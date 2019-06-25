package com.learn.java.leetcode.lc0079;



public class Solution {
	public boolean exist(char[][] board, String word) {
		char[] chars = word.toCharArray();
		for(int i = 0;i<board.length;i++){
			for(int j =0;j<board[0].length;j++){
				if(judge(board,chars,0,i,j)){
					return true;
				}
			}
		}
		return false;
	}

	private boolean judge(char[][] board,char[] chars, int pos ,int x, int y){
		if(x<0||y<0||x>=board.length||y>=board[0].length||board[x][y]!=chars[pos]){
			return false;
		}
		if(pos+1 == chars.length){
			return true;
		}
		char temp = board[x][y];
		board[x][y] = '*';
		boolean result = judge(board,chars,pos+1,x+1,y)||judge(board,chars,pos+1,x,y+1)||judge(board,chars,pos+1,x-1,y)||judge(board,chars,pos+1,x,y-1);
		board[x][y] = temp;
		return result;
	}


}
