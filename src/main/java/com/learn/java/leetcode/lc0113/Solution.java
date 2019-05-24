package com.learn.java.leetcode.lc0113;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> results = new ArrayList<>();
		List<Integer> path = new ArrayList<>();

		int[] current = new int[1];
		current[0] = 0;
		preOrder( root,results,path, current,  sum);
		return results;

	}

	private void preOrder(TreeNode node,List<List<Integer>> results,List<Integer> path,int[] current, int sum) {
		if(node==null){
			return;
		}
		current[0] += node.val;
		path.add(node.val);
		if(current[0]==sum&&node.left==null&&node.right==null){
			results.add(new ArrayList<>(path));
		}
		preOrder( node.left,results,path, current,  sum);
		preOrder( node.right,results,path, current,  sum);

		path.remove(path.size()-1);
		current[0]-=node.val;
	}
}
