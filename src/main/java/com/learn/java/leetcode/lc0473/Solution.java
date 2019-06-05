package com.learn.java.leetcode.lc0473;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	/**
	 * 使用位运算，构造出所有和target的子集，存储到okSubset中，
	 * 遍历okSubset，两两进行比较，如果进行与运算结果为0，说明okSubset[i]和okSubset[j]无交集（没有选择同样的火柴棍）
	 * 这两个结合可以同时存在，将okSubset[i]和okSubset[j]求或，结果放到okHalf中，代表满足一半的结果
	 * 遍历所有okHalf，两两进行比较，如果进行的与运算结果为0，则返回true（说明有4条满足条件的边）
	 * @param nums
	 * @return
	 */
	public boolean makesquare(int[] nums) {
		if (nums.length < 4) {
			return false;
		}
		int sum = Arrays.stream(nums).sum();
		if (sum % 4 != 0) {
			return false;
		}
		int target = sum/4;
		//所有满足条件的一个边代表的集合
		List<Integer> okSubset = new ArrayList<>();
		//所有满足条件的两个边代表的集合
		List<Integer> okHalf = new ArrayList<>();

		int all = 1<< nums.length;
		for (int i =0;i<all;i++){
			int temp =0;
			for(int j = 0;j<nums.length;j++){
				if((i&(1<<j))>0){
					temp += nums[j];
				}
			}
			if(temp==target){
				okSubset.add(i);
			}
		}
		for(int i = 0;i<okSubset.size();i++){
			for(int j = i+1;j<okSubset.size();j++){
				if((okSubset.get(i)&okSubset.get(j))==0){
					okHalf.add(okSubset.get(i)|okSubset.get(j));
				}
			}
		}

		for(int i = 0;i<okHalf.size();i++){
			for(int j = i+1;j<okHalf.size();j++){
				if((okHalf.get(i)&okHalf.get(j))==0){
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 回溯
	 * @param nums
	 * @return
	 */
	public boolean makesquare2(int[] nums) {
		if(nums.length<4){
			return false;
		}
		int sum = Arrays.stream(nums).sum();
		if(sum%4!=0){
			return false;
		}

		Arrays.sort(nums);
		int[] bucket = new int[4];
		return generate(0,nums,sum/4,bucket);
	}

	private boolean generate(int i,int[] nums,int target,int[] bucket){
		if(i>=nums.length){
			return bucket[0]==target && bucket[1]==target && bucket[2]==target && bucket[3]==target;
		}
		for(int j = 0;j< 4;j++){
			if(bucket[j]+nums[i]>target){
				continue;
			}
			bucket[j] += nums[i];
			if(generate(i+1,nums,target,bucket)){
				return true;
			}
			//回溯
			bucket[j] -= nums[i];
		}
		return false;
	}


	public boolean makesquare3(int[] nums) {
		if(nums.length <4 ) {
			return false;
		}
		int sum = Arrays.stream(nums).sum();
		if(sum%4!=0){
			return false;
		}
		Arrays.sort(nums);
		return dfs(nums,0,nums.length,0,0,0,0,sum/4);
	}

	private boolean dfs(int[] nums, int i, int length, int i1, int i2, int i3, int i4, int i5) {
		if(i==length){
			if(i1==i5 && i2==i5 && i3==i5 && i4==i5 ) return true;
			else {
				return false;
			}
		}
		if(i1>i5 || i2>i5 || i3>i5 || i4>i5 ) return false;
		return dfs(nums,i+1,length,i1+nums[i],i2,i3,i4,i5)||
				dfs(nums,i+1,length,i1,i2+nums[i],i3,i4,i5)||
				dfs(nums,i+1,length,i1,i2,i3+nums[i],i4,i5)||
				dfs(nums,i+1,length,i1,i2,i3,i4+nums[i],i5);
	}
}
