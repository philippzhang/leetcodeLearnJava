package com.learn.java.leetcode.lc1003;

import java.util.Stack;

public class Solution {
	public boolean isValid(String S) {
		if("abc".equals(S)){
			return true;
		}
		if(S.length()<=3){
			return false;
		}
		if(S.length()%3!=0){
			return false;
		}
		Stack<Character> stack = new Stack<>();
		char[] chars = S.toCharArray();
		for(int i =0;i<chars.length;i++){
			char c = chars[i];
			if(stack.isEmpty()||c!='c'){
				stack.push(c);
			}else{
				if(stack.peek()!='b'){
					stack.push(c);
				}else{
					char b = stack.pop();
					if(!stack.isEmpty()&&stack.peek()=='a'){
						stack.pop();
					}else{
						stack.push(b);
						stack.push(c);
					}
				}
			}
		}


		return stack.isEmpty();
	}
}
