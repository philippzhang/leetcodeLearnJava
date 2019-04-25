package com.learn.java.leetcode.lc0617;

import com.learn.java.leetcode.base.structure.TreeNode;

/**
 * 617. Merge Two Binary Trees 617. 合并二叉树 Easy
 */
public class Solution {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return null;
		}
		int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
		TreeNode newRoot = new TreeNode(val);
		newRoot.left = mergeTrees(t1 != null ? t1.left : null, t2 != null ? t2.left : null);
		newRoot.right = mergeTrees(t1 != null ? t1.right : null, t2 != null ? t2.right : null);
		return newRoot;
	}
}
