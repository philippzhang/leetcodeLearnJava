package com.learn.java.leetcode.lc0140;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	private Map<String,List<String>> map = new HashMap<>();
	public List<String> wordBreak(String s, List<String> wordDict) {
		if(map.containsKey(s)){
			return map.get(s);
		}
		List<String> list = new ArrayList<>();
		if(s.length()==0){
			list.add("");
			return list;
		}
		for(String word:wordDict){
			if(s.startsWith(word)){
				List<String> tempList = wordBreak(s.substring(word.length()),wordDict);
				for(String temp:tempList){
					list.add(word+(temp.equals("")?"":" ")+temp);
				}
			}
		}
		map.put(s,list);
		return list;
	}
}
