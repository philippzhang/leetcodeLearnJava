package com.learn.java.algorithm.nolinear.tree;


public interface Tree<T> {



	void preOrder();

	void inOrder();

	void postOrder();

	void levelOrder();

	int getDepth();



}
