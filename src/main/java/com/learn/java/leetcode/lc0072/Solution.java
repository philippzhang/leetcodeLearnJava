package com.learn.java.leetcode.lc0072;

public class Solution {
	/**
	 * 动态规划
	 * @param word1
	 * @param word2
	 * @return
	 */
	public int minDistance(String word1, String word2) {
		int m = word1.length();
		int n = word2.length();
		//dp[i][j] 代表最小操作数（步骤），从 word1[0..i-1]转化为 word2[0..j-1].
		int[][] dp = new int[m+1][n+1];
		for(int i =0;i<=m;i++){
			dp[i][0] = i;
		}
		for(int i =0;i<=n;i++){
			dp[0][i] = i;
		}
		for(int i =1;i<=m;i++){
			for(int j=1;j<=n;j++){
				//word1 的 i 个字母 与 word2 的 第 j 个字母 相同
				//                     DP[i][j] =  DP[i-1][j-1]  #不操作
				if(word1.charAt(i-1)==word2.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1];
				}else{
					/**
					 * word1 插入一个字符   DP[i-1][j] + 1 ->  DP[i][j]
					 *         word1 删除一个字符 = word2 插入一个字符  DP[i][j-1] + 1 -> DP[i][j]
					 *         word1 替换一个字符 = word1 word2 都替换一个字符 DP[i-1][j-1] + 1 -> DP[i][j]
					 */
					dp[i][j] = 1+ Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
				}
			}
		}
		return dp[m][n];
	}
}
