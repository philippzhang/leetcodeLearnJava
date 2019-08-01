package com.learn.java.leetcode.lc0209;


public class Solution {
	/**
	 * 暴力算法 时间O(n^3)
	 * @param s
	 * @param nums
	 * @return
	 */
	public int minSubArrayLen1(int s, int[] nums) {
		int n = nums.length;
		int result = Integer.MAX_VALUE;
		for(int i =0;i<n;i++){
			for(int j = i;j<n;j++){
				int sum = 0;
				for(int k = i;k<=j;k++){
					sum +=nums[k];
				}
				if(sum>=s){
					result = Math.min(result,j-i+1);
					break;
				}
			}
		}
		return  result!=Integer.MAX_VALUE?result:0;
	}

	/**
	 * 对暴力的优化，时间O(n^2) ,空间O(n)
	 * @param s
	 * @param nums
	 * @return
	 */
	public int minSubArrayLen2(int s, int[] nums) {
		int n = nums.length;
		if(n ==0){
			return 0;
		}
		int result = Integer.MAX_VALUE;
		int[] sums = new int[n+1];
		for(int i =1;i<=n;i++){
			sums[i] = sums[i-1]+nums[i-1];
		}
		for(int i = 0;i<n;i++){
			for(int j =i;j<n;j++){
				int sum = sums[j]-sums[i]+nums[i];
				if(sum>=s){
					result = Math.min(result,j-i+1);
					break;
				}

			}
		}
		return  result!=Integer.MAX_VALUE?result:0;
	}

	/**
	 * 二分查找 时间O(nlogn) 空间O(n)
	 * @param s
	 * @param nums
	 * @return
	 */
	public int minSubArrayLen(int s, int[] nums) {
		int n = nums.length;
		if (n == 0) {
			return 0;
		}
		int result = Integer.MAX_VALUE;
		int[] sums = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			if(nums[i-1] >= s) {
				return 1;
			}
			sums[i] = sums[i - 1] + nums[i-1];

		}
		if(sums[nums.length] < s) {
			return 0;
		}

		for(int i =1;i<=n;i++){
			int find = s + sums[i-1];
				int index = binary(sums,0,sums.length-1,find);
				if(index>0) {
					result = Math.min(index - i + 1, result);
				}

		}
		return  result!=Integer.MAX_VALUE?result:0;

	}

	private int binary(int [] sum, int left, int right, int s){
		if(left > right) {
			return 0;
		}
		int mid = (left + right) / 2;
		if(mid == 0) {
			return 0;
		}
		if(sum[mid]>= s && (sum[mid-1]) < s) {
			return mid;
		}
		if(sum[mid] < s) {
			return binary(sum,mid+1,right, s);
		} else {
			return binary(sum, left,mid, s);
		}
	}

	/**
	 * 双指针 时间 O(n) ，空间O(1）
	 * @param s
	 * @param nums
	 * @return
	 */
	public int minSubArrayLen3(int s, int[] nums) {
		int n = nums.length;
		if (n == 0) {
			return 0;
		}
		int result = Integer.MAX_VALUE;
		int left=0;
		int sum =0;
		for(int i =0;i<n;i++){
			sum += nums[i];
			while(sum>=s){
				result = Math.min(result,i+1-left);
				sum -= nums[left++];
			}
		}
		return  result!=Integer.MAX_VALUE?result:0;
	}

}
