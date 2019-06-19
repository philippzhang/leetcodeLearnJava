package com.learn.java.leetcode.lc0052;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
	final int[] dx = {-1,1,0,0,-1,-1,1,1};
	final int[] dy = {0,0,-1,1,-1,1,-1,1};
	int ans = 0;
	public int totalNQueens2(int n) {
		int [][] mark = new int [n][n];
		//存储某个摆放结果
		//List<List<Character>> location = new ArrayList<>();

		char[][] location = new char[n][n];
		for(int i =0;i<n;i++){
			for(int j=0;j<n;j++){
				mark[i][j] = 0;
				location[i][j] = '.';
			}
		}
		generate( 0 ,n,location, mark);
		return ans;
	}


	private void generate(int k , int n, char[][]location, int [][] mark){
		if(k==n){
			ans++;
			return;
		}
		for(int i = 0;i<n;i++){
			if(mark[k][i]==0){
				int[][] tmp_mark = new int[n][n];
				for(int j = 0;j < mark.length;j++) {
					tmp_mark[j] = Arrays.copyOf(mark[j], mark[j].length);
				}
				location[k][i] = 'Q';
				putDownTheQueue(k,i,mark);
				generate(k+1,n,location,mark);
				//回溯
				mark = tmp_mark;
				location[k][i] = '.';
			}
		}
	}

	private void putDownTheQueue(int x, int y, int [][] mark){
		mark[x][y]=1;
		for (int i =1;i<mark.length;i++){
			for (int j =0;j<dx.length;j++){
				int new_x = x+i*dx[j];
				int new_y = y+i*dy[j];
				if(new_x>=0&&new_x<mark.length&&new_y>=0&&new_y<mark.length){
					mark[new_x][new_y]=1;
				}
			}
		}
	}




	public int totalNQueens(int n) {
		if(n<=0){
			return 0;
		}
		helper(n, 0, new int[n]);
		return ans;
	}
	private void helper(int n, int cur, int [] row){
		//cur stands for current position of row
		//这里表示这一条已经加到头了
		if(cur == n){
			ans++;
			return;
		}

		//没到头时就从0到n挨个试着加入row
		for(int i = 0; i<n; i++){
			row[cur] = i;
			//检查到目前的cur位置时, row是否合法
			if(isValid(cur, row)){
				helper(n, cur+1, row);
			}
		}
	}

	private boolean isValid(int cur, int [] row){
		for(int i = 0; i<cur; i++){
			if(row[i] == row[cur] || Math.abs(row[cur] - row[i]) == cur-i){
				return false;
			}
		}
		return true;
	}
}
