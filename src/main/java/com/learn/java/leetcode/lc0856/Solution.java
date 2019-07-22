package com.learn.java.leetcode.lc0856;

import java.util.Stack;

public class Solution {
	public int scoreOfParentheses(String S) {
		Stack<Integer> stack = new Stack<>();
		char[] chars = S.toCharArray();
		for(int i =0;i<chars.length;i++){
			if(chars[i]=='('){
				stack.push(-1);
			}else if(chars[i]==')'){
				int p = stack.peek();
				if(p==-1){
					stack.pop();
					stack.push(1);
				}else{
					int t = 0;
					while(!stack.empty()){
						int temp = stack.pop();
						if(temp==-1){
							break;
						}else {
							t +=temp;
						}
					}
					stack.push(t*2);
				}

			}
		}
		int sum =0;
		while(!stack.empty()){
			sum+=stack.pop();
		}
		return sum;
	}
}
