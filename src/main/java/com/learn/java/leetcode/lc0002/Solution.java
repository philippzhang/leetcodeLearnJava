package com.learn.java.leetcode.lc0002;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 2. Add Two Numbers 两数相加 Easy
 *
 * @author zhangyangshuo
 */
public class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int b = 0;
		ListNode head = null, tail = null;
		while (l1 != null || l2 != null) {
			int a = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + b;
			b = a / 10;
			a %= 10;
			if (head == null) {
				head = new ListNode(a);
				tail = head;
			} else {
				tail.next = new ListNode(a);
				tail = tail.next;
			}
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		if (b > 0) {
			tail.next = new ListNode(b);
		}
		return head;
	}
}
