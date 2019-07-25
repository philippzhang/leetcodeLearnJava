package com.learn.java.leetcode.lc0706;



public class MyHashMap {

	private class Node{
		Node next;
		int key;
		int value;


	}
	private Node[] nodeArray = new Node[1024];

	private int hashCode(int key ){
		return key%1023;
	}

	/** Initialize your data structure here. */
	public MyHashMap() {

	}

	/** value will always be non-negative. */
	public void put(int key, int value) {
		Node node = new Node();
		int hash = hashCode(key);
		node.key = key;
		node.value = value;
		if(contains(key)){
			Node n = nodeArray[hash];
			while(n!=null){
				if(n.key==key){
					n.value = value;
					break;
				}
				n = n.next;
			}
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

	/** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
	public int get(int key) {
		int hash = hashCode(key);
		if(nodeArray[hash]==null){
			return -1;
		}else{
			Node n = nodeArray[hash];
			while(n!=null){
				if(n.key==key){
					return n.value;
				}
				n = n.next;
			}
			return -1;
		}
	}

	/** Removes the mapping of the specified value key if this map contains a mapping for the key */
	public void remove(int key) {
		int hash = hashCode(key);
		if(!contains(key)){
			return;
		}else{
			Node n = nodeArray[hash];
			Node next = n.next;
			if(n.key==key){
				nodeArray[hash] = next;
				return;
			}else{
				while(next!=null){
					if(next.key==key){
						n.next= next.next;
						return;
					}
					n = n.next;
					next = next.next;
				}
			}
		}
	}


	private boolean contains(int key){
		int hash = hashCode(key);
		if(nodeArray[hash]==null){
			return false;
		}else{
			Node n = nodeArray[hash];
			while(n!=null){
				if(n.key==key){
					return true;
				}
				n = n.next;
			}
			return false;
		}
	}

}
