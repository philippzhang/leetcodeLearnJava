package com.learn.java.leetcode.lc0496;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 496. Next Greater Element I 496. 下一个更大元素 I Easy
 */
public class Solution {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Stack<Integer> stack = new Stack<>();
		Map<Integer,Integer> map = new HashMap<>();
		int[] results = new int[nums1.length];
		for(int num:nums2){
			while(!stack.isEmpty()&&stack.peek()<num){
				map.put(stack.pop(),num);
			}
			stack.push(num);
		}
		for(int i = 0;i<nums1.length;i++){
			results[i] = map.getOrDefault(nums1[i],-1);
		}
		return results;
	}
}
