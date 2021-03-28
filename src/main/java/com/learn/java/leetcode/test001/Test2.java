package com.learn.java.leetcode.test001;

class ListNode{
	public int val;
	public ListNode next;

	public ListNode(int val) {
		this.val = val;
	}
}


public class Test2 {

	public static ListNode change(ListNode head){
		if(head ==null){
			return null;
		}
		//返回值
		ListNode ret = null;
		ListNode cur = head;
		while(cur!=null){
			ListNode next = cur.next;
			cur.next = ret;
			ret = cur;
			cur = next;
		}
		return ret;
	}

	public static ListNode build(int n){
		ListNode head = null;
		for(int i = 0;i<n;i++){
			ListNode temp = new ListNode(i);
			temp.next = head;
			head = temp;
		}
		return head;
	}

	public static void print(ListNode head){
		ListNode cur = head;
		while(cur!=null){
			System.out.print(cur.val+" ");
			cur = cur.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode head = build(10);
		print(head);
		ListNode newHead = change(head);
		print(newHead);
	}

}
