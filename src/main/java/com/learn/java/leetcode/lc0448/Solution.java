package com.learn.java.leetcode.lc0448;


import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		int n = nums.length;
		for(int i = 0;i<nums.length;i++){
			nums[(nums[i]-1)%n] += n;
		}
		List<Integer> results = new ArrayList<>();

		for(int i = 0;i<nums.length;i++){
			if(nums[i]<=n){
				results.add(i+1);
			}
		}

		return results;
	}
}
