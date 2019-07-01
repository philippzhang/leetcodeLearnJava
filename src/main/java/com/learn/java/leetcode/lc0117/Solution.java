package com.learn.java.leetcode.lc0117;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public Node connect(Node root) {
		if(root == null||root.left==null&&root.right==null){
			return root;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()){
			int levelNum = queue.size();
			Node temp = null;
			for (int i = 0; i < levelNum; i++) {
				Node node = queue.poll();

				if(node.left!=null){
					queue.offer(node.left);

				}
				if(node.right!=null){
					queue.offer(node.right);
				}
				if(temp!=null){
					temp.next= node;
				}
				temp = node;
			}
		}
		return root;
	}
}
