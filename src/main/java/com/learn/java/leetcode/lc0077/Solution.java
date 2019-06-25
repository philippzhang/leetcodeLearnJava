package com.learn.java.leetcode.lc0077;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	List<List<Integer>> results = new ArrayList<>();
	public List<List<Integer>> combine(int n, int k) {

		if(n<=0||n<k||k<=0){
			return results;
		}
		List<Integer> l = new ArrayList<>();
		generateCombine( n,  k, 1 , l);
		return results;
	}

	private void generateCombine(int n, int k,int start ,List<Integer> l){
		if(l.size()==k){
			results.add(new ArrayList<>(l));
			return;
		}
		//此时有(k-c.size())个空位需要填充，那么[i...n]中至少要有(k-c.size())个元素
		//则n-i>=(k-c.size())-1确保[i...n]中至少要有(k-c.size())个元素
		// --> i<=n-(k-c.size())+1
		for(int i = start;i<=n-(k-l.size())+1;i++){
			l.add(i);
			generateCombine(n,k,i+1,l);
			l.remove(l.size()-1);
		}
	}



}
