package com.learn.java.leetcode.lc0111;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public int minDepth(TreeNode root) {
		return getMinHeight(root);
	}

	private int getMinHeight(TreeNode node){
		if(node ==null){
			return 0;
		}
		if(node.left == null&&node.right==null){
			return 1;
		}
		int left = getMinHeight(node.left);
		int right = getMinHeight(node.right);
		if(left==0){
			return right+1;
		}else if(right==0){
			return left+1;
		}
		return (left>right?right:left)+1;
	}
}
