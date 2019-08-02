package com.learn.java.leetcode.lc0334;



public class Solution {

	/**
	 * 贪心算法
	 * @param nums
	 * @return
	 */
	public boolean increasingTriplet(int[] nums) {
		int one = Integer.MAX_VALUE;
		int two = Integer.MAX_VALUE;

		for (int n : nums) {
			if (n <= one) {
				one = n;
			} else if (n <= two) {
				two = n;
			} else {
				return true;
			}
		}

		return false;
	}
	/**
	 * 动态规划
	 * @param nums
	 * @return
	 */
	public boolean increasingTriplet2(int[] nums) {
		if(nums.length<3){
			return false;
		}

		if(nums.length==3){
			return nums[0]<nums[1]&&nums[1]<nums[2];
		}

		int[] dp = new int[nums.length];
		dp[0] = 1;
		int maxval;

		for(int i = 1;i<nums.length;i++){
			maxval = 1;
			for(int j =i-1;j>=0;j--){
				if(nums[i]>nums[j]&&dp[j]+1>maxval){
					maxval = dp[j]+1;
				}
				dp[i] = maxval;
				if(dp[i]>=3){
					return true;
				}
			}
		}

		return false;

	}
}
