package com.learn.java.leetcode.lc0402;

import java.util.Stack;

public class Solution {
	public String removeKdigits(String num, int k) {
		if (num == null || num.length() == 0 || k <= 0) {
			return num;
		}
		if (k >= num.length()) {
			return "0";
		}
		Stack<Integer> stack = new Stack<>();
		stack.push(num.charAt(0) - '0');
		for (int i = 1; i < num.length(); i++) {
			int n = num.charAt(i) - '0';

			while (k>0&&!stack.isEmpty() && stack.peek() > n) {
				stack.pop();
				k--;
			}

			stack.push(n);
		}
		while(k>0&&!stack.isEmpty()){
			stack.pop();
			k--;
		}
		StringBuffer stringBuffer = new StringBuffer();
		while (!stack.isEmpty()) {
			stringBuffer.insert(0, stack.pop());
		}
		while (stringBuffer.length()>1&&stringBuffer.charAt(0) == '0') {
			stringBuffer.deleteCharAt(0);
		}

		return stringBuffer.toString();

	}
}
