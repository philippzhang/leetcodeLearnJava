package com.learn.java.leetcode.lc0199;

import com.learn.java.leetcode.base.structure.TreeNode;


import java.util.*;

public class Solution {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> results = new ArrayList<>();
		Queue<Map.Entry<TreeNode, Integer>> queue = new LinkedList<>();
		if(root==null){
			return results;
		}
		queue.add(new AbstractMap.SimpleEntry(root,0));

		while(!queue.isEmpty()){
			Map.Entry<TreeNode, Integer> entry = queue.poll();
			TreeNode node = entry.getKey();
			int depth = entry.getValue();
			if(results.size()==depth){
				results.add(node.val);
			}else{
				results.set(depth,node.val);
			}
			if(node.left!=null){
				queue.add(new AbstractMap.SimpleEntry(node.left,depth+1));
			}
			if(node.right!=null){
				queue.add(new AbstractMap.SimpleEntry(node.right,depth+1));
			}

		}

		return results;
	}


}
