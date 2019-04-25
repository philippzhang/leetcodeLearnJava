package com.learn.java.leetcode.lc0237;

import com.learn.java.leetcode.base.structure.ListNode;

/**
 * 237. Delete Node in a Linked List 237. 删除链表中的节点 Easy
 */
public class Solution {
	public void deleteNode(ListNode node) {

		node.val = node.next.val;
		node.next = node.next.next;
	}
}
