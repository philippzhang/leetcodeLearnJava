package com.learn.java.leetcode.lc0234;

import com.learn.java.leetcode.base.structure.ListNode;

import java.util.Stack;

/**
 * 234. Palindrome Linked List 234. 回文链表 Easy
 */
public class Solution {

	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		ListNode p1 = head;
		ListNode p2 = head;
		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}
		Stack<ListNode> stack = new Stack();
		while (p1 != null) {
			stack.push(p1);
			p1 = p1.next;
		}
		while (!stack.isEmpty()) {
			if (head.val != stack.pop().val) {
				return false;
			}
			head = head.next;
		}
		return true;
	}

	/**
	 * 不适用栈，空间O(1)
	 *
	 * @param head
	 * @return
	 */
	public boolean isPalindrome2(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		ListNode p1 = head;
		ListNode p2 = head;
		ListNode pre = head;
		while (p2 != null && p2.next != null) {
			pre = p1;
			p1 = p1.next;
			p2 = p2.next.next;
		}

		pre.next = null;
		p1 = reversalList(p1);
		ListNode l1 = head;
		ListNode l2 = p1;
		boolean res = true;
		while (l1 != null && l2 != null) {
			if (l1.val == l2.val) {
				l1 = l1.next;
				l2 = l2.next;
			} else {
				res = false;
				break;
			}
		}

		p1 = reversalList(p1);
		pre.next = p1;

		return res;
	}

	/**
	 * 翻转链表
	 *
	 * @param head
	 * @return
	 */
	private ListNode reversalList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
}
