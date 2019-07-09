package com.learn.java.leetcode.lc0202;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public boolean isHappy(int n) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(n);
		while(true){
			n = compute(n);
			if(n==1){
				return true;
			}
			if(list.contains(n)){
				return false;
			}
			list.add(n);
		}
	}

	private int compute(int n){
		int result = 0;
		if(n==0){
			return 0;
		}
		while(n>0){
			int temp = (n%10);
			result += temp*temp;
			n /=10;
		}
		return result;
	}
}
