package com.learn.java.leetcode.lc0946;

import java.util.Stack;

public class Solution {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		if(pushed==null||pushed.length==0){
			return true;
		}
		Stack<Integer> stack = new Stack();
		int j =0;
		for (int i =0;i<=pushed.length;i++){
			while(!stack.isEmpty()&&j<popped.length&&stack.peek()==popped[j]){
				stack.pop();
				j++;
			}
			if(i==pushed.length){
				break;
			}
			stack.push(pushed[i]);
		}
		return stack.isEmpty()?true:false;
	}
}
