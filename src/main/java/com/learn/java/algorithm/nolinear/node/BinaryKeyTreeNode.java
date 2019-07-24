package com.learn.java.algorithm.nolinear.node;

/**
 * 二叉树结点类
 */
public class BinaryKeyTreeNode<T extends Comparable<T>,E> {
	//权重
	private T key;
	//结点的数据域
	private E data;
	//左子结点域
	private BinaryKeyTreeNode<T,E> lchild;
	//右子结点域
	private BinaryKeyTreeNode<T,E> rchild;




	public BinaryKeyTreeNode(T key,E data) {
		this.key = key;
		this.data = data;
	}


	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public BinaryKeyTreeNode<T, E> getLchild() {
		return lchild;
	}

	public void setLchild(BinaryKeyTreeNode<T, E> lchild) {
		this.lchild = lchild;
	}

	public BinaryKeyTreeNode<T, E> getRchild() {
		return rchild;
	}

	public void setRchild(BinaryKeyTreeNode<T, E> rchild) {
		this.rchild = rchild;
	}

	@Override
	public String toString() {
		return "BinaryKeyTreeNode{" +
				"key=" + key +
				", data=" + data +
				'}';
	}
}
