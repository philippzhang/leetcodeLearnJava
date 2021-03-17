package com.learn.java.leetcode.offer09;


import java.util.Stack;

public class CQueue {
	Stack<Integer> stack1;
	Stack<Integer> stack2;
	public CQueue() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public void appendTail(int value) {
		stack1.push(value);
	}

	public int deleteHead() {
		if(stack2.empty()){
			//stack1 -> stack2
			while(!stack1.empty()){
				stack2.push(stack1.pop());
			}
		}

		if(stack2.empty()){
			return -1;
		}else{
			return stack2.pop();
		}
	}
}
