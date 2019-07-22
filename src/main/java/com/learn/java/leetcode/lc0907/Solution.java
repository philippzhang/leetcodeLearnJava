package com.learn.java.leetcode.lc0907;

import java.util.Stack;

public class Solution {

	/**
	 *   3 1 2 4
	 * 3 3 1 1 1
	 * 1   1 1 1
	 * 2     2 2
	 * 4       4
	 * 考虑从A中的每个元素A[i]，如果求出包含A[i]并以A[i]为最小元素的所有子数组个数n[i]，
	 * 则元素A[i]对答案ans的贡献为n[i]*A[i]，
	 * 那么我们可以先求包含A[i]并以A[i]为最小元素的最长子数组，
	 * 如果A[i]左边第一个小于A[i]的元素为A[left]，A[i]右边第一个小于A[i]的元素为A[right]，
	 * 则包含A[i]并以A[i]为最小元素的最长子数组为A[left+1:right]，
	 * 满足以A[i]为最小元素的所有子数组个数n[i] = (i-left)*(right-i)。
	 * 我们用left[i]表示A[i]左边第一个小于A[i]元素的位置，
	 * 用right[i]表示A[i]右边第一个小于A[i]元素的位置，left数组初始值为-1，right数组初始值为len(A)，
	 * 求解left和right可以用单调栈来实现
	 *
	 */
	private final static int MOD = (int)(1e9) + 7;
	public int sumSubarrayMins(int[] A) {
		int len = A.length;
		int[] left = new int[len],right = new int[len];
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		for(int i =0;i<len;i++){
			while(!s1.empty()&&A[s1.peek()]>A[i]){
				s1.pop();
			}
			left[i] = s1.empty()?i+1:i-s1.peek();
			s1.push(i);
			int j = len -1 -i;
			while(!s2.empty()&&A[s2.peek()]>=A[j]){
				s2.pop();
			}
			right[j] = s2.empty()?len-j:s2.peek()-j;
			s2.push(j);

		}
		int result =0;
		for(int i = 0;i<len;i++){
			result += (left[i]*right[i])%MOD*A[i];
			result %=MOD;
		}
		return result;
	}
}
