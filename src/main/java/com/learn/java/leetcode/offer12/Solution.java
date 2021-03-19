package com.learn.java.leetcode.offer12;

public class Solution {
	public boolean exist(char[][] board, String word) {
		if(board==null||board.length==0){
			return false;
		}

		for(int i =0;i<board.length;i++){
			for(int j = 0;j<board[0].length;j++){
				if(dfs(board,word,i,j,0)){
					return true;
				}
			}
		}

		return false;
	}
	int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};

	private boolean dfs(char[][] board,String word,int i, int j ,int k){
		if(i>=board.length||i<0||j>=board[0].length||j<0||board[i][j]!=word.charAt(k)){
			return false;
		}
		if(k==word.length()-1){
			return true;
		}
		char temp = board[i][j];
		board[i][j] = '\0';

		boolean res = false;
		//向四个方向
		for(int m = 0;m<4;m++){
				res = dfs(board,word,i+dx[m],j+dy[m],k+1);
				if(res){
					break;
				}
		}

		//回溯
		board[i][j] = temp;

		return res;

	}
}
