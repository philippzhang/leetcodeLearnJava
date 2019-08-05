package com.learn.java.leetcode.lc0219;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i =0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				Integer index = map.get(nums[i]);
				if(i-index<=k){
					return true;
				}
			}
			map.put(nums[i],i);
		}
		return false;
	}
}
