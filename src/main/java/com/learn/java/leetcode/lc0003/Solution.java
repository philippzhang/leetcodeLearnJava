package com.learn.java.leetcode.lc0003;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters 无重复字符的最长子串 Medium
 */
public class Solution {
	/**
	 * 滑动窗口
	 *
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
		if (s == null) {
			return 0;
		}
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int max = 0, i = 0, j = 0;
		while (i < n && j < n) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				max = Math.max(max, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
		}
		return max;
	}

	public int lengthOfLongestSubstring2(String s) {
		if (s == null) {
			return 0;
		}
		int n = s.length();
		int max = 0;
		//字符->出现位置+1
		Map<Character, Integer> map = new HashMap<>(8);
		for (int i = 0, j = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(i, map.get(s.charAt(j)));
			}
			max = Math.max(max, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return max;
	}

	public int lengthOfLongestSubstring3(String s) {
		//窗口头指针
		int begin = 0;
		int result = 0;
		StringBuffer word = new StringBuffer();
		int[] charMap = new int[128];
		for(int i =0;i<s.length();i++){
			char c = s.charAt(i);
			charMap[c]++;
			if(charMap[c]==1){
				//单词没有出现
				word.append(c);
				if(result<word.length()){
					result = word.length();
				}
			}else{
				//将重复的字符删去
				while(begin<i&&charMap[c]>1){
					charMap[s.charAt(begin)]--;
					begin++;
				}
				word.setLength(0);
				for(int j =begin;j<=i;j++){
					word.append(s.charAt(j));
				}
			}
		}
		return result;
	}
}