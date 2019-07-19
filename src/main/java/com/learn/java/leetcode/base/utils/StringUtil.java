package com.learn.java.leetcode.base.utils;

import java.util.Iterator;
import java.util.Map;

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


	public static boolean IsEqual(double a,double b)
	{
		return Math.abs(a-b) < 0.000001;
	}

	public static boolean IsEqual(float a,float b)
	{
		return Math.abs(a-b) < 0.000001;
	}

	public static String map2String(Map map){
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		Iterator<Map.Entry> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = iter.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			if(key instanceof Number){
				sb.append(key.toString());
			}else{
				sb.append('"').append(key.toString()).append('"');
			}

			sb.append('=');
			if(value instanceof Number){
				sb.append(value.toString());
			}else{
				sb.append('"').append(value.toString()).append('"');
			}
			if (iter.hasNext()) {
				sb.append(',');
			}
		}
		sb.append('}');
		return sb.toString();
	}

}
