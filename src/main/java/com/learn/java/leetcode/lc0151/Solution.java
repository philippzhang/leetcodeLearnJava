package com.learn.java.leetcode.lc0151;

/**
 * 151. Reverse Words in a String 151. 翻转字符串里的单词 Medium
 */
public class Solution {
	public String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return s;
		}
		int start = 0;
		while (start < s.length() && s.charAt(start) == ' ') {
			start++;
		}
		int end = s.length() - 1;
		while (end > 0 && s.charAt(end) == ' ') {
			end--;
		}

		if (end < start) {
			return "";
		}

		char[] cs = new char[end - start + 2];
		for (int i = start; i <= end; i++) {
			cs[i - start] = s.charAt(i);
		}
		reverse(cs, 0, cs.length - 2);
		cs[end - start + 1] = ' ';

		StringBuffer stringBuffer = new StringBuffer();

		int i = 0;
		int j = 0;
		while (j < cs.length) {
			if (cs[j] != ' ') {
				j++;
			} else {
				if (i != j) {
					reverse(cs, i, j - 1);
					for (int k = i; k <= j - 1; k++) {
						stringBuffer.append(cs[k]);
					}
					stringBuffer.append(' ');
				}
				j++;
				i = j;

			}
		}

		String ss = stringBuffer.substring(0, stringBuffer.length() - 1);

		return ss;


	}

	private void reverse(char[] cs, int start, int end) {
		if (cs == null || cs.length == 0 || end >= cs.length || end - start < 1) {
			return;
		}
		int size = end - start + 1;
		for (int i = 0; i < size / 2; i++) {
			char temp = cs[i + start];
			cs[i + start] = cs[end - i];
			cs[end - i] = temp;
		}
	}

	public String reverseWords2(String s) {

		String[] parts = s.trim().split("\\s+");
		String out = "";
		if (parts.length > 0) {
			for (int i = parts.length - 1; i > 0; i--) {
				out += parts[i] + " ";
			}
			out += parts[0];
		}
		return out;
	}
}
