package com.learn.java.leetcode.lc0313;

public class Solution {
	public int nthSuperUglyNumber(int n, int[] primes) {
		int[] dp = new int[n];
		dp[0] = 1;
		int[] counts = new int[primes.length];

		for(int i =1;i<n;i++){
			int min = Integer.MAX_VALUE;
			for(int j = 0;j<primes.length;j++){
				if(primes[j]*dp[counts[j]]<min){
					min = primes[j]*dp[counts[j]];
				}
			}

			for(int j = 0;j<primes.length;j++){
				if(primes[j]*dp[counts[j]]==min){
					counts[j]++;
				}
			}


			dp[i] = min;

		}



		return dp[n-1];

	}
}
