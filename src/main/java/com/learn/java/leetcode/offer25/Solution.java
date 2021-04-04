package com.learn.java.leetcode.offer25;

import com.learn.java.leetcode.base.structure.ListNode;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//定义一个伪指针
		ListNode dum = new ListNode(-1);
		ListNode cur = dum;
		while(l1!=null&&l2!=null){
			if(l1!=null&&l2!=null){
				if(l1.val<l2.val){
					cur.next = new ListNode(l1.val);
					l1 = l1.next;
				}else {
					cur.next = new ListNode(l2.val);
					l2 = l2.next;
				}
			}
			cur = cur.next;
		}

		cur.next = l1!=null ? l1 :l2;

		return dum.next;
	}
}
