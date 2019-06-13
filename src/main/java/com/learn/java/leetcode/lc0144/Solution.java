package com.learn.java.leetcode.lc0144;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal 144. 二叉树的前序遍历 Medium
 */
public class Solution {
	class Node<T> {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
		}

		public Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	class Queue<T> {
		Node<T> root;
		Node<T> tail;

		public Queue() {
		}

		public void push(T data) {
			if (root == null) {
				root = new Node(data);
				tail = root;
			} else {
				tail.next = new Node(data);
				tail = tail.next;
			}
		}

		public Node<T> poll() {
			if (root == null) {
				return null;
			} else {
				Node<T> temp = new Node(root.data);
				root = root.next;
				if (root == null) {
					tail = null;
				}
				return temp;
			}
		}

		public boolean isEmpty() {
			return root == null;
		}
	}

	class Stack<T> {
		Node<T> root;

		public void push(T data) {
			if (root == null) {
				root = new Node(data);
			} else {
				Node<T> temp = new Node(data, root);
				root = temp;
			}
		}

		public Node<T> pop() {
			if (root == null) {
				return null;
			} else {
				Node<T> temp = new Node(root.data);
				root = root.next;
				return temp;
			}
		}

		public Node<T> peek() {
			if (root == null) {
				return null;
			} else {
				Node<T> temp = new Node(root.data);
				return temp;
			}
		}

		public boolean isEmpty() {
			return root == null;
		}
	}

	public List<Integer> preorderTraversal2(TreeNode root) {
		List<Integer> list = new ArrayList();
		if (root == null) {
			return list;
		}
		Stack<TreeNode> stack = new Stack();
		TreeNode current = root;

		while (!stack.isEmpty() || current != null) {
			while (current != null) {
				list.add(current.val);
				stack.push(current);
				current = current.left;
			}
			if (current == null) {
				current = stack.pop().data;
				current = current.right;
			}

		}
		return list;
	}


	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList();
		if (root == null) {
			return list;
		}
		Stack<TreeNode> stack = new Stack();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode current = stack.pop().data;
			list.add(current.val);
			if(current.right!=null){
				stack.push(current.right);
			}
			if(current.left!=null){
				stack.push(current.left);
			}
		}
		return list;
	}
}
