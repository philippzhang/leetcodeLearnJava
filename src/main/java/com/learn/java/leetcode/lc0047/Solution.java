package com.learn.java.leetcode.lc0047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return res;
		}
		Arrays.sort(nums);
		dfs(res, new ArrayList<>(), nums, new boolean[nums.length]);
		return res;
	}

	public void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] used) {
		if (temp.size() == nums.length) {
			//注意不能直接添加temp
			//以一个集合或数组初始化ArrayList al = new ArrayList(a);//a为集合或数组
			res.add(new ArrayList<>(temp));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (used[i]  || (i > 0 && !used[i - 1]  && nums[i - 1] == nums[i])){
				continue;
			}
			//if (!used[i]) {//记录某个下标的数是否被使用过
				temp.add(nums[i]);
				used[i] = true;
				dfs(res, temp, nums, used);
				temp.remove(temp.size() - 1); //移除最后一个
				used[i] = false;
			//}
		}
	}
}
