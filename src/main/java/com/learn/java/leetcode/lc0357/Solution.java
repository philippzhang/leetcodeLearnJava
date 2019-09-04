package com.learn.java.leetcode.lc0357;

public class Solution {
	/**
	 * 动态规划
	 * @param n
	 * @return
	 */
	public int countNumbersWithUniqueDigits(int n) {
		if(n==0){
			return 1;
		}
		int[] dp = new int[11];
		dp[0]=1;
		int pre = 1;
		for(int i = 1;i<=10;i++){
			dp[i] = dp[i-1]+9*pre;
			pre = pre*(10-i);
		}
		if(n<=10){
			return dp[n];
		}else {
			return dp[10];
		}
	}
}
