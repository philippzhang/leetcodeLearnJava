package com.learn.java.leetcode.lc0921;

import java.util.Stack;

public class Solution {
	public int minAddToMakeValid(String S) {
		Stack<Character> stack = new Stack();
		int result = 0;
		for(int i=0;i<S.length();i++){
			char ch = S.charAt(i);
			if(ch=='('){
				stack.push(ch);
			}else{
				if(!stack.empty()){
					stack.pop();
				}else {
					result++;
				}
			}
		}
		result +=stack.size();
		return result;
	}
}
