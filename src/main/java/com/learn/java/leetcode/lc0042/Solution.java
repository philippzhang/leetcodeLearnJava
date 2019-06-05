package com.learn.java.leetcode.lc0042;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
	class QItem{
		int x;
		int y;
		public QItem(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public int trap(int[] height) {
		if(height==null||height.length<3){
			return 0;
		}
		PriorityQueue<QItem> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.y));
		int[] mark = new int[height.length];
		queue.add(new QItem(0,height[0]));
		queue.add(new QItem(height.length-1,height[height.length-1]));
		mark[0]=1;
		mark[height.length-1]=1;
		int result = 0;
		while(!queue.isEmpty()){
			int x = queue.peek().x;
			int y = queue.peek().y;
			queue.poll();
			int[] dx = {-1,1};
			for(int i =0;i<2;i++){
				int newx = x+dx[i];
				if(newx<0 || newx>=height.length || mark[newx]==1){
					continue;
				}
				if(y>height[newx]){
					result+=y-height[newx];
					height[newx] = y;
				}
				queue.add(new QItem(newx,height[newx]));
				mark[newx]=1;
			}
		}

		return result;

	}
}
