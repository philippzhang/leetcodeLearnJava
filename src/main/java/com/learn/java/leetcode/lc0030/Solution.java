package com.learn.java.leetcode.lc0030;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<Integer> findSubstring2(String s, String[] words) {
		List<Integer> results = new ArrayList<>();
		if(s==null||s.length()==0||words==null||words.length==0){
			return results;
		}
		//记录数组中每个单元出现的个数
		Map<String,Integer> counts = new HashMap<>();
		for(String word:words){
			counts.put(word,counts.getOrDefault(word,0)+1);
		}

		int n =s.length(),num=words.length,len=words[0].length();
		//i是迭代字符串的起始位置，当i>=n-num*len+1的时候  所剩字符已小于要求的字符串 长度，结束
		Map<String,Integer> map = new HashMap<>();
		for(int i =0;i<n-num*len+1;i++){
			map.clear();
			int j=0;
			while(j<num){
				//每次找的是从i开始，长度为len的一个字符串,由于单词的长度是相同的
				String w = s.substring(i+j*len,i+(j+1)*len);
				if(counts.containsKey(w)){
					//将迭代到的字符串及个数放入Map中，与要求的count进行对比
					map.put(w,map.getOrDefault(w,0)+1);
					if(map.get(w)>counts.get(w)){
						break;
					}
				}else{
					break;
				}
				j++;
			}
			if(j==num){
				results.add(i);
			}

		}

		return results;
	}

	/**
	 * 使用在 s 上的滑动窗口来匹配 words 数组，双指针 left，right 分别表示窗口的开始和结束。
	 * 指针移动的单位长度为 words 数组中单词的长度，假设为 len。
	 * 每次取 s 上 right 到 right+len 的一个新单词加入窗口。
	 * 假设这个单词不在 words 数组中（借助 HashMap 判断），说明这个窗口不合格，就将 right 置为 right+len，left 置为 right，继续找。
	 * 假设这个单词在 words 数组中，但在窗口中的出现次数大于在 words 数组中的出现次数，说明这个窗口还是不合格，需要不断的将 left 加上 len，即不断的删除窗口最左边的单词，直到这个单词在窗口中的出现次数与在 words 数组中的出现次数相等为止。
	 * 否则就表示当前窗口的所有单词都在 words 数组中，窗口没有任何问题，right 加上 len 继续向右取新的单词。
	 * 当窗口长度 right-left 正好为 words 数组中所有单词的长度和时，就表示匹配成功，将 left 加入结果集。
	 *
	 * @param s
	 * @param words
	 * @return
	 */
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> results = new ArrayList<>();
		if (s == null || s.length() == 0 || words == null || words.length == 0) {
			return results;
		}
		//记录数组中每个单元出现的个数
		Map<String,Integer> counts = new HashMap<>();
		for(String word:words){
			counts.put(word,counts.getOrDefault(word,0)+1);
		}
		int n =s.length(),num=words.length,len=words[0].length();
		Map<String,Integer> map = new HashMap<>();
		for(int i = 0;i<len;i++){
			map.clear();
			int left = i;
			int right = i;
			while(right<=n-len&&left<=n-len*num){
				String subRight = s.substring(right,right+len);
				if(!counts.containsKey(subRight)){
					map.clear();
					right += len;
					left = right;
					continue;
				}
				// 将刚进入窗口并在 words 中的单词加入窗口 Hash 表
				map.put(subRight,map.getOrDefault(subRight,0)+1);
				// 当该单词在窗口中的出现次数多于在 words 中的出现次数时，不断删除窗口中最左边单词，直到次数相等
				while(map.get(subRight)>counts.get(subRight)){
					String subLeft = s.substring(left,left+len);
					int l = map.get(subLeft);
					if(l==1){
						map.remove(subLeft);
					}else{
						map.put(subLeft,l-1);
					}
					left +=len;
				}
				right+=len;
				// 当窗口长度正好等于 words 总长度时，表示匹配成功，加入结果中
				if(right-left==len*num){
					results.add(left);
				}
			}
		}
		return results;

	}


}
