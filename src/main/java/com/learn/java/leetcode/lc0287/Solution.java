package com.learn.java.leetcode.lc0287;

public class Solution {
	/**
	 * 二分查找
	 * @param nums
	 * @return
	 */
	public int findDuplicate(int[] nums) {
		int len = nums.length;
		int left = 1;
		int right = len-1;
		while(left<right){
			int mid = (left+right)/2;
			int count = 0;
			for(int n:nums){
				if(n<=mid){
					count++;
				}
			}
			if(count>mid){
				right = mid;
			}else{
				left = mid+1;
			}
		}
		return left;
	}
}
