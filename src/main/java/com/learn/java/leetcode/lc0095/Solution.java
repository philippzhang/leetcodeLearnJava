package com.learn.java.leetcode.lc0095;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<TreeNode> generateTrees(int n) {
		List<TreeNode> results = new ArrayList<>();
		if(n<1){
			return results;
		}
		return  helper(1,n);
	}

	private List<TreeNode> helper(int start, int end){
		List<TreeNode> results = new ArrayList<>();
		if(start>end){
			//这行必须加
			results.add(null);
			return results;
		}
		for(int i = start;i<=end;i++){
			List<TreeNode> left = helper(start,i-1);
			List<TreeNode> right = helper(i+1,end);

			for(TreeNode j:left){
				for(TreeNode k:right){
					TreeNode root = new TreeNode(i);
					root.left = j;
					root.right = k;
					results.add(root);
				}
			}

		}
		return results;
	}
}
