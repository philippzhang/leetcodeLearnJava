package com.learn.java.leetcode.lc0312;

public class Solution {
	/**
	 * dp[i][j] 表示戳破 [i+1...j-1] 号气球的最大收益。
	 *
	 * 假设 k 号气球（i+1 <= k <= j-1）是 [i+1...j-1] 中最后一个被戳破的，则
	 *
	 * dp[i][j] = max {for k = range(i+1, j -1) nums[i] * nums[k] * nums[j] + dp[i][k] + dp[k][j]}
	 *
	 * @param nums
	 * @return
	 */
	public int maxCoins(int[] nums) {
		int[][] dp = new int[nums.length+2][nums.length+2];
		int[] a = new int[nums.length+2];
		for(int i =1;i<a.length-1;i++){
			a[i] = nums[i-1];
		}
		a[0] = 1;
		a[nums.length+1] = 1;
		for(int i = 0;i<a.length;i++){
			dp[i][i] =0;
		}
		//dp[i][j], j-i >= 2
		for(int len = 2;len<a.length;len++){
			for(int i =0;i<a.length-len;i++){
				int j = i + len;
				for(int k=i+1;k<j;k++){
					dp[i][j] = Math.max(dp[i][j], a[i] * a[k] * a[j] + dp[i][k] + dp[k][j]);
				}
			}
		}
		return dp[0][a.length-1];
	}
}
