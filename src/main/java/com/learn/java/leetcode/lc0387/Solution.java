package com.learn.java.leetcode.lc0387;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int firstUniqChar(String s) {
		int[] charsNum = new int[26];
		Map<Integer,Integer> map = new HashMap<>();
		char[] chars = s.toCharArray();
		for(int i = 0;i<chars.length;i++){
			int index  = chars[i]-'a';
			charsNum[index]++;
			if(charsNum[index]==1){
				map.put(index,i);
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i =0;i<26;i++){
			if(charsNum[i]==1){
				min = Math.min(min,map.get(i));
			}
		}

		if(min ==Integer.MAX_VALUE){
			min = -1;
		}

		return min;

	}
}
