package com.learn.java.leetcode.lc0021;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 21. Merge Two Sorted Lists 21. 合并两个有序链表 Easy
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode retListNode = new ListNode(Integer.MIN_VALUE);
		ListNode tail = retListNode;
		while (l1 != null || l2 != null) {
			int v1 = l1 != null ? l1.val : Integer.MAX_VALUE;
			int v2 = l2 != null ? l2.val : Integer.MAX_VALUE;
			if (v1 <= v2) {
				tail.next = new ListNode(v1);
				l1 = l1.next;
			} else {
				tail.next = new ListNode(v2);
				l2 = l2.next;
			}
			tail = tail.next;
		}

		return retListNode.next;
	}
}
