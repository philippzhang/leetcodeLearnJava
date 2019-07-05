package com.learn.java.leetcode.lc0739;

import java.util.Stack;

public class Solution {
	public int[] dailyTemperatures(int[] T) {
		if(T==null||T.length==0){
			return T;
		}
		int[] results = new int[T.length];
		Stack<Integer> stack = new Stack<>();
		for(int i =0;i<T.length;i++){
			dailyStack(stack,results,i,T);
		}
		return results;
	}

	private void dailyStack(Stack<Integer> stack,int[] results,int i,int[] T){
		if(stack.isEmpty()){
			stack.push(i);
			return;
		}
		//如果栈没有元素，或者 当前元素比栈顶小 那么应该把当前元素入栈
		Integer peek = stack.peek();
		if(T[peek]>=T[i]){
			stack.push(i);
			return;
		}
		else{
			//T[peek]<T[i]
			//如果比栈顶元素大 那么记录这个值弹出
			results[peek] = i-peek;
			stack.pop();
			dailyStack(stack,results,i,T);
		}
	}
}
