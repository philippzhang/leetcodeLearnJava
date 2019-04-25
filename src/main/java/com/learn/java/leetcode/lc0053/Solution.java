package com.learn.java.leetcode.lc0053;

/**
 * 53. Maximum Subarray 53. 最大子序和 Easy
 */
public class Solution {

	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int max = nums[0], sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			max = Math.max(max, sum);
			sum = Math.max(sum, 0);
		}
		return max;
	}

	public int maxSubArray2(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int length = nums.length;

		int[] dp = new int[length];
		dp[0] = nums[0];
		int max = nums[0];
		for (int i = 1; i < length; i++) {
			dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
			max = Math.max(max, dp[i]);
		}
		return max;
	}
}
