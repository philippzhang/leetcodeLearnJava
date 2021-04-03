package com.learn.java.leetcode.offer32i;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public int[] levelOrder(TreeNode root) {
		if(root ==null){
			return new int[0];
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		List<Integer> ans = new ArrayList<>();
		while(!queue.isEmpty()){
			int size = queue.size();
			for(int i =0;i<size;i++){
				TreeNode temp = queue.poll();
				ans.add(temp.val);
				if(temp.left!=null){
					queue.offer(temp.left);
				}
				if(temp.right!=null){
					queue.offer(temp.right);
				}
			}
		}

		int[] ret = new int[ans.size()];
		for(int i = 0;i<ans.size();i++){
			ret[i] = ans.get(i);
		}
		return ret;
	}
}
