package com.learn.java.leetcode.offer22;

import com.learn.java.leetcode.base.structure.ListNode;

public class Solution {
	/**
	 * 算法采用快慢指针，快指针先走k步，再和慢指针一起走，当快指针走到结尾，慢指针的位置就是倒数第k个位置
	 * @param head
	 * @param k
	 * @return
	 */
	public ListNode getKthFromEnd(ListNode head, int k) {
		ListNode fast = head;
		for(int i = 0;i<k;i++){
			fast = fast.next;
		}
		ListNode slow = head;
		while(fast!=null){
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}
}
