package com.learn.java.leetcode.lc0041;

import java.util.HashSet;

import java.util.Set;

public class Solution {

	/**
	 * 时间O(n),空间O(1)
	 * @param nums
	 * @return
	 */
	public int firstMissingPositive(int[] nums) {
		int min =1;
		if(nums==null||nums.length<=0){
			return min;
		}
		int count = 0;
		for(int n:nums){
			if(n==1){
				count++;
				break;
			}
		}
		if(count==0){
			return min;
		}
		// 把所有 负数和0和超出数组长度的数 都置1
		for(int i=0;i<nums.length;i++){
			if(nums[i]<=0||nums[i]>nums.length){
				nums[i] = 1;
			}
		}

		//如果是升序，转为负数
		for(int i = 0;i<nums.length;i++){
			int n = Math.abs(nums[i]);
			if(nums[n-1]>0){
				nums[n-1] = -nums[n-1];
			}
		}

		for(int i=0;i<nums.length;i++){
			if(nums[i]>0){
				return i+1;
			}
		}

		return nums.length+1;
	}
	/**
	 * 时间O(n),空间O(n)
	 * @param nums
	 * @return
	 */
	public int firstMissingPositive2(int[] nums) {
		int min =1;
		if(nums==null||nums.length<=0){
			return min;
		}
		Set<Integer> set = new HashSet<>();
		for(int n:nums){
			set.add(n);
		}
		while(set.contains(min)){
			min++;
		}
		return min;

	}
}
