package com.learn.java.leetcode.lc0621;

import java.util.Arrays;

/**
 * 621. Task Scheduler 621. 任务调度器 Medium
 */
public class Solution {
	public int leastInterval(char[] tasks, int n) {
		int[] counts = new int[26];
		for(char c:tasks){
			counts[c-'A']++;
		}
		//排序
		Arrays.sort(counts);
		//最大值的个数
		int maxCount = 0;
		for(int i = 25;i>=0;i--){
			if(counts[i]<counts[25]){
					break;
			}
			maxCount++;
		}
		//公式:(count - 1) * (n + 1) + maxCount
		return Math.max((counts[25]-1)*(n+1)+maxCount,tasks.length);

	}
}
