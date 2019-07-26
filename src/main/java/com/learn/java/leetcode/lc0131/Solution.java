package com.learn.java.leetcode.lc0131;

import java.util.ArrayList;

import java.util.List;

public class Solution {
	public List<List<String>> partition(String s) {
		List<List<String>> results = new ArrayList<>();
		List<String> path = new ArrayList<>();
		dfs(s,results,path,0);
		return results;
	}

	private void dfs(String s,List<List<String>> results,List<String> path,int index){
		if(index==s.length()){
			results.add(new ArrayList<>(path));
			return;
		}

		for(int i = index;i<s.length();i++){

			if(isPalindrome(s,index,i)){
				path.add(s.substring(index,i+1));
				dfs(s,results,path,i+1);
				path.remove(path.size()-1);
			}
		}
	}

	private boolean isPalindrome(String s,int start,int end){
		while(start<end){
			if(s.charAt(start)!=s.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
