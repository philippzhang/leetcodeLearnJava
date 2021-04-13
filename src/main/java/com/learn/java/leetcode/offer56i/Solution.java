package com.learn.java.leetcode.offer56i;

public class Solution {
	public int[] singleNumbers(int[] nums) {
		int xor = 0;
		//先做异或
		for(int n:nums){
			xor^=n;
		}
		//将xor分开，找到第一个位置为1的如
		//当xor=2^10 = 010^1010=1000
		//那么mask=1000，找到2个差异的数据从低到高位第一个值不同的位置。
		int mask = 1;
		while((mask&xor)==0){
			mask<<=1;
		}
		int a =0,b =0;
		for(int n:nums){
			if((mask&n)==0){
				a^=n;
			}else{
				b^=n;
			}
		}
		return new int[]{a,b};
	}
}
