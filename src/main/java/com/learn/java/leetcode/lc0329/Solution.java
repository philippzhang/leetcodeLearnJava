package com.learn.java.leetcode.lc0329;

import java.util.*;

public class Solution {
	private static final int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	public int longestIncreasingPath2(int[][] matrix) {
		int m = matrix.length;
		if (m == 0) {
			return 0;
		}
		int n = matrix[0].length;

		int[][] matrixNew = new int[m + 2][n + 2];
		for (int i = 0; i < m; i++) {
			System.arraycopy(matrix[i], 0, matrixNew[i + 1], 1, n);
		}

		int[][] dp = new int[m + 2][n + 2];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				for (int[] d : dir) {
					if (matrixNew[i][j] < matrixNew[i + d[0]][j + d[1]]) {
						dp[i][j]++;
					}
				}
			}
		}


		List<int[]> leaves = new ArrayList<>();
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (dp[i][j] == 0) {
					leaves.add(new int[]{i, j});
				}
			}
		}

		int height = 0;
		while (!leaves.isEmpty()) {
			height++;
			List<int[]> newLeaves = new ArrayList<>();
			for (int[] node : leaves) {
				for (int[] d : dir) {
					int x = node[0] + d[0];
					int y = node[1] + d[1];
					if (matrixNew[node[0]][node[1]] > matrixNew[x][y]) {
						if (--dp[x][y] == 0) {
							newLeaves.add(new int[]{x, y});
						}
					}
				}
			}
			leaves = newLeaves;
		}
		return height;
	}

	/**
	 * 带记忆化的dfs 时间O(mn) 空间O(mn)
	 * @param matrix
	 * @return
	 */
	public int longestIncreasingPath(int[][] matrix) {
		if (matrix.length == 0) {
			return 0;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] cache = new int[m][n];
		int ans = 0;
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				ans = Math.max(ans, dfs(matrix, i, j,m,n, cache));
			}
		}
		return ans;
	}

	private int dfs(int[][] matrix, int i, int j,int m,int n, int[][] cache) {
		if (cache[i][j] != 0) {
			return cache[i][j];
		}
		for (int[] d : dir) {
			int x = i + d[0], y = j + d[1];
			if (0 <= x && x < m && 0 <= y && y < n && matrix[x][y] > matrix[i][j]) {
				cache[i][j] = Math.max(cache[i][j], dfs(matrix, x, y,m,n, cache));
			}
		}
		return ++cache[i][j];
	}


	/**
	 * 动态规划
	 * @param matrix
	 * @return
	 */
	public int longestIncreasingPath1(int[][] matrix) {
		if (matrix.length == 0) {
			return 0;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		//元素入最小堆，数组下标0-value，数组下标1-matrix中y坐标，数组下标2-matrix中x坐标，最小堆以value排序
		Queue<int[]> minDump = new PriorityQueue<>(Comparator.comparingInt(p -> p[0]));
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				minDump.offer(new int[]{matrix[i][j],i,j});
			}
		}
		//dp(记录当前元素累积到的最大递增路径长度)
		int[][] dp = new int[m][n];
		//实时记录最大路径，作为返回值返回
		int maxLength = 0;
		//元素从小到大开始dp(保证大的元素排在小的元素后被累积)
		while(!minDump.isEmpty()){
			int[] curElement = minDump.poll();
			int value = curElement[0];
			int x = curElement[1];
			int y = curElement[2];
			int curMax = 1;
			//四个方向比较最大路径(如果matrix元素大于周边的元素，则最长路径在周边dp的基础上+1)

			for(int[] d:dir){
				int newx = x+d[0];
				int newy = y+d[1];
				if(newx>=0&&newx<m&&newy>=0&&newy<n&&value>matrix[newx][newy]){
					curMax = Math.max(curMax,dp[newx][newy]+1);
				}
			}
			//累积dp
			dp[x][y] = curMax;
			//实时记录最大值
			maxLength = Math.max(maxLength,curMax);
		}
		return maxLength;
	}

}
