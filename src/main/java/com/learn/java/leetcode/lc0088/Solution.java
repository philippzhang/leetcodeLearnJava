package com.learn.java.leetcode.lc0088;

/**
 * 88. Merge Sorted Array 88. 合并两个有序数组 Easy
 */
public class Solution {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1, j = n - 1, k = m + n - 1;
		while (i > -1 && j > -1) {
			nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
		}
		while (j > -1) {
			nums1[k--] = nums2[j--];
		}
	}


	public void merge2(int[] nums1, int m, int[] nums2, int n) {
		int[] nums3 = new int[m + n];
		int i = 0, j = 0, index = 0;
		while (i < m && j < n) {
			if (nums1[i] <= nums2[j]) {
				nums3[index++] = nums1[i++];
			} else {
				nums3[index++] = nums2[j++];
			}
		}
		if (m > 0 && i < m) {
			System.arraycopy(nums1, i, nums3, index, m - i);
		}
		if (n > 0 && j < n) {
			System.arraycopy(nums2, j, nums3, index, n - j);
		}
		System.arraycopy(nums3, 0, nums1, 0, nums3.length);
	}
}
