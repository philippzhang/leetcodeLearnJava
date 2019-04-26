package com.learn.java.leetcode.lc0452;

import java.util.Arrays;

/**
 * 452. Minimum Number of Arrows to Burst Balloons 452. 用最少数量的箭引爆气球 Medium
 */
public class Solution {
	public int findMinArrowShots(int[][] points) {
		if(points==null||points.length==0){
			return 0;
		}
		//先排序
		Arrays.sort(points, (o1, o2) -> (o1[0]-o2[0]));
		//段开始
		int short_begin = points[0][0];
		//段结束
		int short_end = points[0][1];
		int shorter_num = 1;
		for(int i = 1;i<points.length;i++){
			if(short_begin<=points[i][0] && short_end>=points[i][0]){
				short_begin = points[i][0];
				if(short_end>points[i][1]){
					short_end = points[i][1];
				}
			}else{
				shorter_num++;
				short_begin = points[i][0];
				short_end = points[i][1];
			}
		}

		return shorter_num;
	}
}
