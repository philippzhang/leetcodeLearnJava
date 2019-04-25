package com.learn.java.leetcode.lc0033;

/**
 * 33. Search in Rotated Sorted Array 33. 搜索旋转排序数组 Medium
 */
public class Solution {
	public int search(int[] nums, int target) {
		if (nums == null || nums.length <= 0) {
			return -1;
		}
		int left = 0;
		int right = nums.length - 1;

		return search(nums, target, left, right);
	}

	private int search(int[] nums, int target, int left, int right) {
		if (right < left) {
			return -1;
		}
		if (left == right) {
			return nums[left] == target ? left : -1;
		}
		int middle = (left + right) / 2;
		if (nums[middle] == target) {
			return middle;
		} else {
			if (middle - 1 >= left) {
				int max = Math.max(nums[left], nums[middle - 1]);
				int min = Math.min(nums[left], nums[middle - 1]);
				if (target >= min && target <= max || nums[middle - 1] < nums[left]) {
					int l = search(nums, target, left, middle - 1);
					if (l != -1) {
						return l;
					}
				}
			}
			if (middle + 1 <= right) {
				int max = Math.max(nums[middle + 1], nums[right]);
				int min = Math.min(nums[middle + 1], nums[right]);
				if (target >= min && target <= max || nums[right] < nums[middle + 1]) {
					int r = search(nums, target, middle + 1, right);
					if (r != -1) {
						return r;
					}
				}
			}

		}
		return -1;
	}


	private int search2(int[] nums, int target, int low, int high) {
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (nums[mid] == target) {
			return mid;
		}
		if (nums[mid] < nums[high]) {
			if (nums[mid] < target && target <= nums[high]) {
				return search(nums, target, mid + 1, high);
			} else {
				return search(nums, target, low, mid - 1);
			}
		} else {
			if (nums[low] <= target && target < nums[mid]) {
				return search(nums, target, low, mid - 1);
			} else {
				return search(nums, target, mid + 1, high);
			}
		}
	}
}
