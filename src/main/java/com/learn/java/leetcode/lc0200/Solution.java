package com.learn.java.leetcode.lc0200;

public class Solution {
	public int numIslands(char[][] grid) {
		int isLandNum = 0;
		int row = grid.length;
		int col = grid[0].length;
		int[][] mark = new int[row][col];

		for(int i = 0;i< row;i++){
			for(int j =0;j< col;j++){
				if(mark[i][j]==0&&grid[i][j]=='1'){
					DFS(mark,grid,i,j);
					isLandNum++;
				}
			}
		}
		return isLandNum;
	}

	//方向数组

	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};

	/**
	 * 深度优先遍历
	 * @param mark
	 * @param grid
	 * @param x
	 * @param y
	 */
	private void DFS(int[][] mark,char[][] grid,int x,int y){
		mark[x][y]=1;
		for(int i = 0;i<4;i++){
			int newx = x+dx[i];
			int newy = y+dy[i];
			if(newx<0||newx>=mark.length||newy<0||newy>=mark[0].length){
				continue;
			}
			if(mark[newx][newy]==0&&grid[newx][newy]=='1'){
				DFS(mark,grid,newx,newy);
			}
		}
	}
}
