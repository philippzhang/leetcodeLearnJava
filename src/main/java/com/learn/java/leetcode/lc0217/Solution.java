package com.learn.java.leetcode.lc0217;

import java.util.Arrays;

/**
 * 217. Contains Duplicate 217. 存在重复元素 Easy
 */
public class Solution {

	/**
	 * 时间复杂度O(NlnN),空间O(1)
	 *
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}
}
