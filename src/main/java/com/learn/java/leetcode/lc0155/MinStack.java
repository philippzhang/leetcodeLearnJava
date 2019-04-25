package com.learn.java.leetcode.lc0155;


import java.util.Stack;

/**
 * 155. Min Stack 155. 最小栈 Easy
 */
public class MinStack {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;

	/**
	 * initialize your data structure here.
	 */

	public MinStack() {
		stackData = new Stack<>();
		stackMin = new Stack<>();
	}

	public void push(int x) {
		stackData.push(x);
		if (stackMin.isEmpty()) {
			stackMin.push(x);
		} else if (stackMin.peek() >= x) {
			stackMin.push(x);
		}
	}

	public void pop() {
		if (stackData.isEmpty() || stackMin.isEmpty()) {
			throw new RuntimeException("stack is null");
		}
		int x = stackData.pop();
		if (x == stackMin.peek()) {
			stackMin.pop();
		}
	}

	public int top() {
		if (stackData.isEmpty() || stackMin.isEmpty()) {
			throw new RuntimeException("stack is null");
		}
		return stackData.peek();
	}

	public int getMin() {
		if (stackData.isEmpty() || stackMin.isEmpty()) {
			throw new RuntimeException("stack is null");
		}
		return stackMin.peek();
	}
}