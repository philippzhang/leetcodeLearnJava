package com.learn.java.leetcode.offer32ii;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root){
		if(root ==null){
			return new ArrayList<>();
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		List<List<Integer>> ans = new ArrayList<>();
		while(!queue.isEmpty()){
			List<Integer> ans1 = new ArrayList<>();
			int size = queue.size();
			for(int i =0;i<size;i++){
				TreeNode temp = queue.poll();
				ans1.add(temp.val);
				if(temp.left!=null){
					queue.offer(temp.left);
				}
				if(temp.right!=null){
					queue.offer(temp.right);
				}
			}
			ans.add(ans1);
		}

		return ans;
	}
}
