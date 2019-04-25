package com.learn.java.leetcode.lc0020;

import java.util.Stack;

/**
 * 20. Valid Parentheses 20. 有效的括号 Easy
 *
 */
public class Solution {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack();
		if (s == null || s.length() == 0) {
			return true;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else {
					return false;
				}
			} else if (s.charAt(i) == ']') {
				if (!stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				} else {
					return false;
				}
			} else if (s.charAt(i) == '}') {
				if (!stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
