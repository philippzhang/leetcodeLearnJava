package com.learn.java.leetcode.lc0321;

public class Solution {
	public int[] maxNumber(int[] nums1, int[] nums2, int k) {
		int[] results = new int[k];
		if(nums1.length+nums2.length<k){
			return results;
		}
		if(nums1.length>nums2.length){
			return maxNumber(nums2,nums1,k);
		}
		int len = Math.min(nums1.length,k);
		for(int i= 0;i<=len;i++){
			int len2 = k-i;
			if(len2>nums2.length){
				continue;
			}
			int[] maxNums1 = maxNum(nums1,i);
			int[] maxNums2 = maxNum(nums2,len2);
			int[] temp  = mergeNum(maxNums1,maxNums2);
			results = compareTo(temp,results)?temp:results;
		}
		return results;
	}

	/**
	 * 判断两个相同长度数组组成的数的大小
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	private boolean compareTo(int[] nums1 ,int[] nums2){
		for(int i = 0;i<nums1.length;i++){
			if(nums1[i]>nums2[i]){
				return true;
			}else if(nums1[i]<nums2[i]){
				return false;
			}
		}
		return true;
	}

	/**
	 * 将两个数组组成一个数组使得组成的数最大
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	private int[] mergeNum(int[] nums1, int[] nums2){
		int[] results = new int[nums1.length+nums2.length];
		int k = 0,l=0,r=0;
		while(l<nums1.length&&r<nums2.length){
			if(nums1[l]<nums2[r]){
				results[k++] = nums2[r++];
			}else if(nums1[l]>nums2[r]){
				results[k++] = nums1[l++];
			}else{
				if(getNextStep(nums1,nums2,l,r)){
					results[k++] = nums1[l++];
				}else{
					results[k++] = nums2[r++];
				}
			}
		}
		while(l<nums1.length){
			results[k++] = nums1[l++];
		}
		while(r<nums2.length){
			results[k++] = nums2[r++];
		}
		return results;
	}

	/**
	 * 当nums1[l]==nums2[r]时,true去num1[l],false取num2[r]
	 * @param nums1
	 * @param nums2
	 * @param l
	 * @param r
	 * @return
	 */
	private boolean getNextStep(int[] nums1,int[] nums2,int l ,int r){
		if(l>=nums1.length&&r>=nums2.length){
			return true;
		}
		if(r>=nums2.length){
			return true;
		}
		if(l>=nums1.length){
			return false;
		}
		if(nums1[l]==nums2[r]){
			return getNextStep(nums1,nums2,l+1,r+1);
		}else if(nums1[l]>nums2[r]){
			return true;
		}else {
			return false;
		}
	}
	/**
	 * 从一个数组中选择 k 个数组成的数最大
	 * @param nums
	 * @param k
	 * @return
	 */
	private int[] maxNum(int[] nums,int k){
		int[] results = new int[k];
		int l = 0,r  =nums.length-k;
		for(int i = 0;i<k;i++){
			int[] max = getMaxNum(nums,l,r);
			results[i] = max[0];
			l = max[1]+1;
			r = r+1;
		}

		return results;

	}

	/**
	 * 查找nums中最大的值和序号
	 * @param nums
	 * @param l
	 * @param r
	 * @return
	 */
	private int[] getMaxNum(int[] nums,int l ,int r){
		int[] results = new int[2];
		int k = l;
		int max = -1;
		while(k<=r){
			if(nums[k]>max){
				max = nums[k];
				results[0] = max;
				results[1] = k;
				if(max == 9){
					return results;
				}
			}
			k++;
		}
		return results;
	}
}
