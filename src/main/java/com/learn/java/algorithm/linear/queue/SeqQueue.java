package com.learn.java.algorithm.linear.queue;

/**
 * 循环顺序队列
 */
public class SeqQueue<T> implements IQueue {

	//存放队列元素的数组
	private T[] elements;

	//队首所在数组元素的下标
	private int front;
	//队尾所在数组元素的下标的下一个位置
	private int rear;

	//队列元素的个数
	private int count;
	//队列元素的容量
	private int size;

	public SeqQueue(){
		this.size = 10;
		this.elements = (T[])(new Object[size]);
		front = rear = count = 0;
	}

	public SeqQueue(int size){
		this.size = size;
		this.elements = (T[])(new Object[size]);
		front = rear = count = 0;
	}

	//清空队列
	@Override
	public void clear() {
		front = rear = count = 0;
	}

	//队列是否为空
	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	//队列是否已满
	@Override
	public boolean isFull() {
		return count == size;
	}

	//队列长度
	@Override
	public int length() {
		return count;
	}

	/**
	 * 得到队首元素
	 */
	@Override
	public T peek() {
		if(isEmpty()){
			return null;
		}
		return elements[front];
	}

	/**
	 * 删除队首元素(出队)
	 */
	@Override
	public T poll() {
		if(isEmpty()){
			return null;
		}
		T obj = elements[front];
		front = (front+1) % size;
		count--;
		return obj;
	}



	/**
	 * 在队尾插入元素(入队)
	 */
	@Override
	public void insert(Object obj) {
		if(isFull()){
			throw new RuntimeException("队列已满");
		}
		elements[rear] = (T)obj;
		//修改队尾指针
		rear = (rear+1) % size;
		count++;
	}

	/**
	 * 打印所有元素
	 */
	@Override
	public void display() {
		int p = front;
		for(int i =0;i<count;i++){
			System.out.print(elements[p]+" ");
			p = (p+1)%size;
		}
		System.out.println();
	}

	//测试
	public static void main(String[] args) {
		SeqQueue queue = new SeqQueue(6);
		queue.insert("A");
		queue.insert("B");
		queue.insert("C");
		queue.insert("D");
		queue.insert("E");
		queue.insert("F");
		queue.display();

		System.out.println(queue.length());
		System.out.println(queue.isFull());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.length());

		queue.display();

	}


}
