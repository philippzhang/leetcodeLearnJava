package com.learn.java.leetcode.lc0080;



public class Solution {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int index = 1;
		int temp = nums[0];
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]==temp&&count>0){
				nums[index++] = nums[i];
				count--;
			}else if (nums[i] != temp) {
				nums[index++] = nums[i];
				temp = nums[i];
				if(i>index){
					nums[i] = Integer.MIN_VALUE;
				}
				count = 1;
			}
		}
		return index;
	}
}
