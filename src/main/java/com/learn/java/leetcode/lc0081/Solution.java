package com.learn.java.leetcode.lc0081;

public class Solution {
	public boolean search(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		while(left<=right){
			int mid = (left+right)/2;
			if(nums[mid]==target){
				return true;
			}else if(nums[mid]>nums[left]){
				//左侧升序
				if(target>=nums[left]&&target<=nums[mid]){
					right = mid-1;
				}else{
					left = mid+1;
				}
			}else if(nums[mid]<nums[left]){
				//右侧升序
				if(target>=nums[mid]&&target<=nums[right]){
					left = mid+1;
				}else{
					right = mid-1;
				}
			}else{
				//nums[mid]==nums[left]
				left++;
			}

		}
		return false;
	}
}
