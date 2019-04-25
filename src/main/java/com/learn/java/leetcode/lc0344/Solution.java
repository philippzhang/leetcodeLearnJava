package com.learn.java.leetcode.lc0344;

/**
 * 344. Reverse String 344. 反转字符串 Easy
 */
public class Solution {
	public void reverseString(char[] s) {
		if (s == null || s.length == 0) {
			return;
		}
		int size = s.length;
		for (int i = 0; i < size / 2; i++) {
			char temp = s[i];
			s[i] = s[size - i - 1];
			s[size - i - 1] = temp;
		}
	}
}
