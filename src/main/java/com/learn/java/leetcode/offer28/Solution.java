package com.learn.java.leetcode.offer28;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public boolean isSymmetric(TreeNode root) {
		if(root ==null){
			return true;
		}else{
			return helper(root.left,root.right);
		}
	}

	private static boolean helper(TreeNode left,TreeNode right){
		if(left==null&&right==null){
			return true;
		}else if(left==null||right==null){
			return false;
		}else if(left.val!=right.val){
			return false;
		}else{
			return left.val == right.val && helper(left.left,right.right) && helper(left.right,right.left);
		}
	}
}
