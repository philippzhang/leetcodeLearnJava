package com.learn.java.leetcode.lc0725;

import com.learn.java.leetcode.base.structure.ListNode;

public class Solution {
	public ListNode[] splitListToParts(ListNode root, int k) {
		ListNode[] listNodes = new ListNode[k];
		if(root==null||k<=0){
			return listNodes;
		}
		int len = getListNodeLength(root);
		int num1 = len/k;
		int added = len % k;


		for(int i = 0;i<k;i++) {
			if(root==null){
				listNodes[i]=null;
			}else {
				int count = num1 + (added > 0 ? 1 : 0);
				added = Math.max(0, (added - 1));
				ListNode pre = root;
				ListNode cur = null;
				while (root != null&&count-->0) {
					cur = root;
					root = root.next;
				}
				if(cur!=null) {
					cur.next = null;
				}

				listNodes[i]=pre;

				if(count>0){
					root = null;
				}


			}
		}

		return listNodes;
	}
	private int getListNodeLength(ListNode root){
		int count = 0;
		if(root==null){
			return 0;
		}
		while(root!=null){
			count++;
			root = root.next;
		}

		return count;
	}

}
