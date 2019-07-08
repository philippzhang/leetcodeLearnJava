package com.learn.java.leetcode.lc0363;


import java.util.TreeSet;

public class Solution {

	/**
	 *
	 * 时间复杂度：O(m^2*nlog(n))
	 * @param matrix
	 * @param k
	 * @return
	 */
	public int maxSumSubmatrix(int[][] matrix, int k) {
		int row = matrix.length;
		if(row==0){
			return 0;
		}
		int col = matrix[0].length;
		if(col==0){
			return 0;
		}

		int[] dp = new int[row];
		int result = Integer.MIN_VALUE;
		TreeSet<Integer> set = new TreeSet();
		for(int i = 0;i<col;i++){
			for(int j =0;j<row;j++){
				dp[j] = 0;
			}
			for(int j = i;j<col;j++){
				for(int l =0;l<row;l++){
					dp[l] += matrix[l][j];
				}

				int sum = 0;
				int maxValue = Integer.MIN_VALUE;

				set.clear();
				//防止第一个元素就等于k
				set.add(0);
				for(int l=0;l<dp.length;l++){
					sum+=dp[l];

					int target = sum -k;
					//方法返回在这个集合中大于或者等于给定元素的最小元素，如果不存在这样的元素,返回null.
					//查找第一个>=sum-k的下标,
					Integer tag = set.ceiling(target);
					if(tag!=null){
						maxValue = Math.max(maxValue,sum-tag);
						if(maxValue==k){
							return k;
						}
					}
					set.add(sum);
				}

				result = Math.max(result,maxValue);

			}
		}

		return result;
	}
}
