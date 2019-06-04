package com.learn.java.leetcode.lc0028;

public class Solution {
	/**
	 * 采用KMP算法
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public int strStr(String haystack, String needle) {
		if(haystack!=null&&haystack.length()==0&&needle!=null&&needle.length()==0){
			return 0;
		}
		else if(needle==null||needle.length()==0){
			return 0;
		}else if(haystack==null||haystack.length()==0){
			return -1;
		}
		char[] model = needle.toCharArray();
		int[] next = getNextArrayNew(model);
		int i =0, j = 0;
		while(i<haystack.length()&&j<needle.length()){
			if(j==-1||haystack.charAt(i)==needle.charAt(j)){
				i++;
				j++;
			}else{
				j = next[j];
			}
		}
		if(j==needle.length()){
			return i - j;
		}else{
			return -1;
		}

	}

	private int[] getNextArrayNew(char[] model){
		int[] next = new int[model.length];
		next[0] = -1;
		int k = -1;
		int j = 0;
		while (j < model.length - 1)
		{
			//p[k]表示前缀，p[j]表示后缀
			if (k == -1 || model[j] == model[k])
			{
				++k;
				++j;
				next[j] = k;
			}
			else
			{
				k = next[k];
			}
		}
		return next;
	}

	/**
	 * next[0]=-1, next[1]=0。
	 * 在求解next[j]时，令k=next[j-1]，
	 * 比较T[j-1]与T[k]的值，
	 *
	 * a. 若T[j-1]等于T[k]，则next[j]=k+1。
	 * b. 若T[j-1]不等于T[k]，令k=next[k]，若k等于-1，则next[j]=0，否则跳至3。
	 * “部分匹配值”就是”前缀”和”后缀”的最长的共有元素的长度。以”ABCDABD”为例，
	 *  前缀：字符串除了最后一个字符的全部头部组合；
	 *  后缀：字符串处理第一个字符的全部头部组合
	 * －”A”的前缀和后缀都为空集，共有元素的长度为0；
	 * －”AB”的前缀为[A]，后缀为[B]，共有元素的长度为0；
	 * －”ABC”的前缀为[A, AB]，后缀为[BC, C]，共有元素的长度0；
	 * －”ABCD”的前缀为[A, AB, ABC]，后缀为[BCD, CD, D]，共有元素的长度为0；
	 * －”ABCDA”的前缀为[A, AB, ABC, ABCD]，后缀为[BCDA, CDA, DA, A]，共有元素为”A”，长度为1；
	 * －”ABCDAB”的前缀为[A, AB, ABC, ABCD, ABCDA]，后缀为[BCDAB, CDAB, DAB, AB, B]，共有元素为”AB”，长度为2；
	 * －”ABCDABD”的前缀为[A, AB, ABC, ABCD, ABCDA, ABCDAB]，后缀为[BCDABD, CDABD, DABD, ABD, BD, D]，共有元素的长度为0。
	 * @param model
	 * @return
	 */
	private int[] getNextArray(char[] model){
		int[] next = new int[model.length];
		next[0] = -1;
		int k;
		for (int i=1;i<model.length;i++){
			k = next[i-1];
			next[i] = 0;
			while(k!=-1){
				if (model[i-1] == model[k]){
					next[i] = k+1;
					break;
				}else{
					k = next[k];
				}
			}
		}
		return next;
	}
}
