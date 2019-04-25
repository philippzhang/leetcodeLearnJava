package com.learn.java.leetcode.lc0232;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks 232. 用栈实现队列 Easy
 */
public class MyQueue {
	Stack<Integer> stckPush = null;
	Stack<Integer> stackPop = null;

	/**
	 * Initialize your data structure here.
	 */
	public MyQueue() {
		stckPush = new Stack<>();
		stackPop = new Stack<>();
	}

	/**
	 * Push element x to the back of queue.
	 */
	public void push(int x) {
		stckPush.push(x);
	}

	/**
	 * Removes the element from in front of queue and returns that element.
	 */
	public int pop() {
		if (stackPop.isEmpty()) {
			while (!stckPush.isEmpty()) {
				stackPop.push(stckPush.pop());
			}
		}
		if (stackPop.isEmpty()) {
			throw new RuntimeException("queue is null");
		}
		return stackPop.pop();

	}

	/**
	 * Get the front element.
	 */
	public int peek() {
		if (stackPop.isEmpty()) {
			while (!stckPush.isEmpty()) {
				stackPop.push(stckPush.pop());
			}
		}
		if (stackPop.isEmpty()) {
			throw new RuntimeException("queue is null");
		}
		return stackPop.peek();
	}

	/**
	 * Returns whether the queue is empty.
	 */
	public boolean empty() {
		return stackPop.isEmpty() && stckPush.isEmpty();
	}
}
