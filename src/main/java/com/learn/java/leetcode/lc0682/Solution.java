package com.learn.java.leetcode.lc0682;

import java.util.Stack;

/**
 * 682. Baseball Game 682. 棒球比赛 Easy
 */
public class Solution {
	public int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack();
		int results = 0;
		if(ops==null||ops.length==0){
			return 0 ;
		}
		for(String s:ops){
			if(s.equals("+")){
				int t1 = stack.pop();
				int t2 = stack.peek();
				stack.push(t1);
				int number = t1+t2;
				stack.push(number);
				results+=number;
			}else if(s.equals("D")){
				int t2 = stack.peek();
				int number = t2*2;
				stack.push(number);
				results+=number;
			}else if(s.equals("C")){
				int t1 = stack.pop();
				results-=t1;
			}else {
				int number = Integer.parseInt(s);
				stack.push(number);
				results+=number;
			}
		}
		return results;
	}
}
