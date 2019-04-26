package com.learn.java.leetcode.lc0045;

import java.util.Stack;

public class Solution {
	public int jump(int[] nums) {
		if(nums==null||nums.length<2){
			return 0;
		}
		//当前能到达的最远距离
		int max_dis = nums[0];
		//当前可能到达的最远距离
		int pre_dis = nums[0];
		//最小跳次数，最小跳1次
		int jump_min = 1;
		for(int i = 1;i<nums.length;i++){
			if(max_dis<i){
				jump_min++;
				max_dis = pre_dis;
			}
			if(pre_dis<nums[i]+i){
				pre_dis = nums[i]+i;
			}
		}
		return jump_min;
	}
}
