package com.learn.java.leetcode.lc0057;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int[][] insert(int[][] intervals, int[] newInterval) {
		if(newInterval==null||newInterval.length<=0){
			return intervals;
		}
		if(intervals==null||intervals.length<=0){
			int[][] retInterval = new int[1][2];
			retInterval[0][0] = newInterval[0];
			retInterval[0][1] = newInterval[1];
			return retInterval;
		}

		List<Integer[]> list = new ArrayList<>();

		int i = 0;
		int n = intervals.length;
		int newStart = newInterval[0];
		int newEnd = newInterval[1];
		boolean flag = false;
		while(i<n){
			int start = intervals[i][0];
			int end = intervals[i][1];
			if(!flag) {
				if (end < newStart) {
					list.add(new Integer[]{start,end});
				}
				else if (newEnd < start) {
					list.add(new Integer[]{newStart, newEnd});
					list.add(new Integer[]{start, end});
					flag = true;
				}else if (start<=newStart&&end>=newEnd){
					list.add(new Integer[]{start,end});
					flag = true;
				}else if (newStart<=start&&newEnd>=end){
					while(i<n-1&&newEnd>=intervals[i+1][0]){
						newEnd = Math.max(newEnd,intervals[i+1][1]);
						i++;
					}
					list.add(new Integer[]{newStart,newEnd});
					flag = true;
				}else if(start<=newStart&&end<=newEnd){
					while(i<n-1&&newEnd>=intervals[i+1][0]){
						newEnd = Math.max(newEnd,intervals[i+1][1]);
						i++;
					}
					list.add(new Integer[]{start,newEnd});
					flag = true;
				}else if(newStart<=start&&newEnd<=end){
					list.add(new Integer[]{newStart,end});
					flag = true;
				}
			}else{
				list.add(new Integer[]{start,end});
			}
			i++;
		}
		if(!flag){
			list.add(new Integer[]{newStart,newEnd});
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
