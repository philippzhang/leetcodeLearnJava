package com.learn.java.leetcode.lc0044;

public class Solution {
	/**
	 * 动态规划
	 * @param s
	 * @param p
	 * @return
	 */
	public boolean isMatch(String s, String p) {
		//dp[i][j] 表示p[j]是否模式匹配s[i-1]
		boolean[][] dp = new boolean[p.length()+1][s.length()+1];
		dp[0][0]=true;
		for(int i = 1;i<=p.length();i++){
			if(p.charAt(i-1)=='*'){
				dp[i][0] = dp[i-1][0];
				for(int j =1;j<=s.length();j++){
					dp[i][j] = dp[i][j-1]||dp[i-1][j];
				}
			}else if(p.charAt(i-1)=='?'){
				for(int j = 1;j<=s.length();j++){
					dp[i][j]=dp[i-1][j-1];
				}
			}else {
				for(int j = 1;j<=s.length();j++){
					dp[i][j]=s.charAt(j-1)==p.charAt(i-1)&&dp[i-1][j-1];
				}
			}
		}

		return dp[p.length()][s.length()];
	}
}
