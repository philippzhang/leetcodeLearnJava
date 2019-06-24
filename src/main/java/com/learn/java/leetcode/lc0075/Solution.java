package com.learn.java.leetcode.lc0075;

public class Solution {
	/**
	 * 计数排序
	 * @param nums
	 */
	public void sortColors2(int[] nums) {
		int[] counts = new int[3];
		for(int n:nums){
			counts[n]++;
		}
		int c = counts[0];
		int j = 0;
		for(int i =0;i<nums.length;i++){
			if(i<c){
				nums[i] = j;
			}else{
				j++;
				c += counts[j];
				i--;
			}
		}
	}

	/**
	 * 荷兰国旗
	 * @param nums
	 */
	public void sortColors(int[] nums) {
		int l = 0;
		int r = nums.length - 1;
		int less = l - 1;
		int more = r + 1;
		while(l < more){
			if(nums[l] < 1) {
				swap(nums, ++less, l++);
			} else if(nums[l] > 1) {
				swap(nums, --more, l);
			} else {
				l++;
			}
		}
	}
	public void swap(int[] nums, int i, int j){
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
}
