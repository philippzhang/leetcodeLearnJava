package com.learn.java.leetcode.offer27;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public TreeNode mirrorTree(TreeNode root) {
		return helper(root);
	}

	private TreeNode helper(TreeNode root) {
		TreeNode ret = null;
		if(root!=null){
			ret = new TreeNode(root.val);
			ret.left = helper(root.right);
			ret.right = helper(root.left);
		}
		return ret;
	}
}
