package com.learn.java.leetcode.lc0338;

public class Solution {
	//P(x)=P(x/2)+(xmod2)
	public int[] countBits(int num) {
		int[] dp = new int[num + 1];
		for (int i = 1; i <= num; ++i) {
			// x / 2 is x >> 1 and x % 2 is x & 1
			dp[i] = dp[i >> 1] + (i & 1);
		}
		return dp;
	}
}
