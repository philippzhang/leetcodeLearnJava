package com.learn.java.leetcode.lc0382;

import com.learn.java.leetcode.base.structure.ListNode;

import java.util.Random;

public class Solution {

	private ListNode head;
	/** @param head The linked list's head.
	Note that the head is guaranteed to be not null, so it contains at least one node. */
	public Solution(ListNode head) {
		this.head = head;
	}

	/**
	 * 蓄水池抽样,每次抽取 k/(k+i)
	 * i=1,2,....n
	 * 最终的概率都是k/n
	 * 这道题k=1
	 */
	/** Returns a random node's value. */
	public int getRandom() {
		if(head==null){
			return -1;
		}
		int res = head.val;
		ListNode cur = head.next;
		int i = 2;
		Random random = new Random();
		while(cur!=null){
			if(random.nextInt(i)==0){
				res = cur.val;
			}
			i++;
			cur = cur.next;
		}

		return res;

	}
}

