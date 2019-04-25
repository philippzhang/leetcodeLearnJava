package com.learn.java.leetcode.base.spider;

import okhttp3.*;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class LoginCn {
	public static final String boundary = "----WebKitFormBoundaryhG2vKxp7y2GAwhPX";
	public static final MediaType MULTIPART = MediaType.parse("multipart/form-data; boundary=" + boundary);

	public static void main(String... args) throws IOException {
		Scanner scanner = new Scanner(System.in);


		String url = "https://leetcode-cn.com/accounts/login/";
		String usrname = "XXXXX";
		String passwd = "XXXXX";

		Connection.Response response1 = Jsoup.connect(url)
				.method(Connection.Method.GET)
				.execute();

		String csrftoken = response1.cookie("csrftoken");
		String __cfduid = response1.cookie("__cfduid");
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
				.addHeader("Origin", "https://leetcode-cn.com")
				.addHeader("Referer", url)
				.addHeader("Cookie", "__cfduid=" + __cfduid + ";" + "csrftoken=" + csrftoken)
				.post(requestBody)
				.url(url)
				.build();

		Response response = client.newCall(request).execute();
		out.println(response.message());
		out.println(response.headers());
		out.println(response.body().string());
	}
}
