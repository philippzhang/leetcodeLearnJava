package com.learn.java.leetcode.lc0054;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. Spiral Matrix 54. 螺旋矩阵 Medium
 */
public class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> results = new ArrayList<>();
		if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
			return results;
		}
		int wide = matrix[0].length;
		int height = matrix.length;

		int up = 0;
		int right = wide - 1;
		int down = height - 1;
		int left = 0;

		while (up <= down && left <= right) {

			for (int i = left; i <= right; i++) {
				results.add(matrix[up][i]);
			}
			up++;


			for (int i = up; i <= down; i++) {
				results.add(matrix[i][right]);
			}
			right--;

			if (up <= down) {
				for (int i = right; i >= left; i--) {
					results.add(matrix[down][i]);
				}
				down--;

			}
			if (left <= right) {
				for (int j = down; j >= up; j--) {
					results.add(matrix[j][left]);
				}
				left++;
			}

		}

		return results;
	}

	public List<Integer> spiralOrder2(int[][] matrix) {
		List<Integer> results = new ArrayList<>();
		if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
			return results;
		}
		int wide = matrix[0].length;
		int height = matrix.length;

		int up = 0;
		int right = wide - 1;
		int down = height - 1;
		int left = 0;

		while (up <= down && left <= right) {

			if (up == down && left == right) {
				results.add(matrix[up][left]);
			} else if (up == down) {
				for (int i = left; i <= right; i++) {
					results.add(matrix[up][i]);
				}
			} else if (left == right) {
				for (int j = up; j <= down; j++) {
					results.add(matrix[j][right]);
				}
			} else {
				if (up < down) {
					for (int i = left; i < right; i++) {
						results.add(matrix[up][i]);
					}
				}
				if (left < right) {
					for (int j = up; j < down; j++) {
						results.add(matrix[j][right]);
					}
				}
				if (up < down) {
					for (int i = right; i > left; i--) {
						results.add(matrix[down][i]);
					}
				}
				if (left < right) {
					for (int j = down; j > up; j--) {
						results.add(matrix[j][left]);
					}
				}
			}


			if (up < down) {
				up++;
				down--;
			} else {
				break;
			}

			if (left < right) {
				right--;
				left++;
			} else {
				break;
			}

		}
		return results;
	}
}
