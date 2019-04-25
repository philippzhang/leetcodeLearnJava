package com.learn.java.leetcode.lc0236;

import com.learn.java.leetcode.base.structure.TreeNode;

/**
 * 236. Lowest Common Ancestor of a Binary Tree 236. 二叉树的最近公共祖先 Medium
 */
public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		return left == null ? right : right == null ? left : root;

	}
}
