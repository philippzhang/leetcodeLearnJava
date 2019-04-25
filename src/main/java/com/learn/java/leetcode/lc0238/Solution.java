package com.learn.java.leetcode.lc0238;

public class Solution {
	/**
	 * 遍历2遍 时间O(N) 空间O(1）
	 *
	 * @param nums
	 * @return
	 */
	public int[] productExceptSelf(int[] nums) {
		if (nums == null) {
			return null;
		}
		int left = 1;
		int right = 1;
		int len = nums.length;
		int[] results = new int[len];
		for (int i = 0; i < len; i++) {
			results[i] = left;
			left *= nums[i];
		}
		for (int i = len - 1; i >= 0; i--) {
			results[i] *= right;
			right *= nums[i];
		}
		return results;
	}
}
