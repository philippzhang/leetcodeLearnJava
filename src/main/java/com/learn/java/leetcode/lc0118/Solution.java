package com.learn.java.leetcode.lc0118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> results = new ArrayList<>();
		if(numRows<=0){
			return results;
		}
		List<Integer> temp = null;
		for(int i =1;i<=numRows;i++){
			List<Integer> rowList = new ArrayList<>();
			if(i == 1 ){
				rowList.add(1);
			}else{
				for(int j=0;j<i;j++){
					int r = 0;
					if(j==0||j==i-1){
						r = 1;
					}else {
						r = temp.get(j-1)+temp.get(j);
					}
					rowList.add(r);
				}
			}

			results.add(rowList);
			temp = rowList;

		}
		return results;
	}
}
