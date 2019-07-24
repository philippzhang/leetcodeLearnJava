package com.learn.java.algorithm.linear.stack;

public class SeqStack<T> implements IStack {

	//定义对象数组
	private T[] elements;
	//栈为空时，top=0，非空栈时，top指向栈顶元素的下一个存储位置
	private int top;

	//初始化存储容量为maxSize的空栈
	public SeqStack(int maxSize) {
		top = 0;
		elements = (T[])new Object[maxSize];
	}

	//清空方法
	@Override
	public void clear() {
		top = 0;
		elements = null;
	}

	//是否为空方法
	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	//元素个数方法
	@Override
	public int length() {
		return top;
	}

	//取栈顶元素
	@Override
	public T peek() {
		if(isEmpty()){
			return null;
		}
		return elements[top-1];
	}

	//入栈操作
	@Override
	public void push(Object obj) {
		if(top==elements.length){
			throw new RuntimeException("栈已满");
		}
		//数据放入栈顶top，然后top再+1
		elements[top++] = (T)obj;
	}

	//出栈操作（删除并返回栈顶元素）
	@Override
	public T pop() {
		if(isEmpty()){
			throw new RuntimeException("栈已空");
		}
		//top-1指向栈顶，然后返回栈顶元素
		return elements[--top];
	}

	/**
	 * 打印所有元素
	 */
	@Override
	public void display() {
		for (int i = top-1; i >= 0; i--) {
			System.out.print(elements[i]+" ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		SeqStack<String> stack = new SeqStack<>(10);
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
