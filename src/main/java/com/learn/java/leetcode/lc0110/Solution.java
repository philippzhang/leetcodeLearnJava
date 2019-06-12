package com.learn.java.leetcode.lc0110;

import com.learn.java.leetcode.base.structure.TreeNode;
import com.learn.java.leetcode.base.utils.Print;

public class Solution {
	public boolean isBalanced(TreeNode root) {
		if(root==null){
			return true;
		}
		if(root.left==null&&root.right==null){
			return true;
		}
		int left =  getHeight(root.left);
		int right = getHeight(root.right);
		if(Math.abs(left-right)>1){
			return false;
		}else{
			if(isBalanced(root.left)&&isBalanced(root.right)){
				return true;
			}else {
				return false;
			}
		}

	}

	private int getHeight(TreeNode node){
		if(node==null){
			return 0;
		}
		int left =  getHeight(node.left);
		int right = getHeight(node.right);
		return left>right?left+1:right+1;
	}
}
