package com.learn.java.leetcode.lc0289;

public class Solution {
	public void gameOfLife(int[][] board) {

		int m = board.length;
		int n = board[0].length;
		boolean[][] visited = new boolean[m][n];
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				int type = board[i][j];
				int newType = isAlive(board,visited,i,j,m,n);
				if(type!=newType){
					board[i][j] = board[i][j]==1?0:1;
					visited[i][j] = true;
				}
			}
		}

	}

	private int isAlive(int[][] board,boolean[][] visited,int i, int j,int m,int n){
		int type = board[i][j];
		//8个方向
		int times= isAliveLast(board,visited,i-1,j,m,n)+isAliveLast(board,visited,i+1,j,m,n)+
				isAliveLast(board,visited,i,j-1,m,n)+isAliveLast(board,visited,i,j+1,m,n)+
				isAliveLast(board,visited,i-1,j-1,m,n)+isAliveLast(board,visited,i+1,j+1,m,n)+
				isAliveLast(board,visited,i-1,j+1,m,n)+isAliveLast(board,visited,i+1,j-1,m,n);

		if(type==0){
			if(times==3){
				//复活
				return 1;
			}else{
				return 0;
			}
		}else{
			if(times<2||times>3){
				return 0;
			}else{
				return 1;
			}
		}

	}

	private int isAliveLast(int[][] board,boolean[][] visited,int i, int j,int m,int n){
		if(i<0||i>=m||j<0||j>=n){
			return 0;
		}
		if(visited[i][j]){
			return board[i][j] == 1?0:1;
		}else{
			return board[i][j];
		}
	}
}
