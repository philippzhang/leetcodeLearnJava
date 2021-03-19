package com.learn.java.leetcode.offer68ii;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null || p == null|| q==null || root.val ==p.val || root.val ==q.val){
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left,p,q);
		TreeNode right = lowestCommonAncestor(root.right,p,q);

		return left==null ? right : right==null? left : root;

	}

}
