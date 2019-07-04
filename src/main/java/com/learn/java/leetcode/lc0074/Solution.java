package com.learn.java.leetcode.lc0074;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null||matrix.length==0){
			return false;
		}
		int row = matrix.length;
		int up = 0, down = row-1;
		return searchMatrix(matrix,  target, up, down);

	}

	private boolean searchMatrix(int[][] matrix, int target,int up,int down) {
		if(down<up) {
			return false;
		}
		if(up == down){
			return searchMatrix(matrix,target,up);
		}
		int mid = (up+down)/2;
		if(matrix[mid][0]==target){
			return true;
		}
		if(matrix[mid][0]>target){
			return searchMatrix(matrix,  target, up, down-1);
		}
		int col = matrix[0].length-1;
		if(matrix[mid][col]==target){
			return true;
		}
		if(matrix[mid][col]<target){
			return searchMatrix(matrix,  target, up+1, down);
		}

		return searchMatrix(matrix,target,mid);

	}

	/**
	 * 二分搜索
	 * @param matrix
	 * @param target
	 * @param index
	 * @return
	 */
	private boolean searchMatrix(int[][] matrix, int target,int index) {
		int left = 0;
		int right = matrix[index].length-1;
		if(matrix[index][left]<=target&&matrix[index][right]>=target) {
			return searchMatrixBinary(matrix, target, index, left, right);
		}else {
			return false;
		}
	}

	private boolean searchMatrixBinary(int[][] matrix, int target,int index,int left,int right) {
		if(right<left){
			return false;
		}
		int mid = (left+right)/2;
		if(matrix[index][mid]==target){
			return true;
		}else if(matrix[index][mid]>target){
			return searchMatrixBinary(matrix,target,index,left,right-1);
		}else {
			return searchMatrixBinary(matrix,target,index,left+1,right);
		}
	}
}
