package com.learn.java.leetcode.lc0090;

import java.util.*;

public class Solution {

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return result;
		}
		Arrays.sort(nums);
		List<Integer> levelList = new ArrayList<>();
		result.add(new ArrayList<>(levelList));
		subsetsWithDupDFS(result, levelList, 0, nums);
		return result;


	}

	private void subsetsWithDupDFS(List<List<Integer>> result, List<Integer> levelList, int depth, int[] nums) {
		for (int i = depth; i < nums.length; i++) {
			if (i > depth && nums[i - 1] == nums[i]) {
				continue;
			}
			levelList.add(nums[i]);
			result.add(new ArrayList<>(levelList));
			subsetsWithDupDFS(result, levelList, i + 1, nums);
			levelList.remove(levelList.size() - 1);
		}

	}

	public List<List<Integer>> subsetsWithDup2(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> results = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		dfs(nums,results,temp,new boolean[nums.length],0);
		return results;
	}

	private void dfs(int[] nums,List<List<Integer>> results,List<Integer> temp,boolean[] book,int level){
		results.add(new ArrayList<Integer>(temp));
		for(int i =level;i<nums.length;i++){
			if(i!=0 && nums[i]==nums[i-1]&&!book[i-1]){
				continue;
			}
			book[i]=true;
			temp.add(nums[i]);
			dfs(nums,results,temp,book,i+1);
			book[i]=false;
			temp.remove(temp.size()-1);
		}
	}
}
