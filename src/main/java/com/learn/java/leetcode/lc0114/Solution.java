package com.learn.java.leetcode.lc0114;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public void flatten(TreeNode root) {
		preorder(root);
	}

	/**
	 * 前序遍历返回最后一个结点
	 * @param node
	 * @return
	 */
	private TreeNode preorder(TreeNode node){
		if(node==null){
			return null;
		}
		if(node.left==null&&node.right==null){
			return node;
		}
		TreeNode last = null;
		//备份左右指针
		TreeNode left = node.left;
		TreeNode right = node.right;
		TreeNode leftLast = null;
		if(left!=null){
			leftLast = preorder(left);
			node.left=null;
			node.right = left;
			//左子树最后一个结点
			last = leftLast;
		}
		if(right!=null){
			TreeNode rightLast = preorder(right);
			if(leftLast!=null){
				leftLast.right=right;
			}
			//右子树最后一个结点
			last = rightLast;
		}
		return last;
	}
}
