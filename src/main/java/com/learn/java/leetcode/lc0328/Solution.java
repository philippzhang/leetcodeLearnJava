package com.learn.java.leetcode.lc0328;

import com.learn.java.leetcode.base.structure.ListNode;

public class Solution {
	public ListNode oddEvenList(ListNode head) {
		if(head==null|| head.next==null||head.next.next==null){
			return head;
		}
		ListNode p1 = new ListNode(-1);
		ListNode p2 = new ListNode(-1);
		ListNode pCur1 = p1;
		ListNode pCur2 = p2;
		int count = 0;
		while(head!=null){
			if(count%2==0) {
				pCur1.next = head;
				pCur1 = head;
			}else{
				pCur2.next = head;
				pCur2 = head;
			}
			count++;
			head = head.next;
		}

		pCur2.next = null;

		pCur1.next = p2.next;

		return p1.next;
	}

}
