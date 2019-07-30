package com.learn.java.leetcode.lc0001;

import java.util.HashMap;

/**
 * 1. Two Sum 两数之和 Easy
 * Easy
 *
 * @author zhangyangshuo
 */

public class Solution {
	public int[] twoSum2(int[] nums, int target) {
		int[] solution = new int[2];

		for (int i = 0; i < nums.length; i++) {
			int a1 = nums[i];
			int a2 = target - a1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == a2) {
					solution[0] = i;
					solution[1] = j;
					return solution;
				}
			}
		}
		return solution;
	}

	/**
	 * 借助一个存储,时间复杂度O(N)
	 *
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (tracker.containsKey(nums[i])) {
				int left = tracker.get(nums[i]);
				return new int[]{left, i};
			} else {
				tracker.put(target - nums[i], i);
			}
		}
		return new int[2];
	}
}
