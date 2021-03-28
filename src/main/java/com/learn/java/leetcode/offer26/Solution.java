package com.learn.java.leetcode.offer26;

import com.learn.java.leetcode.base.structure.TreeNode;

public class Solution {
	public boolean isSubStructure(TreeNode A, TreeNode B) {
		if(A==null||B==null){
			return false;
		}
		if(dfs(A,B)){
			return true;
		}else if(isSubStructure(A.left,B)){
			return true;
		}else{
			return isSubStructure(A.right,B);
		}
	}

	private boolean dfs(TreeNode A,TreeNode B){
		//必须先判断B为空
		if(B==null){
			return true;
		}
		if(A==null){
			return false;
		}
		if(A.val!=B.val){
			return false;
		}else{
			return dfs(A.left,B.left) && dfs(A.right,B.right);
		}
	}


}
