package com.learn.java.leetcode.lc0172;

public class Solution {
	public int trailingZeroes(int n) {
		int result =0;
		while(n>=5){
			n /=5;
			result+=n;
		}

		return result;
	}
}
