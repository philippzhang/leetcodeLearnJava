package com.learn.java.leetcode.lc0324;

import java.util.Arrays;

public class Solution {
	/**
	 * 把较小和较大的两部分[a1,a2,...,a(n/2)]，[a(n/2+1),...,an]翻转成[a(n/2),...,a1]，[an,...,a(n/2+1)]
	 * 排列成B=[a(n/2),a(n),a(n/2-1),a(n-1),...,a1,a(n/2+1)]即可。
	 *
	 * 时间O(nlogn),空间O(n)
	 * @param nums
	 */
	public void wiggleSort3(int[] nums) {
		//排序
		Arrays.sort(nums);
		int len = nums.length;
		int[] smaller = new int[len%2==0?len/2:(len/2+1)],bigger = new int[len/2];
		//复制
		System.arraycopy(nums,0,smaller,0,smaller.length);
		System.arraycopy(nums,smaller.length,bigger,0,len/2);
		int i = 0;
		for(;i<len/2;i++){
			nums[2*i]=smaller[smaller.length-1-i];
			nums[2*i+1]=bigger[len/2-1-i];
		}
		if(len%2!=0){
			nums[2*i]=smaller[smaller.length-1-i];
		}
	}

	/**
	 *  时间O(nlogn),空间O(n)
	 * @param nums
	 */
	public void wiggleSort2(int[] nums) {
		if(nums == null || nums.length == 1) {
			return;
		}
		Arrays.sort(nums);
		if(nums.length == 2) {
			return;
		}
		int[] val = Arrays.copyOf(nums, nums.length);
		Arrays.sort(val);
		int idx = val.length - 1;
		for(int i = 1;i < nums.length;i += 2) {
			nums[i] = val[idx--];
		}
		for(int i = 0;i < nums.length;i += 2) {
			nums[i] = val[idx--];
		}
	}


	/**
	 * K-Select 时间O(n) ,空间O(1)
	 * @param nums
	 */
	public void wiggleSort(int[] nums) {
		if (nums == null || nums.length == 0 || nums.length == 1) {
			return;
		}
		// find median
		/**
		 * 左侧比中间小，右侧比中间大
		 */
		int median = findKthLargest(nums, 0, nums.length - 1, nums.length / 2);
		// color sort with virtual index
		int n = nums.length;
		int left = 0, i = 0, right = n - 1;
		while (i <= right) {
			int ii =  mod(i, n);
			if (nums[ii] > median) {
				int jj = mod(left, n);
				swap(nums, ii, jj);
				left++;
				i++;
			} else if (nums[ii] < median) {
				int jj = mod(right, n);
				swap(nums, ii, jj);
				right--;
			}else{
				i++;
			}
		}
	}
	//模一个奇数，补齐
	private int mod(int idx, int n) {
		return (2 * idx + 1) % (n | 1);
	}
	private int findKthLargest(int[] nums,int start,int end,int k){
		if(start>end){
			return Integer.MAX_VALUE;
		}
		int pivot = nums[end];
		int left = start;
		for(int i = start;i<end;i++){
			if(nums[i]<=pivot){
				swap(nums,left++,i);
			}
		}
		swap(nums,left,end);
		if(left==k){
			return nums[left];
		}else if(left<k){
			return findKthLargest(nums,left+1,end,k);
		}else{
			return findKthLargest(nums,start,left-1,k);
		}
	}
	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}


}
