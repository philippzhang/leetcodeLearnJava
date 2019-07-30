package com.learn.java.leetcode.lc0162;

public class Solution {
	/**
	 * 时间O(n) 空间O(1）
	 * @param nums
	 * @return
	 */
	public int findPeakElement1(int[] nums) {
		for(int i = 0;i<nums.length-1;i++){
			if(nums[i]>nums[i+1]){
				return i;
			}
		}
		return nums.length-1;
	}

	/**
	 * 时间O(logn) 空间O(logn）
	 * @param nums
	 * @return
	 */
	public int findPeakElement2(int[] nums) {
		return findPeakElementBinary(nums,0,nums.length-1);
	}
	private int findPeakElementBinary(int[] nums ,int left,int right){
		if(left==right){
			return left;
		}
		int middle = (left+right)/2;
		if(nums[middle]>nums[middle+1]){
			return findPeakElementBinary(nums,left,middle);
		}else{
			return findPeakElementBinary(nums,middle+1,right);
		}
	}

	/**
	 * 时间O(logn) 空间O(1）
	 * @param nums
	 * @return
	 */
	public int findPeakElement(int[] nums) {
		int left = 0 ,right = nums.length-1;
		while(left<right){
			int middle = (left+right)/2;
			if(nums[middle]>nums[middle+1]){
				right = middle;
			}else{
				left =middle+1;
			}
		}
		return left;
	}
}
