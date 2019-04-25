package com.learn.java.leetcode.lc0641;

/**
 * 641. Design Circular Deque 641. 设计循环双端队列 Medium
 */
public class MyCircularDeque {
	private int[] data;
	private int front;
	private int rear;
	private int length = 0;
	private int size = 0;
	/** Initialize your data structure here. Set the size of the deque to be k. */
	public MyCircularDeque(int k) {
		data = new int[k];
		front = 0;
		rear = -1;
		length = k;
		size = 0;
	}

	/** Adds an item at the front of Deque. Return true if the operation is successful. */
	public boolean insertFront(int value) {
		if(!isFull()){
			front = (front-1+length)%length;
			data[front]=value;
			size++;
			return true;
		}
		return false;
	}

	/** Adds an item at the rear of Deque. Return true if the operation is successful. */
	public boolean insertLast(int value) {
		if(!isFull()){
			rear=(rear+1)%length;
			data[rear]=value;
			size++;
			return true;
		}
		return false;
	}

	/** Deletes an item from the front of Deque. Return true if the operation is successful. */
	public boolean deleteFront() {
		if(!isEmpty()){
			front = (front+1)%length;
			size--;
			return true;
		}
		return false;
	}

	/** Deletes an item from the rear of Deque. Return true if the operation is successful. */
	public boolean deleteLast() {
		if(!isEmpty()){
			rear=(rear-1+length)%length;
			size--;
			return true;
		}
		return false;
	}

	/** Get the front item from the deque. */
	public int getFront() {
		if(!isEmpty()){
			return data[front];
		}
		return -1;
	}

	/** Get the last item from the deque. */
	public int getRear() {
		if(!isEmpty()){
			return data[(rear+length)%length];
		}
		return -1;
	}

	/** Checks whether the circular deque is empty or not. */
	public boolean isEmpty() {
		return size == 0;
	}

	/** Checks whether the circular deque is full or not. */
	public boolean isFull() {
		return size == data.length;
	}
}
