package com.learn.java.leetcode.lc0327;

import java.util.TreeMap;

public class Solution {
	/**
	 * 使用TreeMap来保存每个前缀和的计数。treeMap查询的时间是logn,所以总时间复杂度为O(nlogn)
	 * @param nums
	 * @param lower
	 * @param upper
	 * @return
	 */
	public int countRangeSum(int[] nums, int lower, int upper) {
		if(nums==null||nums.length==0){
			return 0;
		}
		long[] sum = new long[nums.length];
		sum[0] = nums[0];
		for(int i =1;i<nums.length;i++){
			sum[i] = sum[i-1]+nums[i];
		}
		int total = 0;
		TreeMap<Long,Integer> treeMap = new TreeMap<>();
		for(int i =0;i<nums.length;i++){
			if(sum[i]>=lower&&sum[i]<=upper){
				total++;
			}
			//sum[i] - x >= lower && sum[i] - x <= upper
			// 即 sum[i] - upper <= x <=sum[i] - lower
			//这个x代表的是sum[j],其中j<i。上面的式子表达的是[j+1, i]区间和在[lower,upper]之间
			for(Integer count:treeMap.subMap(sum[i]-upper,true,sum[i]-lower,true).values()){
				total+=count;
			}
			Integer count = treeMap.get(sum[i]);
			if(count==null){
				count =1;
			}else{
				count++;
			}
			treeMap.put(sum[i],count);
		}
		return total;
	}
}
