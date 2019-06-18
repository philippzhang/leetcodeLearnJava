package com.learn.java.leetcode.lc0048;

public class Solution {
	public void rotate(int[][] matrix) {
		int len = matrix.length;
		for (int i = 0; i < len / 2; i++) {
			int start = i;
			int end = len - i - 1;
			for (int j = 0; j < end - start; j++) {

				swap(matrix,start,start+j,start+j,end);
				swap(matrix,start,start+j,end,end-j);
				swap(matrix,start,start+j,end-j,start);
			}
		}
	}

	private void swap(int[][] matrix, int x1, int y1, int x2, int y2) {
		int temp = matrix[x1][y1];
		matrix[x1][y1] = matrix[x2][y2];
		matrix[x2][y2] = temp;
	}
}
