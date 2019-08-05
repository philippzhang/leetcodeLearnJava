package com.learn.java.leetcode.lc0229;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	/**
	 * 多数投票算法
	 * @param nums
	 * @return
	 */
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> results = new ArrayList<>();
		if(nums==null||nums.length==0){
			return results;
		}
		//候选人
		int candidateA = nums[0];
		int candidateB = nums[0];
		int countA = 0;
		int countB = 0;

		for(int num : nums){
			if(num == candidateA){
				//投A
				countA++;
				continue;
			}
			if(num == candidateB){
				//投B
				countB++;
				continue;
			}
			//此时当前值和AB都不等，检查是否有票数减为0的情况，如果为0，则更新候选人
			if(countA==0){
				candidateA = num;
				countA++;
				continue;
			}
			if(countB==0){
				candidateB=num;
				countB++;
				continue;
			}
			//若此时两个候选人的票数都不为0，且当前元素不投AB，那么A,B对应的票数都要--;
			countA--;
			countB--;
		}
		//上一轮遍历找出了两个候选人，判断票数大于N/3
		countA = 0;
		countB = 0;
		for(int num:nums){
			if(num==candidateA){
				countA++;
			}else if(num==candidateB){
				countB++;
			}
		}
		if(countA>nums.length/3){
			results.add(candidateA);
		}
		if(countB>nums.length/3){
			results.add(candidateB);
		}
		return results;
	}
}
