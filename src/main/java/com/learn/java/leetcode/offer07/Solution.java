package com.learn.java.leetcode.offer07;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder ==null || inorder == null|| preorder.length==0 ||inorder.length==0||preorder.length!=inorder.length){
			return null;
		}

		return preBuildTree(0,preorder.length-1,0,inorder.length-1,preorder,inorder);
	}

	/**
	 * 先根遍历
	 * @param preStart
	 * @param preEnd
	 * @param inStart
	 * @param inEnd
	 * @param preorder
	 * @param inorder
	 * @return
	 */
	private TreeNode preBuildTree(int preStart, int preEnd, int inStart, int inEnd, int[] preorder, int[] inorder) {
		if(preStart>preEnd || inStart>inEnd){
			return null;
		}
		//前序遍历第一个结点是根节点
		TreeNode root = new TreeNode(preorder[preStart]);
		int index = inStart;
		while(inorder[index]!=preorder[preStart]){
			index++;
		}
		//左子树的长度
		int leftLen = index - inStart;
		root.left = preBuildTree(preStart+1,preStart+leftLen,inStart, inStart+leftLen,preorder,inorder);
		root.right = preBuildTree(preStart+leftLen+1,preEnd,inStart+leftLen+1,inEnd,preorder,inorder);
		return root;
	}
}
