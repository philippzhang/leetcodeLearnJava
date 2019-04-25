package com.learn.java.leetcode.lc0009;

/**
 * 9. Palindrome Number 回文数 Easy
 */
public class Solution {

	public boolean isPalindrome(int x) {
		if (x < 0 || x >= Integer.MAX_VALUE || x != 0 && x % 10 == 0) {
			return false;
		}
		if (x >= 0 && x < 10) {
			return true;
		}
		int y = 0;
		while (x > y) {
			y = 10 * y + x % 10;
			x /= 10;
		}
		return (x == y) || (x == y / 10);
	}

	public boolean isPalindrome2(int x) {
		if (x < 0 || x >= Integer.MAX_VALUE) {
			return false;
		}
		if (x >= 0 && x < 10) {
			return true;
		}
		int xx = x;
		int y = 0;
		while (xx != 0) {
			y = 10 * y + xx % 10;
			xx /= 10;
		}
		if (x == y) {
			return true;
		} else {
			return false;
		}
	}


}
