package com.learn.java.leetcode.lc0133;

import java.util.List;

/**
 * 图结点
 */
class Node {
	public int val;
	public List<Node> neighbors;

	public Node() {}

	public Node(int _val,List<Node> _neighbors) {
		val = _val;
		neighbors = _neighbors;
	}
}
