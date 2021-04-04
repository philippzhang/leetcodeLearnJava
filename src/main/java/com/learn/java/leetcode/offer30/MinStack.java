package com.learn.java.leetcode.offer30;

import java.util.Stack;

public class MinStack {
	private Stack<Integer> dataStack;
	private Stack<Integer> minStack;

	public MinStack(){
		dataStack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int val){
		dataStack.push(val);
		if(minStack.isEmpty()||minStack.peek()>=val){
			minStack.push(val);
		}
	}

	public void pop(){
		if(dataStack.isEmpty() || minStack.isEmpty()){
			throw new RuntimeException("null");
		}
		if(dataStack.pop().equals(minStack.peek())){
			minStack.pop();
		}
	}

	public int top(){
		if(dataStack.isEmpty() || minStack.isEmpty()){
			throw new RuntimeException("null");
		}
		return dataStack.peek();
	}

	public int getMin(){
		if(dataStack.isEmpty() || minStack.isEmpty()){
			throw new RuntimeException("null");
		}
		return minStack.peek();
	}
}
