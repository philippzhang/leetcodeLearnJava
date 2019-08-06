package com.learn.java.leetcode.lc0241;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	/**
	 * 分治法
	 * @param input
	 * @return
	 */
	public List<Integer> diffWaysToCompute(String input) {
		return partition(input);
	}

	private List<Integer> partition(String input){
		List<Integer> results = new ArrayList<>();
		if(!input.contains("+")&&!input.contains("-")&&!input.contains("*")){
			results.add(Integer.valueOf(input));
			return results;
		}
		for(int i = 0;i<input.length();i++){
			if(input.charAt(i)=='+'||input.charAt(i)=='-'||input.charAt(i)=='*'){
				for(Integer left:partition(input.substring(0,i))){
					for(Integer right:partition(input.substring(i+1))){
						if(input.charAt(i)=='+'){
							results.add(left+right);
						}else if(input.charAt(i)=='-'){
							results.add(left-right);
						}else if(input.charAt(i)=='*'){
							results.add(left*right);
						}
					}
				}
			}
		}
		return results;
	}
}
