package com.learn.java.leetcode.offer18;

import com.learn.java.leetcode.base.structure.ListNode;

public class Solution {
	public ListNode deleteNode(ListNode head, int val) {
		if(head==null){
			return head;
		}
		ListNode pre = head;
		ListNode cur = head;
		if(cur.val==val){
			return cur.next;
		}
		while(cur!=null){
			ListNode next = cur.next;
			if(cur.val==val){
				pre.next = next;
			}else{
				pre = cur;
			}
			cur = next;
		}
		return head;
	}
}
