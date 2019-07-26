package com.learn.java.leetcode.lc0134;

public class Solution {
	/**
	 * 初始化 total 和 current 为 0 ，并且选择 0 号加油站为起点。
	 *
	 * 遍历所有的加油站：
	 *
	 * 每一步中，都通过加上 gas[i] 和减去 cost[i] 来更新 total 和 current 。
	 *
	 * 如果在 i + 1 号加油站， curr < 0 ，将 i + 1 号加油站作为新的起点，同时重置 current = 0 ，让油箱也清空。
	 *
	 * 如果 total < 0 ，返回 -1 ，否则返回 starting station。
	 *
	 *
	 * @param gas
	 * @param cost
	 * @return
	 */
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int n = gas.length;

		int total =  0;
		int current = 0;
		int start = 0;
		for(int i =0;i<n;i++){
			int temp = gas[i]-cost[i];
			total+=temp;
			current+=temp;
			if(current<0){
				start =i+1;
				current =0;
			}
		}
		return total>=0?start:-1;
	}
}
