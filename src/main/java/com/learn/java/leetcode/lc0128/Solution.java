package com.learn.java.leetcode.lc0128;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int longestConsecutive(int[] nums) {
		Set set = new HashSet();
		for(int s:nums){
			set.add(s);
		}
		int ret = 0;
		for(int s:nums){
			if(set.remove(s)){
				int current = s;
				int temp = 1;
				while(set.remove(current-1)){
					current--;
				}
				temp += (s-current);

				current = s;

				while(set.remove(current+1)){
					current++;
				}

				temp += (current-s);

				ret = Math.max(ret,temp);

			}
		}
		return ret;
	}
}
