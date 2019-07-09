package com.learn.java.leetcode.lc0268;

public class Solution {
	public int missingNumber(int[] nums) {
		int sum =0;
		for(int i=0;i<nums.length;i++){
			sum += (i+1);
			sum -= nums[i];
		}

		return sum;
	}
}
