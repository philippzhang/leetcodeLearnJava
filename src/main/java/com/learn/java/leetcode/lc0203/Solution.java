package com.learn.java.leetcode.lc0203;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 203. Remove Linked List Elements 203. 移除链表元素 Easy
 */
public class Solution {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return head;
		}
		ListNode current = head;
		ListNode pre = null;
		while (current != null) {
			ListNode next = current.next;
			if (current.val == val) {
				if (pre == null) {

					head = next;
				} else {
					pre.next = next;

				}
			} else {
				pre = current;
			}

			current = next;
		}
		return head;
	}
}
