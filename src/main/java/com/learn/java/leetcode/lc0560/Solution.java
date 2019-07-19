package com.learn.java.leetcode.lc0560;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int subarraySum(int[] nums, int k) {
		//dpMap表示从 index= 0开始累加的连续序列和出现的次数
		//比如getMap(3)得到5，表示和为3的从index=0开始的连续子序列有5个
		Map<Integer,Integer> dpMap = new HashMap();
		//初始化，表示和为0的从index=0开始连续子序列有1个（就是没有任何元素的空序列情况）
		dpMap.put(0,1);
		//表示循环到当前下标的累加和
		int sum = 0;
		//表示从任意位置开始的连续累加和 = k 的个数
		int result = 0;
		//从index=0开始计算累积和
		for(int num : nums){
			sum += num;
			if(dpMap.containsKey(sum-k)){
				//关于总子序列为什么会累加从index=0开始和为sum-k的序列个数，原因是：
				//如果一个序列从index=0开始累加，累加到index=x时序列和为sum-k,那么从index=x+1开始累加到当前
				//index=i的中间连续子序列，序列和一定是k， 参考计算公式sum-(sum-k)=k
				result += dpMap.get(sum-k);
			}
			dpMap.put(sum,dpMap.getOrDefault(sum,0)+1);
		}
		return result;

	}
}
