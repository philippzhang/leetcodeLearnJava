package com.learn.java.leetcode.lc0384;

import java.util.Random;

public class Solution {
	private int[] array;
	private int[] original;

	Random rand = new Random();

	public Solution(int[] nums) {
		array = nums;
		original = nums.clone();
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		array = original;
		original = original.clone();
		return original;
	}

	private int randRange(int min, int max) {
		return rand.nextInt(max - min) + min;
	}

	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	/**
	 * Fisher-Yates 洗牌算法
	 * 时间O(n) 空间O(n)
	 */
	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		for (int i = 0; i < array.length; i++) {
			swap(i, randRange(i, array.length));
		}
		return array;
	}
}
