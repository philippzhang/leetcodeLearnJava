package com.learn.java.leetcode.lc1019;

import com.learn.java.leetcode.base.structure.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 1019. Next Greater Node In Linked List 1019. 链表中的下一个更大节点 Medium
 */
public class Solution {
	public int[] nextLargerNodes(ListNode head) {
		if(head==null){
			return null;
		}
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> idStack = new Stack<>();
		Map<Integer,Integer> map = new HashMap<>();

		ListNode current = head;
		int count = 0 ;
		while(current!=null){
			while(!stack.isEmpty()&&stack.peek()<current.val){
				stack.pop();
				map.put(idStack.pop(),current.val);
			}
			stack.push(current.val);
			idStack.push(count++);
			current = current.next;
		}
		int [] results = new int[count];
		current = head;
		count = 0;
		while(current!=null){
			results[count]=map.getOrDefault(count,0);
			count++;
			current = current.next;
		}
		return results;
	}
}
