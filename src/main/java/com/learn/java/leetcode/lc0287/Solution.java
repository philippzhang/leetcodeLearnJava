package com.learn.java.leetcode.lc0287;

public class Solution {
	/**
	 * 二分查找
	 * @param nums
	 * @return
	 */
	public int findDuplicate2(int[] nums) {
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

	/**
	 * 快慢指针，重复数据会形成环路
	 * @param nums
	 * @return
	 */
	public int findDuplicate(int[] nums) {
		int fast = 0;
		int low = 0;
		while(true){
			fast = nums[nums[fast]];
			low = nums[low];
			if(fast==low){
				break;
			}
		}
		low = 0;
		while(true){
			low = nums[low];
			fast = nums[fast];
			if(fast==low){
				break;
			}
		}

		return low;

	}
}
