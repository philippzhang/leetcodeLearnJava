package com.learn.java.leetcode.lc0726;

import java.util.TreeMap;

public class Solution {
	public String countOfAtoms(String formula) {
		if(!formula.contains("(")){
			TreeMap<String,Integer> map = new TreeMap<>();
			String atom = "";
			int len = 0;
			char[] chars = formula.toCharArray();
			atom = String.valueOf(chars[0]);
			for(int i = 1;i<chars.length;i++){
				if(Character.isUpperCase(chars[i])){
					len = len==0?1:len;
					if(map.containsKey(atom)){
						map.put(atom,map.get(atom)+len);
					}else{
						map.put(atom,len);
					}
					len = 0;
					atom = String.valueOf(chars[i]);
					continue;
				}
				if(Character.isLowerCase(chars[i])){
					atom+=chars[i];
					continue;
				}

				len = len*10+Character.getNumericValue(chars[i]);
			}

			len = len ==0?1:len;
			if (map.containsKey(atom)) {
				map.put(atom, map.get(atom) + len);
			} else {
				map.put(atom, len);
			}

			StringBuffer stringBuffer = new StringBuffer();
			map.forEach((k,v)->{
				stringBuffer.append(k);
				if(v>1){
					stringBuffer.append(v);
				}
			});
			return stringBuffer.toString();
		}else{
			int end = formula.indexOf(")");
			int begin = formula.lastIndexOf("(",end);

			int len = 0;
			int cur = end+1;
			while(cur<formula.length()&&Character.isDigit(formula.charAt(cur))){
				len = len*10 + Character.getNumericValue(formula.charAt(cur));
				cur++;
			}
			len = len==0?1:len;
			String ff = flat(formula.substring(begin+1,end),len);

			formula = formula.substring(0,begin) + ff + formula.substring(cur);
			return countOfAtoms(formula);
		}
	}

	private String flat(String formula,int repeat){
		char[] chars = formula.toCharArray();
		int temp =0;
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(chars[0]);
		for(int i=1;i<chars.length;i++){
			if (Character.isUpperCase(chars[i])) {
				if (temp == 0) {
					stringBuffer.append(repeat);
				} else {
					stringBuffer.append(temp * repeat);
				}
				temp = 0;
			}

			if (Character.isLetter(chars[i])) {
				stringBuffer.append(chars[i]);
				continue;
			}

			temp = temp * 10 + Character.getNumericValue(chars[i]);
		}

		if (temp == 0) {
			stringBuffer.append(repeat);
		} else {
			stringBuffer.append(repeat * temp);
		}

		return stringBuffer.toString();

	}
}
