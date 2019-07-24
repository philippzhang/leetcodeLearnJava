package com.learn.java.algorithm.linear.stack;

public interface IStack<T> {
	void clear();
	boolean isEmpty();
	int length();
	T peek();
	void push(T obj);
	T pop();
	void display();
}
