package com.learn.java.leetcode.lc0647;

public class Solution {
	int num = 0;
	public int countSubstrings(String s) {
		for(int i=0;i<s.length();i++){
			//回文长度为奇数
			helper(s,i,i);
			//回文长度为偶数
			helper(s,i,i+1);
		}
		return num;
	}

	private void helper(String s,int start,int end){
		while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
			num++;
			start--;
			end++;
		}
	}


	public int countSubstrings2(String s) {
		int cnt = 0;
		int n = s.length();
		char[] charArr = s.toCharArray();
		boolean[][] dp = new boolean[n][n];
		for(int i=n-1;i>=0;i--){//因为要记录dp[i+1][j-1]所以必然要从后向前
			for(int j=i;j<n;j++){
				boolean flag = false;
				flag = ((j-i)<=2)&&charArr[i]==charArr[j];//形如ab，aba
				flag = flag || (charArr[i]==charArr[j] && dp[i+1][j-1]);//形如acdca,a=a，cdc为回文
				if(flag){
					dp[i][j]=true;
					cnt++;
				}
			}
		}
		return cnt;
	}
}
