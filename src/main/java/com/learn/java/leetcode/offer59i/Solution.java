package com.learn.java.leetcode.offer59i;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums.length==0||k==0){
			return new int[0];
		}
		int[] ans = new int[nums.length-k+1];
		//采用单调双端队列
		Deque<Integer> deque = new LinkedList<>();

		for(int j=0,i=1-k;j<nums.length;j++,i++){
			if(i>0&&!deque.isEmpty()&&deque.peekFirst()==nums[i-1]){
				deque.pollFirst();
			}
			while(!deque.isEmpty()&&deque.peekLast()<nums[j]){
				deque.pollLast();
			}
			deque.offerLast(nums[j]);
			if(i>=0){
				ans[i]=deque.peekFirst();
			}
		}
		return ans;
	}
}
