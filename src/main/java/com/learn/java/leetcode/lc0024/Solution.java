package com.learn.java.leetcode.lc0024;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 24. Swap Nodes in Pairs 24. 两两交换链表中的节点 Medium
 */
public class Solution {
	public ListNode swapPairs(ListNode head) {
		if(head==null||head.next==null){
			return head;
		}
		ListNode pre = new ListNode(0);
		pre.next = head;
		ListNode cur = pre;
		while(head!=null&&head.next!=null){
			ListNode next = head.next;
			ListNode nextNext = head.next.next;
			cur.next = next;
			next.next= head;
			head.next = nextNext;

			head = head.next;
			cur = cur.next.next;
		}

		return pre.next;
	}
}
