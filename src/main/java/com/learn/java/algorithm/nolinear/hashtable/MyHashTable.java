package com.learn.java.algorithm.nolinear.hashtable;

import com.learn.java.algorithm.nolinear.node.DataItem;

/**
 * 开发地址法-线性探测解决冲突
 * 线性探测中，如果哈希函数计算的原始下标是x, 线性探测就是x+1, x+2, x+3, 以此类推；
 * 而在二次探测中，探测的过程是x+1, x+4, x+9, x+16，以此类推，到原始位置的距离是步数的平方
 * 当哈希表变得比较满时，我们每插入一个新的数据，都要频繁的探测插入位置，因为可能很多位置都被前面插入的数据所占用了，这称为聚集。数组填的越满，聚集越可能发生。
 * 二次探测虽然消除了原始的聚集问题，但是产生了另一种更细的聚集问题，叫二次聚集
 */
public class MyHashTable<T> {
	//表示每个数据项信息
	private DataItem[] hashArray;
	//数组的初始大小
	private int arraySize;
	//数组实际存储了多少项数据
	private int itemNum;
	//用于删除数据项
	private DataItem nonItem;

	public MyHashTable(int arraySize){
		this.arraySize = arraySize;
		hashArray = new DataItem[arraySize];
		nonItem = new DataItem(-1,null);
	}

	//判断数组是否存储满了
	public boolean isFull(){
		return (itemNum == arraySize);
	}

	//判断数组是否为空
	public boolean isEmpty(){
		return (itemNum == 0);
	}

	//打印数组内容
	public void display(){
		System.out.println("Hash: ");
		for(int j = 0 ; j < arraySize ; j++){
			if(hashArray[j] != null&& hashArray[j].getKey() !=-1){
				System.out.print(hashArray[j].getKey() + " ");
			}else{
				System.out.print("* ");
			}
		}
		System.out.println();
	}

	//通过哈希函数转换得到数组下标
	public int hashFunction(int key){
		return key%arraySize;
	}

	//插入数据项
	public void insert(DataItem item){
		if(isFull()){
			//扩展哈希表
			System.out.println("哈希表已满，重新哈希化...");
			extendHashTable();
		}
		int key = item.getKey();
		int hashVal = hashFunction(key);
		while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1){
			++hashVal;
			hashVal %= arraySize;
		}
		hashArray[hashVal] = item;
		itemNum++;
	}

	/**
	 * 数组有固定的大小，而且不能扩展，所以扩展哈希表只能另外创建一个更大的数组，然后把旧数组中的数据插到新的数组中。
	 * 但是哈希表是根据数组大小计算给定数据的位置的，所以这些数据项不能再放在新数组中和老数组相同的位置上。
	 * 因此不能直接拷贝，需要按顺序遍历老数组，并使用insert方法向新数组中插入每个数据项。
	 * 这个过程叫做重新哈希化。这是一个耗时的过程，但如果数组要进行扩展，这个过程是必须的。
	 */
	public void extendHashTable(){
		int num = arraySize;
		itemNum = 0;//重新计数，因为下面要把原来的数据转移到新的扩张的数组中
		arraySize *= 2;//数组大小翻倍
		DataItem[] oldHashArray = hashArray;
		hashArray = new DataItem[arraySize];
		for(int i = 0 ; i < num ; i++){
			insert(oldHashArray[i]);
		}
	}

	//删除数据项
	public DataItem delete(int key){
		if(isEmpty()){
			System.out.println("Hash Table is Empty!");
			return null;
		}
		int hashVal = hashFunction(key);
		while(hashArray[hashVal] != null){
			if(hashArray[hashVal].getKey() == key){
				DataItem temp = hashArray[hashVal];
				hashArray[hashVal] = nonItem;//nonItem表示空Item,其key为-1
				itemNum--;
				return temp;
			}
			++hashVal;
			hashVal %= arraySize;
		}
		return null;
	}

	//查找数据项
	public DataItem find(int key){
		int hashVal = hashFunction(key);
		while(hashArray[hashVal] != null){
			if(hashArray[hashVal].getKey() == key){
				return hashArray[hashVal];
			}
			++hashVal;
			hashVal %= arraySize;
		}
		return null;
	}

	public static void main(String[] args) {
		MyHashTable<String> myHashTable = new MyHashTable(16);
		myHashTable.insert(new DataItem(1,"A"));
		myHashTable.insert(new DataItem(2,"B"));
		myHashTable.insert(new DataItem(17,"C"));
		myHashTable.insert(new DataItem(18,"D"));
		myHashTable.insert(new DataItem(13,"E"));
		myHashTable.insert(new DataItem(20,"F"));
		myHashTable.insert(new DataItem(5,"G"));
		myHashTable.display();

		DataItem dataItem = myHashTable.find(2);
		System.out.println(dataItem!=null?dataItem:null);

		dataItem = myHashTable.delete(17);
		System.out.println(dataItem!=null?dataItem:null);
		myHashTable.display();

		dataItem = myHashTable.delete(16);
		System.out.println(dataItem!=null?dataItem:null);

	}
}
