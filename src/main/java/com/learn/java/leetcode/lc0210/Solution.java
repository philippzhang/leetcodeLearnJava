package com.learn.java.leetcode.lc0210;

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
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		//邻接表
		List<GraphNode> graph = new ArrayList<>();
		//入度列表
		List<Integer> degree = new ArrayList<>();
		//路径
		LinkedList<Integer> path = new LinkedList<>();

		for(int i =0;i<numCourses;i++){
			graph.add(new GraphNode((i)));
			degree.add(0);
		}

		for(int i =0;i<prerequisites.length;i++){
			//基础课1
			GraphNode begin = graph.get(prerequisites[i][1]);
			//课程2
			GraphNode end = graph.get(prerequisites[i][0]);
			//课程2指向课程1
			begin.neighbors.add(end);
			degree.set(prerequisites[i][0],degree.get(prerequisites[i][0])+1);
		}

		Queue<GraphNode> queue = new LinkedList<>();
		for(int i =0;i<numCourses;i++){
			if(degree.get(i)==0){
				queue.add(graph.get(i));
				path.add(i);
			}
		}

		//BFS

		while(!queue.isEmpty()){
			GraphNode node = queue.poll();
			for(int i =0;i<node.neighbors.size();i++){
				GraphNode neighbor = node.neighbors.get(i);
				//入度-1
				degree.set(neighbor.label,degree.get(neighbor.label)-1);
				if(degree.get(neighbor.label)==0){
					queue.add(neighbor);
					path.add(neighbor.label);
				}
			}
		}
		for(int i = 0;i<degree.size();i++){
			if(degree.get(i)!=0){
				return new int[]{};
			}
		}

		if(path.size()!=numCourses){
			return new int[]{};
		}
		

		int [] results = new int[path.size()];
		for(int i =0;i<path.size();i++){
			results[i] = path.get(i);
		}

		return results;
	}

}
