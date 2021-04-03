package com.learn.java.leetcode.offer37;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.structure.TreeNode;
import com.learn.java.leetcode.lc0297.Codec;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}
	public TreeNode test(TreeNode root){
		com.learn.java.leetcode.lc0297.Codec codec = new Codec();
		return codec.deserialize(codec.serialize(root));
	}
}
