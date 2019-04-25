package com.learn.java.leetcode.lc0025;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 25. Reverse Nodes in k-Group 25. k个一组翻转链表 Hard
 */

public class Solution {
	public ListNode reverseKGroup(ListNode head, int k) {

		ListNode pre = new ListNode(0);
		pre.next = head;

		ListNode cur = null;
		ListNode lastNode = getLastNode(head,k);
		ListNode preCure = pre;
		while(lastNode!=null){
			ListNode lastNext = lastNode.next;
			while(head!=null&&head!=lastNext){
				ListNode next = head.next;
				head.next = cur;
				cur = head;
				head = next;
			}
			preCure.next = cur;

			int l = k;
			while(l-->0) {
				preCure = preCure.next;
			}

			preCure.next = lastNext;

			lastNode = getLastNode(head,k);
			cur = null;
			//preCure.next = reverseKGroup( head, k);
		}
		return pre.next;
	}

	private ListNode getLastNode(ListNode head, int k){
		if(head==null||k<=0){
			return null;
		}
		while(head!=null&&--k>0){
			head = head.next;
		}
		return head;
	}

	/*private int getListLength(ListNode head){
		if(head==null){
			return 0;
		}
		int count = 0;
		while(head!=null){
			count++;
			head = head.next;
		}
		return count;
	}*/
}
