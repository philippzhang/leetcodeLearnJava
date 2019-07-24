package com.learn.java.algorithm.nolinear.node;

/**
 *  AVL树的节点(内部类)
 * @param <T>
 */
public class AVLTreeNode<T extends Comparable<T>> {
	// 关键字(键值)
	private T key;
	// 高度
	private int height;
	// 左孩子
	private AVLTreeNode<T> lchild;
	// 右孩子
	private AVLTreeNode<T> rchild;

	public AVLTreeNode(T key, AVLTreeNode<T> lchild, AVLTreeNode<T> rchild) {
		this.key = key;
		this.lchild = lchild;
		this.rchild = rchild;
		this.height = 0;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public AVLTreeNode<T> getLchild() {
		return lchild;
	}

	public void setLchild(AVLTreeNode<T> lchild) {
		this.lchild = lchild;
	}

	public AVLTreeNode<T> getRchild() {
		return rchild;
	}

	public void setRchild(AVLTreeNode<T> rchild) {
		this.rchild = rchild;
	}
}
