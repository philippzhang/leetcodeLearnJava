package com.learn.java.leetcode.lc0543;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	int max = 0;
	public int diameterOfBinaryTree(TreeNode root) {
		if(root ==null){
			return 0;
		}

		if(root.left==null&&root.right==null){
			return 0;
		}
		getMaxPath(root);
		return max;
	}

	private int getMaxPath(TreeNode node){
		if(node ==null){
			return 0;
		}

		if(node.left==null&&node.right==null){
			return 1;
		}
		int l = getMaxPath(node.left);
		int r = getMaxPath(node.right);
		if(l+r>max){
			max = l+r;
		}
		return Math.max(l,r)+1;
	}
}
