package com.learn.java.leetcode.lc0703;

import java.util.PriorityQueue;

public class KthLargest {
	private PriorityQueue<Integer> priorityQueue;
	private int k;
	public KthLargest(int k, int[] nums) {
		this.k = k ;
		priorityQueue= new PriorityQueue(k);
		if(nums!=null&&nums.length>0){
			for(int num:nums){
				add(num);
			}
		}
	}

	public int add(int val) {
		if(priorityQueue.size()<k) {
			priorityQueue.add(val);
		}else if(priorityQueue.peek()<val){
			priorityQueue.poll();
			priorityQueue.add(val);
		}

		return priorityQueue.peek();

	}
}
