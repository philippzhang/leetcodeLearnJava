package com.learn.java.leetcode.lc0228;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> summaryRanges(int[] nums) {
		List<String> results = new ArrayList<>();
		if(nums.length==0){
			return results;
		}

		int begin = nums[0];
		int end= nums[0];
		for(int i = 1;i<nums.length;i++){
			if(nums[i]!=end+1){
				if(begin==end) {
					results.add(String.valueOf(begin));
				}else{
					results.add(begin+"->"+end);
				}
				begin = nums[i];
				end= nums[i];
			}else{
				end = nums[i];
			}
		}

		if(begin==end) {
			results.add(String.valueOf(begin));
		}else{
			results.add(begin+"->"+end);
		}

		return results;

	}
}
