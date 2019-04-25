package com.learn.java.leetcode.lc0235;

import com.learn.java.leetcode.base.structure.TreeNode;

/**
 * 235. Lowest Common Ancestor of a Binary Search Tree 235. 二叉搜索树的最近公共祖先 Easy
 */

public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || p == null || q == null) {
			return null;
		}
		if (root.val < p.val && root.val < q.val) {
			return lowestCommonAncestor(root.right, p, q);
		} else if (root.val > p.val && root.val > q.val) {
			return lowestCommonAncestor(root.left, p, q);
		} else {
			return root;
		}
	}
}
