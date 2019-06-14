package com.learn.java.leetcode.lc0098;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	/**
	 * 中序遍历，必须是升序
	 */
	double last = -Double.MAX_VALUE;
	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (isValidBST(root.left)) {
			if (last < root.val) {
				last = root.val;
				return isValidBST(root.right);
			}
		}
		return false;
	}


	public boolean isValidBST2(TreeNode root) {
		if(root ==null){
			return true;
		}
		if(root.left!=null&&(root.left.val>=root.val||getMaxRight(root.left)>=root.val)){
			return false;
		}
		if(root.right!=null&&(root.right.val<=root.val||getMinLeft(root.right)<=root.val)){
			return false;
		}

		if(!isValidBST2(root.left)||!isValidBST2(root.right)){
			return false;
		}

		return true;
	}

	private int getMaxRight(TreeNode node){
		TreeNode cur = node ;
		while(cur.right!=null){
			cur = cur.right;
		}
		return cur.val;
	}

	private int getMinLeft(TreeNode node){
		TreeNode cur = node ;
		while(cur.left!=null){
			cur = cur.left;
		}
		return cur.val;
	}
}
