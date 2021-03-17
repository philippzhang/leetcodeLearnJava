package com.learn.java.leetcode.offer10ii;

public class Solution {
	public int numWays(int n) {
		if(n<=0){
			return 1;
		}
		if(n==1||n==2){
			return n;
		}
		int a = 1,b = 2,sum = 0;
		for(int i = 3;i<=n;i++){
			sum = (b + a) % 1000000007;
			a = b;
			b = sum;
		}
		return sum;
	}
}
