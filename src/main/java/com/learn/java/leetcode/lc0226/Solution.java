package com.learn.java.leetcode.lc0226;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public TreeNode invertTree(TreeNode root) {
		if(root==null||root.left==null&&root.right==null){
			return root;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			TreeNode rightTree = node.right;
			node.right = node.left;
			node.left = rightTree;
			if(node.left!=null){
				queue.offer(node.left);
			}
			if(node.right!=null){
				queue.offer(node.right);
			}
		}

		return root;
	}

	// 先序遍历--从顶向下交换
	public TreeNode invertTree2(TreeNode root) {
		if (root == null) return null;
		// 保存右子树
		TreeNode rightTree = root.right;
		// 交换左右子树的位置
		root.right = invertTree2(root.left);
		root.left = invertTree2(rightTree);
		return root;
	}
}
