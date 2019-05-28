package com.learn.java.leetcode.lc0409;

public class Solution {
	public int longestPalindrome(String s) {
		if(s==null||s.length()==0){
			return 0;
		}
		int[] marks = new int[128];
		for(int i =0;i<128;i++){
			marks[0] = 0;
		}
		for(int i =0;i<s.length();i++){
			marks[s.charAt(i)]++;
		}

		int result = 0;
		boolean flag = false;
		for(int i =0;i<128;i++){
			if(marks[i]%2==0){
				result+=marks[i];
			}else{
				result+=(marks[i]-1);
				flag = true;
			}
		}

		if(flag){
			result++;
		}

		return result;

	}
}
