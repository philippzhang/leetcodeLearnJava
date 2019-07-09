package com.learn.java.leetcode.lc0190;

public class Solution {
	public int reverseBits(int n) {
		int result = 0;
		for(int i = 0;i<=31;i++){
			int temp = n;
			temp = temp&1;
			temp = temp<<(31-i);
			result|=temp;
			n>>=1;
		}
		return result;
	}

	public int reverseBits2(int n) {
		int result = 0;
		for(int i = 0;i<=31;i++){
			int temp = n>>i;
			temp = temp&1;
			temp = temp<<(31-i);
			result|=temp;
		}
		return result;
	}
}
