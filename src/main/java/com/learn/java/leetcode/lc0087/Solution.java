package com.learn.java.leetcode.lc0087;

public class Solution {
	public boolean isScramble(String s1, String s2) {
		if(s1.length()==0&&s2.length()==0){
			return true;
		}
		if(s1.length()!=s2.length()){
			return false;
		}
		return dfs(s1.toCharArray(),s2.toCharArray(),0,0,s1.length());

	}
	private boolean dfs(char[] chars1,char[] chars2,int start1,int start2,int len){
		if(len==1){
			return chars1[start1]==chars2[start2];
		}

		if(!equlas(chars1,chars2,start1,start2,len)){
			return false;
		}
		for(int i = 1;i<len;i++){
			//对应情况 1 ，判断 S1 的子树能否变为 S2 相应部分
			if(dfs(chars1,chars2,start1,start2,i)&&dfs(chars1,chars2,start1+i, start2+i, len-i)){
				return true;
			}
			//对应情况 2 ，S1 两个子树先进行了交换，然后判断 S1 的子树能否变为 S2 相应部分
			if (dfs(chars1, chars2, start1, start2+len-i, i) && dfs(chars1, chars2, start1+i, start2, len-i)) {
				return true;
			}
		}
		return false;

	}

	private boolean equlas(char[] chars1,char[] chars2,int start1,int start2,int len){
		int[] charArr = new int[26];
		for(int i = 0;i<len;i++){
			charArr[chars1[start1+i]-'a']++;
			charArr[chars2[start2+i]-'a']--;
		}
		for(int item:charArr){
			if(item!=0){
				return false;
			}
		}
		return true;
	}
}
