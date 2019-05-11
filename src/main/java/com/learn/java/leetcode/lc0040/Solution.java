package com.learn.java.leetcode.lc0040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		if (candidates == null || candidates.length == 0) {
			return result;
		}
		Arrays.sort(candidates);
		List<Integer> levelList = new ArrayList<>();
		dfs(candidates,  target,result,levelList, 0, 0);
		return result;
	}

	private void dfs(int[] candidates, int target,List<List<Integer>> result,List<Integer> levelList,int sum,int level){
		for(int i = level;i<candidates.length;i++){
			if(i>level&&candidates[i]==candidates[i-1]){
				continue;
			}
			if(sum+candidates[i]>target){
				continue;
			}

			sum+=candidates[i];

			levelList.add(candidates[i]);
			if(sum==target){
				result.add(new ArrayList(levelList));
			}
			dfs(candidates,  target,result,levelList, sum, i+1);
			sum-=candidates[i];
			levelList.remove(levelList.size()-1);
		}
	}


}
