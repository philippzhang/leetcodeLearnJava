package com.learn.java.leetcode.lc0274;

import java.util.Arrays;

public class Solution {
	/**
	 * 排序 O(NlogN)
	 * @param citations
	 * @return
	 */
	public int hIndex2(int[] citations) {
		Arrays.sort(citations);

		for (int res = citations.length; res > 0; res--) {
			if (citations[citations.length - res] >= res) {
				return res;
			}
		}

		return 0;
	}

	/**
	 * O(N)
	 * @param citations
	 * @return
	 */
	public int hIndex(int[] citations) {
		int n = citations.length;
		//h<n
		int[] papers = new int[n+1];

		for(int c:citations){
			papers[Math.min(n,c)]++;
		}
		for (int i = n; i > 0; --i){
			if (papers[i] >= i){
				return i;
			}
			papers[i-1] += papers[i];
		}
		return 0;
	}


}
