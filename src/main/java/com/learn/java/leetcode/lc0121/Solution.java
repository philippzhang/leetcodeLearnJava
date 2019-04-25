package com.learn.java.leetcode.lc0121;

/**
 * 121. Best Time to Buy and Sell Stock 121. 买卖股票的最佳时机 Easy
 */
public class Solution {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int max = 0;
		int min = prices[0];
		int profile = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			} else if (prices[i] - min > profile) {
				profile = prices[i] - min;
			}
		}
		return profile;
	}
}
