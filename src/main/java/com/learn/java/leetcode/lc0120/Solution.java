package com.learn.java.leetcode.lc0120;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	/**
	 * 从底往上遍历
	 * @param triangle
	 * @return
	 */
	public int minimumTotal(List<List<Integer>> triangle) {
		if(triangle==null||triangle.size()==0){
			return 0;
		}
		int length = triangle.size();
		List<List<Integer>> dp = new ArrayList<>();
		for(int i =0;i<length;i++){
			dp.add(new ArrayList<>());
			for(int j = 0;j<length;j++){
				dp.get(i).add(0);
			}
		}
		for (int i =0;i<dp.size();i++){
			dp.get(length-1).set(i,triangle.get(length-1).get(i));
		}

		for (int i = length-2;i>=0;i--){
			for(int j = 0;j<triangle.get(i).size();j++){
				dp.get(i).set(j,Math.min(dp.get(i+1).get(j),dp.get(i+1).get(j+1))+triangle.get(i).get(j));
			}
		}
		return dp.get(0).get(0);
	}
}
