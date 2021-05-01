package com.learn.java.leetcode.offer21;

public class Solution {
	public int[] exchange(int[] nums) {
		if(nums==null||nums.length<=0){
			return nums;
		}
		int[] ret = new int[nums.length];

		int[] ret_odd = new int[nums.length];
		int[] ret_oven = new int[nums.length];
		int index_odd = 0;
		int index_oven = 0;
		for(int i = 0;i<nums.length;i++){
			if(nums[i]%2==1){
				ret_odd[index_odd++] = nums[i];
			}else{
				ret_oven[index_oven++] = nums[i];
			}
		}
		System.arraycopy(ret_odd,0,ret,0,index_odd);
		System.arraycopy(ret_oven,0,ret,index_odd,index_oven);
		return ret;
	}

	/**
	 * 收尾指针
	 * @param nums
	 * @return
	 */
	public int[] exchange2(int[] nums) {
		if(nums==null||nums.length<=0){
			return nums;
		}

		int left = 0 ,right =nums.length-1;
		while(left<right){
			if((nums[left]&1)==1){
				left++;
				continue;
			}
			if((nums[right]&1)==0){
				right--;
				continue;
			}

			swap(nums,left++,right--);

		}

		return nums;

	}

	/**
	 * 快慢指针
	 * @param nums
	 * @return
	 */
	public int[] exchange3(int[] nums) {
		if (nums == null || nums.length <= 0) {
			return nums;
		}
		int low = 0,fast =0;
		while(fast<nums.length){
			if((nums[fast]&1)==1){
				swap(nums,low,fast);
				low++;
			}
			fast++;
		}

		return nums;
	}

	private void swap(int[] nums,int i,int j){
		int temp = nums[i] ;
		nums[i] = nums[j];
		nums[j] = temp;
	}


}
