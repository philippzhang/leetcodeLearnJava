package com.learn.java.leetcode.lc0092;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 92. Reverse Linked List II 92. 反转链表 II Medium
 */
public class Solution {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (head == null || head.next == null || m < 1 || m > n) {
			return head;
		}
		ListNode preHead = new ListNode(0);
		preHead.next = head;
		ListNode p1 = preHead;
		int i = 1;
		while (p1 != null && i < m) {
			p1 = p1.next;
			i++;
		}

		if (p1 == null) {
			return head;
		}
		ListNode p2 = p1.next;
		ListNode pre = null;
		ListNode tail = null;

		while (p2 != null && i < n + 1) {
			ListNode next = p2.next;
			if (pre == null) {
				tail = p2;
			}
			p2.next = pre;
			pre = p2;
			p2 = next;
			i++;
		}
		if (i == n + 1) {
			p1.next = pre;
			tail.next = p2;
		} else {
			//n>链表长度

			ListNode pre2 = null;
			while (pre != null) {
				ListNode next = pre.next;
				pre.next = pre2;
				pre2 = pre;
				pre = next;
			}
			p1.next = pre2;
		}

		return preHead.next;
	}

	public ListNode createList(int[] arr) {
		if (arr == null || arr.length <= 0) {
			return null;
		}
		ListNode head = null;
		ListNode current = null;
		ListNode pre = null;
		for (int i = 0; i < arr.length; i++) {
			current = new ListNode(arr[i]);
			if (pre == null) {
				head = current;
			} else {
				pre.next = current;
			}
			pre = current;
		}
		return head;
	}

	public void print(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}
}
