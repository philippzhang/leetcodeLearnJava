package com.learn.java.leetcode.offer04;

/**
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 */
public class Solution {


	/**
	 * 由于给定的二维数组具备每行从左到右递增以及每列从上到下递增的特点，
	 * 当访问到一个元素时，可以排除数组中的部分元素。
	 *
	 * 从二维数组的右上角开始查找。如果当前元素等于目标值，则返回 true。
	 * 如果当前元素大于目标值，则移到左边一列。
	 * 如果当前元素小于目标值，则移到下边一行。
	 *
	 *
	 * @param matrix
	 * @param target
	 * @return
	 */
	public boolean findNumberIn2DArray(int[][] matrix, int target) {
		if(matrix==null||matrix.length==0||matrix[0].length==0){
			return false;
		}
		int up = 0,down = matrix.length-1;
		int left = 0,right = matrix[0].length-1;
		while (up<=down&&right>=left){
			if(matrix[up][right]==target){
				return true;
			}else if(matrix[up][right]>target){
				right --;
			}else if(matrix[up][right]<target){
				up ++;
			}
		}
		return false;
	}
}
