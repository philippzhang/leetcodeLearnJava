package com.learn.java.leetcode.lc0292;

/**
 * 292. Nim Game 292. Nim游戏 Easy
 */
public class Solution {
	public boolean canWinNim(int n) {
		return !(n % 4 == 0);
	}
}
