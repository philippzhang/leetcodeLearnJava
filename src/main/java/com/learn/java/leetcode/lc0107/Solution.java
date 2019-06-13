package com.learn.java.leetcode.lc0107;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
		if (root == null) {
			return wrapList;
		}
		queue.offer(root);
		while(!queue.isEmpty()){
			int queueSize = queue.size();
			List<Integer> subList = new ArrayList<>();
			for(int i = 0;i<queueSize;i++){
				if(queue.peek().left!=null){
					queue.offer(queue.peek().left);
				}
				if(queue.peek().right!=null){
					queue.offer(queue.peek().right);
				}
				subList.add(queue.poll().val);
			}

			wrapList.add(0,subList);
		}

		return wrapList;
	}
}
