package com.learn.java.leetcode.lc0231;

/**
 * 231. Power of Two 231. 2的幂 Easy
 */
public class Solution {
	public boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		int i = 2;
		while (i <= n) {
			if (i == n) {
				return true;
			}
			if (i >= Integer.MAX_VALUE / 2) {
				return false;
			}
			i = i << 1;
		}

		return false;
	}
}
