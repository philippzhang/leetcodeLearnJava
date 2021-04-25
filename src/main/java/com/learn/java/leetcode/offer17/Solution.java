package com.learn.java.leetcode.offer17;

public class Solution {
	public int[] printNumbers(int n) {
		if(n==0){
			return new int[0];
		}
		int max = (int)Math.pow(10,n)-1;

		int[] ret = new int[max];
		for(int i=0;i<max;i++){
			ret[i] = i+1;
		}
		return ret;
	}
}
