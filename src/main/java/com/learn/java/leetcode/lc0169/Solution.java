package com.learn.java.leetcode.lc0169;

/**
 * 169. Majority Element 169. 求众数 Easy
 */
public class Solution {
	public int majorityElement(int[] nums) {
		int major = nums[0], count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (count == 0) {
				major = nums[i];
				count = 1;
			} else if (major == nums[i]) {
				count++;
			} else {
				count--;
			}
		}
		return major;
	}
}
