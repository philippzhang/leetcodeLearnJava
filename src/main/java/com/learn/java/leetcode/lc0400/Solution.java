package com.learn.java.leetcode.lc0400;

public class Solution {
	public int findNthDigit(int n) {
		int max = 0;
		int i = 1;
		while(n>max+i*(Math.pow(10,i)-Math.pow(10,i-1))){
			max += i*(Math.pow(10,i)-Math.pow(10,i-1));
			i++;
		}
		n-=max;
		n--;
		int remain = n%i;
		int counter = n/i;
		//找到该数字
		int in = (int)Math.pow(10,i-1)+counter;
		int result = 0;
		//从后向前找
		for(int j =0;j<i-remain;j++){
			result = in%10;
			in/=10;
		}
		return result;
	}
}
