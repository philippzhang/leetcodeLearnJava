package com.learn.java.leetcode.lc0119;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/**
	 * 获取杨辉三角的指定行
	 * 直接使用组合公式C(n,i) = n!/(i!*(n-i)!)
	 * 则第(i+1)项是第i项的倍数=(n-i)/(i+1);
	 */
	public List<Integer> getRow(int rowIndex) {
		List<Integer> res = new ArrayList<>(rowIndex + 1);
		long cur = 1;
		for (int i = 0; i <= rowIndex; i++) {
			res.add((int) cur);
			cur = cur * (rowIndex-i)/(i+1);
		}
		return res;
	}


	public List<Integer> getRow2(int rowIndex) {
		List<Integer> results = new ArrayList<>();

		if(rowIndex<0){
			return results;
		}

		for(int i =1;i<=rowIndex+1;i++){
			List<Integer> rowList = new ArrayList<>();
			if(i == 1 ){
				rowList.add(1);
			}else{
				for(int j=0;j<i;j++){
					int r = 0;
					if(j==0||j==i-1){
						r = 1;
					}else {
						r = results.get(j-1)+results.get(j);
					}
					rowList.add(r);
				}
			}

			results = rowList;

		}
		return results;
	}
}
