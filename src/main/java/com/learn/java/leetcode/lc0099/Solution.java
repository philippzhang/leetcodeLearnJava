package com.learn.java.leetcode.lc0099;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	/**
	 * 那这道题我们就有了大致思路
	 * 我们对错误的二叉树进行 中序遍历 那我们按顺序访问到的数应该是按顺序排列的
	 * 那如果对两个节点交换了顺序  那一定有两个地方是  不满足  前一个元素 < 当前元素 < 后一个元素
	 */
	TreeNode t1,t2,pre;
	public void recoverTree(TreeNode root) {
		inorder(root);
		int temp = t1.val;
		t1.val = t2.val;
		t2.val = temp;
	}

	/**
	 * 中序遍历
	 * @param node
	 */
	private void inorder(TreeNode node){
		if(node ==null){
			return;
		}
		inorder(node.left);
		if(pre!=null&&pre.val>node.val){
			if(t1==null){
				t1 = pre;
			}
			t2 = node;
		}
		pre = node;
		inorder(node.right);
	}
}
