package com.learn.java.leetcode.lc0416;

public class Solution {
	/**
	 * 0-1 背包问题也是最基础的背包问题，它的特点是：待挑选的物品有且仅有一个，可以选择也可以不选择。
	 *
	 * dp[i][j] ：表示从数组的 [0, i] 这个子区间内挑选一些正整数，每个数只能用一次，使得这些数的和等于 j。
	 *
	 * 根据我们学习的 0-1 背包问题的状态转移推导过程，新来一个数，例如是 nums[i]，根据这个数可能选择也可能不被选择：
	 *
	 * 如果不选择 nums[i]，在 [0, i - 1] 这个子区间内已经有一部分元素，使得它们的和为 j ，那么 dp[i][j] = true；
	 * 如果选择 nums[i]，在 [0, i - 1] 这个子区间内就得找到一部分元素，使得它们的和为 j - nums[i] ，我既然这样写出来了，你就应该知道，这里讨论的前提条件是 nums[i] <= j。
	 * 以上二者成立一条都行。于是得到状态转移方程是：
	 *
	 * dp[i][j] = dp[i - 1][j] or dp[i - 1][j - nums[i]], (nums[i] <= j)
	 *
	 * @param nums
	 * @return
	 */
	public boolean canPartition(int[] nums) {
		int size = nums.length;
		if(size ==0 ){
			return false;
		}

		int s = 0;
		for(int n:nums){
			s+=n;
		}

		if((s&1)==1){
			return false;
		}

		int target = s>>1;

		boolean[][] dp = new boolean[size][target+1];

		for(int i =1;i<target+1;i++){
			if(nums[0]==i){
				dp[0][i] = true;
			}
		}

		for(int i =1;i<size;i++){
			for(int j = 0;j<target+1;j++){
				dp[i][j] = dp[i-1][j];
				if(j>=nums[i]){
					dp[i][j] = dp[i-1][j]||dp[i-1][j-nums[i]];
				}
			}
		}

		return dp[size-1][target];
	}
}
