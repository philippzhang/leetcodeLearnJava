package com.learn.java.leetcode.lc0127;

import java.util.*;

public class Solution {
	/**
	 * BFS搜索
	 * @param beginWord
	 * @param endWord
	 * @param wordList
	 * @return
	 */
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Map<String,List<String>> graph = new HashMap<>();
		buildGrahp( beginWord,  wordList, graph);
		return bfsGraph(beginWord,endWord,graph);
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

	private void buildGrahp(String beginWrod,List<String> wordList,Map<String,List<String>> graph){
		wordList.add(0,beginWrod);
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

	private int bfsGraph(String beginWord,String endWord,Map<String,List<String>> graph){
		Queue<Map.Entry<String,Integer>> queue = new LinkedList<>();
		queue.offer(new AbstractMap.SimpleEntry<>(beginWord,1));
		//记录已访问过的顶点
		Set<String> set = new HashSet<>();
		while(!queue.isEmpty()){
			String node = queue.peek().getKey();
			int step = queue.peek().getValue();
			queue.poll();
			if(node.equals(endWord)){
				return step;
			}
			List<String> neighbors = graph.get(node);
			if(neighbors!=null&&neighbors.size()>0){
				for(int i=0;i<neighbors.size();i++) {
					String neighbor = neighbors.get(i);
					if (!set.contains(neighbor)){
						queue.offer(new AbstractMap.SimpleEntry<>(neighbor,step+1));
						set.add(neighbor);
					}
				}
			}
		}
		return 0;
	}
}
