package com.learn.java.leetcode.lc0309;

public class Solution {
	public int maxProfit(int[] prices) {
		if(prices.length<=1){
			return 0;
		}
		if(prices.length==2){
			return Math.max(prices[1]-prices[0],0);
		}
		int[] dp = new int[prices.length];
		dp[0] = 0;
		for(int i = 1;i<prices.length;i++){
			//当前不执行任何操作
			dp[i] = dp[i-1];
			//卖出
			for(int j = i - 1;j>=0;j-- ){
				int diff = prices[i] - prices[j];
				if(diff<=0) {
					continue;
				}
				//卖出
				if(j>=2) {
					dp[i] = Math.max(diff + dp[j - 2], dp[i]);
				}else {
					dp[i] = Math.max(diff , dp[i]);
				}

			}
		}
		return dp[prices.length-1];
	}
}
