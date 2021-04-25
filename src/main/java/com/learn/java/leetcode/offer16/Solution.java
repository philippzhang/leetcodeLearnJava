package com.learn.java.leetcode.offer16;

public class Solution {
	/**
	 * 当n为偶数： x^n = (x^2)^(n//2)
	 * 当n为奇数： x^n = x(x^2)^(n//2)
	 * @param x
	 * @param n
	 * @return
	 */
	public double myPow(double x, int n) {
		if(x==0){
			return 0;
		}
		double res = 1.0;
		long b = n;
		if(n<0){
			x = 1/x;
			b = -b;
		}
		while(b>0){
			if((b&1)==1){
				res *=x;
			}
			x = x*x;
			b>>=1;
		}

		return res;
	}
}
