package com.learn.java.leetcode.lc0438;

import java.util.*;

public class Solution {
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> results = new ArrayList<>();

		int[] table = new int[26];
		char[] chars = s.toCharArray();
		char[] charp = p.toCharArray();
		for(char c:charp){
			table[c-'a']+=1;
		}
		for(int i =0 ; i<=chars.length-p.length();i++) {
			int[] tmptable = new int[26];
			int tmp = i;
			for (int j = i; j < i + p.length(); j++) {
				tmptable[chars[j] - 'a'] += 1;
			}
			if (Arrays.equals(table, tmptable)) {
				results.add(tmp);
			}
		}

		return results;
	}
}
