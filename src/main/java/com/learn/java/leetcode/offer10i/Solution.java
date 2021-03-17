package com.learn.java.leetcode.offer10i;

public class Solution {
	//这个题必须用动态规划，如果用递归肯定会超时
	public int fib(int n) {
		if(n<=0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		int a = 0,b = 1,sum = 1;
		for(int i = 2;i<=n;i++){
			sum = (b + a) % 1000000007;
			a = b;
			b = sum;
		}
		return sum;
	}
}
