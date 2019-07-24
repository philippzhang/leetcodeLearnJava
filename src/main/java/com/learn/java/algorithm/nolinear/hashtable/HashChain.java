package com.learn.java.algorithm.nolinear.hashtable;

import com.learn.java.algorithm.linear.table.SortDataItemLinkList;
import com.learn.java.algorithm.nolinear.node.DataItem;

/**
 * 链地址法
 */
public class HashChain<T> {
	//数组中存放链表
	private SortDataItemLinkList[] hashArray;
	private int arraySize;
	public HashChain(int size){
		arraySize = size;
		hashArray = new SortDataItemLinkList[arraySize];
		//new 出每个空链表初始化数组
		for(int i = 0 ; i < arraySize ; i++){
			hashArray[i] = new SortDataItemLinkList();
		}
	}

	public void display(){
		System.out.println("Hash: ");
		for(int i = 0 ; i < arraySize ; i++){
			System.out.print(i + "：");
			hashArray[i].display();
		}
		System.out.println("--------------");
	}

	public int hashFunction(int key){
		return key%arraySize;
	}

	public void insert(DataItem dataItem){
		int key = dataItem.getKey();
		int hashVal = hashFunction(key);
		//直接往链表中添加即可
		hashArray[hashVal].insert(dataItem);
	}

	public DataItem delete(int key){
		int hashVal = hashFunction(key);
		//从链表中找到要删除的数据项，直接删除
		DataItem temp = hashArray[hashVal].delete(key);
		return temp;
	}

	public DataItem find(int key){
		int hashVal = hashFunction(key);
		DataItem temp = hashArray[hashVal].find(key);
		return temp;
	}

	public static void main(String[] args) {
		HashChain<String> hashChain = new HashChain(4);
		hashChain.insert(new DataItem(1,"A"));
		hashChain.insert(new DataItem(2,"B"));
		hashChain.insert(new DataItem(17,"C"));
		hashChain.insert(new DataItem(18,"D"));
		hashChain.insert(new DataItem(13,"E"));
		hashChain.insert(new DataItem(20,"F"));
		hashChain.insert(new DataItem(5,"G"));
		hashChain.display();

		DataItem dataItem = hashChain.find(2);
		System.out.println(dataItem!=null?dataItem:null);

		dataItem = hashChain.delete(5);
		System.out.println(dataItem!=null?dataItem:null);
		hashChain.display();

		dataItem = hashChain.delete(16);
		System.out.println(dataItem!=null?dataItem:null);

		
	}

}
