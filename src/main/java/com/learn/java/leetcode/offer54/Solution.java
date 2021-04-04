package com.learn.java.leetcode.offer54;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	int res,i;
	public int kthLargest(TreeNode root, int k) {
		i=k;
		dfs(root);
		return res;
	}
	//对于搜索二叉树，从右向左遍历，正好是降序
	private void dfs (TreeNode root){
		if(root==null) {
			return;
		}
		dfs(root.right);
		if(i==0){
			return;
		}
		if(--i==0){
			res = root.val;
		}
		dfs(root.left);
	}
}
