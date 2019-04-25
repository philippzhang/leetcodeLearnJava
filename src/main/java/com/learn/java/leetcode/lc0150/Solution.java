package com.learn.java.leetcode.lc0150;

import java.util.Stack;

/**
 * 150. Evaluate Reverse Polish Notation 150. 逆波兰表达式求值 Medium
 */
public class Solution {
	private Stack<Integer> stack = new Stack();

	public int evalRPN(String[] tokens) {
		if (tokens == null || tokens.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < tokens.length; i++) {
			String chr = tokens[i];
			if (chr.equals("+")) {
				int x1 = stack.pop();
				int x2 = stack.pop();
				stack.push((x1 + x2));
			} else if (chr.equals("-")) {
				int x1 = stack.pop();
				int x2 = stack.pop();
				stack.push((x2 - x1));
			} else if (chr.equals("*")) {
				int x1 = stack.pop();
				int x2 = stack.pop();
				stack.push((x1 * x2));
			} else if (chr.equals("/")) {
				int x1 = stack.pop();
				int x2 = stack.pop();
				stack.push((x2 / x1));
			} else {
				stack.push(Integer.valueOf(chr));
			}
		}

		return stack.pop();
	}
}
