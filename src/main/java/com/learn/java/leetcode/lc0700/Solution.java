package com.learn.java.leetcode.lc0700;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public TreeNode searchBST(TreeNode root, int val) {
		return searchBSTCore(root,val);
	}

	private TreeNode searchBSTCore(TreeNode root, int val){
		if(root==null){
			return null;
		}
		if(root.val==val){
			return root;
		}
		if(root.val>val){
			return searchBSTCore(root.left,val);
		}else{
			return searchBSTCore(root.right,val);
		}
	}
}
