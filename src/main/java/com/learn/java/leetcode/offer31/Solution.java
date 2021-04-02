package com.learn.java.leetcode.offer31;

import java.util.Stack;

public class Solution {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> stack = new Stack();
		int j = 0;
		for(int  i = 0;i<pushed.length;i++){
			stack.push(pushed[i]);
			while(!stack.isEmpty() && j<popped.length && popped[j]==stack.peek()){
				stack.pop();
				j++;
			}
		}
		return stack.isEmpty();
	}
}
