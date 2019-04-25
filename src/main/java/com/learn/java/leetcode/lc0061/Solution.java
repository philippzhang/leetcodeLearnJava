package com.learn.java.leetcode.lc0061;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 61. Rotate List 61. 旋转链表 Medium
 */
public class Solution {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null) {
			return head;
		}
		int i = 0;
		ListNode preHead = new ListNode(-1);
		preHead.next = head;
		ListNode fast = preHead;
		for (i = 0; fast.next != null; i++) {
			fast = fast.next;
		}
		ListNode slow = preHead;
		for (int j = i - k % i; j > 0; j--) {
			slow = slow.next;
		}
		fast.next = head;
		preHead.next = slow.next;
		slow.next = null;
		return preHead.next;
	}


	public ListNode rotateRight2(ListNode head, int k) {
		if (head == null || head.next == null) {
			return head;
		}
		int count = lengthList(head);
		k = k % count == 0 ? count : k % count;

		for (int i = 0; i < k; i++) {
			head = turnRight(head);
		}
		return head;
	}

	public int lengthList(ListNode head) {
		if (head == null) {
			return 0;
		}

		int count = 0;
		ListNode cur = head;
		while (cur != null) {
			cur = cur.next;
			count++;
		}
		return count;
	}


	private ListNode turnRight(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode p = head;
		while (p.next.next != null) {
			p = p.next;
		}
		ListNode temp = p.next;
		p.next = null;
		temp.next = head;
		return temp;
	}


}
