package com.learn.java.leetcode.lc0102;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. Binary Tree Level Order Traversal 102. 二叉树的层次遍历 Medium
 */
public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		Queue<TreeNode> queue1 = new LinkedList<>();
		Queue<TreeNode> queue2 = new LinkedList<>();
		queue1.offer(root);
		List<Integer> childList = new ArrayList<>();
		while (!queue1.isEmpty()) {
			TreeNode current = queue1.poll();
			childList.add(current.val);
			if (current.left != null) {
				queue2.offer(current.left);
			}
			if (current.right != null) {
				queue2.offer(current.right);
			}

			if (queue1.isEmpty()) {
				list.add(childList);
				childList = new ArrayList<>();
				while (!queue2.isEmpty()) {
					queue1.offer(queue2.poll());
				}
			}
		}
		return list;
	}

	public List<List<Integer>> levelOrder2(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
		if (root == null) {
			return wrapList;
		}
		queue.offer(root);
		while (!queue.isEmpty()) {
			int levelNum = queue.size();
			List<Integer> subList = new LinkedList<Integer>();
			for (int i = 0; i < levelNum; i++) {
				if (queue.peek().left != null) {
					queue.offer(queue.peek().left);
				}
				if (queue.peek().right != null) {
					queue.offer(queue.peek().right);
				}
				subList.add(queue.poll().val);
			}
			wrapList.add(subList);
		}
		return wrapList;
	}
}
