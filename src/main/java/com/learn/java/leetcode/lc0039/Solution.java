package com.learn.java.leetcode.lc0039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> levelList = new ArrayList<>();
		Arrays.sort(candidates);
		dfs(candidates,target,result,levelList,0,0);
		return result;
	}

	private void dfs(int[] candidates, int target,List<List<Integer>> result,List<Integer> levelList,int sum,int level){
		for(int i =level;i<candidates.length;i++){
			if(sum+candidates[i]>target){
				continue;
			}
			sum+=candidates[i];
			levelList.add(candidates[i]);
			if(sum==target){
				result.add(new ArrayList<>(levelList));
			}
			dfs(candidates,target,result,levelList,sum,i);
			sum-=candidates[i];
			levelList.remove(levelList.size()-1);
		}
	}
}
