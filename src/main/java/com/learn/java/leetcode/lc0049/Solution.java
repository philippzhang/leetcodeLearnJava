package com.learn.java.leetcode.lc0049;



import java.util.*;

public class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> results = new ArrayList<>();
		Map<String,List<String>> map = new HashMap<>();
		for(int i =0;i<strs.length;i++){
			String v = strs[i];
			String[] arr = v.split("");
			Arrays.sort(arr);
			String key = Arrays.toString(arr);
			if(!map.containsKey(key)){
				map.put(key,new ArrayList<>());
			}
			map.get(key).add(v);
		}
		for(Map.Entry<String,List<String>> entry: map.entrySet()){
			results.add(entry.getValue());
		}

		return results;
	}
}
