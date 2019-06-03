package com.learn.java.leetcode.lc0018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> results = new ArrayList<>();
		if(nums==null||nums.length<4){
			return results;
		}

		for(int i =0;i<nums.length-3;i++){
			if(i>0&&nums[i-1]==nums[i]){
				//去重
				continue;
			}
			results.addAll(threeSum(nums,target-nums[i],i));
		}
		return results;
	}

	private List<List<Integer>> threeSum(int[] nums,int target,int start){
		List<List<Integer>> results = new ArrayList<>();
		for(int i = start+1;i<nums.length-2;i++){
			if(i>start+1&&nums[i-1]==nums[i]){
				//去重
				continue;
			}
			for(int j = i+1,k = nums.length-1;j<k;){
				if(j>i+1&&nums[j-1]==nums[j]){
					//去重
					j++;
					continue;
				}
				if(k<nums.length-1&&nums[k+1]==nums[k]){
					//去重
					k--;
					continue;
				}
				int t = nums[i]+nums[j]+nums[k];
				if(t<target){
					j++;
				}else if(t>target){
					k--;
				}else{
					List<Integer> l = new ArrayList<>();
					l.add(nums[start]);
					l.add(nums[i]);
					l.add(nums[j]);
					l.add(nums[k]);
					results.add(l);
					j++;
					k--;
				}
			}
		}

		return results;
	}
}
