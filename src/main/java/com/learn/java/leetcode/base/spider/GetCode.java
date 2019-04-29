package com.learn.java.leetcode.base.spider;

import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.utils.Build;
import com.learn.java.leetcode.base.utils.InitializationConfig;
import okhttp3.Headers;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class GetCode {
	private static Pattern reUnicode = Pattern.compile("\\\\u([0-9a-zA-Z]{4})");
	private static volatile GetCode getCode;
	private OkHttpHelper okHttpHelper;

	private GetCode() {
		okHttpHelper = OkHttpHelper.getSingleton();
	}

	public static GetCode getSingleton() {
		GetCode result = getCode;
		if (result == null) {
			synchronized (GetCode.class) {
				result = getCode;
				if (result == null) {
					result = getCode = new GetCode();
				}
			}
		}
		return result;
	}

	public synchronized Map<String, String> getSubmissions(String problemTitle) throws IOException {

		//保存语言对应的提交代码
		Map<String, String> submissionMap = new HashMap<>();
		int offset = 0;
		int limit = 10;
		boolean hasNext = true;
		String lastKey = "";

		List<String> languageList = Build.buildList(InitializationConfig.readProperties().getProperty("SUBMISSIONS_LANGUAGE"));


		//判断某个语言的代码是否已经抓取
		Map<String, Boolean>languageMap = new HashMap<>();
		for (int i = 0; i < languageList.size(); i++){

			languageMap.put(languageList.get(i), false);

		}

		//想要爬取的题目的对应语言提交的代码已经保存在本地了
		if (languageMap.size() == 0) {
			return submissionMap;
		}

		while(hasNext){
			String submissionsUrl = String.format(InitializationConfig.readProperties().getProperty("SUBMISSIONS_FORMAT"), problemTitle, offset, limit, lastKey);

			Headers headers = new Headers.Builder()
					.add("Cookie", "__cfduid=" + LoginEn.__cfduid + ";" + "csrftoken=" + LoginEn.csrftoken + ";" + "LEETCODE_SESSION=" + LoginEn.LEETCODE_SESSION)
					.build();

			Response response = okHttpHelper.get(submissionsUrl, headers);

			if (response != null){
				String responseData = response.body().string();

				SubmissionBean submissionBean = okHttpHelper.fromJson(responseData, SubmissionBean.class);
				List<SubmissionBean.SubmissionsDumpBean> submissionsDumpList = submissionBean.getSubmissions_dump();

				if (submissionsDumpList == null){
					/*if (Main.isDebug){
						out.println("submissionsUrl = " + submissionsUrl);
						out.println("problemTitle = " + problemTitle);
						out.println("responseData = " + responseData);
						out.println("status message = " + response.message());
						out.println("message code = " + response.code());
					}*/
					/*
					 * 当获取不到提交记录时休眠一小段时间后进行重复尝试,服务器返回如下信息
					 * responseData = {"detail":"You do not have permission to perform this action."}
					 * status message = Forbidden
					 * message code = 403
					 */
					continue;
				}

				for (int i = 0; i < submissionsDumpList.size(); i++){
					SubmissionBean.SubmissionsDumpBean submission = submissionsDumpList.get(i);
					String language = submission.getLang();
					if (languageMap.containsKey(language) && languageMap.get(language) == false && submission.getStatus_display().equals("Accepted")){
						submissionMap.put(language, getSubmissionCode(submission.getUrl()));
						languageMap.put(language, true);
					}
				}

				//翻页逻辑
				hasNext = submissionBean.isHas_next();
				offset = (++offset) * limit;
				lastKey = submissionBean.getLast_key();

				response.close();
			}else{
				//TODO
			}
		}

		return submissionMap;
	}

	private String getSubmissionCode(String submissionUrl) throws IOException {
		String url = "https://leetcode.com" + submissionUrl;

		String codeString = null;

		Headers headers = new Headers.Builder()
				.add("Cookie", "__cfduid=" + LoginEn.__cfduid + ";" + "csrftoken=" + LoginEn.csrftoken + ";" + "LEETCODE_SESSION=" + LoginEn.LEETCODE_SESSION)
				.build();

		Response response = okHttpHelper.get(url, headers);

		if (response != null) {
			String htmlString = response.body().string();

			Document document = Jsoup.parse(htmlString);
			Elements elements = document.getElementsByTag("script");
			for (Element element : elements) {
				int indexStart = element.toString().indexOf("submissionCode: '");
				if (indexStart > -1) {
					int indexTo = element.toString().indexOf("editCodeUrl");
					codeString = element.toString().substring(indexStart + ("submissionCode: '").length(), indexTo - 5);
					break;
				}
			}

			response.close();
		} else {
			//TODO 错误信息处理
		}

		codeString = encode(codeString);

		return codeString;
	}

	private String encode(String s) {
		Matcher matcher = reUnicode.matcher(s);
		StringBuffer sb = new StringBuffer(s.length());
		while (matcher.find()) {
			String replace = Character.toString((char) Integer.parseInt(matcher.group(1), 16));
			if (replace.equals("\\")) {
				replace = "\\\\";
			}
			matcher.appendReplacement(sb, replace);
		}
		matcher.appendTail(sb);
		return sb.toString();
	}

	public static void main(String[] args) {
		try {
			String QUESTION_ID = "6";
			if(!LoginEn.doLogin()){
				return;
			}

			List<String> targetUrlList = SpiderUtils.readReadmeFile(LeetCodeSpider.class, QUESTION_ID);
			if (targetUrlList == null || targetUrlList.size() <= 1) {
				return ;
			}
			String title = targetUrlList.get(2);

			Map<String, String> submissionMap = GetCode.getSingleton().getSubmissions(title);

			for (Map.Entry<String, String> entry : submissionMap.entrySet()) {
				System.out.println(entry.getKey());

				System.out.println(entry.getValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
