package com.learn.java.leetcode.lc0019;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 19. Remove Nth Node From End of List 19. 删除链表的倒数第N个节点 Medium
 */

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return head;
		}
		ListNode fast = head;
		ListNode slow = head;
		while (n-- > 0) {
			if (fast == null) {
				return head;
			}
			fast = fast.next;
		}
		if (fast == null) {
			return head.next;
		}
		while (fast != null && fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		ListNode temp = slow.next;
		if (temp != null) {
			slow.next = temp.next;
		}
		if (n == 1) {
			head = head.next;
		}

		return head;
	}
}
