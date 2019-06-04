package com.learn.java.leetcode.lc0126;

import java.util.*;

public class Solution {
	public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
		Map<String,List<String>> graph = new HashMap<>();
		buildGrahp(beginWord,wordList,graph);
		List<QItem> queue = new ArrayList<>();
		List<Integer> endWordPosList = new ArrayList<>();
		bfsGraph(beginWord,endWord,graph, queue,endWordPosList);

		List<List<String>> results = new ArrayList<>();

		for(int i = 0;i<endWordPosList.size();i++){
			int pos = endWordPosList.get(i);
			List<String> path = new ArrayList<>();
			while(pos!=-1){
				path.add(queue.get(pos).node);
				pos = queue.get(pos).prev;
			}
			List<String> pathNew = new ArrayList<>();
			int j = path.size();
			while(j>0){
				pathNew.add(path.remove(--j));

			}
			results.add(pathNew);
		}

		return results;

	}

	private boolean connect(String word1,String word2){
		int cnt =0;
		for(int i =0;i<word1.length();i++){
			if(word1.charAt(i)!=word2.charAt(i)){
				cnt++;
			}
		}
		return cnt==1;
	}

	private void buildGrahp(String beginWord,List<String> wordList,Map<String,List<String>> graph){
		if(!wordList.contains(beginWord)) {
			wordList.add(0, beginWord);
		}
		for(int i = 0;i<wordList.size();i++){
			graph.put(wordList.get(i),new ArrayList<>());
		}
		for(int i =0;i<wordList.size();i++){
			for(int j = i+1;j<wordList.size();j++){
				if(connect(wordList.get(i),wordList.get(j))){
					graph.get(wordList.get(i)).add(wordList.get(j));
					graph.get(wordList.get(j)).add(wordList.get(i));
				}
			}
		}
	}

	class QItem{
		String node;
		int prev;
		int step;
		public QItem(String node, int prev, int step) {
			this.node = node;
			this.prev = prev;
			this.step = step;
		}
	}

	private void  bfsGraph(String beginWord,String endWord,Map<String,List<String>> graph,List<QItem> queue,List<Integer> endWordPosList){

		//记录单词，步数
		Map<String,Integer> map = new HashMap<>();
		//最小步数
		int minStep = 0;
		queue.add(new QItem(beginWord,-1,1));
		//队头指针
		int front = 0;
		while(front!=queue.size()){
			QItem qItem = queue.get(front);
			String node = qItem.node;
			int step = qItem.step;
			if(minStep!=0&&step>minStep){
				break;
			}
			if(node.equals(endWord)){
				minStep = step;
				endWordPosList.add(front);
			}
			List<String> neighbors = graph.get(node);
			if(neighbors!=null&&neighbors.size()>0){
				for(int i=0;i<neighbors.size();i++) {
					String neighbor = neighbors.get(i);
					//结点没被访问，或另一条最短路径
					if (!map.containsKey(neighbor)||map.get(neighbor)==step+1){
						queue.add(new QItem(neighbor,front,step+1));
						//标记临界点的最短步数
						map.put(neighbor,step+1);
					}
				}
			}
			front++;
		}
	}
}
