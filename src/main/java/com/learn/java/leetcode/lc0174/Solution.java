package com.learn.java.leetcode.lc0174;

public class Solution {
	public int calculateMinimumHP(int[][] dungeon) {
		if(dungeon==null||dungeon.length==0){
			return 0;
		}
		int row = dungeon.length;
		int col = dungeon[0].length;
		int[][] dp = new int[row][col];
		dp[row-1][col-1] = Math.max(1,1-dungeon[row-1][col-1]);
		for(int i = col-2;i>=0;i--){
			dp[row-1][i] = Math.max(1, dp[row-1][i+1] - dungeon[row-1][i]);
		}
		for(int i = row-2;i>=0;i--){
			dp[i][col-1] = Math.max(1, dp[i+1][col-1] - dungeon[i][col-1]);
		}
		for(int i = row-2;i>=0;i--){
			for(int j = col-2;j>=0;j--){
				int dpMin = Math.min(dp[i][j+1],dp[i+1][j]);
				dp[i][j] = Math.max(1,dpMin-dungeon[i][j]);
			}
		}


		return dp[0][0];
	}
}
