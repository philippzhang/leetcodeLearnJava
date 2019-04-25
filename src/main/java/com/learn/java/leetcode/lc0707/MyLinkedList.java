package com.learn.java.leetcode.lc0707;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 707. Design Linked List 707. 设计链表 Easy
 */
public class MyLinkedList {

	private ListNode head;

	/**
	 * Initialize your data structure here.
	 */
	public MyLinkedList() {
		head = null;
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
	 */
	public int get(int index) {
		if (index < 0 || head == null) {
			return -1;
		}
		ListNode current = head;
		while (current != null && index > 0) {
			current = current.next;
			index--;
		}
		if (index == 0 && current != null) {
			return current.val;
		} else {
			return -1;
		}
	}

	/**
	 * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		ListNode newHead = new ListNode(val);
		newHead.next = head;
		head = newHead;
	}

	/**
	 * Append a node of value val to the last element of the linked list.
	 */
	public void addAtTail(int val) {
		if (head == null) {
			head = new ListNode(val);
		} else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(val);
		}
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
	 */
	public void addAtIndex(int index, int val) {
		if (index >= 0) {
			ListNode current = head;
			ListNode pre = null;
			while (current != null && index > 0) {
				pre = current;
				current = current.next;
				index--;
			}
			if (index == 0) {
				ListNode newNode = new ListNode(val);
				newNode.next = current;
				if (pre == null) {
					if (head == null) {
						head = newNode;
					} else {
						head.next = newNode;
					}
					//pre = head;
				} else {
					pre.next = newNode;
				}
			}
		}
	}

	/**
	 * Delete the index-th node in the linked list, if the index is valid.
	 */
	public void deleteAtIndex(int index) {
		if (head == null) {
			return;
		}
		if (index >= 0) {
			ListNode current = head;
			ListNode pre = null;
			while (current != null && index > 0) {
				pre = current;
				current = current.next;
				index--;
			}
			if (index == 0 && current != null) {
				if (pre == null) {
					head = head.next;
				} else {
					pre.next = current.next;
				}
			}
		}
	}
}
