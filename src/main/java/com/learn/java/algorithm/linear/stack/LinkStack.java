package com.learn.java.algorithm.linear.stack;

import com.learn.java.algorithm.linear.node.Node;

public class LinkStack<T>  implements IStack {
	//链表的头指针
	private Node<T> top;

	public LinkStack() {
		top = null;
	}

	//置空
	@Override
	public void clear() {
		top = null;
	}

	//是否为空
	@Override
	public boolean isEmpty() {
		return top == null;
	}

	//长度
	@Override
	public int length() {
		Node p = top;
		int length = 0;
		while (p!=null){
			p = p.getNext();
			length++;
		}
		return length;
	}

	//取栈顶元素
	@Override
	public T peek() {
		if(isEmpty()){
			return null;
		}else{
			return (T) top.getData();
		}
	}

	//入栈操作
	@Override
	public void push(Object obj) {
		//将插入对象封装成新的结点
		Node<T> p = new Node(obj);
		//p指向之前的栈顶结点元素
		p.setNext(top);
		//p再重新成为新的栈顶结点
		top = p;
	}

	//出栈操作（删除并返回栈顶元素）
	@Override
	public T pop() {
		if(isEmpty()){
			return null;
		}else{
			Node p = top;
			top = top.getNext();
			return (T) p.getData();
		}
	}

	/**
	 * 打印所有元素
	 */
	@Override
	public void display() {
		Node p = top;
		while (p != null) {
			System.out.print(p.getData() + " ");
			p = p.getNext();
		}
		System.out.println();
	}

	/**
	 * 测试
	 */
	public static void main(String[] args) {
		LinkStack<String> stack = new LinkStack<>();
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		stack.push("ddd");
		stack.push("eee");

		stack.display();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.display();
	}
}
