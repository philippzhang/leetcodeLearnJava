package com.learn.java.algorithm.linear.table;

public interface ITableList<T> {
	void clear();
	boolean isEmpty();
	int length();
	T get(int i);
	int indexOf(T obj);
	T find(T obj);
	void insert(int index, T obj);
	T remove(int index);
	void display();
	void startAdd(T obj);
	void add(T obj);
}
