package com.learn.java.leetcode.base.spider;

import com.learn.java.leetcode.base.utils.InitializationConfig;
import org.apache.commons.lang.StringUtils;

import java.io.File;

/**
 * 生成题目
 *
 * @author zhangyangshuo
 */
public class GetQuestion {


	private static final int START_ID = 982; // 743;
	private static final int END_ID = 1044; //749;
	private static final String[] QUESTION_IDS = {"605"};
	//private static final String[] QUESTION_IDS = {"123","125","316","341","385","394","591","726","739","770","856","895","907","921","975","1003","1047"};
	//,"117","118","119","123","125","316","341","385","394","591","726","739","770","856","895","907","921","975","1003","1047"
	private static final String package_parent = InitializationConfig.readProperties().getProperty("GetQuestionPath");

	private static final String userDir = System.getProperty("user.dir");

	public static void main(String[] args) {
		//for (String questionId : QUESTION_IDS) {
		for (int i = START_ID;i<=END_ID;i++){
			String questionId = String.valueOf(i);
			try {
				getQuestion(questionId);
			} catch (Exception e) {
				System.out.println("==================");
				System.out.println(questionId);
				System.out.println("==================");
				e.printStackTrace();
			}
		}

	}

	private static void getQuestion(String questionId) {

		String questionName = MyFileWriter.GetQuestionName(questionId);
		String packagePath = userDir + package_parent + "/" + questionName;
		File path = new File(packagePath);


		if (new File(packagePath + "/Main.java").exists() || new File(packagePath + "/README.md").exists()) {
			System.out.println(packagePath + " exists!");
			return;
		}

		String retInfo = LeetCodeSpider.GetQuestionMd(questionId);

		if (StringUtils.isBlank(retInfo)) {
			System.out.println(questionId+":get data is null!");
			return;
		}

		if (!path.exists()) {
			path.mkdir();
		}

		MyFileWriter.writeString(packagePath + "/README.md", retInfo);

		String mainFileInfo = MyFileWriter.getMainFileInfo(questionName);

		MyFileWriter.writeString(packagePath + "/Main.java", mainFileInfo);
	}
}
