package com.learn.java.leetcode.lc0547;

import java.util.ArrayList;
import java.util.List;

public class Solution {


	class DisjointSet{
		private List<Integer> idList;
		private List<Integer> sizeList;
		int count ;

		public DisjointSet(int n) {
			idList = new ArrayList<>();
			sizeList = new ArrayList<>();
			for(int i = 0;i<n;i++){
				idList.add(i);
				sizeList.add(1);
			}
			count = n;
		}
		public int find(int p ){
			int v = idList.get(p);
			while(p!=v){
				int vv = idList.get(v);
				idList.set(p,vv);
				p = vv;
				v = idList.get(p);
			}
			return p;
		}

		public void union(int p ,int q){
			int i = find(p);
			int j = find(q);
			if(i==j){
				return;
			}
			if(sizeList.get(i)<sizeList.get(j)){
				idList.set(i,j);
				sizeList.set(j,(sizeList.get(j)+sizeList.get(i)));
			}else{
				idList.set(j,i);
				sizeList.set(i,(sizeList.get(j)+sizeList.get(i)));
			}
			count--;
		}

	}

	/**
	 * 并查集
	 * @param M
	 * @return
	 */

	public int findCircleNum(int[][] M) {
		if (M == null || M.length == 0) {
			return 0;
		}
		DisjointSet disjointSet = new DisjointSet(M.length);
		for(int i = 0 ;i<M.length;i++){
			for(int j = i+1 ;j<M.length;j++){
				if(M[i][j]==1){
					disjointSet.union(i,j);
				}
			}
		}
		return disjointSet.count;

	}

	/**
	 * dfs算法
	 * @param M
	 * @return
	 */
	public int findCircleNum2(int[][] M) {
		if(M==null||M.length==0){
			return 0;
		}
		int[] visit = new int[M.length];
		int count =0;
		for(int i =0;i<M.length;i++){
			if(visit[i]==0){
				dfsGraph(i,M,visit);
				count++;
			}
		}
		return count;
	}

	private void dfsGraph(int u,int[][] M,int[] visit){
		visit[u] = 1;
		for(int i =0;i<M[u].length;i++){
			if(visit[i]==0&&M[u][i]==1){
				dfsGraph(i,M,visit);
			}
		}
	}
}
