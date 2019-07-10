package com.learn.java.leetcode.lc0349;

import java.util.*;

public class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
		if(nums1.length==0||nums2.length==0){
			return new int[0];
		}
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0,j=0;
		Set<Integer> set = new HashSet<>();
		while(i<nums1.length&&j<nums2.length){
			if(nums1[i]==nums2[j]){
				set.add(nums1[i]);
				i++;
				j++;
			}else if (nums1[i]<nums2[j]){
				i++;
			}else{
				j++;
			}
		}

		int[] results = new int[set.size()];
		i = 0;
		for(Integer v:set){
			results[i++] = v;
		}
		set.clear();
		return results;
	}
}
