package com.learn.java.leetcode.lc0106;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		return preOrderBuild(0,inorder.length-1,0,postorder.length-1,inorder,postorder);
	}

	private TreeNode preOrderBuild(int leftIn,int rightIn,int leftPost,int rightPost,int[] inorder, int[] postorder) {
		if (leftIn > rightIn || leftPost > rightPost) {
			return null;
		}

		//根节点
		TreeNode root = new TreeNode(postorder[rightPost]);

		int rootIn = leftIn;
		while (inorder[rootIn] != postorder[rightPost]) {
			rootIn++;
		}
		//左子树个数
		int leftLen = rootIn - leftIn;
		root.left = preOrderBuild(leftIn, rootIn - 1, leftPost, leftPost + leftLen - 1, inorder, postorder);
		root.right = preOrderBuild(rootIn + 1, rightIn, leftPost + leftLen, rightPost - 1, inorder, postorder);
		return root;
	}

}
