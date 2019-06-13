package com.learn.java.leetcode.lc0171;

public class Solution {
	public int titleToNumber(String s) {
		if(s==null||s.length()==0){
			return 0;
		}
		int ret = 0;
		for(int i = 0;i<s.length();i++){
			ret = 26*ret + (s.charAt(i)-'A'+1);
		}

		return ret;
	}
}
