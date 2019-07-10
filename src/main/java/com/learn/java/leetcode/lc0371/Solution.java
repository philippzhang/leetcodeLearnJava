package com.learn.java.leetcode.lc0371;

public class Solution {
	/**
	 * c = a ^ b得到不包括进位的和
	 * d = a & b得到哪些是进位
	 * 当d不为0时，只要再计算c与(d<<1)的和即m可
	 * @param a
	 * @param b
	 * @return
	 */
	public int getSum(int a, int b) {
		while(b!=0){
			int temp = a^b;
			b = (a&b)<<1;
			a = temp;
		}
		return a;
	}

	public int getSum2(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return getSum2(a ^ b, (a & b) << 1);
		}
	}
}
