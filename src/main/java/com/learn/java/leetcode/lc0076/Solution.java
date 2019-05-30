package com.learn.java.leetcode.lc0076;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private boolean isWindowOK(int[] mapS,int[] mapT,List<Integer> listT){
		for(int i =0;i<listT.size();i++){
			if(mapS[listT.get(i)]<mapT[listT.get(i)]){
				return false;
			}
		}
		return true;
	}
	public String minWindow(String s, String t) {
		int MAX_ARRAY_LEN = 128;
		int[] mapS = new int[MAX_ARRAY_LEN];
		int[] mapT = new int[MAX_ARRAY_LEN];

		for(int i =0;i<t.length();i++){
			mapT[t.charAt(i)]++;
		}
		//记录那些字符出现
		List<Integer> listT = new ArrayList<>();
		for(int i =0;i<MAX_ARRAY_LEN;i++){
			if(mapT[i]>0){
				listT.add(i);
			}
		}
		//窗口起始位置
		int begin = 0;
		String result = "";
		for(int i =0;i<s.length();i++){
			mapS[s.charAt(i)]++;
			while(begin<i){
				char beginCh = s.charAt(begin);
				if(mapT[beginCh]==0){
					//头指针指向的字符没有出现
					begin++;
				}else if(mapS[beginCh]>mapT[beginCh]){
					//头指针前移，它指向的字符-1
					mapS[beginCh]--;
					begin++;
				}else{
					break;
				}
			}
			if(isWindowOK(mapS,mapT,listT)){
				int newWindowLen = i - begin+1;
				if(newWindowLen>0&&(result==null|result.length()==0||result.length()>newWindowLen)){
					result = s.substring(begin,begin+newWindowLen);
				}
			}
		}

		return result;

	}
}
