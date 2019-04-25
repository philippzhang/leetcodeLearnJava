package com.learn.java.leetcode.lc0059;

/**
 * 59. Spiral Matrix II 59. 螺旋矩阵 II Medium
 */
public class Solution {
	public int[][] generateMatrix(int n) {
		if (n <= 0) {
			return null;
		}
		int[][] results = new int[n][n];
		int left = 0;
		int right = n - 1;
		int up = 0;
		int down = n - 1;
		int count = 1;
		while (up <= down && left <= right) {
			for (int i = left; i <= right; i++) {
				results[up][i] = count++;
			}
			up++;

			for (int i = up; i <= down; i++) {
				results[i][right] = count++;
			}

			right--;

			for (int i = right; i >= left; i--) {
				results[down][i] = count++;
			}
			down--;

			for (int i = down; i >= up; i--) {
				results[i][left] = count++;
			}
			left++;
		}

		return results;
	}
}
