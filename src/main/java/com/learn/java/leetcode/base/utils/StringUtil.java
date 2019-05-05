package com.learn.java.leetcode.base.utils;

/**
 * 字符串相关的处理
 */
public class StringUtil {

	/**
	 * 统计字符串中出现的某个字符个数
	 *
	 * @param str
	 * @param s
	 * @return
	 */
	public static int countString(String str, char s) {
		int count = 0;
		while (str.indexOf(s) != -1) {
			str = str.substring(str.indexOf(s) + 1, str.length());
			count++;
		}
		return count;
	}


	/**
	 * 判读字符串是否数字
	 *
	 * @param str
	 * @return
	 */
	public static boolean judgeNumber(String str) {
		return str.matches("[-+]?[0-9]+.*[0-9]*");

	}

	public static boolean judgeINumber(String str){
		return str.matches("^I[0-9]=.+$");
	}

	/**
	 * 处理字符串
	 *
	 * @param temp
	 * @return
	 */
	public static String changeStr(String temp) {
		if (temp == null || temp.equals("null")) {
			return null;
		}
		if (temp.startsWith("\"")) {
			temp = temp.substring(1);
		}
		if (temp.endsWith("\"")) {
			temp = temp.substring(0, temp.length() - 1);
		}
		return temp;
	}

}
