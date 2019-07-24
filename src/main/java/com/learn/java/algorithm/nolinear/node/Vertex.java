package com.learn.java.algorithm.nolinear.node;

/**
 * 顶点类
 */
public class Vertex<T> {
	private T label;

	public Vertex(T label){
		this.label = label;
	}

	public T getLabel() {
		return label;
	}

	public void setLabel(T label) {
		this.label = label;
	}
}
