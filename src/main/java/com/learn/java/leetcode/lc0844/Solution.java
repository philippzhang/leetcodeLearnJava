package com.learn.java.leetcode.lc0844;

import java.util.Stack;

/**
 * 844. Backspace String Compare 844. 比较含退格的字符串 Easy
 */
public class Solution {
	private Stack<Character> s1 = new Stack();
	private Stack<Character> t1 = new Stack();

	public boolean backspaceCompare(String S, String T) {
		if (S == null || T == null) {
			return true;
		} else if (S != null && T == null || S == null && T != null) {
			return false;
		} else {
			for (int i = 0; i < S.length(); i++) {
				char c = S.charAt(i);
				if (c != '#') {
					s1.push(c);
				} else if (!s1.isEmpty()) {
					s1.pop();
				}
			}

			for (int i = 0; i < T.length(); i++) {
				char c = T.charAt(i);
				if (c != '#') {
					t1.push(c);
				} else if (!t1.isEmpty()) {
					t1.pop();
				}
			}

			while (!s1.isEmpty() || !t1.isEmpty()) {
				Character c1 = null;
				Character c2 = null;
				if (!s1.isEmpty()) {
					c1 = s1.pop();
				}
				if (!t1.isEmpty()) {
					c2 = t1.pop();
				}
				if (c1 == null && c2 == null) {
					continue;
				} else if (c1 == null && c2 != null || c2 == null && c1 != null || !c1.equals(c2)) {
					return false;
				}
			}

			return true;
		}
	}
}