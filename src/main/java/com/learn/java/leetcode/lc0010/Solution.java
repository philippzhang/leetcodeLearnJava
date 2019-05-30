package com.learn.java.leetcode.lc0010;

public class Solution {
	public boolean isMatch(String s, String p) {
		char[] sArr = s.toCharArray();
		char[] pArr = p.toCharArray();
		int m = sArr.length;
		int n = pArr.length;
		//dp[i][j]为是前i个字符和p的前j个字符能否匹配
		boolean[][] dp = new boolean[m+1][n+1];

		//空串与空模式匹配
		//j=0&&i!=0空表达式与非空串
		dp[0][0] = true;

		for(int i = 0;i<=m;i++){
			for(int j =1;j<=n;j++){
				if(pArr[j-1]=='*'){

					//pArr[j-1]为'*',代表pArr[n-2]=c可以重复0次或多次，他们是一个整体c*

					//sArr[i-1]是0个c，能否匹配取决于s[0..i-1]和p[0..j-3]能否匹配

					//sArr[i-1]是多个c中的最后一个，能否匹配取决于s[0..i-2]和p[0..j-1]能否匹配

					dp[i][j]= j>=2&&dp[i][j-2] || i>=1&&j>=2 &&dp[i-1][j]&&(pArr[j-2]=='.'||pArr[j-2]==sArr[i-1]);
				}else{
					//pArr[j-1]为正常字符（非.非*），若sArr[i-1]==pArr[j-1]，
					//pArr[j-1]为'.',则sArr[i-1]一定与'.'匹配
					//以上两种情况能否匹配取决于s[0..i-2]和p[0..j-2]能否匹配

					dp[i][j] = i>0&&(pArr[j-1]=='.'||sArr[i-1]==pArr[j-1]) &&dp[i-1][j-1];

				}
			}
		}
		return dp[m][n];
	}
}
