package com.learn.java.leetcode.lc0275;

public class Solution {
	/**
	 * 二分查找O(logN)
	 * 第一步先确定h的范围： 0<h<citationsSize
	 * 第二步二分： h将0~citationsSize这个区间分为两部分，小于等于h的部分和大于h的部分。
	 * 解释：只要h满足，那么小于等于h的数一定满足，大于h的数不满足。
	 * 第三步条件：倒数第h个数大于等于h即可，即citations[citationsSize-mid]>=mid
	 *
	 * @param citations
	 * @return
	 */
	public int hIndex(int[] citations) {
		int n = citations.length;
		if(n==0){
			return 0;
		}

		int left = 0 ,right = n;
		while(left<right) {
			int mid = (left + right+1) / 2;
			if (citations[n-mid] >= mid) {
				left = mid ;
			} else {
				right = mid-1;
			}
		}

		return left;
	}


	public int hIndex2(int[] citations) {
		int n = citations.length;
		if(n==0){
			return 0;
		}
		int left = 0 ,right = n-1;
		while(left<right) {
			int mid = (left + right) / 2;
			if (citations[mid] >= n-mid) {
				right = mid;
			} else {
				left = mid +1;
			}
		}
		if(citations[right]<n-right){
			return 0;
		}
		return n-right;
	}
}
