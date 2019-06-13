package com.learn.java.leetcode.lc0168;

public class Solution {
	public String convertToTitle(int n) {
		if(n<=0){
			return "";
		}
		if(n>0&&n<=26){
			return String.valueOf((char)('A'+(n-1)));
		}
		StringBuffer ret = new StringBuffer();
		for(int i = n;i>0;i/=26){
			int mod = i%26;
			if(mod==0){
				mod = 26;
			}
			ret.insert(0,String.valueOf((char)('A'+(mod-1))));
			i-=mod;
		}

		return ret.toString();
	}
}
