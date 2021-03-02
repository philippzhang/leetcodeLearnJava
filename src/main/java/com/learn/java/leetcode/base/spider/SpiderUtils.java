package com.learn.java.leetcode.base.spider;

import com.learn.java.leetcode.base.Utilitys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpiderUtils {

	public static List<String> readReadmeFile(Class clazz, String questionId) {
		List<String> retList = new ArrayList<>();
		String packageName = clazz.getPackage().getName();
		String path = "/" + packageName.replaceAll("\\.", "/") + "/README.md";
		Map<String, String> map = readReadmeFile(path);
		if (map.containsKey(questionId)) {
			String line = map.get(questionId);
			String[] arr = line.split("\t", -1);
			if("yes".equals(arr[3])){
				retList.add(arr[1]);
				retList.add(arr[2]);
				retList.add(arr[3]);
			}
		}
		return retList;
	}

	public static Map<String, String> readReadmeFile(String path) {
		Map<String, String> map = new HashMap<>();
		BufferedReader reader = null;
		try {
			InputStream is = Utilitys.class.getResourceAsStream(path);
			reader = new BufferedReader(new InputStreamReader(is));
			String tempString = null;

			int i = 0;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				tempString = tempString.trim();
				if (tempString.length() > 0 && !tempString.startsWith("#") && !tempString.startsWith("`")) {
					String[] arr = tempString.split("\t", -1);
					if (arr.length > 3) {
						map.put(arr[0], tempString);
					}
				}

			}

		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return map;
	}
}
