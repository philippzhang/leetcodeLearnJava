package com.learn.java.leetcode.lc0378;

public class Solution {
	/**
	 * O(nlgn*lgK)
	 * @param matrix
	 * @param k
	 * @return
	 */
	public int kthSmallest2(int[][] matrix, int k) {
		int m = matrix.length;
		int n = matrix[0].length;
		int lo = matrix[0][0],hi = matrix[m-1][n-1];
		while(lo<hi){
			int mid = (hi+lo)/2;
			int count = 0,j = n-1;
			for(int i =0;i<m;i++){
				while(j>=0&&matrix[i][j]>mid){
					j--;
				}
				count +=(j+1);
			}
			if(count<k){
				lo = mid +1;
			}else{
				hi = mid;
			}
		}
		return lo;
	}

	/**
	 * O(nlgK)
	 * @param matrix
	 * @param k
	 * @return
	 */
	public int kthSmallest(int[][] matrix, int k) {
		int m = matrix.length;
		int n = matrix[0].length;
		int lo = matrix[0][0],hi = matrix[m-1][n-1];
		while(lo < hi){
			int mid = (hi+lo)/2;
			int count = countLessOrEquals(mid, matrix,m,n);
			if(count < k) {
				lo = mid+1;
			} else {
				hi = mid;
			}
		}
		return lo;
	}

	public int countLessOrEquals(int target, int[][] matrix,int m,int n){
		int i = m-1, j = 0;
		int count = 0;
		while(i >= 0 && j < n){
			if(target < matrix[i][j]){
				i--;
			}else{
				count += i+1;
				j++;
			}
		}
		return count;
	}
}
