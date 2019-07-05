package com.learn.java.leetcode.lc0283;

public class Solution {
	public void moveZeroes(int[] nums) {
		if(nums==null||nums.length<=1){
			return;
		}
		int j = -1;
		for(int i =0;i<nums.length;i++){
			if(nums[i]==0){
				j = i+1;
				while(j<nums.length&&nums[j]==0){
					j++;
				}
				if(j<nums.length){
					nums[i] = nums[j];
					nums[j]=0;
				}
			}
		}
	}
}
