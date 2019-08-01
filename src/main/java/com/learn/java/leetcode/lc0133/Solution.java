package com.learn.java.leetcode.lc0133;

import java.util.*;

public class Solution {
	public Node cloneGraph2(Node node) {
		Map<Node,Node> lookup = new HashMap<>();
		return dfs(node,lookup);
	}

	/**
	 * dfs
	 * @param node
	 * @param lookup
	 * @return
	 */
	private Node dfs(Node node,Map<Node,Node> lookup){
		if(node==null){
			return null;
		}
		if(lookup.containsKey(node)){
			return lookup.get(node);
		}
		Node clone = new Node(node.val,new ArrayList<>());
		lookup.put(node,clone);
		for(Node n:node.neighbors){
			clone.neighbors.add(dfs(n,lookup));
		}
		return clone;
	}

	/**
	 * bfs
	 * @param node
	 * @return
	 */
	public Node cloneGraph(Node node) {
		if(node==null){
			return null;
		}
		Map<Node,Node> lookup = new HashMap<>();
		Node clone = new Node(node.val,new ArrayList<>());
		lookup.put(node,clone);

		Queue<Node> queue = new LinkedList<>();
		queue.offer(node);
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			for(Node n :temp.neighbors){
				if(!lookup.containsKey(n)){
					lookup.put(n,new Node(n.val,new ArrayList<>()));
					queue.offer(n);
				}
				lookup.get(temp).neighbors.add(lookup.get(n));
			}
		}
		return clone;
	}
}
