package com.learn.java.leetcode.lc0310;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<Integer> findMinHeightTrees(int n, int[][] edges) {
		boolean[][] graph = new boolean[n][n];
		boolean[] visitd = new boolean[n];
		Queue<Integer> queue = new LinkedList<>();
		int[] e = new int[n];
		//构建图
		for(int i = 0;i<edges.length;i++){
			graph[edges[i][0]][edges[i][1]]=true;
			graph[edges[i][1]][edges[i][0]]=true;
			e[edges[i][0]]++;
			e[edges[i][1]]++;
		}
		//去除最外层的结点
		while(n>2){
			//找到最外层结点
			for(int i = 0;i<e.length;i++){
				if(e[i]==1){
					queue.offer(i);
				}
			}

			while(!queue.isEmpty()){
				Integer v = queue.poll();
				e[v]--;
				n--;
				visitd[v]=true;
				for(int i = 0;i<graph[v].length;i++){
					if(graph[v][i]){
						e[i]--;
						graph[v][i]=false;
						graph[i][v]=false;
					}
				}
			}
		}

		List<Integer> results = new ArrayList<>();
		for(int i=0;i<visitd.length;i++){
			if(!visitd[i]){
				results.add(i);
			}
		}

		return results;
	}
}
