package com.learn.java.leetcode.lc0401;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> readBinaryWatch(int num) {
		List<String> results = new ArrayList<>();
		for(int i = 0;i<12;i++){
			for(int j =0;j<60;j++){
				if(Integer.bitCount((i<<6|j))==num){
					results.add(i+":"+(j>9?"":"0")+j);
				}
			}
		}
		return results;
	}
}
