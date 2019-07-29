package com.learn.java.leetcode.lc0149;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	int[][] points;
	int n;
	Map<Double,Integer> lines = new HashMap<>();
	int horisontalLines;

	public Pair<Integer, Integer> addLine(int i, int j, int count, int duplicates){

		int x1 = points[i][0];
		int y1 = points[i][1];

		int x2 = points[j][0];
		int y2 = points[j][1];

		if((x1==x2)&&(y1==y2)){
			duplicates++;
		}else if(y1==y2){
			horisontalLines +=1;
			count = Math.max(horisontalLines,count);
		}else {
			double slope = 1.0*(x1-x2)/(y1-y2)+0.0;
			lines.put(slope,lines.getOrDefault(slope,1)+1);
			count = Math.max(lines.get(slope),count);
		}
		return new Pair<>(count,duplicates);

	}

	private int computeMaxPoints(int i) {
		lines.clear();
		horisontalLines = 1;
		int count =1 ;
		int duplicates = 0;

		for(int j = i+1;j<n;j++){
			Pair<Integer,Integer> p = addLine(i,j,count,duplicates);
			count = p.getKey();
			duplicates = p.getValue();
		}

		return  count + duplicates;
	}

	public int maxPoints(int[][] points) {
		this.points = points;
		n =points.length;
		if(n<3){
			return n;
		}
		int maxCount = 1;

		for(int i = 0;i<n-1;i++){
			maxCount = Math.max(computeMaxPoints(i), maxCount);
		}

		return maxCount;

	}
}
