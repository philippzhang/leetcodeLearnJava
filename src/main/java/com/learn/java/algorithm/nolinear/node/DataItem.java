package com.learn.java.algorithm.nolinear.node;

public class DataItem<T>{
	private int key;

	private T value;

	public DataItem(int key, T value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "DataItem{" +
				"key=" + key +
				", value=" + value +
				'}';
	}
}
