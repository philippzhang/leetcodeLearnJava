package com.learn.java.leetcode.lc0104;

import com.learn.java.leetcode.base.structure.TreeNode;

/**
 * 104. Maximum Depth of Binary Tree 104. 二叉树的最大深度 Easy
 */
public class Solution {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = maxDepth(root.left) + 1;
		int rightDepth = maxDepth(root.right) + 1;
		return leftDepth > rightDepth ? leftDepth : rightDepth;
	}
}
