package com.learn.java.leetcode.lc0430;

/**
 * 430. Flatten a Multilevel Doubly Linked List 430. 扁平化多级双向链表 Medium
 */
public class Solution {
	public Node flatten(Node head) {

		//System.out.println(Utils.format(head));
		if (head == null) {
			return head;
		}
		Node pre = new Node(-1, null, head, null);
		while (head != null) {

			Node next = head.next;
			Node child = head.child;
			if (child != null) {
				Node ret = flatten(child);
				head.next = ret;
				ret.prev = head;

				Node last = ret;
				while (last != null && last.next != null) {
					last = last.next;
				}
				last.next = next;
				if(next!=null) {
					next.prev = last;
				}
				head.child = null;

			}
			head = next;
		}
		pre.next.prev = null;
		return pre.next;
	}
}
