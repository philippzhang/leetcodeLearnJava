package com.learn.java.leetcode.lc0125;

public class Solution {
	public boolean isPalindrome(String s) {
		if(s.length()==0){
			return true;
		}

		int i = 0,j=s.length()-1;
		while(i<j){
			char c = s.charAt(i);
			while(i<j&&(!Character.isLetter(c)&&!Character.isDigit(c))){
				c = s.charAt(++i);
			}
			if(i>=j){
				return true;
			}

			char d = s.charAt(j);
			while(i<j&&(!Character.isLetter(d)&&!Character.isDigit(d))){
				d = s.charAt(--j);
			}

			if(c>='A'&&c<='Z'){
				c = Character.toLowerCase(c);
			}
			if(d>='A'&&d<='Z'){
				d = Character.toLowerCase(d);
			}
			if(c!=d){
				return false;
			}
			i++;
			j--;
		}

		return true;
	}
}
