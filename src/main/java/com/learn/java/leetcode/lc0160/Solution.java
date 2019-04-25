package com.learn.java.leetcode.lc0160;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 160. Intersection of Two Linked Lists 160. 相交链表 Easy
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		ListNode a = headA;
		ListNode b = headB;
		int lenA = len(headA);
		int lenB = len(headB);
		while (lenA > lenB) {
			a = a.next;
			lenA--;
		}
		while (lenB > lenA) {
			b = b.next;
			lenB--;
		}
		while (a != b) {
			if (a == null) {
				return null;
			} else {
				a = a.next;
			}
			if (b == null) {
				return null;
			} else {
				b = b.next;
			}
		}
		return a;
	}

	private int len(ListNode head) {
		int n = 0;
		while (head != null) {
			head = head.next;
			n++;
		}
		return n;
	}
}
