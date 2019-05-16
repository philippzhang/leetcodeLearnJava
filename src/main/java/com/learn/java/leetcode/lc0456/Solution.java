package com.learn.java.leetcode.lc0456;

import java.util.Stack;

public class Solution {
	public boolean find132pattern(int[] nums) {
		if(nums==null||nums.length<3){
			return false;
		}
		//2
		int last = Integer.MIN_VALUE;

		Stack<Integer> stack = new Stack();
		for(int i = nums.length-1;i>=0;i--){

			// 若出现132中的1则返回正确值
			if(nums[i]<last){
				return true;
			}
			// 若当前值大于或等于2则更新2（2为栈中小于当前值的最大元素）

			while(!stack.isEmpty()&&stack.peek()<nums[i]){
				last = stack.pop();
			}

			stack.push(nums[i]);
		}

		return false;

	}
}
