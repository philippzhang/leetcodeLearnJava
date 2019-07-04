package com.learn.java.leetcode.lc0240;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null||matrix.length==0){
			return false;
		}
		int m = 0;
		int n = matrix[0].length - 1;
		while (m < matrix.length && n >= 0) {
			if (matrix[m][n] == target) {
				return true;
			} else if (matrix[m][n] > target) {
				n--;
			} else {
				m++;
			}
		}
		return false;
	}


}
