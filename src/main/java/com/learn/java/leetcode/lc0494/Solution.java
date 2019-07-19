package com.learn.java.leetcode.lc0494;

public class Solution {
	int sum =0;

	/**
	 * BFS
	 * @param nums
	 * @param S
	 * @return
	 */
	public int findTargetSumWays2(int[] nums, int S) {
		BFS(nums,S,0,0);
		return sum;
	}
	private void BFS(int[] nums,int S,int temp,int i){
		if(i==nums.length){
			sum = temp==S? sum+1:sum;
			return;
		}

		BFS(nums,S,temp+nums[i],i+1);
		BFS(nums,S,temp-nums[i],i+1);
	}

	/**
	 * sum(P) 前面符号为+的集合；sum(N) 前面符号为减号的集合
	 * 以题目可以转化为
	 * sum(P) - sum(N) = target
	 * => sum(nums) + sum(P) - sum(N) = target + sum(nums)
	 * => 2 * sum(P) = target + sum(nums)
	 * => sum(P) = (target + sum(nums)) / 2
	 * 因此题目转化为01背包，也就是能组合成容量为sum(P)的方式有多少种
	 * @param nums
	 * @param S
	 * @return
	 */
	public int findTargetSumWays(int[] nums, int S) {
		int sum = 0;
		for(int n:nums){
			sum+=n;
		}
		if(sum<S||((sum+S)&1)==1){
			return 0;
		}

		int w  = (sum+S)>>1;
		int[] dp = new int [w+1];
		dp[0] = 1;
		for(int n:nums){
			for(int j =w;j>=n;j--){
				dp[j] += dp[j-n];
			}
		}
		return dp[w];
	}



}
