package com.learn.java.leetcode.lc0013;

public class Solution {
	public int romanToInt(String s) {
		int result = 0;
		if(s==null||s.length()==0){
			return 0;
		}
		int i = 0;
		for(;i<s.length();i++){
			char c = s.charAt(i);
			char cc = i+1<=s.length()-1?s.charAt(i+1):'-';
			switch (c){
				case 'M': result +=1000; break;
				case 'D': result +=500; break;
				case 'C': {
					if(cc=='D'){
						result += 400;
						i++;
					}else if(cc=='M'){
						result += 900;
						i++;
					}else {
						result += 100;
					}
					break;
				}
				case 'L': result +=50; break;
				case 'X': {
					if(cc=='L'){
						result += 40;
						i++;
					}else if(cc=='C'){
						result += 90;
						i++;
					}else {
						result += 10;
					}
					break;
				}
				case 'V': result +=5; break;
				case 'I': {
					if(cc=='V'){
						result += 4;
						i++;
					}else if(cc=='X'){
						result += 9;
						i++;
					}else {
						result += 1;
					}
					break;
				}
			}
		}
		return result;
	}
}
