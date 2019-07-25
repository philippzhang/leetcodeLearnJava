package com.learn.java.leetcode.lc0705;

public class MyHashSet {
	private class Node{
		Node next;
		int val;

	}
	private Node[] nodeArray = new Node[1024];
	/** Initialize your data structure here. */
	public MyHashSet() {

	}

	private int hashCode(int key ){
		return key%1023;
	}

	public void add(int key) {
		Node node = new Node();
		int hash = hashCode(key);
		node.val = key;
		if(contains(key)){
			return;
		}
		if(nodeArray[hash]==null){
			nodeArray[hash] = node;
		}else{
			Node n = nodeArray[hash];
			while(n.next!=null){
				n = n.next;
			}
			n.next = node;
		}

	}

	public void remove(int key) {
		int hash = hashCode(key);
		if(!contains(key)){
			return;
		}else{
			Node n = nodeArray[hash];
			Node next = n.next;
			if(n.val==key){
				nodeArray[hash] = next;
				return;
			}else{
				while(next!=null){
					if(next.val==key){
						n.next= next.next;
						return;
					}
					n = n.next;
					next = next.next;
				}
			}
		}
	}

	/** Returns true if this set contains the specified element */
	public boolean contains(int key) {
		int hash = hashCode(key);
		if(nodeArray[hash]==null){
			return false;
		}else{
			Node n = nodeArray[hash];
			while(n!=null){
				if(n.val==key){
					return true;
				}
				n = n.next;
			}
			return false;
		}
	}
}
