package com.learn.java.leetcode.lc0687;

import com.learn.java.leetcode.base.structure.TreeNode;

/**
 * 687. Longest Univalue Path 687. 最长同值路径 Easy
 */
public class Solution {
	public int longestUnivaluePath(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int[] res = new int[1];
		dfs(root, res);
		return res[0];
	}

	private int dfs(TreeNode node, int[] res) {
		int l = node.left != null ? dfs(node.left, res) : 0;
		int r = node.right != null ? dfs(node.right, res) : 0;
		int lres = node.left != null && node.val == node.left.val ? (l + 1) : 0;
		int rres = node.right != null && node.val == node.right.val ? (r + 1) : 0;
		res[0] = Math.max(res[0], lres + rres);
		return Math.max(lres, rres);
	}
}
