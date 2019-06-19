package com.learn.java.leetcode.lc0067;

public class Solution {
	public String addBinary(String a, String b) {
		if(a==null||a.length()==0){
			return b;
		}
		if(b==null||b.length()==0){
			return a;
		}
		int i = a.length()-1;
		int j = b.length()-1;
		int ans = 0;
		StringBuffer sb = new StringBuffer();
		while(i>=0||j>=0){
			int ia = i>=0?(a.charAt(i)-'0'):0;
			int ib = j>=0?(b.charAt(j)-'0'):0;
			int v = ia+ib + ans;
			ans = v/2;
			v = v%2;
			sb.append(v);
			i--;
			j--;
		}
		if(ans>0){
			sb.append(ans);
		}

		return sb.reverse().toString();

	}
}
