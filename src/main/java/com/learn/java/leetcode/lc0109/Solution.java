package com.learn.java.leetcode.lc0109;

import com.learn.java.leetcode.base.structure.ListNode;
import com.learn.java.leetcode.base.structure.TreeNode;

/**
 * 109. Convert Sorted List to Binary Search Tree 109. 有序链表转换二叉搜索树 Medium
 */
public class Solution {
	public TreeNode sortedListToBST(ListNode head) {
		if(head==null){
			return null;
		}
		if(head.next==null){
			return new TreeNode(head.val);
		}
		ListNode preMiddleNode = preMiddleNode(head);
		ListNode middleNode = preMiddleNode.next;
		TreeNode root = new TreeNode(middleNode.val);
		preMiddleNode.next = null;
		root.left=sortedListToBST(head);
		root.right=sortedListToBST(middleNode.next);
		return root;
	}

	private ListNode preMiddleNode(ListNode head) {
		/*if(head==null||head.next==null){
			return head;
		}*/
		ListNode slow = head;
		ListNode fast = head;
		ListNode pre = null;
		while(fast!=null&&fast.next!=null){
			pre = slow;
			slow = slow.next;
			fast = fast.next;
			fast = fast.next;
		}
		return pre;

	}
}
