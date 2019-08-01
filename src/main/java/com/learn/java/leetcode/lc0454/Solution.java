package com.learn.java.leetcode.lc0454;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		int count = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int a:A){
			for(int b:B){
				int sumAB = a+b;
				map.put(sumAB,map.getOrDefault(sumAB,0)+1);
			}
		}
		for(int c:C){
			for(int d:D){
				int sumCD = c+d;
				count += map.getOrDefault(-sumCD,0);
			}
		}
		return count;
	}
}
