package com.learn.java.leetcode.lc0146;

import java.util.HashMap;
import java.util.Map;

/**
 * 146. LRU Cache 146. LRU缓存机制 Hard
 */
public class LRUCache {

	/**
	 * 采用双向链表和HashMap实现
	 */

	class DLinkedNode {
		int key;
		int value;
		DLinkedNode pre;
		DLinkedNode next;

	}

	private Map<Integer, DLinkedNode>
			cache = new HashMap<Integer, DLinkedNode>();
	private int count;
	private int capacity;
	private DLinkedNode head, tail;

	/**
	 * 添加结点到head之后
	 *
	 * @param node
	 */
	private void addNode(DLinkedNode node) {
		node.pre = head;
		node.next = head.next;

		head.next.pre = node;
		head.next = node;
	}

	/**
	 * 移除一个存在的结的
	 *
	 * @param node
	 */
	private void removeNode(DLinkedNode node) {
		DLinkedNode pre = node.pre;
		DLinkedNode next = node.next;

		pre.next = next;
		next.pre = pre;
	}

	/**
	 * 移除结点添加到头部
	 *
	 * @param node
	 */
	private void moveToHead(DLinkedNode node) {
		this.removeNode(node);
		this.addNode(node);
	}

	/**
	 * 移除结尾
	 *
	 * @return
	 */
	private DLinkedNode removeTail() {
		DLinkedNode res = tail.pre;
		this.removeNode(res);
		return res;
	}


	public LRUCache(int capacity) {
		this.count = 0;
		this.capacity = capacity;

		head = new DLinkedNode();
		head.pre = null;

		tail = new DLinkedNode();
		tail.next = null;
		head.next = tail;
		tail.pre = head;
	}

	public int get(int key) {
		DLinkedNode node = cache.get(key);
		if (node == null) {
			return -1;
		}

		this.moveToHead(node);

		return node.value;
	}

	public void put(int key, int value) {
		DLinkedNode node = cache.get(key);
		if (node == null) {
			DLinkedNode newNode = new DLinkedNode();
			newNode.key = key;
			newNode.value = value;
			this.cache.put(key, newNode);
			this.addNode(newNode);
			count++;

			if (count > capacity) {
				DLinkedNode tail = this.removeTail();
				this.cache.remove(tail.key);
				count--;
			}
		} else {
			node.value = value;
			this.moveToHead(node);
		}

	}

}
