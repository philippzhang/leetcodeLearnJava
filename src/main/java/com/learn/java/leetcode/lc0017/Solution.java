package com.learn.java.leetcode.lc0017;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {


	public List<String> letterCombinations(String digits) {
		List<String> results = new ArrayList<>();
		if(digits==null||digits.length()==0){
			return results;
		}
		Map<Character,String> digitCharMap = new HashMap<>();
		digitCharMap.put('2',"abc");
		digitCharMap.put('3',"def");
		digitCharMap.put('4',"ghi");
		digitCharMap.put('5',"jkl");
		digitCharMap.put('6',"mno");
		digitCharMap.put('7',"pqrs");
		digitCharMap.put('8',"tuv");
		digitCharMap.put('9',"wxyz");

		String[] cValueArr = new String[digits.length()];
		for(int i =0;i<digits.length();i++){
			char c = digits.charAt(i);
			String cValue = digitCharMap.get(c);
			cValueArr[i] = cValue;
		}

		arrangeList(results,cValueArr,0,"");

		return results;
	}

	private void arrangeList(List<String> results,String[] cValueArr,int i ,String temp){
		if(i<cValueArr.length-1){
			for(int j =0;j<cValueArr[i].length();j++){
				arrangeList(results,cValueArr,i+1,temp+cValueArr[i].charAt(j));
			}
			i++;
		}else{
			for(int j =0;j<cValueArr[i].length();j++){
				results.add(temp+cValueArr[i].charAt(j));
			}
		}
	}

}
