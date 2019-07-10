package com.learn.java.leetcode.lc0350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
		if(nums1.length==0||nums2.length==0){
			return new int[0];
		}
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0,j=0;
		List<Integer> list = new ArrayList<>();
		while(i<nums1.length&&j<nums2.length){
			if(nums1[i]==nums2[j]){
				list.add(nums1[i]);
				i++;
				j++;
			}else if (nums1[i]<nums2[j]){
				i++;
			}else{
				j++;
			}
		}

		int[] results = new int[list.size()];
		for(i =0;i<list.size();i++){
			results[i] = list.get(i);
		}
		list.clear();
		return results;
	}
}
