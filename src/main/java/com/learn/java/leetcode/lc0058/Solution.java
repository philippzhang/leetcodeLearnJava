package com.learn.java.leetcode.lc0058;

public class Solution {
	public int lengthOfLastWord(String s) {
		if(s==null||s.length()<=0){
			return 0;
		}

		//遇到字符时赋值为true
		boolean flag = false;
		int ans = 0;
		for(int i = s.length()-1;i>=0;i--){
			if(s.charAt(i)!=' '){
				ans++;
				flag = true;
			}else{
				if(flag){
					break;
				}
			}
		}
		return ans;

	}
}
