package com.learn.java.leetcode.lc0306;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	boolean flag = false;

	public boolean isAdditiveNumber(String num) {
		if(num.length()<=2){
			return false;
		}
		dfs(num,0,new ArrayList<>());

		return flag;
	}

	private void dfs(String num,int i ,List<Long> results){
		int n = results.size(),len = num.length(),tlen = -1;
		long value = -1;
		if(i==len&&n>2){
			flag = true;
			return;
		}
		if(n>=2){
			value = results.get(n-1)+results.get(n-2);
			tlen = String.valueOf(value).length();
		}

		for(int j = i+1;((n>=2&&(j=i+tlen)<=len)||(j<=i+(len-i)/2&&j<=len))&&!flag;j++){
			if(num.charAt(i)=='0'&&j!=i+1){
				//累加序列里的数不会以 0 开头
				break;
			}
			if(n==0||n==1||value==Long.valueOf(num.substring(i,j))){
				results.add(Long.valueOf(num.substring(i,j)));
				dfs(num,j,results);
			}
			if(j==i+tlen){
				break;
			}
		}

		if(!results.isEmpty()){
			results.remove(results.size()-1);
		}
	}

}
