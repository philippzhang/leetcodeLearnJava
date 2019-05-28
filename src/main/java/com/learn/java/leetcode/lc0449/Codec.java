package com.learn.java.leetcode.lc0449;

import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Codec {


	private String changeInt2String(int val){
		StringBuffer stringBuffer = new StringBuffer();
		StringBuffer stringBuffer2 = new StringBuffer();
		int tag = 1;
		if(val<0){
			tag = -1;
			val=-val;
		}
		while(val!=0){
			stringBuffer.append((char)(val%10+'0'));
			val = val/10;
		}
		if(tag ==-1) {
			stringBuffer2.append('-');
		}
		for(int i = stringBuffer.length()-1;i>=0;i--){
			stringBuffer2.append(stringBuffer.charAt(i));
		}
		stringBuffer2.append('#');

		return stringBuffer2.toString();
	}

	private void bstPreorder(TreeNode node,StringBuffer stringBuffer){
		if(node==null){
			return;
		}

		String strVal = changeInt2String(node.val);
		stringBuffer.append(strVal);

		bstPreorder(node.left,stringBuffer);
		bstPreorder(node.right,stringBuffer);
	}

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		StringBuffer stringBuffer = new StringBuffer();
		bstPreorder(root,stringBuffer);
		return stringBuffer.toString();
	}

	private void bstInsert(TreeNode node,TreeNode insertNode){
		if(insertNode.val<node.val){
			if(node.left!=null){
				bstInsert(node.left,insertNode);
			}else{
				node.left = insertNode;
			}
		}else{
			if(node.right!=null){
				bstInsert(node.right,insertNode);
			}else{
				node.right = insertNode;
			}
		}
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		if(data==null||data.length()==0){
			return null;
		}
		List<TreeNode> treeNodeList = new ArrayList<>();
		int val = 0;
		int tag = 1;
		for(int i =0;i<data.length();i++){
			if(data.charAt(i)=='#') {
				val *=tag;
				treeNodeList.add(new TreeNode(val));
				val = 0;
				tag = 1;
			}else if(data.charAt(i)=='-'){
				tag = -1;
			}else {
				val = 10*val+data.charAt(i)-'0';
			}
		}
		for (int i =1;i<treeNodeList.size();i++){
			bstInsert(treeNodeList.get(0),treeNodeList.get(i));
		}
		return treeNodeList.get(0);
	}
}
