package com.learn.java.leetcode.lc0029;

/**
 * 29. Divide Two Integers 29. 两数相除 Medium
 */
public class Solution {
	public int divide(int dividend, int divisor) {
		if (dividend > Integer.MAX_VALUE || dividend < Integer.MIN_VALUE || divisor > Integer.MAX_VALUE || divisor < Integer.MIN_VALUE || divisor == 0) {
			return Integer.MAX_VALUE;
		}
		if (dividend == Integer.MIN_VALUE && divisor == 1) {
			return Integer.MIN_VALUE;
		}

		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}

		// 求符号位
		int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

		int result = 0;
		long y = dividend > 0 ? dividend : -(long) dividend;
		long x = divisor > 0 ? divisor : -(long) divisor;

		while (y >= x) {
			// 记录除数
			long tmp = x;
			// 记录商的大小
			long mul = 1;

			while (y >= (tmp << 1)) {
				tmp <<= 1;
				mul <<= 1;
			}

			// 减去最接近dvd的dvs的指数倍的值（值为tmp）
			y -= tmp;

			// 修正结果
			result += mul;
		}

		if (sign > 0) {
			return result > Integer.MAX_VALUE ? Integer.MAX_VALUE : result;
		} else {
			return result > Integer.MAX_VALUE ? Integer.MIN_VALUE : -result;
		}

	}
}
