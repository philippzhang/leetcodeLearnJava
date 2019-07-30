package com.learn.java.leetcode.lc0153;

public class Solution {
	//int min  = Integer.MAX_VALUE;
	public int findMin(int[] nums) {
		if(nums.length==1){
			return nums[0];
		}
		if(nums.length==2){
			return Math.min(nums[0],nums[1]);
		}
		int left = 0,right = nums.length-1;

		return findMinBinary(nums,left,right);
	}

	private int findMinBinary(int[] nums,int left,int right){
		if(left==right){
			return nums[left];
		}
		if(left==right-1){
			return Math.min(nums[left],nums[right]);
		}

		int middle = (left+right)/2;
		if(nums[left]<nums[right]) {
			//递增序列
			return nums[left];
		}else{
			if (nums[left] < nums[middle]){
				//最小点在middle右侧
				return findMinBinary(nums,middle+1, right);
			}else{
				//if (nums[left] > nums[middle]){
				//最小点在middle左侧
				return findMinBinary(nums,left+1, middle);
			}
		}


	}
}
