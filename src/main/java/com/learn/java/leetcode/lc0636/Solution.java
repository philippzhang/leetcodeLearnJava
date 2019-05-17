package com.learn.java.leetcode.lc0636;

import java.util.List;
import java.util.Stack;

public class Solution {
	public int[] exclusiveTime(int n, List<String> logs) {
		int[] results = new int[n];
		Stack<Integer[]> stack = new Stack();
		for(int i = 0;i<logs.size();i++){
			String[] arr = logs.get(i).split(":");
			if(arr[1].equals("start")){
				stack.push(new Integer[]{Integer.valueOf(arr[0]),Integer.valueOf(arr[2]),Integer.valueOf(arr[2])});
			}else{
				if(!stack.empty()) {
					Integer[] pop = stack.pop();
					results[pop[0]] += Integer.valueOf(arr[2]) - pop[1] + 1;
					if (!stack.isEmpty()) {
						Integer[] peek = stack.peek();
						peek[1] = peek[1] + Integer.valueOf(arr[2])  - pop[2] + 1;
					}
				}
			}
		}
		return results;
	}
}
