package com.learn.java.leetcode.lc0062;

/**
 * 62. Unique Paths 62. 不同路径 Medium
 */
public class Solution {
	/**
	 * 这道题实际是求C(m+n-2,m-1)
	 * 机器人一定会走m+n-2步，即从m+n-2中挑出m-1步向下走不就行了吗？即C（（m+n-2），（m-1））。
	 *
	 * @param m
	 * @param n
	 * @return
	 */
	public int uniquePaths(int m, int n) {
		if (m == 1 || n == 1) {
			return 1;
		}
		int min = Math.min(m, n);
		int max = Math.max(m, n);
		double result = 1;

		for (int i = 1; i <= min - 1; i++) {
			result *= (i + max - 1);
			result /= i;
		}

		return (int) result;
	}

	/**
	 * 借助空间计算
	 *
	 * @param m
	 * @param n
	 * @return
	 */
	public int uniquePaths2(int m, int n) {
		int[][] dp = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}
			}
		}
		return dp[m - 1][n - 1];
	}
}
