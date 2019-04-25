package com.learn.java.leetcode.lc0622;

/**
 * 622. Design Circular Queue 622. 设计循环队列 Medium
 */
public class MyCircularQueue {
	private int[] data;
	private int front;
	private int rear;
	private int length = 0;
	private int size = 0;
	/** Initialize your data structure here. Set the size of the queue to be k. */
	public MyCircularQueue(int k) {
		data = new int[k];
		front = 0;
		rear = -1;
		length = k;
		size = 0;
	}

	/** Insert an element into the circular queue. Return true if the operation is successful. */
	public boolean enQueue(int value) {
		if(!isFull()) {
			rear = (++rear)%length;
			data[rear] = value;
			size++;
			return true;
		}
		return false;
	}

	/** Delete an element from the circular queue. Return true if the operation is successful. */
	public boolean deQueue() {
		if(!isEmpty()) {
			front = (++front)%length;
			size--;
			return true;
		}
		return false;

	}

	/** Get the front item from the queue. */
	public int Front() {
		if(!isEmpty()) {
			return data[front];
		}
			return -1;

	}

	/** Get the last item from the queue. */
	public int Rear() {
		if(!isEmpty()) {
			return data[rear];
		}
		return -1;
	}

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty() {
		return size == 0;
	}

	/** Checks whether the circular queue is full or not. */
	public boolean isFull() {
		return size == data.length;
	}
}
