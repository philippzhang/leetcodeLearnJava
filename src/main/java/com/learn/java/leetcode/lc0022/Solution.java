package com.learn.java.leetcode.lc0022;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		generate("",n,n,result);
		return result;
	}

	private void generate(String item,int left,int right,List<String> result){
		if(left==0&&right==0){
			result.add(item);
			return;
		}
		if(left>0){
			generate(item+"(",left-1,right,result);
		}
		if(left<right){
			generate(item+")",left,right-1,result);
		}
	}
}
