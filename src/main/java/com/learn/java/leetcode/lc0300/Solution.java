package com.learn.java.leetcode.lc0300;

import java.util.ArrayList;
import java.util.List;


public class Solution {

	/**
	 * 采用二分查找 O(nlogn)
	 * @param nums
	 * @return
	 */
	public int lengthOfLIS(int[] nums) {
		if(nums==null||nums.length==0){
			return 0;
		}
		List<Integer> list = new ArrayList<>();
		list.add(nums[0]);
		for(int i =1;i<nums.length;i++){
			int length = list.size();
			if(nums[i]>list.get(length-1)){
				list.add(nums[i]);
			}else{
				int pos = binarySearch(list,nums[i]);
				list.set(pos,nums[i]);
			}
		}
		return list.size();
	}
	private int binarySearch(List<Integer> list,int target){
		int index = -1;
		int begin = 0;
		int end = list.size()-1;
		while(index ==-1){
			int mid = (begin+end)/2;
			int v= list.get(mid);
			if(target==v){
				index = mid;
			}else if(target<v){
				if(mid ==0||target>list.get(mid-1)){
					index = mid;
				}
				end = mid -1;
			}else{
				if(mid ==list.size()-1||target<list.get(mid+1)){
					index = mid+1;
				}
				begin = mid +1;
			}
		}
		return index;
	}


	public int lengthOfLIS3(int[] nums) {
		if(nums==null||nums.length==0){
			return 0;
		}
		List<Integer> list = new ArrayList<>();
		list.add(nums[0]);
		for(int i =1;i<nums.length;i++){
			int length = list.size();
			if(nums[i]>list.get(length-1)){
				list.add(nums[i]);
			}else{
				for(int j =0;j<length;j++){
					if(list.get(j)>=nums[i]){
						list.set(j,nums[i]);
						break;
					}
				}
			}
		}
		return list.size();
	}


	/**
	 * 采用动态规划时间复杂度O(n*n)
	 * @param nums
	 * @return
	 */
	public int lengthOfLIS2(int[] nums) {
		if(nums==null||nums.length==0){
			return 0;
		}
		int[] dp = new int[nums.length];
		dp[0]=1;
		int result = 1;
		for(int i =1;i<dp.length;i++){
			dp[i] = 1;
			for(int j =0;j<i;j++){
				if(nums[j]<nums[i]&&dp[i]<dp[j]+1){
					dp[i] = dp[j]+1;
				}
			}
			result = Math.max(result,dp[i]);
		}
		return result;
	}


}
