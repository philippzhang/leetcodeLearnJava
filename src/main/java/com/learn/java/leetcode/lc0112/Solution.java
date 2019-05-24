package com.learn.java.leetcode.lc0112;

import com.learn.java.leetcode.base.structure.TreeNode;


public class Solution {
	public boolean hasPathSum(TreeNode root, int sum) {
		int[] current = new int[1];
		current[0] = 0;
		return preOrder(root,current,sum);
	}

	private boolean preOrder(TreeNode node,  int[] current, int sum) {
		if(node==null){
			return false;
		}
		current[0] += node.val;
		if(current[0]==sum&&node.left==null&&node.right==null){
			return true;
		}
		boolean f1 = preOrder( node.left, current,  sum);
		if(f1){
			return true;
		}
		boolean f2 = preOrder( node.right, current,  sum);
		if(f2){
			return true;
		}
		current[0]-=node.val;
		return false;
	}
}
