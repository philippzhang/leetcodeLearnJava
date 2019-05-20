package com.learn.java.leetcode.lc0880;


public class Solution {
	public String decodeAtIndex(String S, int K) {
		int N = S.length();
		long size = 0;
		for(int i=0;i<N;i++){
			char s = S.charAt(i);
			if(Character.isLetter(s)){
				size++;
			}else{
				size*=(s-'0');
			}
		}
		for(int i = N-1;i>=0;i--){
			char s = S.charAt(i);
			K %=size;
			if(K==0&&Character.isLetter(s)){
				return String.valueOf(s);
			}

			if(Character.isLetter(s)){
				size--;
			}else{
				size/=(s-'0');
			}
		}

		return null;
 	}

}
