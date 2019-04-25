package com.learn.java.leetcode.lc0007;

/**
 * 7. Reverse Integer 整数反转 Easy
 */
public class Solution {
	public int reverse(int x) {
		if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {
			return 0;
		}
		int y = x;
		int z = 0;
		while (y != 0) {
			int pop = y % 10;
			if (z > Integer.MAX_VALUE / 10 || (z == Integer.MAX_VALUE / 10 && pop > 7)) {
				return 0;
			}
			if (z < Integer.MIN_VALUE / 10 || (z == Integer.MIN_VALUE / 10 && pop < -8)) {
				return 0;
			}
			z = z * 10 + pop;
			y /= 10;
		}
		if (z >= Integer.MAX_VALUE || z <= Integer.MIN_VALUE) {
			return 0;
		}

		return z;
	}
}
