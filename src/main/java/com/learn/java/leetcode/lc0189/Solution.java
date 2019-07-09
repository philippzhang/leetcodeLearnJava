package com.learn.java.leetcode.lc0189;

public class Solution {

	/**
	 * 使用反转
	 * 时间复杂度：O(n)O(n) 。 nn 个元素被反转了总共 3 次。
	 * 空间复杂度：O(1)O(1) 。 没有使用额外的空间。
	 * @param nums
	 * @param k
	 */
	public void rotate(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}
	public void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}



	/**
	 * 暴力法
	 * 时间复杂度：O(n*k)O(n∗k) 。每个元素都被移动 1 步（O(n)O(n)） k次（O(k)O(k)） 。
	 * 空间复杂度：O(1)O(1) 。没有额外空间被使用。
	 * @param nums
	 * @param k
	 */
	public void rotate1(int[] nums, int k) {
		int len = nums.length;
		int mod = k%len;
		if(mod==0){
			return;
		}

		while(mod>0){
			int temp = nums[len-1];
			for(int i=len-2;i>=0;i--){
				nums[i+1] = nums[i];
			}
			nums[0] = temp;
			mod--;
		}

	}

	/**
	 * 使用额外的数组
	 * 时间复杂度： O(n)O(n) 。将数字放到新的数组中需要一遍遍历，另一边来把新数组的元素拷贝回原数组。
	 * 空间复杂度： O(n)O(n)。另一个数组需要原数组长度的空间。
	 * @param nums
	 * @param k
	 */
	public void rotate2(int[] nums, int k) {
		int[] a = new int[nums.length];
		for(int i =0;i<nums.length;i++){
			a[(i+k)%nums.length] = nums[i];
		}
		for(int i =0;i<nums.length;i++){
			nums[i] = a[i];
		}
	}

	/**
	 * 环状替换
	 * 时间复杂度：O(n)O(n) 。只遍历了每个元素一次。
	 * 空间复杂度：O(1)O(1) 。使用了常数个额外空间。
	 * @param nums
	 * @param k
	 */
	public void rotate3(int[] nums, int k) {
		k = k%nums.length;
		int count =0;
		for(int i =0;count<nums.length;i++){
			int current = i;
			int prev = nums[i];
			do{
				int next = (current+k)%nums.length;
				int temp = nums[next];
				nums[next] = prev;
				prev = temp;
				current = next;
				count++;
			}while(i!=current);
		}
	}
}
