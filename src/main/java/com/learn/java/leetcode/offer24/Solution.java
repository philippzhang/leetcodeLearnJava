package com.learn.java.leetcode.offer24;

import com.learn.java.leetcode.base.structure.ListNode;

public class Solution {
	public ListNode reverseList(ListNode head) {
		if(head==null){
			return null;
		}
		ListNode ret = null;
		ListNode cur = head;
		while(cur!=null){
			ListNode next = cur.next;
			cur.next = ret;
			ret = cur;
			cur = next;
		}

		return ret;
	}
}
