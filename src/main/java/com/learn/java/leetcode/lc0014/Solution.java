package com.learn.java.leetcode.lc0014;

import java.util.Arrays;

/**
 * 14. Longest Common Prefix 14. 最长公共前缀 Easy
 */
public class Solution {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		String pre = strs[0];
		int i = 0;
		while (i < strs.length) {
			while (strs[i].indexOf(pre) != 0) {
				pre = pre.substring(0, pre.length() - 1);
			}
			i++;
		}
		return pre;
	}

	/**
	 * 排序后，判断第一个和最后一个字符串
	 *
	 * @param strs
	 * @return
	 */
	public String longestCommonPrefix2(String[] strs) {
		StringBuilder result = new StringBuilder();
		if (strs != null && strs.length > 0) {
			Arrays.sort(strs);
			char[] a = strs[0].toCharArray();
			char[] b = strs[strs.length - 1].toCharArray();
			for (int i = 0; i < a.length; i++) {
				if (b.length > i && b[i] == a[i]) {
					result.append(b[i]);
				} else {
					return result.toString();
				}
			}
		}
		return result.toString();
	}
}
