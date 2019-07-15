package com.learn.java.leetcode.lc0581;

import java.util.Arrays;

public class Solution {
	public int findUnsortedSubarray(int[] nums) {
		int[] temp = nums.clone();
		Arrays.sort(temp);
		int left = 0, right = nums.length - 1;

		while (left < right && nums[left] == temp[left]) {
			left++;
		}
		while (left < right && nums[right] == temp[right]) {
			right--;
		}

		return right-left>0?right-left+1:0;

	}
}
