package com.learn.java.leetcode.lc0129;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	int ans =0;
	public int sumNumbers(TreeNode root) {
		helper(root,0);
		return ans;
	}

	private void helper(TreeNode node,int val){
		if(node==null){
			return;
		}
		val = val*10+node.val;
		if(node.left==null&&node.right==null){
			ans +=val;
			return;
		}
		helper(node.left,val);
		helper(node.right,val);

	}
}
