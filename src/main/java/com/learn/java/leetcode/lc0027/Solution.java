package com.learn.java.leetcode.lc0027;

/**
 * 27. Remove Element 27. 移除元素 Easy
 */
public class Solution {
	public int removeElement(int[] nums, int val) {
		int i = 0;
		int size = nums.length;
		while (i < size) {
			if (nums[i] == val) {
				for (int j = i; j < size - 1; j++) {
					nums[j] = nums[j + 1];
				}
				size--;
			} else {
				i++;
			}
		}
		return size;
	}

	public int removeElement2(int[] nums, int val) {
		int begin = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[begin++] = nums[i];
			}
		}
		return begin;
	}

}
