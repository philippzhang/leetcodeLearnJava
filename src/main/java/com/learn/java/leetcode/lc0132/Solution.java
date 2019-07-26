package com.learn.java.leetcode.lc0132;

public class Solution {
	/**
	 * dp[i]表示前 i 个字符组成的子串，最少需要几次分割，才能变成都是回文串
	 * 对于所有的 j < i， 如果s[j, i]是回文串, 且 dp[j] + 1 < dp[i] 则 dp[i] = dp[j] + 1
	 * @param s
	 * @return
	 */
	public int minCut(String s) {
		int n  = s.length();
		int[] dp = new int[n+1];
		dp[0] = -1;

		for(int i = 1;i<=n;i++){
			dp[i] = i;
			for(int j = 0;j<i;j++){
				if(isPalindrome(s,j,i-1)){
					dp[i] = Math.min(dp[j]+1,dp[i]);
				}
			}

		}
		return dp[n];
	}


	private boolean isPalindrome(String s,int start,int end){

		while(start<end){
			if(s.charAt(start)!=s.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
