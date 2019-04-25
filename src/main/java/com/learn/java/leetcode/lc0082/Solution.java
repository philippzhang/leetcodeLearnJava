package com.learn.java.leetcode.lc0082;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 82. Remove Duplicates from Sorted List II 82. 删除排序链表中的重复元素 II Medium
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode cur = head;
		ListNode preHead = new ListNode(-1);
		preHead.next = head;
		ListNode pre = preHead;
		while (cur != null) {
			while (cur.next != null && cur.val == cur.next.val) {
				cur = cur.next;
			}
			if (pre.next == cur) {
				pre = pre.next;
			} else {
				pre.next = cur.next;
			}
			cur = cur.next;
		}

		return preHead.next;
	}

	/**
	 * 递归实现
	 *
	 * @param head
	 * @return
	 */
	public ListNode deleteDuplicates2(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next != null && head.val == head.next.val) {
			while (head.next != null && head.val == head.next.val) {
				head = head.next;
			}
			return deleteDuplicates2(head.next);
		} else {
			head.next = deleteDuplicates2(head.next);
		}
		return head;
	}

}
