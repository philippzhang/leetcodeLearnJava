package com.learn.java.leetcode.lc0093;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> restoreIpAddresses(String s) {
		List<String> results = new ArrayList<>();
		if(s==null||s.length()==0){
			return results;
		}
		restore(s,results,0,"");
		return results;
	}

	private void restore(String s,List<String> results,int k,String ret){
		if(s.isEmpty()||k==4){
			if (s.isEmpty() && k == 4) {
				results.add(ret.substring(1));
			}
			return ;
		}
		for(int i = 1;i<=(s.charAt(0)=='0'?1:3)&&i<=s.length();i++){
			String temp = s.substring(0,i);
			if(Integer.parseInt(temp)<=255){
				restore(s.substring(i),results,k+1,ret+"."+temp);
			}
		}
	}
}
