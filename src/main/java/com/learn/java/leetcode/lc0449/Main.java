package com.learn.java.leetcode.lc0449;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.structure.TreeNode;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	public TreeNode test(TreeNode root){
		Codec codec = new Codec();
		TreeNode treeNode = codec.deserialize(codec.serialize(root));
		return treeNode;
	}
}
