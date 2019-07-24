package com.learn.java.algorithm.nolinear.node;

/**
 * 二叉树结点类
 */
public class BinaryTreeNode<T> {
	//结点的数据域
	private T data;
	//左子结点域
	private BinaryTreeNode lchild;
	//右子结点域
	private BinaryTreeNode rchild;


	public BinaryTreeNode() {
		this(null);
	}

	public BinaryTreeNode(T data) {
		this(data, null, null);
	}

	public BinaryTreeNode(T data, BinaryTreeNode lchild, BinaryTreeNode rchild) {
		this.data = data;
		this.lchild = lchild;
		this.rchild = rchild;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTreeNode getLchild() {
		return lchild;
	}

	public void setLchild(BinaryTreeNode lchild) {
		this.lchild = lchild;
	}

	public BinaryTreeNode getRchild() {
		return rchild;
	}

	public void setRchild(BinaryTreeNode rchild) {
		this.rchild = rchild;
	}
}
