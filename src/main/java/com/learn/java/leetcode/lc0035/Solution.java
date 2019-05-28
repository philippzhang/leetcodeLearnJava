package com.learn.java.leetcode.lc0035;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		if(nums==null||nums.length==0){
			return 0;
		}
		int begin = 0;
		int end = nums.length-1;
		//插入位置
		int index = -1;
		while(index==-1){
			int mid = (begin+end)/2;
			if(nums[mid]==target){
				return mid;
			}
			else if(nums[mid]>target){
				if(mid==0||target>nums[mid-1]){
					index = mid;
				}
				end = mid-1;

			}else{
				if(mid==nums.length-1||target<nums[mid+1]){
					index = mid+1;
				}
				begin = mid+1;
			}
		}
		return index;
	}
}
