package com.learn.java.leetcode.lc0218;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	/**
	 * 分治法
	 * @param buildings
	 * @return
	 */
	public List<List<Integer>> getSkyline(int[][] buildings) {
		int n = buildings.length;
		List<List<Integer>> output = new ArrayList<>();

		if(n==0){
			return output;
		}
		if(n==1){
			int xStart = buildings[0][0];
			int xEnd = buildings[0][1];
			int y = buildings[0][2];
			output.add(new ArrayList<Integer>() {{add(xStart); add(y); }});
			output.add(new ArrayList<Integer>() {{add(xEnd); add(0); }});

			return output;
		}

		List<List<Integer>> leftSkyline ,rightSkyline;
		leftSkyline = getSkyline(Arrays.copyOfRange(buildings,0,n/2));
		rightSkyline = getSkyline(Arrays.copyOfRange(buildings,n/2,n));

		return mergeSkyline(leftSkyline,rightSkyline);
	}

	private List<List<Integer>> mergeSkyline(List<List<Integer>> left,List<List<Integer>> right){
		int nL = left.size(),nR = right.size();
		int pL = 0,pR = 0;
		int currY = 0,leftY = 0,rightY = 0;
		int x,maxY;
		List<List<Integer>> output = new ArrayList<List<Integer>>();

		while((pL<nL)&&(pR<nR)){
			List<Integer> pointL = left.get(pL);
			List<Integer> pointR = right.get(pR);

			if(pointL.get(0)<pointR.get(0)){
				x = pointL.get(0);
				leftY = pointL.get(1);
				pL++;
			}else{
				x = pointR.get(0);
				rightY = pointR.get(1);
				pR++;
			}

			maxY = Math.max(leftY,rightY);
			if(currY!=maxY){
				//更新
				updateOutput(output,x,maxY);
				currY = maxY;
			}
		}

		appendSkyline(output,left,pL,nL,currY);

		appendSkyline(output,right,pR,nR,currY);

		return output;
	}

	private void updateOutput(List<List<Integer>> output,int x,int y){
		if(output.isEmpty()||output.get(output.size()-1).get(0)!=x){
			output.add(new ArrayList<Integer>(){{add(x);add(y);}});
		}else{
			output.get(output.size()-1).set(1,y);
		}
	}

	private void appendSkyline(List<List<Integer>> output,List<List<Integer>> skyline,int p,int n,int currY){
		while(p<n){
			List<Integer> point = skyline.get(p);
			int x = point.get(0);
			int y = point.get(1);
			p++;

			if(currY!=y){
				updateOutput(output,x,y);
				currY = y;
			}
		}
	}
}
