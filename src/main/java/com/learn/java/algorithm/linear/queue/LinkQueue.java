package com.learn.java.algorithm.linear.queue;

import com.learn.java.algorithm.linear.node.Node;

/**
 * 链表队列LinkQueue
 */
public class LinkQueue<T> implements IQueue {
	//队首指针
	private Node front;
	//队尾指针
	private Node rear;

	//构造函数
	public LinkQueue() {
		front = rear = null;
	}

	//置空
	public void clear() {
		front = rear = null;
	}

	//是否为空
	public boolean isEmpty() {
		return front == null;
	}

	//链表长度
	public int length(){
		Node p = front;
		int length =0;
		while(p!=null){
			p = p.getNext();
			++length;
		}
		return length;
	}

	public boolean isFull() {
		return false;
	}

	/**
	 * 得到队首元素
	 */
	public Object peek(){
		if(isEmpty()){
			return null;
		}
		return front.getData();
	}

	//插入队列
	@Override
	public void insert(Object data){
		Node p = new Node(data);
		if(isEmpty()){
			front = rear = p;
		}else{
			rear.setNext(p);
			rear = p;
		}
	}


	//删除队列数据
	@Override
	public Object poll(){
		if(isEmpty()){
			return null;
		}else{
			Node p = front;
			front  = front.getNext();
			if(p==rear){
				rear = null;
			}
			return p.getData();
		}
	}

	/**
	 * 打印所有元素
	 */
	@Override
	public void display() {
		Node p = front;
		while(p!=null){
			System.out.print(p.getData()+" ");
			if(p==rear){
				break;
			}else {
				p = p.getNext();
			}
		}
		System.out.println();
	}

	//测试
	public static void main(String[] args) {
		LinkQueue<String> queue = new LinkQueue<>();
		queue.insert("A");
		queue.insert("B");
		queue.insert("C");
		queue.insert("D");
		queue.insert("E");
		queue.insert("F");
		queue.display();

		System.out.println(queue.length());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.length());

		queue.display();

	}


}
