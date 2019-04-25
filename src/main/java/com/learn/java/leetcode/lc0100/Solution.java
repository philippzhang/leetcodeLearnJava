package com.learn.java.leetcode.lc0100;

import com.learn.java.leetcode.base.structure.TreeNode;

/**
 * 100. Same Tree 100. 相同的树 Easy
 */
public class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p != null && q == null || p == null && q != null) {
			return false;
		}
		if (p == null && q == null) {
			return true;
		}
		if (p != null && q != null && p.val != q.val) {
			return false;
		}
		if (!isSameTree(p.left, q.left)) {
			return false;
		}
		if (!isSameTree(p.right, q.right)) {
			return false;
		}
		return true;
	}
}
