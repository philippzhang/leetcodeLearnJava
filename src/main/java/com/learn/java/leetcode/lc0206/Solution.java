package com.learn.java.leetcode.lc0206;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 206. Reverse Linked List 206. 反转链表 Easy
 */
public class Solution {
	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode newHead = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}

		return newHead;

	}


	public ListNode reverseList2(ListNode head) {
		return reverseList2(head, null);
	}

	private ListNode reverseList2(ListNode head, ListNode newHead) {
		if (head == null) {
			return newHead;
		}
		ListNode next = head.next;
		head.next = newHead;
		return reverseList2(next, head);
	}

}
