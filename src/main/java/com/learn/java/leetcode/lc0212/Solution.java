package com.learn.java.leetcode.lc0212;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
	static class TrieNode{
		TrieNode[] children = new TrieNode[26];
		String word;
	}

	static class Trie{
		TrieNode root = new TrieNode();
		public void insert(String word){
			TrieNode node = root;
			int n = word.length();
			int charNo;
			for(int i = 0;i<n;i++){
				charNo = word.charAt(i)-'a';
				if(node.children[charNo]==null){
					node.children[charNo] = new TrieNode();
				}
				node = node.children[charNo];
			}
			node.word = word;
		}
	}

	/**
	 * dfs 回溯
	 * @param board
	 * @param visited
	 * @param i
	 * @param j
	 * @param m
	 * @param n
	 * @param node
	 * @param resultSet
	 */
	private void dfs(char[][] board,boolean[][] visited,int i ,int j ,int m ,int n,TrieNode node ,Set<String> resultSet){
		if(i<0||j<0||i>=m||j>=n||visited[i][j]){
			return;
		}
		node = node.children[board[i][j]-'a'];
		if(node == null){
			return;
		}
		if(node.word!=null){
			resultSet.add(node.word);
		}
		visited[i][j] = true;
		dfs(board,visited,i-1,j,m,n,node,resultSet);
		dfs(board,visited,i+1,j,m,n,node,resultSet);
		dfs(board,visited,i,j-1,m,n,node,resultSet);
		dfs(board,visited,i,j+1,m,n,node,resultSet);
		visited[i][j] = false;
	}
	public List<String> findWords(char[][] board, String[] words) {
		Trie trie = new Trie();
		for(String word:words){
			trie.insert(word);
		}

		int m = board.length;
		int n = board[0].length;
		boolean[][] visited = new boolean[m][n];
		Set<String> resultSet = new HashSet();
		for(int i =0;i<m;i++){
			for(int j = 0;j<n;j++){
				dfs(board,visited,i,j,m,n,trie.root,resultSet);
			}
		}

		return new LinkedList<>(resultSet);
	}
}
