package com.learn.java.leetcode.lc0343;

public class Solution {

	/**
	 * 动态规划
	 * @param n
	 * @return
	 */
	public int integerBreak(int n) {
		int[] dp = new int[n+1];
		dp[2]=1;
		for(int i =3;i<=n;i++){
			for(int j = 1;j<=i-1;j++){
				dp[i] = Math.max(dp[i],Math.max(j*dp[i-j],j*(i-j)));
			}
		}
		return dp[n];
	}

	/**
	 * 暴力求解
	 * @param n
	 * @return
	 */
	public int integerBreak1(int n) {
		if (n == 2) {
			return 1;
		}
		int res = -1;
		for (int i = 1; i <= n - 1; i++) {
			res = Math.max(res, Math.max(i * (n - i), i * integerBreak1(n - i)));
		}
		return res;
	}
}
