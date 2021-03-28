package com.learn.java.leetcode.test001;

class TreeNode{
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int val) {
		this.val = val;
	}
}
public class Test4 {
	public static boolean judge(TreeNode root){
		return dfs(root);
	}

	private static boolean dfs(TreeNode root){
		if(root == null || root.left==null&&root.right==null){
			return true;
		}
		else if(root.left==null&&root.right!=null||root.right==null&&root.left!=null){
			return false;
		}else if(root.left.val!=root.right.val){
			return false;
		}else {
			return root.left.val==root.right.val && dfs(root.left) && dfs(root.right);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(4);

		System.out.println(judge(root));

		 root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(5);

		System.out.println(judge(root));
	}
}
