package com.learn.java.leetcode.lc0437;

import com.learn.java.leetcode.base.structure.TreeNode;


public class Solution {
	public int pathSum(TreeNode root, int sum) {
		if(root==null){
			return 0;
		}
		return preOrder(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);
	}

	private int preOrder(TreeNode node, int sum) {
		if(node ==null){
			return 0;
		}

		int res = 0;
		if(node.val==sum){
			res += 1;
		}

		res += preOrder( node.left, sum-node.val);
		res += preOrder( node.right, sum-node.val);

		return res;
	}
}
