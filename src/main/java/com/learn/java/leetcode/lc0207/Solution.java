package com.learn.java.leetcode.lc0207;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	private class GraphNode{
		int label;
		List<GraphNode> neighbors;
		public GraphNode(int label){
			this.label = label;
			neighbors = new ArrayList<>();
		}
	}

	/**
	 * 算法核心思路是判断是有环路，即从某个点遍历后，仍能访问到该点
	 * @param numCourses
	 * @param prerequisites
	 * @return
	 */
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		//邻接表
		List<GraphNode> graph = new ArrayList<>();
		//结点访问状态，-1没有访问过，0正在访问，1已经完成访问
		List<Integer> visit = new ArrayList<>();

		for(int i =0;i<numCourses;i++){
			graph.add(new GraphNode((i)));
			visit.add(-1);
		}

		for(int i =0;i<prerequisites.length;i++){
			//基础课1
			GraphNode begin = graph.get(prerequisites[i][1]);
			//课程2
			GraphNode end = graph.get(prerequisites[i][0]);
			//课程2指向课程1
			begin.neighbors.add(end);
		}

		for(int i = 0;i <graph.size();i++){
			if(visit.get(i)==-1 && !dfsGraph(graph.get(i),visit)){
				return false;
			}
		}
		return true;
	}

	/**
	 * 先计算入度，入度为0的点入队列，删除队列中的点，并将其邻居的入度-1，
	 * 如果最后所有点的入度都为0，说明没有环路，否则有环路
	 * @param node
	 * @param visit
	 * @return
	 */
	private boolean dfsGraph(GraphNode node,List<Integer> visit){
		visit.set(node.label,0);
		for(int i =0;i<node.neighbors.size();i++){
			GraphNode neighbor = node.neighbors.get(i);
			if(visit.get(neighbor.label)==-1){
				if(!dfsGraph(neighbor,visit)){
					return false;
				}
			}else if (visit.get(neighbor.label)==0){
				return false;
			}
		}
		visit.set(node.label,1);
		return true;
	}

	public boolean canFinish2(int numCourses, int[][] prerequisites) {
		//邻接表
		List<GraphNode> graph = new ArrayList<>();
		//入度列表
		List<Integer> degree = new ArrayList<>();
		for(int i = 0;i<numCourses;i++){
			degree.add(0);
			graph.add(new GraphNode(i));
		}
		for(int i = 0;i<prerequisites.length;i++){
			GraphNode begin = graph.get(prerequisites[i][1]);
			GraphNode end = graph.get(prerequisites[i][0]);
			begin.neighbors.add(end);
			degree.set(prerequisites[i][0],degree.get(prerequisites[i][0])+1);
		}



		Queue<GraphNode> queue = new LinkedList<>();
		for(int i =0;i<numCourses;i++){
			if(degree.get(i)==0){
				queue.add(graph.get(i));
			}
		}
		//BFS

		while(!queue.isEmpty()){
			GraphNode node = queue.poll();
			for(int i =0;i<node.neighbors.size();i++){
				GraphNode neighbor = node.neighbors.get(i);
				degree.set(neighbor.label,degree.get(neighbor.label)-1);
				if(degree.get(neighbor.label)==0){
					queue.add(neighbor);
				}
			}
		}
		for(int i = 0;i<degree.size();i++){
			if(degree.get(i)!=0){
				return false;
			}
		}
		return true;
	}

}
