package com.learn.java.leetcode.lc0122;

/**
 * 122. Best Time to Buy and Sell Stock II 122. 买卖股票的最佳时机 II Easy
 */
public class Solution {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int i = 0, profile = 0, min = 0;
		while (i < prices.length) {
			while (i < prices.length - 1 && prices[i] > prices[i + 1]) {
				i++;
			}
			min = prices[i++];
			while (i < prices.length - 1 && prices[i] < prices[i + 1]) {
				i++;
			}
			profile += i < prices.length ? (prices[i] - min) : 0;
		}
		return profile;
	}
}
