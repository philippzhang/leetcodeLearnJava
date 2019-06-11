package com.learn.java.leetcode.lc0050;

public class Solution {
	public double myPow(double x, int n) {
		double res = 1.0;
		for(int i =n;i!=0;i/=2){
			if(i%2!=0){
				res*=x;
			}
			x*=x;
		}
		return n>0?res:1/res;
	}
}
