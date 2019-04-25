package com.learn.java.leetcode.lc0933;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 933. Number of Recent Calls 933. 最近的请求次数 Easy
 */

public class RecentCounter {
	private Queue<Integer> queue;
	public RecentCounter() {
		queue = new LinkedList<>();
	}

	public int ping(int t) {
		if(queue.isEmpty()){
			queue.offer(t);
		}else{
			while(!queue.isEmpty()&&(queue.peek()<(t-3000)||queue.peek()>t)){
				queue.poll();
			}
			queue.offer(t);
		}

		return queue.size();
	}
}
