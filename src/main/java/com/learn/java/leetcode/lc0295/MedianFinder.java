package com.learn.java.leetcode.lc0295;


import java.util.PriorityQueue;

/**
 * 295. Find Median from Data Stream 295. 数据流的中位数 Hard
 */
public class MedianFinder {

	private PriorityQueue<Integer> smallQuery;
	private PriorityQueue<Integer> bigQuery;
	/** initialize your data structure here. */
	public MedianFinder() {
		smallQuery = new PriorityQueue<>();
		bigQuery = new PriorityQueue<>((e1, e2) -> e2 - e1);
		/*bigQuery = new PriorityQueue(new Comparator<Integer>() {
			@Override
			public int compare(Integer e1, Integer e2) {
				return e2 - e1;
			}
		});*/
	}

	public void addNum(int num) {
		if(bigQuery.size()==0){
			bigQuery.add(num);
			return;
		}
		if(bigQuery.size()>0&&num<bigQuery.peek()){
			bigQuery.add(num);

		}else if(smallQuery.size()>0&&num>smallQuery.peek()){
			smallQuery.add(num);
		}else{
			bigQuery.add(num);
		}

		if(bigQuery.size()==smallQuery.size()+2){
			smallQuery.add(bigQuery.poll());
		}else if(bigQuery.size()==smallQuery.size()-2){
			bigQuery.add(smallQuery.poll());
		}

	}

	public double findMedian() {
		if(bigQuery.size()==smallQuery.size()){
			return (smallQuery.peek()+ bigQuery.peek())/2.0;
		}
		else if(bigQuery.size()<smallQuery.size()){
			return smallQuery.peek();
		}else{
			return bigQuery.peek();
		}
	}
}
