package com.learn.java.leetcode.lc0257;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> results = new ArrayList<>();
		helper( root,results, "");
		return results;
	}

	private void helper(TreeNode node,List<String> results,String path){
		if(node==null){
			return;
		}

		path+=node.val;
		if(node.left==null&&node.right==null){
			results.add(path);
			return;
		}
		path+="->";

		helper( node.left, results, path);
		helper( node.right,results, path);
	}

	public List<String> binaryTreePaths2(TreeNode root) {
		List<String> results = new ArrayList<>();
		if(root==null){
			return results;
		}
		LinkedList<TreeNode> nodeQueue = new LinkedList<>();
		LinkedList<String> pathQueue = new LinkedList<>();
		nodeQueue.add(root);
		pathQueue.add(String.valueOf(root.val));
		while(!nodeQueue.isEmpty()){
			TreeNode node = nodeQueue.pollLast();
			String path = pathQueue.pollLast();
			if(node.left==null&&node.right==null){
				results.add(path);
			}
			if(node.left!=null){
				nodeQueue.add(node.left);
				pathQueue.add(path + "->"+node.left.val);
			}
			if(node.right!=null){
				nodeQueue.add(node.right);
				pathQueue.add(path + "->"+node.right.val);
			}
		}
		return results;
	}
}
