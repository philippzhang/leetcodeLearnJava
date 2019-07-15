package com.learn.java.leetcode.lc0297;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Codec {
	private void rserialize(TreeNode root, StringBuffer stringBuffer) {
		if(root==null){
			stringBuffer.append("null,");
		}else{
			stringBuffer.append(root.val).append(',');
			rserialize(root.left,stringBuffer);
			rserialize(root.right,stringBuffer);
		}
	}
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		StringBuffer stringBuffer = new StringBuffer();
		rserialize(root,stringBuffer);
		return stringBuffer.toString();
	}

	private TreeNode rdeserialize(List<String> list) {
		if(list==null||list.size()==0){
			return null;
		}
		if(list.get(0).equals("null")){
			list.remove(0);
			return null;
		}
		TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
		list.remove(0);
		root.left = rdeserialize(list);
		root.right = rdeserialize(list);
		return root;

	}
	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		String[] array = data.split(",");
		List<String> list = new LinkedList<>(Arrays.asList(array));
		return rdeserialize(list);
	}
}
