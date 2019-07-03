package com.learn.java.leetcode.lc0316;


import java.util.Stack;

public class Solution {
	/**
	 * 维护一个Stack<char>，对字符串进行正序遍历。对每个字符ch，
	 * 首先判断stack内是否存在该字符，若stack顶端值比ch大且后续遍历中
	 * 还能访问到同样的值则将该顶端值去除，最后将stack转化为Array，逆序后转化为字符串输出
	 * @param s
	 * @return
	 */
	public String removeDuplicateLetters(String s) {
		Stack<Character> stack = new Stack();
		for(int i =0;i<s.length();i++){
			char c = s.charAt(i);
			if(stack.contains(c)){
				continue;
			}
			while(!stack.isEmpty()&&stack.peek()>c&&s.lastIndexOf(stack.peek())>i){
				stack.pop();
			}
			stack.push(c);
		}

		StringBuffer stringBuffer = new StringBuffer();
		while(!stack.isEmpty()){
			stringBuffer.append(stack.pop());
		}

		return stringBuffer.reverse().toString();

	}
}
