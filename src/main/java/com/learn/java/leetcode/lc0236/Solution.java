package com.learn.java.leetcode.lc0236;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 236. Lowest Common Ancestor of a Binary Tree 236. 二叉树的最近公共祖先 Medium
 */
public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		return left == null ? right : right == null ? left : root;

	}


	public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q){
		List<TreeNode> path   = new ArrayList<>();
		List<TreeNode> p_path = new ArrayList<>();
		List<TreeNode> q_path = new ArrayList<>();
		preorder(root,p,path,p_path);
		path.clear();
		preorder(root,q,path,q_path);
		path.clear();
		int path_len =0;
		if(p_path.size()<q_path.size()){
			path_len = p_path.size();
		}else{
			path_len = q_path.size();
		}
		TreeNode result = null;
		for(int i =0;i<path_len;i++){
			if(p_path.get(i)==q_path.get(i)){
				result = p_path.get(i);
			}
		}
		return result;
	}

	/**
	 * 根节点到任意结点的路径
	 * @param node
	 * @param search
	 * @param path
	 * @param result
	 */
	private void preorder(TreeNode node,TreeNode search,List<TreeNode> path,List<TreeNode> result){
		if(node==null){
			return;
		}
		path.add(node);
		if(node == search){
			result.addAll(path);
			return;
		}
		preorder(node.left,search,path,result);
		preorder(node.right,search,path,result);
		path.remove(path.size()-1);
	}
}
