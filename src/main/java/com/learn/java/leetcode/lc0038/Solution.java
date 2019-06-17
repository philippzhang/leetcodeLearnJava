package com.learn.java.leetcode.lc0038;

public class Solution {
	String[] str;
	public String countAndSay(int n) {
		//定义数组 用于存储每个字符串
		str=new String[40];
		str[0]="1";
		for(int i=1;i<n;i++)
			//从1位置开始遍历，i项内容可通过i-1项来获得
		{
			str[i]=getStr(str[i-1]);
		}
		return str[n-1];
	}
	//通过字符串获得下一次报数序列
	public String getStr(String str) {
		//i是循环遍历的计数器，n是字符串长度，
		// out是子字符串遍历的初始角标，
		// res是子字符串的长度，str2是最终新字符串
		int i=0,n=str.length(),out=0,res=0;
		String str2="";
		while(i<n) {
			char c = str.charAt(i);
			//用n-1>i剔除了单元素项 当前项等于后一项
			if(n-1>i&&c==str.charAt(i+1)) {
				//out记录子串起始位置
				if(res==0) {
					out=i;
				}
				i++;
				res++;
			}
			//当前项与后一项不同时  更新str2 并重置res和i
			else if(n-1>i&&res>0&&c!=str.charAt(i+1)) {
				str2+=(res+1)+""+c;
				i=out+res+1;
				res=0;
			}
			//单一元素或者遍历到了最后一位
			else{
				str2+=(res+1)+""+c;
				i++;
			}
		}
		return str2;
	}
}
