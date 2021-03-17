package com.learn.java.leetcode.offer06;

import com.learn.java.leetcode.base.structure.ListNode;

public class Solution {
	public int[] reversePrint(ListNode head) {
		if(head==null){
			return new int[0];
		}
		ListNode temp = head;
		int size =0;
		while(temp!=null){
			size ++;
			temp = temp.next;
		}
		int [] ans = new int[size];
		temp = head;
		while(temp!=null){
			ans[--size] = temp.val;
			temp = temp.next;
		}
		return ans;
	}
}
