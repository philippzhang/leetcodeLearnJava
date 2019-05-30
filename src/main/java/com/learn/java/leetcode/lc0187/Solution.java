package com.learn.java.leetcode.lc0187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<String> findRepeatedDnaSequences(String s) {
		Map<String,Integer> map = new HashMap<>();
		List<String> results = new ArrayList<>();
		if(s==null||s.length()<=10){
			return results;
		}
		for(int i=0;i<=s.length()-10;i++){
			String word = s.substring(i,i+10);
			if(map.containsKey(word)){
				map.put(word,map.get(word)+1);
			}else{
				map.put(word,1);
			}
		}

		for(Map.Entry<String,Integer> entry:map.entrySet()){
			if(entry.getValue()>1){
				results.add(entry.getKey());
			}
		}
		return results;
	}
	//2^20 所有长度为10的DNA序列

	private byte[] gHashMap = new byte[1048576];

	private char[] DNA_CHAR = {'A','C','G','T'};
	private String changeInt2DNA(int DNA){
		StringBuffer stringBuffer = new StringBuffer();
		for(int i =0;i<10;i++){
			stringBuffer.append(DNA_CHAR[DNA&3]);
			DNA = DNA >>2;
		}
		return stringBuffer.toString();
	}

	public List<String> findRepeatedDnaSequences2(String s) {
		List<String> results = new ArrayList<>();
		if (s == null || s.length() <= 10) {
			return results;
		}
		int[] charMap = new int[128];
		charMap['A']= 0;
		charMap['C']= 1;
		charMap['G']= 2;
		charMap['T']= 3;
		int key = 0;
		//倒序
		for(int i =9;i>=0;i--){
			key = (key<<2) + charMap[s.charAt(i)];
		}
		gHashMap[key] ++;
		for(int i = 10;i<s.length();i++){
			key = key >>2;
			key = key|(charMap[s.charAt(i)]<<18);
			if(gHashMap[key]<=1) {
				gHashMap[key]++;
			}
		}
		for(int i = 0;i<1048576;i++){
			if(gHashMap[i]>1){
				results.add(changeInt2DNA(i));
			}
		}

		return results;

	}

}
