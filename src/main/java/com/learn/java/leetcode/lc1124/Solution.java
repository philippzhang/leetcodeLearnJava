package com.learn.java.leetcode.lc1124;

import java.util.Stack;

public class Solution {
	/**
	 * 以输入样例 hours = [9,9,6,0,6,6,9] 为例，我们将大于 88 小时的一天记为 11 分，小于等于 88 小时的一天记为 -1−1 分。
	 * 那么处理后，我们得到 score = [1, 1, -1, -1, -1, -1, 1]，然后我们对得分数组计算前缀和
	 * presum = [0, 1, 2, 1, 0, -1, -2, -1]。
	 * 题目要求返回表现良好时间段的最大长度，即求最长的一段中，得分 11 的个数大于得分 -1−1 的个数，
	 * 也就是求 score 数组中最长的一段子数组，其和大于 00，
	 * 那么也就是找出前缀和数组 presum 中两个索引 i 和 j，使 j - i 最大，
	 * 且保证 presum[j] - presum[i] 大于 00。到此，我们就将这道题转化为，
	 * 求 presum 数组中的一个最长的上坡，可以用单调栈实现。我们维护一个单调栈，
	 * 其中存储 presum 中的元素索引，栈中索引指向的元素严格单调递减，由 presum 数组求得单调栈为 stack = [0, 5, 6]，
	 * 其表示元素为 [0, -1, -2]。然后我们从后往前遍历 presum 数组，与栈顶索引指向元素比较，
	 * 如果相减结果大于 00，则一直出栈，直到不大于 00 为止，然后更新当前最大宽度
	 *
	 * @param hours
	 * @return
	 */
	public int longestWPI(int[] hours) {
		int len = hours.length;
		//大于8小时计1分 小于等于8小时计-1分
		int[] score =  new int[len];
		for(int i =0;i<len;i++){
			if(hours[i]>8) {
				score[i]=1;
			}else {
				score[i]=-1;
			}
		}
		//前缀和
		int[] presum = new int[len+1];
		for(int i = 1;i<len+1;i++){
			presum[i] = presum[i-1]+score[i-1];
		}
		Stack<Integer> stack = new Stack();
		int result = 0;
		//顺序生成单调栈，栈中元素从第一个元素开始严格单调递减，最后一个元素肯定是数组中的最小元素所在位置
		for(int i = 0;i<len+1;i++){
			if(stack.isEmpty()||presum[stack.peek()]>presum[i]){
				stack.push(i);
			}
		}
		//倒序扫描数组，求最大长度坡
		int i = len;
		while(i>result){
			while(!stack.isEmpty()&&presum[stack.peek()]<presum[i]){
				result = Math.max(result,i-stack.peek());
				stack.pop();
			}
			i--;
		}
		return result;
	}
}
