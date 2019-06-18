package com.learn.java.leetcode.lc0066;

public class Solution {
	public int[] plusOne(int[] digits) {
		if(digits==null||digits.length==0){
			return new int[0];
		}
		int[] ret1 = new int[digits.length];
		int r = 1;
		for(int i = digits.length-1;i>=0;i--){
			int v = (digits[i]+r);
			r = v/10;
			v = v%10;
			ret1[i]=v;
		}
		if(r==0){
			return ret1;
		}else{
			int[] ret2 = new int[digits.length+1];
			ret2[0]=r;
			System.arraycopy(ret1,0,ret2,1,digits.length);
			return ret2;
		}
	}
}
