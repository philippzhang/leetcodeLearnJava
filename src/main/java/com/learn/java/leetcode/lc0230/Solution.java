package com.learn.java.leetcode.lc0230;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.Stack;

/**
 * 230. Kth Smallest Element in a BST 230. 二叉搜索树中第K小的元素 Medium
 */
public class Solution {
	public int kthSmallest(TreeNode root, int k) {
		if (root == null || k < 0) {
			return -1;
		}
		int count = root.left != null ? count(root.left) : 0;
		if (k <= count) {
			return kthSmallest(root.left, k);
		} else if (k > count + 1) {
			return kthSmallest(root.right, k - count - 1);
		} else {
			return root.val;
		}
	}

	private int count(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return (root.left != null ? count(root.left) : 0) + (root.right != null ? count(root.right) : 0) + 1;
	}

	public int kthSmallest2(TreeNode root, int k) {
		if (root == null || k < 0) {
			return -1;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = root;
		while (cur != null) {
			stack.push(cur);
			cur = cur.left;
		}

		while (!stack.isEmpty()) {
			cur = stack.pop();
			k--;
			if (k == 0) {
				return cur.val;
			}
			TreeNode right = cur.right;
			while (right != null) {
				stack.push(right);
				right = right.left;
			}
		}
		return -1;
	}
}
