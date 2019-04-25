package com.learn.java.leetcode.lc0148;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 148. Sort List 148. 排序链表 Medium
 */
public class Solution {
	/**
	 * 采用归并排序
	 *
	 * @param head
	 * @return
	 */
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode p1 = head;
		ListNode p2 = head;
		ListNode pre = null;
		while (p2 != null && p2.next != null) {
			pre = p1;
			p1 = p1.next;
			p2 = p2.next.next;
		}
		pre.next = null;
		ListNode l1 = sortList(head);
		ListNode l2 = sortList(p1);

		return mergeList(l1, l2);
	}

	private ListNode mergeList(ListNode l1, ListNode l2) {
		ListNode preHead = new ListNode(Integer.MIN_VALUE);
		ListNode current = preHead;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				current.next = l1;
				l1 = l1.next;
			} else {
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}
		if (l1 != null) {
			current.next = l1;
		}
		if (l2 != null) {
			current.next = l2;
		}
		return preHead.next;
	}
}
