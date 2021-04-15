package com.learn.java.leetcode.offer33;

import java.util.Stack;

public class Solution {
	public boolean verifyPostorder(int[] postorder) {
		return postorder==null || postorder.length==0 ||recure(postorder,0,postorder.length-1);
	}

	/**
	 * 采用分治法:
	 * 1.将postorder[i,j]划分为postorder[i,m-1] 和 postorder[m,j-1]
	 * 2.postorder[i,m-1]都比postorder[j]小，postorder[m,j-1]都比postorder[j]大
	 * @param postorder
	 * @param i
	 * @param j
	 * @return
	 */
	public boolean recure(int[] postorder,int i,int j){
		if(i>=j){
			return true;
		}
		int p = i;
		while(postorder[p]<postorder[j]){
			p++;
		}
		int m = p;
		while(postorder[p]>postorder[j]){
			p++;
		}

		return p == j && recure(postorder,i,m-1) && recure(postorder,m,j-1);
	}

	/**
	 * 采用单调栈：
	 * 1.先给root赋予最大值
	 * 2.从右向左遍历，如果postorder[i]>root 返回false
	 * 3.如果栈顶元素>postorder[i] 则 root=postorder[i]
	 * @param postorder
	 * @return
	 */
	public boolean verifyPostorder2(int[] postorder) {
		if(postorder == null || postorder.length==0){
			return true;
		}
		Stack<Integer> stack = new Stack();
		int root = Integer.MAX_VALUE;
		for(int i = postorder.length-1;i>=0;i--){
			if(postorder[i]>root){
				return false;
			}
			while(!stack.isEmpty()&&stack.peek()>postorder[i]){
				root = stack.pop();
			}
			stack.push(postorder[i]);
		}
		return true;
	}
}
