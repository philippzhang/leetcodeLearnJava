package com.learn.java.leetcode.lc0432;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllOne {
	class Node implements Comparable<Node>{
		String key;
		int  value;



		public Node(String key, int value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public int compareTo(Node o) {
			if(value == o.value){
				return key.compareTo(o.key);
			}
			return value-o.value;
		}

		@Override
		public String toString() {
			return "Node{" +
					"key='" + key + '\'' +
					", value=" + value +
					'}';
		}
	}
	private Map<String,Node> map = null;
	private TreeMap<Node,Integer> treeMap = null;
	/** Initialize your data structure here. */
	public AllOne() {
		map = new HashMap<>();
		treeMap = new TreeMap<>();
	}

	/** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
	public void inc(String key) {
		Node node = map.get(key) ;
		if(node == null) {
			node = new Node(key,1) ;
			map.put(key, node) ;
			treeMap.put(node,1) ;
		}else {
			//必须先删除
			treeMap.remove(node) ;
			node.value++ ;
			treeMap.put(node, 1) ;
		}
	}

	/** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
	public void dec(String key) {
		Node node = map.get(key);
		if(node!=null){
			//必须先删除
			treeMap.remove(node);
			node.value--;
			if(node.value==0){
				map.remove(key);
			}else{
				treeMap.put(node,1);
			}
		}
	}

	/** Returns one of the keys with maximal value. */
	public String getMaxKey() {
		if(treeMap.isEmpty()){
			return "";
		}
		return treeMap.lastEntry().getKey().key;
	}

	/** Returns one of the keys with Minimal value. */
	public String getMinKey() {
		if(treeMap.isEmpty()){
			return "";
		}
		return treeMap.firstEntry().getKey().key;
	}
}
