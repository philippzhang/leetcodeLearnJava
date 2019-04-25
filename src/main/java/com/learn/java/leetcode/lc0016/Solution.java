package com.learn.java.leetcode.lc0016;

import java.util.Arrays;

/**
 * 16. 3Sum Closest 16. 最接近的三数之和 Medium
 */
public class Solution {
	public int threeSumClosest(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 2) {
			return nums[0] + nums[1];
		}
		if (nums.length == 3) {
			return nums[0] + nums[1] + nums[2];
		}

		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[nums.length - 1];

		for (int i = 0; i < nums.length - 2; i++) {
			int lo = i + 1;
			int hi = nums.length - 1;
			while (lo < hi) {
				int sum = nums[i] + nums[lo] + nums[hi];
				if (sum < target) {
					lo++;
				} else if (sum > target) {
					hi--;
				} else {
					return target;
				}
				if (Math.abs(target - result) > Math.abs(target - sum)) {
					result = sum;
				}
			}
		}
		return result;
	}
}
