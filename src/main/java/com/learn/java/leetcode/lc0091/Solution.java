package com.learn.java.leetcode.lc0091;

public class Solution {
	public int numDecodings(String s) {
		if(s==null||s.length()==0||s.length()==1&&s.equals("0")){
			return 0;
		}
		if(s.length()==1){
			return 1;
		}
		int length = s.length();
		int[] dp = new int[length+1];
		dp[0] = 1;
		for(int i = 0;i<length;i++){
			dp[i+1] = s.charAt(i)=='0'?0:dp[i];
			if(i>0&&(s.charAt(i-1)=='1'||s.charAt(i-1)=='2'&&s.charAt(i)<='6')){
				dp[i+1] += dp[i-1];
			}
		}

		return dp[length];
	}
}
