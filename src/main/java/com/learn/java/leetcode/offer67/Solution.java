package com.learn.java.leetcode.offer67;

public class Solution {
	public int strToInt(String str) {
		int res = 0, bndry = Integer.MAX_VALUE / 10;
		int i = 0, sign = 1, length = str.length();
		if(length == 0) {
			return 0;
		}
		while(str.charAt(i) == ' ') {
			if(++i == length) {
				return 0;
			}
		}
		if(str.charAt(i) == '-') {
			sign = -1;
		}
		if(str.charAt(i) == '-' || str.charAt(i) == '+') {
			i++;
		}
		for(int j = i; j < length; j++) {
			if(str.charAt(j) < '0' || str.charAt(j) > '9') {
				break;
			}
			if(res > bndry || res == bndry && str.charAt(j) > '7') {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			res = res * 10 + (str.charAt(j) - '0');
		}
		return sign * res;
	}

	public int strToInt2(String str) {
		long ans = 0;
		if(str==null||str.length()==0){
			return 0;
		}
		char[] chars = str.toCharArray();
		boolean f1 = false;
		boolean f2 = false;
		boolean f3 = false;
		boolean flag = false;//true为负
		for(int i = 0;i<chars.length;i++){
			if(chars[i]==' '){
				if(!f1) {
					continue;
				}else{
					if(f3){
						break;
					}else{
						return 0;
					}
				}
			}else {
				f1 = true;
				if(chars[i]=='+'||chars[i]=='-'){
					if(!f2&&chars[i]=='-'){
						flag = true;
					}
					if(f2){
						if(f3){
							break;
						}else{
							return 0;
						}
					}

				}else{
					if(chars[i]<'0'||chars[i]>'9'){
						if(f3){
							break;
						}else{
							return 0;
						}
					}else{
						int k = chars[i]-'0';
						ans = ans*10+k;
						int temp = judge(ans,flag);
						if(temp!=-1){
							return temp;
						}
						f3 = true;
					}
				}
				f2 = true;
			}
		}
		if(flag){
			ans = -ans;
		}
		if(ans>Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}
		if(ans<Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		return (int)ans;
	}
	private int judge(long ans,boolean flag){
		if(!flag&&ans>=Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}else if(flag&&ans>Integer.MAX_VALUE){
			return Integer.MIN_VALUE;
		}
		return -1;
	}
}
