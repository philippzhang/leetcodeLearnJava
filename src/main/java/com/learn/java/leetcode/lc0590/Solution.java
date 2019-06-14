package com.learn.java.leetcode.lc0590;

import com.learn.java.leetcode.base.structure.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public List<Integer> postorder(Node root) {
		List<Integer> list = new ArrayList();
		if (root == null) {
			return list;
		}
		Stack<Node> stack = new Stack();
		stack.add(root);
		Node last = null;
		while(!stack.isEmpty()){
			List<Node> nodes = stack.peek().children;
			if(nodes!=null&&nodes.size()>0 && !nodes.contains(last)) {
				for (int i = nodes.size() - 1; i >= 0; i--) {
					stack.add(nodes.get(i));
				}
			}else {
				Node node = stack.pop();
				list.add(node.val);
				last = node;
			}
		}
		return list;
	}


	public List<Integer> postorder2(Node root) {
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
		for(Node n:node.children){
			helper(n,list);
		}
		list.add(node.val);
	}
}
