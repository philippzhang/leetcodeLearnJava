package com.learn.java.algorithm.nolinear.node;

import static com.learn.java.algorithm.nolinear.tree.RBTree.RED;

public class RBTNode<T extends Comparable<T>> {
	private boolean color;//颜色
	//关键值
	private T key;
	//左子节点
	private RBTNode<T> lchild;
	//右子节点
	private RBTNode<T> rchild;
	//父节点
	private RBTNode<T> parent;

	public RBTNode( T key, boolean color,RBTNode<T> parent, RBTNode<T> lchild, RBTNode<T> rchild){
		this.color = color;
		this.key = key;
		this.parent = parent;
		this.lchild = lchild;
		this.rchild = rchild;
	}

	//获得节点的关键值
	public T getKey(){
		return key;
	}
	//打印节点的关键值和颜色信息
	@Override
	public String toString(){
		return ""+key+(this.color == RED ? "R":"B");
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public void setKey(T key) {
		this.key = key;
	}


	public RBTNode<T> getLchild() {
		return lchild;
	}

	public void setLchild(RBTNode<T> lchild) {
		this.lchild = lchild;
	}

	public RBTNode<T> getRchild() {
		return rchild;
	}

	public void setRchild(RBTNode<T> rchild) {
		this.rchild = rchild;
	}

	public RBTNode<T> getParent() {
		return parent;
	}

	public void setParent(RBTNode<T> parent) {
		this.parent = parent;
	}
}