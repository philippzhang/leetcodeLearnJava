package com.learn.java.algorithm.linear.table;

import com.learn.java.algorithm.linear.node.Node;
import com.learn.java.algorithm.nolinear.node.DataItem;

public class SortDataItemLinkList<T> {

	//链表的头指针
	private Node<DataItem<T>> head;

	public SortDataItemLinkList() {
		head = new Node();
	}


	public void clear() {
		head.setData(null);
		head.setNext(null);
	}


	public boolean isEmpty() {
		return head.getNext() == null;
	}


	public int length() {
		Node<DataItem<T>> current = head.getNext();
		int i = 0;
		while (current != null) {
			i++;
			current = current.getNext();
		}
		return i;
	}


	/*public DataItem<T> get(int index) {
		Node<DataItem<T>> p = head.getNext();
		int i = 0;
		//从首结点开始查找
		while (p != null && i < index) {
			p = p.getNext();
			i++;
		}
		//循环结束判断
		if (i > index || p == null) {
			throw new RuntimeException("查找元素不存在");
		}
		return p.getData();
	}*/


	/*public int indexOf(int key) {
		Node<DataItem<T>> p = head.getNext();
		int i = 0;
		while (p != null && p.getData().getKey() <= key) {
			if (p.getData().getKey() == key) {
				return i;
			}
			p = p.getNext();
			i++;
		}
		return -1;
	}*/


	public DataItem<T> find(int key) {
		Node<DataItem<T>> p = head.getNext();
		while (p != null && p.getData().getKey() <= key) {
			if (p.getData().getKey() == key) {
				return p.getData();
			}
			p = p.getNext();
		}
		return null;
	}


	public void insert(DataItem<T> obj) {
		Node<DataItem<T>> current = head.getNext();
		Node<DataItem<T>> previous = null;
		Node<DataItem<T>> node = new Node(obj);
		while (current != null && current.getData().getKey() <= obj.getKey()) {
			previous = current;
			current = current.getNext();
		}
		if (previous == null) {
			head.setNext(node);
		} else {
			previous.setNext(node);
		}

		node.setNext(current);
	}

/*	public DataItem<T> remove(int index) {
		Node<DataItem<T>> p = head;
		int i = -1;
		//寻找第i个结点的前结点
		while (p != null && i < index - 1) {
			p = p.getNext();
			i++;
		}
		if (i > index - 1 && p == null) {
			throw new RuntimeException("删除位置不合法");
		}
		//当前结点p的引用指向下下个结点
		p.setNext(p.getNext().getNext());
		return p.getData();
	}*/

	public DataItem<T> delete(int key) {
		Node<DataItem<T>> p = head.getNext();
		Node<DataItem<T>> previous = null;
		//寻找第i个结点的前结点
		while (p != null && p.getData().getKey() != key) {
			previous = p;
			p = p.getNext();
		}
		if (p == null) {
			//throw new RuntimeException("删除位置不合法");
			return null;
		}
		//当前结点p的引用指向下下个结点
		if (previous == null) {
			head = head.getNext();
		} else {
			previous.setNext(p.getNext());
		}
		return p.getData();
	}


	public void display() {
		Node<DataItem<T>> node = head.getNext();
		while (node != null) {
			System.out.print(node.getData().getKey() + " ");
			node = node.getNext();
		}
		System.out.println();
	}

}
