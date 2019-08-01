package com.learn.java.leetcode.lc0205;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length()){
			return false;
		}
		Map<Character,Integer> maps = new HashMap<>();
		Map<Character,Integer> mapt = new HashMap<>();
		char[] chars = s.toCharArray();
		char[] chart = t.toCharArray();
		for(int i =0;i<chars.length;i++){
			char cs = chars[i];
			char ct = chart[i];
			if(maps.containsKey(cs)){
				int j = maps.get(cs);
				if(ct!=chart[j]){
					return false;
				}
			}else{
				if(mapt.containsKey(ct)){
					return false;
				}
			}

			maps.put(cs,i);
			mapt.put(ct,i);

		}

		return true;
	}

	public boolean isIsomorphic2(String s, String t) {
		Map<Character,Character> map = new HashMap<>();
		if(s.length()!=t.length()) {
			return false;
		}

		for(int i = 0;i<s.length();i++){
			char ss = s.charAt(i);
			char tt = t.charAt(i);
			if(map.containsKey(ss)){
				if(map.get(ss)!=tt) {
					return false;
				}
			}else{
				if(map.containsValue(tt)) {
					return false;
				}
				map.put(ss,tt);
			}

		}
		return true;
	}

}
