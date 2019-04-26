package com.learn.java.leetcode.lc0173;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.Stack;

/**
 * 二叉搜索树迭代器
 */
public class BSTIterator {
	private Stack<Integer> stack;
	public BSTIterator(TreeNode root) {
		stack = new Stack<>();
		buildStack(root,stack);
	}

	/** @return the next smallest number */
	public int next() {
		if(hasNext()){
			return stack.pop();
		}else {
			return -1;
		}
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return stack.size()>0;
	}

	private void buildStack(TreeNode root,Stack<Integer> stack){
		if(root!=null){
			buildStack(root.right,stack);
			stack.push(root.val);
			buildStack(root.left,stack);
		}
	}
}
