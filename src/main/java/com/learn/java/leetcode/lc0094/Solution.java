package com.learn.java.leetcode.lc0094;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal 94. 二叉树的中序遍历 Medium
 */
public class Solution {
	class Node<T> {
		T data;
		Solution.Node next;

		public Node(T data) {
			this.data = data;
		}

		public Node(T data, Solution.Node next) {
			this.data = data;
			this.next = next;
		}
	}

	class Stack<T> {
		Solution.Node<T> root;

		public void push(T data) {
			if (root == null) {
				root = new Solution.Node(data);
			} else {
				Solution.Node<T> temp = new Solution.Node(data, root);
				root = temp;
			}
		}

		public Solution.Node<T> pop() {
			if (root == null) {
				return null;
			} else {
				Solution.Node<T> temp = new Solution.Node(root.data);
				root = root.next;
				return temp;
			}
		}

		public Solution.Node<T> peek() {
			if (root == null) {
				return null;
			} else {
				Solution.Node<T> temp = new Solution.Node(root.data);
				return temp;
			}
		}

		public boolean isEmpty() {
			return root == null;
		}
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList();
		if (root == null) {
			return list;
		}
		Stack<TreeNode> stack = new Stack();
		TreeNode current = root;
		while (current != null || !stack.isEmpty()) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}
			if (!stack.isEmpty()) {
				current = stack.pop().data;
				list.add(current.val);
				current = current.right;
			}

		}
		return list;
	}
}
