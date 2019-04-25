package com.learn.java.leetcode.lc0069;

import static java.lang.Math.abs;

/**
 * 69. Sqrt(x) 69. x 的平方根 Easy
 */
public class Solution {
	/**
	 * 二分搜索法
	 *
	 * @param x
	 * @return
	 */
	public int mySqrt(int x) {
		if (x == 1 || x == 0) {
			return x;
		}
		long left = 1;
		long right = x;
		long xx = x;

		while (left < right) {
			long mid = left + (right - left) / 2;
			long z = mid * mid;
			if (z == xx) {
				return (int) mid;
			} else if (z > xx) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return (int) right - 1;
	}

	/**
	 * 牛顿法
	 * 经过(xi, f(xi))这个点的切线方程为f(x) = f(xi) + f’(xi)(x - xi)，其中f'(x)为f(x)的导数，本题中为2x。令切线方程等于0，即可求出xi+1=xi - f(xi) / f'(xi)。
	 * <p>
	 * 继续化简，xi+1=xi - (xi2 - n) / (2xi) = xi - xi / 2 + n / (2xi) = xi / 2 + n / 2xi = (xi + n/xi) / 2。
	 *
	 * @param x
	 * @return
	 */
	public int mySqrt2(int x) {
		if (x == 1 || x == 0) {
			return x;
		}
		double res = 1, pre = 0;
		while (abs(res - pre) > 1e-6) {
			pre = res;
			res = (res + x / res) / 2;
		}
		return (int) res;
	}

	/**
	 * 简化牛顿法
	 *
	 * @param x
	 * @return
	 */
	int mySqrt3(int x) {
		long res = x;
		while (res * res > x) {
			res = (res + x / res) / 2;
		}
		return (int) res;
	}
}
