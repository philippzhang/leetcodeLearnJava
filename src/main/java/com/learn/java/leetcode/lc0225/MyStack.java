package com.learn.java.leetcode.lc0225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. Implement Stack using Queues 225. 用队列实现栈 Easy
 */
public class MyStack {
	Queue<Integer> queueHead = null;
	Queue<Integer> queueTail = null;

	/**
	 * Initialize your data structure here.
	 */
	public MyStack() {
		queueHead = new LinkedList<>();
		queueTail = new LinkedList<>();
	}

	/**
	 * Push element x onto stack.
	 */
	public void push(int x) {
		queueHead.offer(x);
	}

	/**
	 * Removes the element on top of the stack and returns that element.
	 */
	public int pop() {

		while (!queueHead.isEmpty()) {
			int x = queueHead.poll();
			if (!queueHead.isEmpty()) {
				queueTail.offer(x);
			} else {
				while (!queueTail.isEmpty()) {
					queueHead.offer(queueTail.poll());
				}

				return x;
			}
		}
		throw new RuntimeException("stack is null");
	}

	/**
	 * Get the top element.
	 */
	public int top() {

		while (!queueHead.isEmpty()) {
			int x = queueHead.poll();
			queueTail.offer(x);
			if (queueHead.isEmpty()) {
				while (!queueTail.isEmpty()) {
					queueHead.offer(queueTail.poll());
				}
				return x;
			}
		}
		throw new RuntimeException("stack is null");
	}

	/**
	 * Returns whether the stack is empty.
	 */
	public boolean empty() {
		return queueHead.isEmpty() && queueTail.isEmpty();
	}
}

