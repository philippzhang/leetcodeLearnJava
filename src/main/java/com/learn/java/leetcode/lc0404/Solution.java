package com.learn.java.leetcode.lc0404;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 404. Sum of Left Leaves 404. 左叶子之和 Easy
 */
public class Solution {
	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int ll = sumOfLeftLeavesTag(root.left, true);
		int lr = sumOfLeftLeavesTag(root.right, false);
		return ll + lr;
	}

	/**
	 * 递归方式
	 *
	 * @param root
	 * @param isLeft
	 * @return
	 */

	public int sumOfLeftLeavesTag(TreeNode root, boolean isLeft) {
		if (root == null) {
			return 0;
		}
		if (isLeft && root.left == null && root.right == null) {
			return root.val;
		} else {
			int ll = sumOfLeftLeavesTag(root.left, true);
			int lr = sumOfLeftLeavesTag(root.right, false);
			return ll + lr;
		}
	}

	/**
	 * 迭代方式实现
	 *
	 * @param root
	 * @return
	 */
	public int sumOfLeftLeaves2(TreeNode root) {
		if (root == null || root.left == null && root.right == null) {
			return 0;
		}
		int res = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode curr = queue.poll();
			if (curr.left != null && curr.left.left == null && curr.left.right == null) {
				res += curr.left.val;
			}
			if (curr.left != null) {
				queue.offer(curr.left);
			}
			if (curr.right != null) {
				queue.offer(curr.right);
			}
		}
		return res;
	}
}
