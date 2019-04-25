package com.learn.java.leetcode.lc0138;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 138. Copy List with Random Pointer 138. 复制带随机指针的链表 Medium
 */
public class Solution {

	/**
	 * 不借助存储
	 *
	 * @param head
	 * @return
	 */
	public Node copyRandomList(Node head) {
		if (head == null) {
			return null;
		}
		Node cur = head;
		//将copy结点置于原结点之后
		while (cur != null) {
			Node node = new Node(cur.val, cur.next, null);
			cur.next = node;
			cur = cur.next.next;
		}

		//设置random
		cur = head;
		while (cur != null) {
			cur.next.random = cur.random != null ? cur.random.next : null;
			cur = cur.next.next;
		}

		//新老链表分离
		cur = head;
		Node cHead = cur.next;
		Node curNew = cHead;
		while (cur != null) {
			cur.next = curNew.next;
			cur = cur.next;
			curNew.next = cur != null ? cur.next : null;
			curNew = curNew.next;
		}
		//返回新链表


		return cHead;
	}

	/**
	 * 使用存储的方式，
	 * map记录结点地址到序号的映射
	 * list保存新节点，序号可以与map的序号相对应
	 *
	 * @param head
	 * @return
	 */
	public Node copyRandomList2(Node head) {
		if (head == null) {
			return null;
		}
		Node cur = head;
		Map<Node, Integer> map = new HashMap<>();
		List<Node> list = new ArrayList();
		int i = 0;
		while (cur != null) {
			list.add(new Node(cur.val, null, null));
			map.put(cur, i);
			cur = cur.next;
			i++;
		}

		cur = head;
		int j = 0;
		while (cur != null) {
			if (j < list.size() - 1) {
				list.get(j).next = list.get(j + 1);
			}
			if (cur.random != null) {
				int id = map.get(cur.random);
				list.get(j).random = list.get(id);
			}

			j++;
			cur = cur.next;
		}

		return list.get(0);
	}


}
