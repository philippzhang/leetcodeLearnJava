package com.learn.java.leetcode.lc0136;

/**
 * 136. Single Number 136. 只出现一次的数字 Easy
 */
public class Solution {
	public int singleNumber(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		return result;
	}
}
