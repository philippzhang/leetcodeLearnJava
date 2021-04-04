package com.learn.java.leetcode.offer59ii;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {
	private Queue<Integer> queque = null;
	private Deque<Integer> maxQueue = null;
	public MaxQueue() {
		queque = new LinkedList<>();
		maxQueue = new LinkedList<>();
	}

	public int max_value() {
		if(queque.isEmpty()||maxQueue.isEmpty()){
			return -1;
		}
		return maxQueue.peekFirst();
	}

	public void push_back(int value) {
		queque.offer(value);
		while(!maxQueue.isEmpty()&&maxQueue.peekLast()<value){
			maxQueue.pollLast();
		}
		maxQueue.offerLast(value);
	}

	public int pop_front() {
		if(queque.isEmpty()||maxQueue.isEmpty()){
			return -1;
		}
		int temp = queque.poll();
		if(maxQueue.peek()==temp){
			maxQueue.pollFirst();
		}
		return temp;
	}
}
