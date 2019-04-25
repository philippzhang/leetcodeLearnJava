package com.learn.java.leetcode.lc0026;

/**
 * 26. Remove Duplicates from Sorted Array 26. 删除排序数组中的重复项 Easy
 */
public class Solution {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int index = 1;
		int temp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != temp) {
				nums[index++] = nums[i];
				temp = nums[i];
			}
		}
		return index;
	}
}
