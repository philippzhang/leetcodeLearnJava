package com.learn.java.leetcode.lc0322;

import java.util.Arrays;

public class Solution {
	public int coinChange(int[] coins, int amount) {
		if(coins==null||coins.length==0||amount==0){
			return 0;
		}
		int[] dp = new int[amount+1];
		for(int i = 0;i<=amount;i++){
			dp[i] = -1;
		}
		Arrays.sort(coins);
		dp[0] = 0;
		for(int i =1;i<=amount;i++){
			for(int j = 0;j<coins.length;j++){
				if(i-coins[j]>=0&&dp[i-coins[j]]!=-1){
					if(dp[i]==-1||dp[i]>dp[i-coins[j]]+1){
						//递推公式
						dp[i] = dp[i-coins[j]]+1;
					}
				}
			}
		}
		return dp[amount];
	}
}
