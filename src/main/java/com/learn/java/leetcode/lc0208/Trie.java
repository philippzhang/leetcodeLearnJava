package com.learn.java.leetcode.lc0208;


import java.util.ArrayList;
import java.util.List;

public class Trie {

	private final static int MAX_CHAR_NUM = 26;
	private class TrieNode{
		TrieNode[] child = new TrieNode[MAX_CHAR_NUM];
		boolean isEnd;

		public TrieNode() {
			isEnd = false;
		}
	}
	class TrieTree{

		public TrieTree() {
			trieNodeList = new ArrayList<>();
			root = new TrieNode();
		}

		private TrieNode root;
		private List<TrieNode> trieNodeList;
		private TrieNode newNode(){
			TrieNode node = new TrieNode();
			trieNodeList.add(node);
			return node;
		}

		public void insert(String word){
			TrieNode ptr = root;
			for(int i = 0;i<word.length();i++){
				char c = word.charAt(i);
				int pos = c-'a';
				if(ptr.child[pos]==null){
					ptr.child[pos] = newNode();
				}
				ptr = ptr.child[pos];
			}
			ptr.isEnd = true;
		}

		public boolean search(String word){
			TrieNode ptr = root;
			for(int i = 0;i<word.length();i++){
				char c = word.charAt(i);
				int pos = c-'a';
				if(ptr.child[pos]==null){
					return false;
				}
				ptr = ptr.child[pos];
			}
			return ptr.isEnd;
		}

		public boolean startWith(String prefix){
			TrieNode ptr = root;
			for(int i = 0;i<prefix.length();i++){
				char c = prefix.charAt(i);
				int pos = c-'a';
				if(ptr.child[pos]==null){
					return false;
				}
				ptr = ptr.child[pos];
			}
			return true;
		}

	}


	private TrieTree trieTree;
	/** Initialize your data structure here. */
	public Trie() {
		trieTree = new TrieTree();
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		trieTree.insert(word);
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		return trieTree.search(word);
	}

	/** Returns if there is any word in the trie that starts with the given prefix. */
	public boolean startsWith(String prefix) {
		return trieTree.startWith(prefix);
	}
}
