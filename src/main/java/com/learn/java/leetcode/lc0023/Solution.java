package com.learn.java.leetcode.lc0023;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 23. Merge k Sorted Lists 23. 合并K个排序链表 Hard
 */
public class Solution {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) {
			return null;
		}
		if (lists.length == 1) {
			return lists[0];
		}

		if (lists.length == 2) {
			return mergeTwoLists(lists[0], lists[1]);
		}
		int start = 0;
		int end = lists.length - 1;
		int middle = (start + end) / 2;
		ListNode leftLists = mergeKLists(lists, start, middle);
		ListNode rightLists = mergeKLists(lists, middle + 1, end);
		return mergeTwoLists(leftLists, rightLists);

	}

	private ListNode mergeKLists(ListNode[] lists, int start, int end) {
		if (start > end) {
			return null;
		}
		if (start == end) {
			return lists[start];
		}
		if (end - start == 1) {
			return mergeTwoLists(lists[start], lists[end]);
		}
		int middle = (start + end) / 2;
		ListNode leftLists = mergeKLists(lists, start, middle);
		ListNode rightLists = mergeKLists(lists, middle + 1, end);
		return mergeTwoLists(leftLists, rightLists);
	}


	private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
