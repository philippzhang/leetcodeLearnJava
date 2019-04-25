package com.learn.java.leetcode.lc0011;

public class Solution {
	/**
	 * 双指针法 O(N)
	 * 这种方法背后的思路在于，两线段之间形成的区域总是会受到其中较短那条长度的限制。此外，两线段距离越远，得到的面积就越大。
	 * <p>
	 * 我们在由线段长度构成的数组中使用两个指针，一个放在开始，一个置于末尾。 此外，我们会使用变量 maxareamaxarea 来持续存储到目前为止所获得的最大面积。
	 * 在每一步中，我们会找出指针所指向的两条线段形成的区域，更新 maxareamaxarea，并将指向较短线段的指针向较长线段那端移动一步。
	 *
	 * @param height
	 * @return
	 */
	public int maxArea(int[] height) {
		if (height == null || height.length <= 1) {
			return 0;
		}
		int max = 0;
		int l = 0, h = height.length - 1;
		while (l < h) {
			max = Math.max(Math.min(height[l], height[h]) * (h - l), max);
			if (height[l] < height[h]) {
				l++;
			} else {
				h--;
			}
		}
		return max;

	}

	public int maxArea2(int[] height) {
		if (height == null || height.length <= 1) {
			return 0;
		}
		int max = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				max = Math.max(Math.min(height[i], height[j]) * (j - i), max);
			}
		}

		return max;
	}


}
