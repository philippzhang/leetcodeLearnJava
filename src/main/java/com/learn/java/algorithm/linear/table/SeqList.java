package com.learn.java.algorithm.linear.table;

/**
 * 顺序表实现链表
 */
public class SeqList<T> implements ITableList {
	//定义对象数组表示顺序表的存储空间
	private T[] elements;
	//定义线性表的当前长度
	private int len;

	//初始化存储容量为maxSize的空表
	public SeqList(int maxSize) {
		len = 0;
		elements = (T[]) new Object[maxSize];
	}

	//清空方法
	@Override
	public void clear() {
		len = 0;
	}

	//是否为空方法
	@Override
	public boolean isEmpty() {
		return len == 0;
	}

	//表的元素个数方法
	@Override
	public int length() {
		return len;
	}

	//取值方法
	@Override
	public T get(int i) {
		if (i < 0 || i > len - 1) {
			throw new RuntimeException("取值不合法");
		}
		return elements[i];
	}

	/**
	 * 根据元素对象查找位置
	 */
	@Override
	public int indexOf(Object obj) {
		int i = 0;
		while (i < len && !elements[i].equals(obj)) {
			i++;
		}
		if (i >= len) {
			throw new RuntimeException("查找元素不存在");
		}
		//返回元素的位置
		return i;
	}

	/**
	 * 根据元素对象
	 */
	@Override
	public T find(Object obj) {
		int i = 0;
		while (i < len && !elements[i].equals(obj)) {
			i++;
		}
		if (i >= len) {
			throw new RuntimeException("查找元素不存在");
		}
		//返回元素的位置
		return elements[i];
	}

	@Override
	public void insert(int index, Object obj){
		if (len == elements.length) {
			throw new RuntimeException("顺序表已满");
		}
		if(index<0||index>len) {
			throw new RuntimeException("插入位置不合法");
		}
		for(int i = index ;i<len-1;i++){
			elements[i+1] = elements[i];
		}
		elements[index] = (T) obj;
		//长度增加
		len++;
	}

	@Override
	public T remove(int index){
		if (index < 0 || index > len) {
			throw new RuntimeException("删除位置不合法");
		}
		T obj = elements[index];
		for(int i = index ;i<len-1;i++){
			elements[i] = elements[i+1];
		}
		elements[len-1]=null;
		len --;
		return obj;
	}

	@Override
	public void display() {
		if(len>0){
			for(int i = 0;i<len;i++){
				System.out.print(elements[i]+" ");
			}
		}
		System.out.println();
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

	public static void main(String[] args) {
		SeqList<String> list = new SeqList(10);
		list.insert(0, "a");
		list.insert(1, "b");
		list.insert(2, "c");
		list.insert(3, "d");
		list.insert(4, "e");

		System.out.println(list.remove(0));
//		System.out.println(list.indexOf("e"));
		System.out.println(list.length());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		list.display();
	}

}
