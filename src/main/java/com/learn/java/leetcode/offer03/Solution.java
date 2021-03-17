package com.learn.java.leetcode.offer03;

public class Solution {
	public int findRepeatNumber(int[] nums) {
		for(int i = 0;i<nums.length;i++){
			nums[i]+=1;
		}
		for(int i =0;i<nums.length;i++){
			int index = Math.abs(nums[i])-1;
			if(nums[index]<0){
				return index;
			}
			nums[index] *= (-1);
		}
		return -1;
	}
}
