package com.learn.java.leetcode.lc0130;

public class Solution {
	int row,col;
	public void solve(char[][] board) {
		if(board==null||board.length==0){
			return;
		}
		row = board.length;
		col = board[0].length;
		//对第一行和最后一行的所有O进行深度优先搜索
		for(int i=0;i<row;i++){
			dfs(board,i,0);
			dfs(board,i,col-1);
		}
		//对第一列和最后一列的所有O进行深度优先搜索
		for(int j=0;j<col;j++){
			dfs(board,0,j);
			dfs(board,row-1,j);
		}
		//遍历矩阵，将O变为X，将-变为O
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(board[i][j]=='O') {
					board[i][j]='X';
				}
				if(board[i][j]=='-') {
					board[i][j]='O';
				}
			}
		}

	}

	private void dfs(char[][] board,int i,int j){
		if(i<0||j<0||i>=row||j>=col||board[i][j]!='O'){
			return;
		}
		//将当前O更改为-
		board[i][j]='-';
		dfs(board,i-1,j);
		dfs(board,i+1,j);
		dfs(board,i,j-1);
		dfs(board,i,j+1);
	}
}
