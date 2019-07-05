package com.learn.java.leetcode.lc0204;

public class Solution {
	/**
	 * 厄拉多塞筛法
	 * @param n
	 * @return
	 */
	public int countPrimes(int n) {
		if(n<=2){
			return 0;
		}
		int[] output = new int[n];
		for(int i = 2;i<n;i++){
			output[i] = 1;
		}
		int i = 2;
		while (i*i<n){
			for(int j =2;j<(n-1)/i+1;j++){
				output[i*j]=0;
			}
			i++;
		}

		int sum = 0;
		for( i = 2;i<n;i++){
			if(output[i] == 1){
				sum++;
			}
		}
		return sum;
	}
}
