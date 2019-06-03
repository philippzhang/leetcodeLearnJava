package com.learn.java.leetcode.lc0056;

import com.learn.java.leetcode.base.structure.Interval;

import java.util.*;

public class Solution {
	public int[][] merge(int[][] intervals) {
		List<Integer[]> list = new ArrayList<>();
		if(intervals==null||intervals.length==0){
			return new int[][]{};
		}
		Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

		int i = 0;
		int n = intervals.length;
		while(i<n){
			int start = intervals[i][0];
			int end = intervals[i][1];
			while(i<n-1&&end>=intervals[i+1][0]){
				end = Math.max(end,intervals[i+1][1]);
				i++;
			}
			list.add(new Integer[]{start,end});
			i++;
		}
		int[][] results = new int[list.size()][2];
		for(i =0;i<list.size();i++){
			results[i][0] = list.get(i)[0];
			results[i][1] = list.get(i)[1];
		}
		list.clear();
		return results;
	}
}
