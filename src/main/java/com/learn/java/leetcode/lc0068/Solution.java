package com.learn.java.leetcode.lc0068;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

		// 总体思路： 假设当前单词间只有一个空格，来获得当前这一行的最多单词数

		public List<String> fullJustify(String[] words, int maxWidth) {
			List<String> ret = new ArrayList<>();

			int index = 0;
			while(index < words.length){
				int cur = index, len = 0;
				// len + words[cur].length() + cur - index 为单词之间取 一个空格的长度
				while(cur < words.length && len + words[cur].length() + cur - index <= maxWidth){
					// 计算纯单词长度
					len = len + words[cur++].length();
				}
				cur--;
				// System.out.println(cur + " " + len);
				StringBuilder sb = new StringBuilder();
				// 区分最后一行
				if(cur == words.length - 1){
					for(int i = index; i <= cur; i++){
						sb.append(words[i]);
						if(i < cur){
							sb.append(' ');
						}
					}
				}else{
					int base = cur > index ? (maxWidth - len) / (cur - index) : (maxWidth - len);
					String baseStr = genSpace(base);
					int left = cur > index ? (maxWidth - len) % (cur - index) : 0;
					String leftStr = genSpace(base + 1);
					for(int i = index; i <= cur; i++){
						sb.append(words[i]);
						if(i < cur){
							sb.append(left > 0 ? leftStr : baseStr);
							left--;
						}
					}
				}
				if(sb.length() < maxWidth){
					sb.append(genSpace(maxWidth - sb.length()));
				}
				ret.add(sb.toString());
				index = cur + 1;
			}
			return ret;
		}

		private String genSpace(int n){
			char[] cs = new char[n];
			Arrays.fill(cs, ' ');
			return new String(cs);
		}

}
