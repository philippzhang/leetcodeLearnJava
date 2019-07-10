package com.learn.java.leetcode.lc0242;

import java.util.Arrays;

public class Solution {

	/**
	 * 时间复杂度：O(n)。时间复杂度为 O(n) 因为访问计数器表是一个固定的时间操作。
	 * 空间复杂度：O(1)。尽管我们使用了额外的空间，但是空间的复杂性是 O(1)，因为无论 NN 有多大，表的大小都保持不变。
	 *
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()){
			return false;
		}
		int[] counter = new int[26];
		for(int i =0;i<s.length();i++){
			counter[s.charAt(i)-'a']++;
			counter[t.charAt(i)-'a']--;
		}
		for (int count : counter) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}
	/**
	 * 排序法, 时间复杂度：O(nlogn) 空间复杂度O(1)
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram2(String s, String t) {
		if(s.length()!=t.length()){
			return false;
		}
		char[] chars1 = s.toCharArray();
		char[] chars2 = t.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		return Arrays.equals(chars1,chars2);
	}
}
