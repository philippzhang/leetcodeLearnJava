package com.learn.java.leetcode.lc0164;

public class Solution {
	private static class Bucket{
		Integer min;
		Integer max;
	}

	/**
	 * 桶排序
	 * @param nums
	 * @return
	 */
	public int maximumGap(int[] nums) {
		if (nums==null||nums.length < 2) {
			return 0;
		}
		//求最大值、最小值
		int max = nums[0];
		int min = nums[0];
		for(int i =1 ;i<nums.length;i++){
			max = Math.max(max,nums[i]);
			min = Math.min(min,nums[i]);
		}
		int m = max-min;
		if(m==0){
			return 0;
		}

		//桶的数量
		int bucketNum = nums.length;
		Bucket[] buckets = new Bucket[bucketNum];
		for(int i = 0;i<bucketNum;i++){
			buckets[i] = new Bucket();
		}
		for(int i = 0;i<nums.length;i++){
			long ii = (long)(nums[i]-min)*(bucketNum-1)/m;
			int index = (int)ii;
			if(index<0){
				index=0;
			}
			if(buckets[index].min==null||buckets[index].min>nums[i]){
				buckets[index].min = nums[i];
			}
			if(buckets[index].max==null||buckets[index].max<nums[i]){
				buckets[index].max = nums[i];
			}
		}

		//桶排序，找到最大差值
		int leftMax = buckets[0].max;
		int maxDistance =0;
		for(int i =1;i<buckets.length;i++){
			if(buckets[i].min==null){
				continue;
			}
			if(buckets[i].min-leftMax>maxDistance){
				maxDistance=buckets[i].min-leftMax;
			}
			leftMax=buckets[i].max;
		}
		return maxDistance;
	}

}
