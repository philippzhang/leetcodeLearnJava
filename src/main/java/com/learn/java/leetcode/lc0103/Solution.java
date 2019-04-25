package com.learn.java.leetcode.lc0103;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.*;

/**
 * 103. Binary Tree Zigzag Level Order Traversal 103. 二叉树的锯齿形层次遍历 Medium
 */
public class Solution {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		//逆序
		Stack<TreeNode> stack = new Stack<>();
		//记录正常顺序
		Queue<TreeNode> queue2 = new LinkedList<>();
		queue.offer(root);
		int level = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> childList = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				if (level % 2 == 1) {
					if (queue2.peek().left != null) {
						queue.offer(queue2.peek().left);
					}
					if (queue2.peek().right != null) {
						queue.offer(queue2.peek().right);
					}
					queue2.poll();
				} else {
					if (queue.peek().left != null) {
						stack.push(queue.peek().left);
						queue2.offer(queue.peek().left);
					}
					if (queue.peek().right != null) {
						stack.push(queue.peek().right);
						queue2.offer(queue.peek().right);
					}
				}
				childList.add(queue.poll().val);
			}
			list.add(childList);
			if (level % 2 == 0) {
				while (!stack.isEmpty()) {
					queue.offer(stack.pop());
				}
			}
			level++;
		}
		return list;
	}


	public List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		boolean order = true;
		int size = 1;
		while (!q.isEmpty()) {
			List<Integer> tmp = new ArrayList<>();
			for (int i = 0; i < size; ++i) {
				TreeNode n = q.poll();
				if (order) {
					tmp.add(n.val);
				} else {
					tmp.add(0, n.val);
				}
				if (n.left != null) {
					q.add(n.left);
				}
				if (n.right != null) {
					q.add(n.right);
				}
			}
			res.add(tmp);
			size = q.size();
			order = order ? false : true;
		}
		return res;
	}

	/**
	 * 递归实现
	 *
	 * @param root
	 * @return
	 */
	public List<List<Integer>> zigzagLevelOrder3(TreeNode root) {
		List<List<Integer>> sol = new ArrayList<>();
		travel(root, sol, 0);
		return sol;
	}

	private void travel(TreeNode curr, List<List<Integer>> sol, int level) {
		if (curr == null) {
			return;
		}
		if (sol.size() <= level) {
			sol.add(new ArrayList<>());
		}
		List<Integer> list = sol.get(level);
		if (level % 2 == 0) {
			list.add(curr.val);
		} else {
			list.add(0, curr.val);
		}

		travel(curr.left, sol, level + 1);
		travel(curr.right, sol, level + 1);
	}

}
