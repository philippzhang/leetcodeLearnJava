package com.learn.java.leetcode.offer14i;

public class Solution {
	/**
	 * 数学推导，尽可能将绳子以长度3等分为多段时，乘积最大 O(1)
	 * @param n
	 * @return
	 */
	public int cuttingRope(int n) {
		if(n<=3){
			return n-1;
		}
		int a = n/3;
		int b= n%3;
		if(b==0){
			return (int)Math.pow(3,a);
		}else if(b==1){
			return (int)Math.pow(3,a-1)*4;
		}else{
			return (int)Math.pow(3,a)*2;
		}
	}

	/**
	 * 采用动态规划 O(mn)
	 * @param n
	 * @return
	 */
	public int cuttingRope2(int n) {
		int[] dp = new int[n+1];
		//n=2是，值为1
		dp[2] = 1;
		//i从3遍历到n
		for(int i =3;i<=n;i++){
			//j表示每一段的长度，最少是1,最大是i-2, i-1会使最大值变小
			//i-j>=2
			for(int j =1 ;j<=i-2;j++){
				dp[i] = Math.max(Math.max(dp[i-j],i-j)*j,dp[i]);
			}

		}

		return dp[n];
	}
}
