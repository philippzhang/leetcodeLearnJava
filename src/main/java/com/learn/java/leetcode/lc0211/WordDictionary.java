package com.learn.java.leetcode.lc0211;


public class WordDictionary {
	private final static int MAX_CHAR_NUM = 26;
	private class TrieNode{
		TrieNode[] child = new TrieNode[MAX_CHAR_NUM];
		boolean isEnd;

		public TrieNode() {
			for(int i = 0;i<MAX_CHAR_NUM;i++){
				child[i] = null;
			}
			isEnd = false;
		}
	}
	class TrieTree{

		public TrieTree() {
			root = new TrieNode();
		}

		private TrieNode root;
		private TrieNode newNode(){
			TrieNode node = new TrieNode();
			return node;
		}

		public void insert(String word){
			TrieNode ptr = root;
			int len = word.length();
			for(int i = 0;i<len;i++){
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
			if(word==null||word.length()==0){
				return true;
			}
			return searchTrie(root,word.toCharArray(),0);
		}

		private boolean searchTrie(TrieNode node,char[] word,int i ){
			if(i ==word.length){
				return node.isEnd;
			}
			char c = word[i];
			boolean flag = false;
			if(c=='.'){
				for(int j = 0;j<MAX_CHAR_NUM;j++){
					if(node.child[j]==null){
						continue;
					}
					flag |= searchTrie(node.child[j],word,i+1);
					if(flag){
						return true;
					}
				}
			}else{
				int pos = c-'a';
				if(node.child[pos]==null){
					return false;
				}
				flag = searchTrie(node.child[pos],word,i+1);
			}
			return flag;
		}

	}


	private TrieTree trieTree;
	/** Initialize your data structure here. */
	public WordDictionary() {
		trieTree = new TrieTree();
	}

	/** Adds a word into the data structure. */
	public void addWord(String word) {
		trieTree.insert(word);
	}

	/** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
	public boolean search(String word) {
		return trieTree.search(word);
	}


}
