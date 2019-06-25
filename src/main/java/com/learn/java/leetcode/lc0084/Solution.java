package com.learn.java.leetcode.lc0084;

public class Solution {
	public int largestRectangleArea(int[] heights) {
		if(heights==null||heights.length==0){
			return 0;
		}
		return maxArea(heights,0,heights.length-1);
	}

	private int maxArea(int[] h ,int left,int right){
		if(left==right){
			return h[left];
		}
		int min = left;
		boolean sorted = true;
		for(int i = left+1;i<=right;i++){
			if(h[i]<h[i-1]){
				sorted = false;
			}
			if(h[i]<h[min]){
				min = i;
			}
		}
		if(sorted){
			int max = 0;
			for(int i= left;i<=right;i++){
				max = Math.max(max,h[i]*(right-i+1));
			}
			return max;
		}
		int l = (min>left)?maxArea(h,left,min-1):0;
		int r = (min<right)?maxArea(h,min+1,right):0;
		return Math.max(Math.max(l,r),h[min]*(right-left+1));
	}
}
