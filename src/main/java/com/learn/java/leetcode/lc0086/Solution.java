package com.learn.java.leetcode.lc0086;

import com.learn.java.leetcode.base.structure.ListNode;

public class Solution {
	public ListNode partition(ListNode head, int x) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		ListNode lessPre = new ListNode(0);
		ListNode lessCur = lessPre;
		ListNode morePre = new ListNode(0);
		ListNode moreCur = morePre;
		ListNode cur = head;

		while (cur != null) {
			if (cur.val < x) {
				lessCur.next = cur;
				lessCur = lessCur.next;
			} else {
				moreCur.next = cur;
				moreCur = moreCur.next;
			}
			cur = cur.next;
		}
		//这行必须加
		moreCur.next = null;

		lessCur.next = morePre.next;

		morePre = null;

		return lessPre.next;
	}
}
