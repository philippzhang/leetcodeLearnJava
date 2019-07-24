package com.learn.java.algorithm.linear.table;

import com.learn.java.algorithm.linear.node.Node;

/**
 * 连接表实现链表
 */
public class LinkList<T> implements ITableList {
	//链表的头指针
	private Node<T> head;

	public LinkList(){
		head = new Node();
	}

	//将一个已存在头结点的链表置为空表
	@Override
	public void clear(){
		head.setData(null);
		head.setNext(null);
	}

	//判断带有结点的链表是否为空
	@Override
	public boolean isEmpty() {
		return head.getNext() == null;
	}

	//求带头结点的链表的长度
	@Override
	public int length(){
		//p执向首结点
		Node<T> p = head.getNext();
		int length = 0;
		while(p!=null){
			p = p.getNext();
			++length;
		}
		return length;
	}

	@Override
	public T get(int index){
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
	}

	//查找元素为obj的结点
	@Override
	public int indexOf(Object obj){
		Node<T> p = head.getNext();
		int i =0;
		//从首结点开始查找
		while(p!=null&&!p.getData().equals(obj)){
			p = p.getNext();
			i++;
		}
		if(p == null){
			return -1;
		}
		return i;
	}

	//查找元素为obj的结点
	@Override
	public T find(Object obj){
		Node<T> p = head.getNext();
		int i =0;
		//从首结点开始查找
		while(p!=null&&!p.getData().equals(obj)){
			p = p.getNext();
			i++;
		}
		if(p == null){
			return null;
		}
		return p.getData();
	}

	//在第i个结点之前插入新节点元素
	@Override
	public void insert(int index, Object obj) {
		Node<T> p = head;
		int i = -1;
		//寻找第i个结点的前结点
		while(p!=null&&i<index-1){
			p = p.getNext();
			i++;
		}
		if(i>index-1&&p==null){
			throw new RuntimeException("插入位置不合法");
		}
		//插入元素
		Node<T> s = new Node(obj);
		s.setNext(p.getNext());
		p.setNext(s);
	}

	@Override
	public T remove(int index) {
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

	}

	//头部添加元素
	@Override
	public void startAdd(Object obj) {
		insert(0, obj);
	}

	//默认尾部添加元素
	@Override
	public void add(Object obj) {
		insert(length(), obj);
	}


	/**
	 * 打印输出所有结点
	 */
	@Override
	public void display() {
		Node<T> node = head.getNext();
		while (node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkList<String> list = new LinkList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");

		list.display();
		System.out.println(list.indexOf("ccc"));
		System.out.println(list.get(2));
		list.remove(2);
		list.display();
		list.startAdd("aaa");
		list.startAdd("bbb");
		list.display();
		//list.removeRepeatElem();
		//list.display();
	}

}
