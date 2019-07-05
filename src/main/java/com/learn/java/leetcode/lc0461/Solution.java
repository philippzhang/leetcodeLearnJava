package com.learn.java.leetcode.lc0461;

public class Solution {
	public int hammingDistance(int x, int y) {
		if(x==y){
			return 0;
		}
		int num =0;
		int temp = x^y;
		while(temp>0){
			num += (temp&1);
			temp>>=1;
		}
		return num;
	}
}
