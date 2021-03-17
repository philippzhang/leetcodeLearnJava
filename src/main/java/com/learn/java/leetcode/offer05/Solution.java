package com.learn.java.leetcode.offer05;

public class Solution {
	public String replaceSpace(String s) {
		if(s==null){
			return s;
		}
		char[] ch = new char[s.length()*3];
		int size = 0;
		for(char c:s.toCharArray()){
			if(c==' '){
				ch[size++] ='%';
				ch[size++] ='2';
				ch[size++] ='0';
			}else{
				ch[size++] =c;
			}
		}
		return new String(ch,0,size);
	}
}
