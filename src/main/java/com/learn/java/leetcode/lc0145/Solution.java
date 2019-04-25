package com.learn.java.leetcode.lc0145;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. Binary Tree Postorder Traversal 145. 二叉树的后序遍历 Hard
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

	/**
	 * 对于任一节点P，
	 * * 1）先将节点P入栈；
	 * * 2）若P不存在左孩子和右孩子，或者P存在左孩子或右孩子，但左右孩子已经被输出，则可
	 * *      以直接输出节点P，并将其出栈，将出栈节点P标记为上一个输出的节点，再将此时的
	 * *      栈顶结点设为当前节点；
	 * * 3）若不满足2）中的条件，则将P的右孩子和左孩子依次入栈，当前节点重新置为栈顶结点，
	 * *      之后重复操作2）；
	 * * 4）直到栈空，遍历结束。
	 *
	 * @param root
	 * @return
	 */
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList();
		if (root == null) {
			return list;
		}
		Stack<TreeNode> stack = new Stack();
		stack.push(root);
		TreeNode pre = null;
		while (!stack.isEmpty()) {
			TreeNode current = stack.peek().data;
			if ((current.left == null && current.right == null) || pre != null && (pre == current.left || pre == current.right)) {
				current = stack.pop().data;
				list.add(current.val);
				pre = current;
			} else {

				if (current.right != null) {
					stack.push(current.right);
				}
				if (current.left != null) {
					stack.push(current.left);
				}
			}
		}
		return list;
	}
}
