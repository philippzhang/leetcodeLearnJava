package com.learn.java.leetcode.lc0557;

import java.util.ArrayList;

/**
 * 557. Reverse Words in a String III 557. 反转字符串中的单词 III Easy
 */
public class Solution {
	public String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return s;
		}
		//String[] arr = s.split("\\s+");
		String[] arr = split(s);
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			String s1 = arr[i];
			if (i < arr.length - 1) {
				stringBuffer.append(reverse2(s1)).append(' ');
			} else {
				stringBuffer.append(reverse2(s1));
			}
		}
		return stringBuffer.toString();
	}

	private String[] split(String s) {
		ArrayList<String> words = new ArrayList<>();
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				words.add(word.toString());
				word = new StringBuilder();
			} else {
				word.append(s.charAt(i));
			}
		}
		words.add(word.toString());
		return words.toArray(new String[words.size()]);
	}

	private String reverse2(String s) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			res.insert(0, s.charAt(i));
		}
		return res.toString();
	}


	private String reverse(String s) {
		char[] cs = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			cs[i] = s.charAt(i);
		}
		reverse(cs, 0, cs.length - 1);
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < cs.length; i++) {
			stringBuffer.append(cs[i]);
		}
		return stringBuffer.toString();
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


}
