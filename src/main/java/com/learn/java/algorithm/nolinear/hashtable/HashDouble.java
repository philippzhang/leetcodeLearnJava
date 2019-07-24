package com.learn.java.algorithm.nolinear.hashtable;

import com.learn.java.algorithm.nolinear.node.DataItem;

/**
 * 开发地址法-再哈希
 * 方法是把关键字用不同的哈希函数再做一遍哈希化，用这个结果作为步长。对于指定的关键字，步长在整个探测中是不变的，不过不同的关键字使用不同的步长。
 *
 * 　　第二个哈希函数必须具备如下特点：
 *
 * 　　一、和第一个哈希函数不同
 *
 * 　　二、不能输出0（否则，将没有步长，每次探测都是原地踏步，算法将陷入死循环）。
 * 专家们已经发现下面形式的哈希函数工作的非常好：
 * stepSize = constant - key % constant; 其中constant是质数，且小于数组容量。
 */
public class HashDouble<T> {
	private DataItem[] hashArray;   //DataItem类，表示每个数据项信息
	private int arraySize;//数组的初始大小
	private int itemNum;//数组实际存储了多少项数据
	private DataItem nonItem;//用于删除数据项

	public HashDouble(){
		this.arraySize = 13;
		hashArray = new DataItem[arraySize];
		nonItem = new DataItem(-1,null);//删除的数据项下标为-1
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
		System.out.print("Hash: ");
		for(int j = 0 ; j < arraySize ; j++){
			if(hashArray[j] != null&&hashArray[j].getKey()!=-1){
				System.out.print(hashArray[j].getKey() + " ");
			}else{
				System.out.print("* ");
			}
		}
		System.out.println();
	}
	//通过哈希函数转换得到数组下标
	public int hashFunction1(int key){
		return key%arraySize;
	}

	public int hashFunction2(int key){
		return 5 - key%5;
	}

	//插入数据项
	public void insert(DataItem item){
		if(isFull()){
			//扩展哈希表
			System.out.println("哈希表已满，重新哈希化...");
			extendHashTable();
		}
		int key = item.getKey();
		int hashVal = hashFunction1(key);
		int stepSize = hashFunction2(key);//用第二个哈希函数计算探测步数
		while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1){
			hashVal += stepSize;
			hashVal %= arraySize;//以指定的步数向后探测
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
		int hashVal = hashFunction1(key);
		int stepSize = hashFunction2(key);
		while(hashArray[hashVal] != null){
			if(hashArray[hashVal].getKey() == key){
				DataItem temp = hashArray[hashVal];
				hashArray[hashVal] = nonItem;//nonItem表示空Item,其key为-1
				itemNum--;
				return temp;
			}
			hashVal += stepSize;
			hashVal %= arraySize;
		}
		return null;
	}

	//查找数据项
	public DataItem find(int key){
		int hashVal = hashFunction1(key);
		int stepSize = hashFunction2(key);
		while(hashArray[hashVal] != null){
			if(hashArray[hashVal].getKey() == key){
				return hashArray[hashVal];
			}
			hashVal += stepSize;
			hashVal %= arraySize;
		}
		return null;
	}

	public static void main(String[] args) {
		HashDouble<String> hashDouble = new HashDouble();
		hashDouble.insert(new DataItem(1,"A"));
		hashDouble.insert(new DataItem(2,"B"));
		hashDouble.insert(new DataItem(17,"C"));
		hashDouble.insert(new DataItem(18,"D"));
		hashDouble.insert(new DataItem(13,"E"));
		hashDouble.insert(new DataItem(20,"F"));
		hashDouble.insert(new DataItem(5,"G"));
		hashDouble.display();

		DataItem dataItem = hashDouble.find(2);
		System.out.println(dataItem!=null?dataItem:null);

		dataItem = hashDouble.delete(17);
		System.out.println(dataItem!=null?dataItem:null);
		hashDouble.display();

		dataItem = hashDouble.delete(16);
		System.out.println(dataItem!=null?dataItem:null);

	}
}
