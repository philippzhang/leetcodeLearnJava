package com.learn.java.algorithm.linear.queue;

public interface IQueue<T> {
	void clear();
	boolean isEmpty();
	int length();
	boolean isFull();
	T peek();
	T poll();
	void insert(T obj);
	void display();
}
