package com.learn.java.leetcode.offer29;

public class Solution {

	public int[] spiralOrder(int[][] matrix) {
		if(matrix==null||matrix.length==0||matrix[0].length==0){
			return new int[0];
		}
		int m = matrix.length;//行数
		int n = matrix[0].length;//列数
		int [] ret = new int[n*m];
		int index = 0;

		int left = 0;  int up = 0;

		int right = n-1;  int down = m-1;

		while(true){

			for(int i = left;i<=right;i++){
				ret[index++] = matrix[up][i];
			}
			if(++up>down){
				break;
			}

			for(int i = up;i<=down;i++){
				ret[index++] = matrix[i][right];
			}
			if(--right<left){
				break;
			}

			for(int i = right;i>=left;i--){
				ret[index++] = matrix[down][i];
			}

			if(--down<up){
				break;
			}

			for(int i = down;i>=up;i--){
				ret[index++] = matrix[i][left];
			}

			if(++left>right){
				break;
			}
		}


		return ret;
	}
}
