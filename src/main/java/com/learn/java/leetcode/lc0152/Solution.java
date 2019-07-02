package com.learn.java.leetcode.lc0152;

public class Solution {
	public int maxProduct(int[] nums) {
		int[] dpMin = new int[nums.length];
		int[] dpMax = new int[nums.length];
		dpMin[0]=nums[0];
		dpMax[0]=nums[0];

		int res = dpMax[0];
		for(int i=1;i<nums.length;i++){
			dpMin[i] = Math.min(dpMin[i - 1] * nums[i], Math.min(dpMax[i - 1] * nums[i], nums[i]));
			dpMax[i] = Math.max(dpMin[i - 1] * nums[i], Math.max(dpMax[i - 1] * nums[i], nums[i]));

			res = Math.max(res, dpMax[i]);
		}

		return res;
	}
}
