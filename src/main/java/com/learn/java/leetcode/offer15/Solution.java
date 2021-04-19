package com.learn.java.leetcode.offer15;

public class Solution {
	public int hammingWeight(int n) {
		int m = 0;
		while(n!=0){
			if((n&1)==1){
				m++;
			}
			//无符号右移
			n >>>=1;
		}
		return m;
	}
}
