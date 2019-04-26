package com.learn.java.leetcode.lc0055;

public class Solution {
	public boolean canJump(int[] nums) {
		if(nums==null||nums.length==0){
			return false;
		}
		int[] indexes = new int[nums.length];
		for(int i =0;i<nums.length;i++){
			indexes[i]=i+nums[i];
		}
		int max_step = indexes[0];
		for(int i = 1;i<nums.length;i++){
			if(i<=max_step&&indexes[i]>max_step){
				max_step = indexes[i];
			}
		}
		if(max_step<nums.length-1) {
			return false;
		}
		return true;
	}
}
