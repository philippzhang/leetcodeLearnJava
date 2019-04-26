package com.learn.java.leetcode.lc0376;

/**
 * 376. Wiggle Subsequence 376. 摆动序列 Medium
 */
public class Solution {
	enum STATE{
		BEGIN,UP,DOWN
	}
	public int wiggleMaxLength(int[] nums) {
		if(nums==null||nums.length==0){
			return 0;
		}
		int count =1 ;
		STATE state = STATE.BEGIN;

		for(int i = 1;i<nums.length;i++){
			switch (state){
				case BEGIN:
					if(nums[i]>nums[i-1]){
						state=STATE.UP;
						count++;
					}else if(nums[i]<nums[i-1]){
						state=STATE.DOWN;
						count++;
					}
					break;
				case UP:
					if(nums[i]<nums[i-1]){
						state=STATE.DOWN;
						count++;
					}
					break;
				case DOWN:
					if(nums[i]>nums[i-1]){
						state=STATE.UP;
						count++;
					}
					break;
			}
		}

		return count;
	}
}
