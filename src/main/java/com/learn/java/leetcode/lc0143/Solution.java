package com.learn.java.leetcode.lc0143;

import com.learn.java.leetcode.base.structure.ListNode;

import java.util.LinkedList;


public class Solution {
	public void reorderList(ListNode head) {
		if(head==null||head.next==null||head.next.next==null){
			return ;
		}

		//拆分为2个链表
		ListNode middle = getMiddleNode(head);

		ListNode pCur2 = middle.next;
		middle.next = null;
		ListNode pCur1 = head;

		//翻转pCur2
		ListNode current = pCur2;
		pCur2 = null;
		while(current!=null){
			ListNode next = current.next;
			current.next = pCur2;
			pCur2 = current;
			current = next;
		}


		while (pCur1!=null){
			ListNode next1 = pCur1.next;
			pCur1.next = pCur2;
			if(pCur2!=null) {
				ListNode next2 = pCur2.next;
				pCur2.next = next1;
				pCur2 = next2;
			}
			pCur1 = next1;
		}

	}

	private ListNode getMiddleNode(ListNode head) {
		if(head==null||head.next==null){
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null&&fast.next!=null&&fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;

	}


	public void reorderList2(ListNode head) {
		LinkedList<ListNode> queue = new LinkedList<>();
		ListNode cur = head;
		while (cur != null) {
			queue.addLast(cur);
			cur = cur.next;
		}
		while (!queue.isEmpty()) {
			if (cur == null) {
				cur = queue.pollFirst();
			} else {
				cur.next = queue.pollFirst();
				cur = cur.next;
			}
			cur.next = queue.pollLast();
			cur = cur.next;
		}
		if (cur != null) {
			cur.next = null;
		}
	}
}
