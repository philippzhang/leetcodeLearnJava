package com.learn.java.leetcode.lc0589;

import com.learn.java.leetcode.base.structure.Node;



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

	public List<Integer> preorder2(Node root) {
		List<Integer> list = new ArrayList();
		if (root == null) {
			return list;
		}
		helper(root,list);
		return list;
	}

	private void helper(Node node ,List<Integer> list){
		if(node == null){
			return;
		}
		list.add(node.val);
		for(Node n:node.children){
			helper(n,list);
		}
	}

	public List<Integer> preorder(Node root) {
		List<Integer> list = new ArrayList();
		if (root == null) {
			return list;
		}
		Stack<Node> stack = new Stack();
		stack.add(root);
		while(!stack.isEmpty()){
			Node n = stack.pop();
			list.add(n.val);
			for(int i = n.children.size()-1;i>=0;i--){
				stack.add(n.children.get(i));
			}
		}
		return list;
	}
}
