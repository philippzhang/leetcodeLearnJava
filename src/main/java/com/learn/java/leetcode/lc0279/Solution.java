package com.learn.java.leetcode.lc0279;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	class Node{
		//剩余值
		int val;
		//完全平方数的个数
		int step;

		public Node(int val, int step) {
			this.val = val;
			this.step = step;
		}
	}

	/**
	 * 采用图的BFS
	 * @param n
	 * @return
	 */
	public int numSquares(int n) {
		Queue<Node> queue = new LinkedList<>();
		queue.offer(new Node(n,0));
		//visited 数组来过滤元素的
		boolean[] visited = new boolean[n+1];
		while (!queue.isEmpty()){
			int val = queue.peek().val;
			int step = queue.peek().step;
			queue.remove();

			for(int i = 1;;i++){
				int a = val - i*i;
				if (a<0){
					break;
				}
				if(a==0){
					return step+1;
				}
				if(!visited[a]){
					queue.offer(new Node(a,step+1));
					visited[a] = true;
				}
			}
		}
		return -1;
	}

}
