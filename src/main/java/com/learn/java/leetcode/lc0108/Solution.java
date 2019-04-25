package com.learn.java.leetcode.lc0108;

import com.learn.java.leetcode.base.structure.TreeNode;

/**
 * 108. Convert Sorted Array to Binary Search Tree 108. 将有序数组转换为二叉搜索树 Easy
 */
public class Solution {
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums==null||nums.length==0){
			return null;
		}
		if(nums.length==1){
			return new TreeNode(nums[0]);
		}
		return sortedArrayToBST(nums,0,nums.length-1);
	}

	private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
		if(left>right||left<0||right>nums.length-1){
			return null;
		}
		if(left==right){
			return new TreeNode(nums[left]);
		}
		int middle = (left+right)/2;
		TreeNode root = new TreeNode(nums[middle]);
		root.left = sortedArrayToBST(nums,left,middle-1);
		root.right = sortedArrayToBST(nums,middle+1,right);
		return root;
	}
}
