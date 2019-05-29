package com.learn.java.leetcode.lc0290;



import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean wordPattern(String pattern, String str) {
		Map<Character,Integer> used = new HashMap<>();
		Map<String,Character> wordMap = new HashMap<>();
		StringBuffer stringBuffer = new StringBuffer();
		int pos=0;
		str = str+' ';
		for(int i = 0;i<str.length();i++){
			char c = str.charAt(i);
			if(c==' '){
				//遇到空格拆分单词
				if(pos==pattern.length()){
					//已无pattern
					return false;
				}
				String word = stringBuffer.toString() ;
				char p = pattern.charAt(pos);
				if(!wordMap.containsKey(word)){
					if(used.containsKey(p)){
						return false;
					}
					wordMap.put(word,p);
					used.put(p,1);
				}else{
					if(wordMap.get(word)!=p){
						return false;
					}
				}
				//清空
				stringBuffer.setLength(0);
				pos++;
			}else{
				stringBuffer.append(c);
			}
		}
		if(pos!=pattern.length()){
			return false;
		}
		return true;
	}

}
