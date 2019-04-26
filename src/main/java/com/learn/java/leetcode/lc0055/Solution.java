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
		int max_dis = indexes[0];
		for(int i = 1;i<nums.length;i++){
			if(i<=max_dis&&indexes[i]>max_dis){
				max_dis = indexes[i];
			}
		}
		if(max_dis<nums.length-1) {
			return false;
		}
		return true;
	}
}
