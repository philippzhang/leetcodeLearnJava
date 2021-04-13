package com.learn.java.leetcode.offer56ii;

public class Solution {
	/**
	 * 通过状态机判断，00->01->10->00
	 * 异或运算：x ^ 0 = x ， x ^ 1 = ~x
	 * 与运算：x & 0 = 0 ， x & 1 = x
	 * 设当前状态为 two one ，此时输入二进制位 n
	 * one = one ^ n & ~two
	 * two = two ^ n & ~one
	 * @param nums
	 * @return
	 */
	public int singleNumber(int[] nums) {
		int one =0,two = 0;
		for(int n:nums){
			one = one^n & ~two;
			two = two^n & ~one;
		}
		return one;
	}

	public int singleNumber2(int[] nums) {
		int[] counts = new int[32];
		for(int num:nums){
			for(int j =0;j<32;j++){
				counts[j] += (num & 1);
				num>>=1;
			}
		}
		int ans =0;
		for(int i=0;i<32;i++){
			ans<<=1;
			ans |= (counts[31-i]%3);
		}

		return ans;

	}

}
