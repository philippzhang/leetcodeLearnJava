package com.learn.java.leetcode.lc0876;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 876. Middle of the Linked List 876. 链表的中间结点 Easy
 */
public class Solution {
	public ListNode middleNode(ListNode head) {
		ListNode p1 = head;
		ListNode p2 = head;
		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
			if (p2 != null) {
				p2 = p2.next;
			}

		}

		return p1;
	}
}
