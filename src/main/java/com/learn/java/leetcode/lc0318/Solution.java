package com.learn.java.leetcode.lc0318;

public class Solution {
	public int maxProduct(String[] words) {
		int length = words.length;
		int[] arr = new int[length];
		for(int i =0;i<length;i++){
			String word = words[i];
			for(int j = 0;j<words[i].length();j++){
				arr[i]|=1<<(word.charAt(j)-'a');
			}
		}
		int result = 0;
		for(int i =0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if((arr[i]&arr[j])==0){
					result = Math.max(result,words[i].length()*words[j].length());
				}
			}
		}
		return result;
	}
}
