package com.learn.java.leetcode.lc0429;

import com.learn.java.leetcode.base.structure.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> results = new ArrayList<>();
		if(root==null){
			return results;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			int size = queue.size();
			List<Integer> subList = new ArrayList();
			for(int i =0;i<size;i++){
				Node node = queue.poll();
				subList.add(node.val);
				List<Node> children = node.children;
				if(children!=null&&children.size()>0){
					for(Node n:children){
						queue.offer(n);
					}
				}
			}
			results.add(subList);
		}

		return results;
	}
}
