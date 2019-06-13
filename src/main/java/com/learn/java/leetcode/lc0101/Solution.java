package com.learn.java.leetcode.lc0101;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public boolean isSymmetric(TreeNode root) {
		return isMirror(root,root);
	}

	private boolean isMirror(TreeNode p,TreeNode q){
		if(p==null&&q==null){
			return true;
		}else if(p!=null&&q==null||p==null&&q!=null){
			return false;
		}
		if(p.val==q.val){
			return isMirror(p.left,q.right)&&isMirror(p.right,q.left);
		}
		return false;
	}

	public boolean isSymmetric2(TreeNode root) {
		if(root ==null){
			return true;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root.left);
		queue.offer(root.right);
		while(!queue.isEmpty()){
			TreeNode left = queue.poll();
			TreeNode right = queue.poll();
			if(left==null&&right==null){
				continue;
			}
			if(left==null || right == null){
				return false;
			}
			if(left.val!=right.val){
				return false;
			}
			queue.add(left.left);
			queue.add(right.right);
			queue.add(left.right);
			queue.add(right.left);
		}
		return true;
	}

}
