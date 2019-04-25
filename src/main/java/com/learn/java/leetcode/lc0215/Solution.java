package com.learn.java.leetcode.lc0215;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 215. Kth Largest Element in an Array 215. 数组中的第K个最大元素 Medium
 */
public class Solution {

	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);

		for (int i = 0; i < nums.length; i++) {
			if (priorityQueue.size() < k) {
				priorityQueue.add(nums[i]);
			} else {
				if (nums[i] >= priorityQueue.peek()) {
					priorityQueue.poll();
					priorityQueue.add(nums[i]);
				}
			}
		}
		return priorityQueue.peek();
	}


	/**
	 * 排序 O(N lg N) running time + O(1) memory
	 *
	 * @param nums
	 * @param k
	 * @return
	 */
	public int findKthLargest2(int[] nums, int k) {
		final int N = nums.length;
		Arrays.sort(nums);
		return nums[N - k];
	}

	public int findKthLargest1(int[] nums, int k) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for (int i = 0; i < nums.length; i++) {
			priorityQueue.add(nums[i]);
			if (priorityQueue.size() > k) {
				priorityQueue.poll();
			}
		}
		return priorityQueue.peek();
	}




	public int findKthLargest3(int[] nums, int k) {
		k = nums.length - k;
		int lo = 0;
		int hi = nums.length - 1;
		while (lo < hi) {
			final int j = partition(nums, lo, hi);
			if (j < k) {
				lo = j + 1;
			} else if (j > k) {
				hi = j - 1;
			} else {
				break;
			}
		}
		return nums[k];
	}

	private int partition(int[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		while (true) {
			while (i < hi && less(a[++i], a[lo])) {
			}
			while (j > lo && less(a[lo], a[--j])) {
			}
			if (i >= j) {
				break;
			}
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}


	private void exch(int[] a, int i, int j) {
		final int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	private boolean less(int v, int w) {
		return v < w;
	}


}
