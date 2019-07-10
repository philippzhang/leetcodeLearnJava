package com.learn.java.leetcode.lc0326;

public class Solution {

	/**
	 * 位运算 %1==0忽略小数
	 * @param n
	 * @return
	 */
	public boolean isPowerOfThree(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}

	/**
	 * 循环法 O(logn)
	 * @param n
	 * @return
	 */
	public boolean isPowerOfThree1(int n) {
		if (n < 1) {
			return false;
		}

		while (n % 3 == 0) {
			n /= 3;
		}

		return n == 1;
	}

	/**
	 * 基准转换,以3为基准，匹配正则^10*$
	 * @param n
	 * @return
	 */
	public boolean isPowerOfThree2(int n) {
		return Integer.toString(n, 3).matches("^10*$");
	}




	/**
	 * 整数限制 <Integer.MAX_VALUE 的最大3^19 = 1162261467
	 * @param n
	 * @return
	 */
	public boolean isPowerOfThree3(int n) {
		System.out.println(Integer.MAX_VALUE);
		return n > 0 && 1162261467 % n == 0;
	}


}
