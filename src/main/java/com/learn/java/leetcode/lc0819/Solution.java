package com.learn.java.leetcode.lc0819;

import java.util.*;

public class Solution {
	public String mostCommonWord(String paragraph, String[] banned) {
		if(paragraph==null||paragraph.length()==0){
			return "";
		}
		Map<String,Integer> counter = new HashMap<>();
		paragraph = paragraph.toLowerCase();
		paragraph = paragraph+" ";
		Set<String> bannedSet = new HashSet<>();
		for(String s:banned){
			bannedSet.add(s.toLowerCase());
		}
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0 ;i<paragraph.length();i++){
			char c= paragraph.charAt(i);
			//!?',;.
			if(c=='!'||c=='?'||c=='\''||c==','||c==','||c==';'||c=='.'||c==' '){
				String word = stringBuffer.toString();
				stringBuffer.setLength(0);
				if(word.length()>0&&!bannedSet.contains(word)){
					counter.put(word,counter.getOrDefault(word,0)+1);
				}
			}else{
				stringBuffer.append(c);
			}
		}

		int max = 0;
		String word = null;
		for(Map.Entry<String,Integer> entry:counter.entrySet()){
			if(entry.getValue()>max){
				max = entry.getValue();
				word = entry.getKey();
			}
		}
		return word;
	}
}
