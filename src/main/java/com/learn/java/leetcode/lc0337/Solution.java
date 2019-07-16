package com.learn.java.leetcode.lc0337;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public int rob(TreeNode root) {
		return doRob(root);
	}

	private int doRob(TreeNode node){
		if(node ==null){
			return 0;
		}
		int a = node.val;
		int b = doRob(node.left) + doRob(node.right);
		if(node.left!=null){
			a+=(doRob(node.left.left)+doRob(node.left.right));
		}
		if(node.right!=null){
			a+=(doRob(node.right.left)+doRob(node.right.right));
		}
		return Math.max(a,b);
	}

}
