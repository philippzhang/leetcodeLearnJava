package com.learn.java.algorithm.nolinear.node;

public class HeapNode<T extends Comparable<T>> {
	private T key;

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public HeapNode(T key) {
		this.key = key;
	}
}
