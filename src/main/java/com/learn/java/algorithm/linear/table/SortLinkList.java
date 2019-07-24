package com.learn.java.algorithm.linear.table;

import com.learn.java.algorithm.linear.node.Node;

public class SortLinkList<T extends Comparable<T>> {

	//链表的头指针
	private Node<T> head;

	public SortLinkList(){
		head = new Node();
	}


	public void clear() {
		head.setData(null);
		head.setNext(null);
	}


	public boolean isEmpty() {
		return head.getNext()==null;
	}


	public int length() {
		Node<T> current = head.getNext();
		int i =0;
		while(current!=null){
			i++;
			current = current.getNext();
		}
		return i;
	}


	/*public T get(int index) {
		Node<T> p = head.getNext();
		int i= 0;
		//从首结点开始查找
		while(p!=null&&i<index){
			p  = p.getNext();
			i++;
		}
		//循环结束判断
		if (i > index || p == null) {
			throw new RuntimeException("查找元素不存在");
		}
		return p.getData();
	}*/


	/*public int indexOf(T obj) {
		Node<T> p = head.getNext();
		int i = 0;
		while(p!=null&&p.getData().compareTo((T) obj)<0){
			if(p.getData().equals(obj)){
				return i;
			}
			p = p.getNext();
			i++;
		}
		return -1;
	}*/


	public Node<T> find(T obj) {
		Node<T> p = head.getNext();
		int i = 0;
		while(p!=null&&p.getData().compareTo((T) obj)<=0){
			if(p.getData().equals(obj)){
				return p;
			}
			p = p.getNext();
			i++;
		}
		return null;
	}


	public void insert(T obj) {
		Node<T> current = head.getNext();
		Node<T> previous = null;
		Node<T> node =  new Node(obj);
		while(current!=null&&current.getData().compareTo((T) obj)<=0){
			previous = current;
			current = current.getNext();
		}
		if(previous==null){
			head.setNext(node);
		}else{
			previous.setNext(node);
		}

		node.setNext(current);
	}

	public void insert(Node<T> node) {
		if(node==null){
			return;
		}
		Node<T> current = head.getNext();
		Node<T> previous = null;
		while(current!=null&&current.getData().compareTo((T) node.getData())<=0){
			previous = current;
			current = current.getNext();
		}
		if(previous==null){
			head.setNext(node);
		}else{
			previous.setNext(node);
		}

		node.setNext(current);
	}


	/*public T remove(int index) {
		Node<T> p = head;
		int i = -1;
		//寻找第i个结点的前结点
		while(p!=null&&i<index-1){
			p = p.getNext();
			i++;
		}
		if(i>index-1&&p==null){
			throw new RuntimeException("删除位置不合法");
		}
		//当前结点p的引用指向下下个结点
		p.setNext(p.getNext().getNext());
		return p.getData();
	}*/

	public Node<T> delete(T obj) {
		Node<T> p = head.getNext();
		Node<T> previous = null;
		//寻找第i个结点的前结点
		while(p!=null&&!p.getData().equals(obj)){
			previous = p;
			p = p.getNext();
		}
		if(p==null){
			throw new RuntimeException("删除位置不合法");
		}
		//当前结点p的引用指向下下个结点
		if(previous == null) {
			head = head.getNext();
		}else {
			previous.setNext(p.getNext());
		}
		return p;
	}


	public void display() {
		Node<T> node = head.getNext();
		while (node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SortLinkList<Integer> list = new SortLinkList();
		list.insert(1);
		list.insert(2);
		list.insert(8);
		list.insert(3);
		list.insert(4);

		list.display();

		list.delete(1);

		list.display();
		//list.removeRepeatElem();
		//list.display();
	}
}
