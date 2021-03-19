package com.learn.java.leetcode.offer68i;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null || p == null|| q==null){
			return null;
		}
		if(root.val<p.val&&root.val<q.val){
			return lowestCommonAncestor(root.right,p,q);
		}else if(root.val>p.val&&root.val>q.val){
			return lowestCommonAncestor(root.left,p,q);
		}else {
			return root;
		}

	}

}
