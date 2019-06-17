package com.learn.java.leetcode.lc0032;

import java.util.Stack;

public class Solution {
	/**
	 * 栈
	 *
	 1.需有一个变量start记录有效括号子串的起始下标，max表示最长有效括号子串长度，初始值均为0

	 2.遍历给字符串中的所有字符

	 2.1若当前字符s[index]为左括号'('，将当前字符下标index入栈（下标稍后有其他用处），处理下一字符

	 2.2若当前字符s[index]为右括号')'，判断当前栈是否为空

	 2.2.1若栈为空，则start = index + 1，处理下一字符（当前字符右括号下标不入栈）

	 2.2.2若栈不为空，则出栈（由于仅左括号入栈，则出栈元素对应的字符一定为左括号，可与当前字符右括号配对），判断栈是否为空

	 2.2.2.1若栈为空，则max = max(max, index-start+1)

	 2.2.2.2若栈不为空，则max = max(max, index-栈顶元素值)
	 * @param s
	 * @return
	 */
	public int longestValidParentheses2(String s) {
		int max=0,start=0;
		if(s==null||s.length()<=1){
			return 0;
		}
		int len = s.length();
		Stack<Integer> stack = new Stack();
		for(int i = 0;i<len;i++){
			if(s.charAt(i)=='('){
				stack.push(i);
			}else {
				if(stack.isEmpty()){
					start = i+1;
				}else {
					stack.pop();
					if(stack.isEmpty()){
						max = Math.max(max,i-start+1);
					}else {
						max = Math.max(max,i-stack.peek());
					}
				}
			}
		}
		return max;
	}

	/**
	 * 动态规划
	 * @param s
	 * @return
	 */
	public int longestValidParentheses(String s) {
		if(s==null||s.length()<=1){
			return 0;
		}
		int[] dp = new int[s.length()];
		int res = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				if (s.charAt(i - 1) == '(') {
					dp[i] = (i - 2 >= 0 ? dp[i - 2] + 2 : 2);
				} else if (s.charAt(i - 1) == ')' && i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
					dp[i] = dp[i - 1] + 2 +  (i - dp[i - 1] - 2 >= 0 ? dp[i - dp[i - 1] - 2] : 0) ;
				}
			}
			res = Math.max(res, dp[i]);
		}
		return res;

	}
}
