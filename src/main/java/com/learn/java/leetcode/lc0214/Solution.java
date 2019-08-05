package com.learn.java.leetcode.lc0214;


public class Solution {

	/**
	 * 暴力法
	 * @param s
	 * @return
	 */
	public String shortestPalindrome2(String s) {
		StringBuilder r = new StringBuilder(s).reverse();
		int n = s.length();
		for (int i = 0; i < n; i++) {
			if (s.substring(0, n - i).equals( r.substring(i))) {
				return r.substring(0, i) + s;
			}
		}
		return "";
	}


	/**
	 * KMP
	 * @param s
	 * @return
	 */
	public String shortestPalindrome(String s) {
		StringBuilder r = new StringBuilder(s).reverse();
		String str = s + "#" + r;
		int[] next = next(str);
		String prefix = r.substring(0,r.length()-next[str.length()]);
		return prefix + s;
	}

	private static int[] next(String p){
		int[] next = new int[p.length()+1];
		next[0] = -1;
		int k = -1;
		int i = 1;
		while(i<next.length){
			if(k==-1||p.charAt(k)==p.charAt(i-1)){
				next[i++]  = ++k;
			}else{
				k = next[k];
			}
		}
		return next;
	}

}
