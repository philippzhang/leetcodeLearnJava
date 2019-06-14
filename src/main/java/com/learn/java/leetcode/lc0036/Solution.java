package com.learn.java.leetcode.lc0036;

public class Solution {
	public boolean isValidSudoku2(char[][] board) {
		// 记录某行，某位数字是否已经被摆放
		boolean[][] row = new boolean[9][9];
		// 记录某列，某位数字是否已经被摆放
		boolean[][] col = new boolean[9][9];
		// 记录某 3x3 宫格内，某位数字是否已经被摆放
		boolean[][] block = new boolean[9][9];

		for(int i =0;i<9;i++){
			for(int j =0;j<9;j++){
				if(board[i][j]!='.'){
					//序号从0-8
					int num = board[i][j]-'1';
					//第几个宫格
					int blockIndex = (i/3)*3+j/3;
					if(row[i][num]||col[j][num]||block[blockIndex][num]){
						return false;
					}else{
						row[i][num]=true;
						col[j][num]=true;
						block[blockIndex][num]=true;
					}
				}
			}
		}
		return true;
	}

	public  boolean isValidSudoku(char[][] board) {
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if(board[i][j] == '.') {
					continue;
				}
				for(int k = 8; k > j; k--) {
					if(board[i][j] == board[i][k]) {
						return false;
					}
				}
				for(int k = 8; k > i; k--) {
					if(board[i][j] == board[k][j]) {
						return false;
					}
				}
				for(int k = i + 1; k % 3 != 0; k ++){
					for(int h = j / 3 * 3;h < j / 3 * 3  + 3; h ++ ) {
						if(board[i][j] == board[k][h]) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
}
