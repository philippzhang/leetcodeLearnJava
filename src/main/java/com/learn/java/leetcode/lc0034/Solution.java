package com.learn.java.leetcode.lc0034;

public class Solution {
	public int[] searchRange(int[] nums, int target) {
		int[] results = {-1,-1};
		if(nums==null||nums.length==0){
			return results;
		}
		int left = getLeftRange(nums,target);
		int right= getRightRange(nums,target);
		results[0] = left;
		results[1] = right;
		return results;
	}

	private int getLeftRange(int[] nums,int target){
		int begin = 0;
		int end = nums.length-1;
		while(begin<=end){
			int mid = (begin+end)/2;
			if(nums[mid]==target){
				if(mid ==0||nums[mid-1]<target){
					return mid;
				}
				end = mid -1;
			}else if(target<nums[mid]){
				end = mid-1;
			}else {
				begin = mid+1;
			}
		}
		return -1;
	}

	private int getRightRange(int[] nums,int target){
		int begin = 0;
		int end = nums.length-1;
		while(begin<=end){
			int mid = (begin+end)/2;
			if(nums[mid]==target){
				if(mid ==nums.length-1||nums[mid+1]>target){
					return mid;
				}
				begin = mid +1;
			}else if(target<nums[mid]){
				end = mid-1;
			}else {
				begin = mid+1;
			}
		}
		return -1;
	}
}
