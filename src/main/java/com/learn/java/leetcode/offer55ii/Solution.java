package com.learn.java.leetcode.offer55ii;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {

	boolean flag = true;
	public boolean isBalanced(TreeNode root) {
		dfs(root);
		return flag;
	}

	private int dfs(TreeNode root){
		if(root ==null ){
			return 0;
		}
		if(!flag){
			//提前减枝
			return -1;
		}
		int leftHeight = root.left!=null ? dfs(root.left) : 0;
		int rightHeight = root.right!=null ? dfs(root.right) : 0;

		if(leftHeight==-1 || rightHeight==-1 || Math.abs(leftHeight-rightHeight) >1 ){
			flag = false;
			return -1;
		}
		return Math.max(leftHeight,rightHeight)+1;
	}
}
