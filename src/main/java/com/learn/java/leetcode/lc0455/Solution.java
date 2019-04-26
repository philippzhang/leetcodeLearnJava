package com.learn.java.leetcode.lc0455;

import java.util.Arrays;

public class Solution {
	public int findContentChildren(int[] g, int[] s) {
		if(g==null||s==null||g.length==0||s.length==0){
			return 0;
		}
		Arrays.sort(g);
		Arrays.sort(s);
		int i = 0;
		int j = 0;
		while(i<g.length&&j<s.length){
			if(g[i]<=s[j]){
				i++;
			}
			j++;
		}
		return i;
	}
}
