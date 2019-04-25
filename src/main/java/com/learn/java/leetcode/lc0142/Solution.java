package com.learn.java.leetcode.lc0142;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 142. Linked List Cycle II 142. 环形链表 II Medium
 */
public class Solution {
	/**
	 * 设定快慢指针，快指针每次走2步
	 * 假设从开始到环第一个结点距离为A，从环开始快慢执行相遇距离为B
	 * 那么慢执行运行距离为A+B 快指针为2A+2B,由于快执行多走了一个环长（N)
	 * 所以环长N = 2A+2B-(A+B)=A+B
	 * 所以当从链表头开始运行的另一个慢指针运行A距离时，从相遇点慢指针也会运行距离A（N-B=A）
	 * 此时相遇点为环开始结点
	 *
	 * @param head
	 * @return
	 */
	public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				ListNode slow2 = head;
				while (slow2 != slow) {
					slow = slow.next;
					slow2 = slow2.next;
				}
				return slow;
			}

		}
		return null;
	}
}
