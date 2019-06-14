package com.learn.java.leetcode.lc0031;

public class Solution {
	/**
	 * 从数组倒着查找，找到nums[i] 比nums[i+1]小的时候，
	 * 就将nums[i]跟nums[i+1]到nums[nums.length - 1]当中找到一个最小的比nums[i]大的元素交换。
	 * 交换后，再把nums[i+1]到nums[nums.length-1]排序
	 * @param nums
	 */
	public void nextPermutation(int[] nums) {
		if(nums==null||nums.length<2){
			return;
		}
		int size = nums.length;
		for(int i= size-2;i>=0;i--){
			if(nums[i]<nums[i+1]){
				for(int k = size-1;k>=i+1;k--){
					if(nums[i]<nums[k]){
						swap(nums,i,k);
						break;
					}
				}
				qkSort(nums,i+1,size-1);
				return;
			}
		}

		qkSort(nums,0,size-1);

	}

	private void swap(int[] nums,int i,int j ){
		if(i!=j){
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}

	private void qkSort(int[] nums, int low, int high)
	{
		int i, j;
		int x;
		if (low >= high) {
			return;
		}
		i = low;
		j = high;
		x = nums[i];
		while (i < j) {
			while (i < j && nums[j] >= x) {
				j--;
			}
			while (i < j && nums[i] <= x) {
				i++;
			}
			if(i<j){
				swap(nums,i,j);
			}
		}
		swap(nums,low,i);
		qkSort(nums, low, j - 1);
		qkSort(nums, j + 1, high);
	}

}
