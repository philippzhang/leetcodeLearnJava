package com.learn.java.leetcode.lc0147;

import com.learn.java.leetcode.base.structure.ListNode;

public class Solution {
	public ListNode insertionSortList(ListNode head) {
		if(head==null||head.next==null){
			return head;
		}
		ListNode dummy = new ListNode(-1);
		ListNode current = head;
		while(current!=null){
			ListNode next = current.next;
			ListNode pre = dummy;
			//这一步是为了找到当前的cur的节点要插在哪个节点后面
			while(pre.next!=null&&pre.next.val<current.val){
				pre = pre.next;
			}
			current.next = pre.next;
			pre.next = current;
			current = next;
		}

		return dummy.next;
	}
}
