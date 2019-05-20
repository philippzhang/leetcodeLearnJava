package com.learn.java.leetcode.lc0331;

public class Solution {
	/*
规律 : 二叉树的NULL节点数 = 非NULL节点数 + 1,且前序遍历序列化后最后的字符一定为'#';
ans : 初始化为0,遇到数字则加一,遇到'#'则减一,如果在遍历到字符串结尾的中途小于零,说明违背规律,如空节点下面还有节点等违规情况,则直接返回false;
while循环 : 因为节点数字会超过0~9的情况,需要判断.
最后通过ans是否为0并且最后一个字符是否为'#'判断.
 */
	public boolean isValidSerialization(String preorder) {
		if(preorder.startsWith("#")&&!preorder.equals("#")){
			return false;
		}
		if(!preorder.endsWith("#")){
			return false;
		}
		String[] pre = preorder.split(",");
		int ans = 0;
		for(int i = 0;i<pre.length-1;i++){
			ans+=pre[i].equals("#")?-1:1;
			if(ans<0){
				return false;
			}
		}

		return ans ==0;
	}
}
