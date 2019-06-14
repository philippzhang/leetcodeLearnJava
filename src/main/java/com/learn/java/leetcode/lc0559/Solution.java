package com.learn.java.leetcode.lc0559;

import com.learn.java.leetcode.base.structure.Node;

import java.util.List;

public class Solution {
	public int maxDepth(Node root) {
		return getHeight(root);
	}

	private int getHeight(Node node){
		if(node==null){
			return 0;
		}
		int max = 0;
		List<Node> children= node.children;
		for(Node n:children){
			max = Math.max(max,getHeight(n));
		}
		return max +1;
	}
}
