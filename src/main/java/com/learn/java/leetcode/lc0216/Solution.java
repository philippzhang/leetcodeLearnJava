package com.learn.java.leetcode.lc0216;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> levelList = new ArrayList<>();
		dfs(k, n, result, levelList, 0, 1, 0);
		return result;
	}

	private void dfs(int k, int n, List<List<Integer>> result, List<Integer> levelList, int sum, int level, int count) {
		for (int i = level; i <= 9; i++) {
			if (sum + i > n || count >= k) {
				continue;
			}
			if (levelList.contains(i)) {
				continue;
			}
			sum += i;
			count++;
			levelList.add(i);
			if (sum == n && count == k) {
				result.add(new ArrayList<>(levelList));
			}
			dfs(k, n, result, levelList, sum, i, count);
			sum -= i;
			count--;
			levelList.remove(levelList.size() - 1);
		}
	}
}
