package com.learn.java.leetcode.lc0063;

/**
 * 63. Unique Paths II 63. 不同路径 II Medium
 */
public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid == null) {
			return 0;
		}
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		if (m == 0 || n == 0) {
			return 0;
		}

		int[][] results = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j == 0) {
					results[i][j] = 1;
				} else if (i == 0) {
					results[i][j] = results[i][j - 1];
				} else if (j == 0) {
					results[i][j] = results[i - 1][j];
				} else {
					results[i][j] = results[i][j - 1] + results[i - 1][j];
				}
				if (obstacleGrid[i][j] == 1) {
					results[i][j] = 0;
				}
			}
		}

		return results[m - 1][n - 1];
	}
}
