package com.learn.java.leetcode.lc0395;

public class Solution {
	public int longestSubstring(String s, int k) {
		int len = s.length();
		if(len==0||k>len){
			return 0;
		}
		if(k<2){
			return len;
		}

		return count(s.toCharArray(),k,0,len-1);
	}

	private int count(char[] chars,int k,int start,int end){
		if(end-start+1<k){
			return 0;
		}
		int[] times = new int[26];
		for(int i = start;i<=end;i++){
			times[chars[i]-'a']++;
		}
		//双指针移动
		while(end-start+1>=k&&times[chars[start]-'a']<k){
			start++;
		}

		while(end-start+1>=k&&times[chars[end]-'a']<k){
			end--;
		}

		if(end-start+1<k){
			return 0;
		}
		for(int i = start;i<=end;i++){
			if(times[chars[i]-'a']<k){
				return Math.max(count(chars,k,start,i-1),count(chars,k,i+1,end));
			}
		}
		return end-start+1;
	}
}
