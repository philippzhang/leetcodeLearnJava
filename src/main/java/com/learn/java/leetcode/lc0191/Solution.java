package com.learn.java.leetcode.lc0191;

public class Solution {
	public int hammingWeight(int n) {
		int result = 0;
		for(int i =0;i<32;i++){
			int temp = n;
			result += temp&1;
			n>>=1;
		}
		return result;
	}
}
