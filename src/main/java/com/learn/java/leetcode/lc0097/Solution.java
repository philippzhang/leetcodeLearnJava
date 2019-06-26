package com.learn.java.leetcode.lc0097;

public class Solution {
	public boolean isInterleave(String s1, String s2, String s3) {
		if((s1+s2).equals(s3)){
			return true;
		}
		if(s1.length()+s2.length()!=s3.length()){
			return false;
		}
		//dp[i][j]表示s1前i项(不包括i)以及s2的前j项可以组成s3前i+j项
		boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
		dp[0][0] = true;
		char[] chars1 = s1.toCharArray();
		char[] chars2 = s2.toCharArray();
		char[] chars3 = s3.toCharArray();

		for(int i =0;i<=chars1.length;i++){
			for(int j =0;j<=chars2.length;j++){
				if(i>0&&dp[i-1][j]&&chars1[i-1]==chars3[i+j-1]){
					dp[i][j] = true;
				}else if(j>0&&dp[i][j-1]&&chars2[j-1]==chars3[i+j-1]){
					dp[i][j] = true;
				}
			}
		}

		return dp[s1.length()][s2.length()];


	}
}
