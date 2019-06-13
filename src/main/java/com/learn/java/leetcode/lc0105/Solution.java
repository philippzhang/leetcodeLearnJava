package com.learn.java.leetcode.lc0105;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return preOrderBuild(0,preorder.length-1,0,inorder.length-1,preorder,inorder);
	}

	private TreeNode preOrderBuild(int leftPre,int rightPre,int leftIn,int rightIn,int[] preorder, int[] inorder){
		if(leftPre>rightPre||leftIn>rightIn){
			return null;
		}
		//根节点
		TreeNode root = new TreeNode(preorder[leftPre]);

		int rootIn = leftIn;
		while(preorder[leftPre]!=inorder[rootIn]){
			//中序数组中找到根节点的位置
			rootIn++;
		}
		//左子树个数
		int leftLen = rootIn -leftIn;
		root.left = preOrderBuild(leftPre+1,leftPre+leftLen,leftIn,rootIn-1,preorder,inorder);
		root.right = preOrderBuild(leftPre+leftLen+1,rightPre,rootIn+1,rightIn,preorder,inorder);
		return root;
	}
}
