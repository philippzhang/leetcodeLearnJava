package com.learn.java.algorithm.nolinear.heap;

import com.learn.java.algorithm.nolinear.node.HeapNode;

/**
 * 堆（大顶堆）
 *
 * 它是完全二叉树，除了树的最后一层节点不需要是满的，其它的每一层从左到右都是满的。
 * 注意下面两种情况，第二种最后一层从左到右中间有断隔，那么也是不完全二叉树。
 *
 * 节点的左子节点是 2*index+1，
 *
 * 节点的右子节点是 2*index+2，
 *
 * 节点的父节点是 （index-1）/2。
 *
 * 堆中的每一个节点的关键字都大于（或等于）这个节点的子节点的关键字
 */
public class Heap<T extends Comparable<T>> {
	private HeapNode<T>[] heapArray;
	private int maxSize;
	private int currentSize;

	public T getTop(){
		if(heapArray!=null){
			return heapArray[0].getKey();
		}
		return null;
	}

	public Heap(int mx) {
		maxSize = mx;
		currentSize = 0;
		heapArray = new HeapNode[maxSize];
	}

	public boolean isEmpty() {
		return (currentSize == 0)? true : false;
	}

	public boolean isFull() {
		return (currentSize == maxSize)? true : false;
	}
	public boolean insert(T key){
		if(isFull()){
			return false;
		}
		HeapNode<T> heapNode = new HeapNode<>(key);
		heapArray[currentSize]=heapNode;
		trickleUp(currentSize++);
		return true;
	}

	//向上调整
	public void trickleUp(int index) {
		int parent = (index-1)/2;
		HeapNode<T> bottom = heapArray[index];
		while(index>0&&bottom.getKey().compareTo(heapArray[parent].getKey())>0){
			heapArray[index] = heapArray[parent];
			index = parent;
			parent = (parent-1)/2;
		}
		heapArray[index] = bottom;
	}

	public HeapNode<T> remove(){
		if(currentSize>0) {
			HeapNode<T> root = heapArray[0];
			heapArray[0] = heapArray[--currentSize];
			trickleDown(0);
			return root;
		}
		return null;
	}

	//向下调整
	public void trickleDown(int index) {
		HeapNode<T> top = heapArray[index];
		int largeChildIndex;
		while(index<currentSize/2){
			int leftChildIndex = index*2+1;
			int rightChildIndex = leftChildIndex+1;
			if(rightChildIndex<currentSize&&heapArray[rightChildIndex].getKey().compareTo(heapArray[leftChildIndex].getKey())>0){
				largeChildIndex = rightChildIndex;
			}else{
				largeChildIndex = leftChildIndex;
			}
			if(top.getKey().compareTo(heapArray[largeChildIndex].getKey())>0){
				break;
			}
			heapArray[index] = heapArray[largeChildIndex];
			index = largeChildIndex;
		}
		heapArray[index] = top;
	}

	//根据索引改变堆中某个数据
	public boolean change(int index, T newValue) {
		if(index < 0 || index >= currentSize) {
			return false;
		}
		T oldValue = heapArray[index].getKey();
		heapArray[index].setKey(newValue);
		if(oldValue.compareTo(newValue)<0) {
			trickleUp(index);
		}
		else {
			trickleDown(index);
		}
		return true;
	}

	public void displayHeap() {
		System.out.println("heapArray(array format): ");
		for(int i = 0; i < currentSize; i++) {
			if(heapArray[i] != null) {
				System.out.print(heapArray[i].getKey() + " ");
			}
			else {
				System.out.print("--");
			}
		}
	}

}
