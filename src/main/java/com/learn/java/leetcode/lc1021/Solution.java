package com.learn.java.leetcode.lc1021;

import java.util.Stack;

public class Solution {
	public String removeOuterParentheses(String S) {
		if(S==null||S.length()==0){
			return "";
		}
		Stack<Character> stack = new Stack();
		int count = 0;
		StringBuffer stringBuffer = new StringBuffer();
		for(int i =0;i<S.length();i++){
			char c = S.charAt(i);
			if(c=='('){
				count++;
			}else {
				count--;
			}
			stack.push(c);

			if(count==0){
				if(!stack.empty()){
					stack.pop();
				}
				if(stack.size() >=1) {
					StringBuffer newBuff = new StringBuffer();
					while (stack.size() > 1) {
						newBuff.insert(0,stack.pop());
					}
					stack.pop();
					stringBuffer.append(newBuff);
				}
			}

		}
		return stringBuffer.toString();
 	}
}
