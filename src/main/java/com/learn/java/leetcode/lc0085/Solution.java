package com.learn.java.leetcode.lc0085;

import java.util.Stack;

public class Solution {
	/**
	 * 单调栈
	 * @param matrix
	 * @return
	 */
	public int maximalRectangle(char[][] matrix) {
		if(matrix==null||matrix.length==0){
			return 0;
		}
		int row = matrix.length;
		int col = matrix[0].length;
		int[] height= new int[col];
		int ans = 0;
		Stack<Integer> stack = new Stack();
		stack.push(-1);
		for(int i = 0;i<row;i++){
			for(int j = 0;j<col;j++){
				height[j] = matrix[i][j]=='1'?height[j]+1:0;
				while(stack.peek()!=-1&&height[stack.peek()]>height[j]){
					int h = height[stack.pop()];
					int l = j-stack.peek()-1;
					ans = Math.max(ans,h*l);
				}
				stack.push(j);
			}
			while(stack.peek()!=-1){
				int h = height[stack.pop()];
				int l = col-stack.peek()-1;
				ans = Math.max(ans,h*l);
			}
		}
		return ans;
	}
}
