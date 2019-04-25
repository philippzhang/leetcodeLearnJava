package com.learn.java.leetcode.lc0005;

public class Solution {
	/**
	 * 中心扩展算法
	 *
	 * @param s
	 * @return
	 */
	public String longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = getPalindromeLen(s, i, i);
			int len2 = getPalindromeLen(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start + 1) {
				start = i - (len - 1) / 2;
				//或者end = i + len/2;
				end = i + ((len == len1) ? (len1 - 1) / 2 : (len2 / 2));
			}

		}

		return s.substring(start, end + 1);

	}

	private int getPalindromeLen(String s, int start, int end) {
		while (start >= 0 && end <= s.length() - 1 && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}

		//(end-1)-(start-1)+1
		return end - start - 1;
	}
}
