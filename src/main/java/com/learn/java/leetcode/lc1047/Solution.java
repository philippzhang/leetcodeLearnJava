package com.learn.java.leetcode.lc1047;

import java.util.Stack;

public class Solution {
	public String removeDuplicates(String S) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (stack.isEmpty()) {
				stack.push(c);
			} else if (stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		StringBuffer stringBuffer = new StringBuffer();
		while(!stack.isEmpty()){
			stringBuffer.append(stack.pop());
		}
		return stringBuffer.reverse().toString();
	}
}
