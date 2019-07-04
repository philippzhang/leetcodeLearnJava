package com.learn.java.leetcode.lc0239;

import java.util.LinkedList;

public class Solution {
	public int[] maxSlidingWindow(int[] nums, int k) {
		if(nums==null||nums.length==0||k<=0){
			return new int[0];
		}
		int[] results = new int[nums.length-k+1];
		//双端队列
		LinkedList<Integer> queue = new LinkedList<>();
		int index = 0;
		for(int i =0;i<nums.length;i++){
			while(!queue.isEmpty()&&nums[queue.peekLast()]<=nums[i]){
				queue.pollLast();
			}
			queue.offer(i);
			if(queue.peekFirst() == i-k){
				queue.pollFirst();
			}

			if(i>=k-1){
				results[index++] = nums[queue.peekFirst()];
			}

		}

		return results;

	}

}
