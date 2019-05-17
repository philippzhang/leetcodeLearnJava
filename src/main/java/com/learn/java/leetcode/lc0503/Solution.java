package com.learn.java.leetcode.lc0503;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
	public int[] nextGreaterElements(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		int [] ret = new int[nums.length];
		Arrays.fill(ret,Integer.MIN_VALUE);
		int n = nums.length;

		for(int i = 0;i<n*2;i++){
			while(!stack.isEmpty()&&nums[stack.peek()]<nums[i%n]){
				ret[stack.pop()]=nums[i%n];
			}

			if(ret[i%n]==Integer.MIN_VALUE){
				stack.push(i%n);
			}
		}

		while(!stack.isEmpty()){
			ret[stack.pop()] = -1;
		}

		return ret;
	}
}
