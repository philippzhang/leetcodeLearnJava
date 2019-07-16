package com.learn.java.leetcode.lc0222;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public int countNodes(TreeNode root) {
		return root ==null?0:countNodes(root.left)+countNodes(root.right)+1;
	}
}
