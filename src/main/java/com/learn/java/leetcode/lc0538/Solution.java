package com.learn.java.leetcode.lc0538;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	private void travalTree(TreeNode node,int[] sum ){
		if(node ==null){
			return;
		}
		travalTree(node.right,sum);
		sum[0]+=node.val;
		node.val = sum[0];
		travalTree(node.left,sum);
	}
	public TreeNode convertBST(TreeNode root) {
		int[] sum = new int[1];
		travalTree(root,sum);
		return root;
	}
}
