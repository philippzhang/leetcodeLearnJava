package com.learn.java.leetcode.offer19;

public class Solution {
	/**
	 * 我们用 f[i][j] 表示 s 的前 i 个字符与 p 中的前 j 个字符是否能够匹配
	 * @param s
	 * @param p
	 * @return
	 */
	public boolean isMatch(String s, String p) {
		int m = s.length();
		int n = p.length();
		boolean[][] dp = new boolean[m+1][n+1];
		dp[0][0] = true;
		for(int i = 0;i<=m;i++){
			for(int j =1;j<=n;j++){
				if(p.charAt(j-1)=='*'){
					//如果s的前i个字符和p的前j - 2个字符匹配，这时p的第j个字符为'*'
					//那么无论p的第j-1个字符是什么，令它出现0次，dp[i][j]就可以为true
					dp[i][j] = dp[i][j-2];
					if(matcher(s,p,i,j-1)){

						//如果s的前i - 1个字符和p的前j个字符匹配，并且s的第i个字符和p的第j - 1个字符相等
                        //那么让p的第j - 1个字符多出现一次，s的前i字符和p的前j的字符就可以匹配了
						dp[i][j] = dp[i][j]||dp[i-1][j];
					}
				}else{
					if(matcher(s,p,i,j)){
						dp[i][j] = dp[i-1][j-1];
					}
				}
			}
		}

		return dp[m][n];
	}

	/**
	 * 其中 matches(x,y) 判断两个字符是否匹配的辅助函数。
	 * 只有当 y 是 . 或者 x 和 y 本身相同时，这两个字符才会匹配。
	 *
	 * @param s
	 * @param p
	 * @param i
	 * @param j
	 * @return
	 */
	private boolean matcher(String s,String p,int i,int j){
		if(j==0&&i==0){
			return true;
		}else if(j==0||i==0){
			return false;
		}
		if(p.charAt(j-1)=='.'){
			return true;
		}

		return s.charAt(i-1)==p.charAt(j-1);

	}
}
