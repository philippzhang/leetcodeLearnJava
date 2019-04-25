package com.learn.java.leetcode.lc0817;

import com.learn.java.leetcode.base.structure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 817. Linked List Components 817. 链表组件 Medium
 */
public class Solution {
	public int numComponents(ListNode head, int[] G) {
		if(head==null||G==null||G.length==0){
			return 0;
		}
		Set<Integer> set = new HashSet<>();
		for(int num:G){
			set.add(num);
		}
		boolean flag = false;
		int result = 0;
		while(head!=null){
			if(set.contains(head.val)&&!flag){
				flag = true;
				result++;
			}else if(!set.contains(head.val)&&flag){
				flag = false;
			}
			head = head.next;
		}

		return result;
	}
}
