package com.learn.java.leetcode.lc0445;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 445. Add Two Numbers II 445. 两数相加 II Medium
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1==null&&l2==null){
			return null;
		}
		if(l1 == null){
			return l2;
		}
		if(l2 == null){
			return l1;
		}

		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode plast1 = null;
		ListNode plast2 = null;

		int num = 0;

		ListNode curNext = null;

		while(p1!=plast1||p2!=plast2){
			int v1 = 0;
			int v2 = 0;
			while(p1!=plast1&&p1.next!=plast1){
				p1 = p1.next;
			}
			if(p1!=plast1){
				v1 = p1.val;
				plast1 = p1;
			}

			while(p2!=plast2&&p2.next!=plast2){
				p2 = p2.next;
			}
			if(p2!=plast2){
				v2 = p2.val;
				plast2 = p2;
			}


			ListNode newNode = new ListNode((v1+v2+num)%10);
			newNode.next=curNext;
			curNext = newNode;

			num = (v1+v2+num)/10;

			p1 = l1;
			p2 = l2;
		}

		if(num!=0){
			ListNode newNode = new ListNode(num);
			newNode.next=curNext;
			curNext = newNode;
		}

		return curNext;

	}
}
