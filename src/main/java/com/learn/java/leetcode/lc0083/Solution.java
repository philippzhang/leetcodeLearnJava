package com.learn.java.leetcode.lc0083;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 83. Remove Duplicates from Sorted List 83. 删除排序链表中的重复元素 Easy
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.val == current.next.val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}
}
