package com.learn.java.leetcode.lc0073;

public class Solution {
	/**
	 * 空间O(1)
	 * @param matrix
	 */
	public void setZeroes(int[][] matrix){
		if(matrix==null||matrix.length==0){
			return;
		}
		int row = matrix.length;
		int col = matrix[0].length;
		boolean rowFlag = false;
		for(int i =0;i<row;i++){
			if(matrix[i][0]==0){
				rowFlag = true;
				break;
			}
		}

		boolean colFlag = false;
		for(int j =0;j<col;j++){
			if(matrix[0][j]==0){
				colFlag = true;
				break;
			}
		}

		for(int i =0;i<row;i++){
			for(int j = 0;j<col;j++){
				if(matrix[i][j]==0){
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}

		for(int i =1;i<row;i++){
			if(matrix[i][0]==0){
				for(int j = 1;j<col;j++){
					matrix[i][j] = 0;
				}
			}
		}

		for(int j =1;j<col;j++){
			if(matrix[0][j]==0){
				for(int i = 1;i<row;i++){
					matrix[i][j] = 0;
				}
			}
		}

		if(rowFlag){
			for(int i = 0;i<row;i++){
				matrix[i][0] = 0;
			}
		}

		if(colFlag){
			for(int j = 0;j<col;j++){
				matrix[0][j] = 0;
			}
		}

	}


	public void setZeroes2(int[][] matrix) {
		if(matrix==null||matrix.length==0){
			return;
		}
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] mark = new int[row][col];
		for(int i =0;i<row;i++){
			for(int j = 0;j<col;j++){
				if(mark[i][j]==0&&matrix[i][j]==0){
					setZeroes(matrix,mark,i,j,row,col);
				}
			}
		}
	}

	private void setZeroes(int[][] matrix,int[][] mark,int i,int j,int row,int col ){
		mark[i][j] = 1;
		for(int k =0;k<row;k++){
			if(mark[k][j]==0&&matrix[k][j]==0){
				setZeroes(matrix,mark,k,j,row,col);
			}else{
				matrix[k][j] = 0;
				mark[k][j]=1;
			}
		}

		for(int k =0;k<col;k++){
			if(mark[i][k]==0&&matrix[i][k]==0){
				setZeroes(matrix,mark,i,k,row,col);
			}else{
				matrix[i][k] = 0;
				mark[i][k]=1;
			}
		}
	}
}
