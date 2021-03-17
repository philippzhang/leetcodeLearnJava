package com.learn.java.leetcode.offer55i;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public int maxDepth(TreeNode root) {
		return dfs(root);
	}

	private int dfs(TreeNode root){
		if(root ==null ){
			return 0;
		}
		int leftHeight = root.left!=null ? dfs(root.left):0;
		int rightHeight = root.right!=null ? dfs(root.right):0;
		return Math.max(leftHeight,rightHeight)+1;
	}

}
