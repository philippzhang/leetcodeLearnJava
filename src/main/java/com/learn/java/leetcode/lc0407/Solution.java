package com.learn.java.leetcode.lc0407;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 搜索使用优先队列，按高度建立小顶堆
 * 以矩形的四周为起点进行广度优先搜索，这些点最初会进入队列
 * 使用一个二维数组对入队的点进行标记，之后搜索到改点后，不再进度队列
 * 只要优先队列不空，则取出堆头元素进行搜索，按上下左右四个方向进行拓展，忽略超出边界的点
 * 对(x,y,h)进行拓展，如果h>heighMap[newx][newy]
 * result+=h-heighMap[newx][newy]
 * 将heighMap[newx][newy]赋值为h(表示水平面升高)
 */
public class Solution {
	class QItem{
		int x;
		int y;
		int h;

		public QItem(int x, int y, int h) {
			this.x = x;
			this.y = y;
			this.h = h;
		}
	}

	public int trapRainWater(int[][] heightMap) {
		if(heightMap==null||heightMap.length==0){
			return 0;
		}
		//按h建立小顶堆
		PriorityQueue<QItem> priorityQueue = new PriorityQueue((Comparator<QItem>) (o1, o2) -> o1.h-o2.h);


		int row = heightMap.length;
		int col = heightMap[0].length;

		if(row<3||col<3){
			return 0;
		}
		int[][] mark = new int[row][col];
		for(int i =0;i<row;i++){
			priorityQueue.add(new QItem(i,0,heightMap[i][0]));
			mark[i][0]=1;
			priorityQueue.add(new QItem(i,col-1,heightMap[i][col-1]));
			mark[i][col-1]=1;
		}
		for(int i = 1;i<col-1;i++){
			priorityQueue.add(new QItem(0,i,heightMap[0][i]));
			mark[0][i]=1;
			priorityQueue.add(new QItem(row-1,i,heightMap[row-1][i]));
			mark[row-1][i]=1;
		}

		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		//最终积水量
		int result = 0;

		while(!priorityQueue.isEmpty()){
			int x = priorityQueue.peek().x;
			int y = priorityQueue.peek().y;
			int h = priorityQueue.peek().h;
			priorityQueue.poll();
			for(int i =0;i<4;i++){
				int newx = x+dx[i];
				int newy = y+dy[i];
				if(newx<0||newx>=row||newy<0||newy>=col||mark[newx][newy]==1){
					continue;
				}
				if(h>heightMap[newx][newy]){
					result+=h-heightMap[newx][newy];
					heightMap[newx][newy] = h;
				}
				priorityQueue.add(new QItem(newx,newy,heightMap[newx][newy]));
				mark[newx][newy]=1;
			}
		}

		return result;

	}
}
