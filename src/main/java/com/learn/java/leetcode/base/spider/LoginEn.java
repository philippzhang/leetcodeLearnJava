package com.learn.java.leetcode.base.spider;

import com.learn.java.leetcode.base.utils.InitializationConfig;
import okhttp3.*;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.List;

import static java.lang.System.out;

public class LoginEn {
	public static final String boundary = "----WebKitFormBoundaryhG2vKxp7y2GAwhPX";
	public static final MediaType MULTIPART = MediaType.parse("multipart/form-data; boundary=" + boundary);

	public static String csrftoken;
	public static String __cfduid;
	public static String LEETCODE_SESSION;

	public static boolean doLogin() throws IOException {
		//Scanner scanner = new Scanner(System.in);


		String url = "https://leetcode.com/accounts/login/";
		String usrname = InitializationConfig.readProperties().getProperty("en_username");
		String passwd = InitializationConfig.readProperties().getProperty("en_password");

		Connection.Response response1 = Jsoup.connect(url)
				.method(Connection.Method.GET)
				.execute();

		csrftoken = response1.cookie("csrftoken");
		__cfduid = response1.cookie("__cfduid");
		out.println("csrftoken = " + csrftoken);
		out.println("__cfduid = " + __cfduid);

		OkHttpClient client = new OkHttpClient().newBuilder()
				.followRedirects(false)
				.followSslRedirects(false)
				.build();


		String form_data = "--" + boundary + "\r\n"
				+ "Content-Disposition: form-data; name=\"login\"" + "\r\n\r\n"
				+ usrname + "\r\n"
				+ "--" + boundary + "\r\n"
				+ "Content-Disposition: form-data; name=\"password\"" + "\r\n\r\n"
				+ passwd
				+ "--" + boundary + "\r\n"
				+ "Content-Disposition: form-data; name=\"csrfmiddlewaretoken\"" + "\r\n\r\n"
				+ csrftoken + "\r\n"
				+ "--" + boundary + "--";
		RequestBody requestBody = RequestBody.create(MULTIPART, form_data);


		Request request = new Request.Builder()
				.addHeader("Content-Type", "multipart/form-data; boundary=" + boundary)
				.addHeader("Connection", "keep-alive")
				.addHeader("Accept", "*/*")
				.addHeader("Origin", "https://leetcode.com")
				.addHeader("Referer", url)
				.addHeader("Cookie", "__cfduid=" + __cfduid + ";" + "csrftoken=" + csrftoken)
				.post(requestBody)
				.url(url)
				.build();

		Response response = client.newCall(request).execute();

		Headers headers = response.headers();
		List<String> cookies = headers.values("Set-Cookie");
		for (String cookie : cookies){
			int found = cookie.indexOf("LEETCODE_SESSION");
			if (found > -1){
				int last = cookie.indexOf(";");
				LEETCODE_SESSION = cookie.substring("LEETCODE_SESSION".length() + 1, last);

			}
		}



		out.println(response.message());
		out.println(response.headers());
		out.println(response.body().string());

		boolean success;
		if (LEETCODE_SESSION != null){
			success = true;
			out.println("Login Successfully");
		}else{
			success = false;
			out.println("Login Unsuccessfully");
		}
		response.close();

		return success;
	}

	public static void main(String[] args) throws IOException {
		doLogin();
	}
}
