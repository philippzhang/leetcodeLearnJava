package com.learn.java.leetcode.tms34;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	List<List<Integer>> ret = new ArrayList<>();
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		if(root==null){
			return new ArrayList<>();
		}
		dfs( root, sum,new LinkedList<>());

		return ret;
	}
	private void dfs(TreeNode root,int sum,LinkedList<Integer> path){
		if(root!=null){
			path.add(root.val);
			int temp = sum-root.val;
			if(temp==0&&root.left==null&&root.right==null){
				ret.add(new LinkedList(path));
			}
			if(root.left!=null){
				dfs(root.left,temp,path);
			}
			if(root.right!=null){
				dfs(root.right,temp,path);
			}
			//回溯
			path.removeLast();
		}
	}
}
