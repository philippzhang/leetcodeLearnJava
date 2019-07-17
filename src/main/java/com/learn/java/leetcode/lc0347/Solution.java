package com.learn.java.leetcode.lc0347;

import java.util.*;

public class Solution {
	/**
	 * 堆排序
	 * @param nums
	 * @param k
	 * @return
	 */
	public List<Integer> topKFrequent2(int[] nums, int k) {
		Map<Integer,Integer> words = new HashMap<>();
		for(int n:nums){
			words.put(n,words.getOrDefault(n,0)+1);
		}


		PriorityQueue<AbstractMap.SimpleEntry<Integer,Integer>> heap = new PriorityQueue<>(k, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

		for(Map.Entry<Integer,Integer> entry:words.entrySet()){
			if(heap.size()<k){
				heap.add(new AbstractMap.SimpleEntry(entry.getKey(),entry.getValue()));
			}else if(entry.getValue()>heap.peek().getValue()){
				heap.remove();
				heap.add(new AbstractMap.SimpleEntry(entry.getKey(),entry.getValue()));
			}
		}

		List<Integer> results = new ArrayList<>();


		while(!heap.isEmpty()){
			results.add(heap.remove().getKey());
		}
		Collections.reverse(results);
		return results;
	}

	/**
	 * 桶排序
	 * @param nums
	 * @param k
	 * @return
	 */
	public List<Integer> topKFrequent(int[] nums, int k) {
		int max  = 0;
		Map<Integer,Integer> words = new HashMap<>();
		for(int n:nums){
			words.put(n,words.getOrDefault(n,0)+1);
			max = Math.max(words.get(n),max);
		}
		//需要注意的是：这里new的只是一个引用变量数组，它们初始化是指向null的
		List<Integer>[] buckets = new ArrayList[max + 1];
		//将每个数插入索引为它的频次的那个桶里
		for(int num : words.keySet()){
			int frequency = words.get(num);
			if(buckets[frequency] == null){
				buckets[frequency] = new ArrayList<>();
			}
			buckets[frequency].add(num);
		}
		//由于桶的索引的含义是数出现的频次，越在数组后面的频次就越高
		//想要求出频次最高的k个数，只需要倒着遍历桶即可
		//这里做的是将倒着遍历到的k个数放入要作为结果返回的List中
		List<Integer> results = new ArrayList<>();
		for(int i = max; i >= 0 && k > 0; i--){
			if(buckets[i] != null){
				//桶的索引的含义是数的频次，因此一个桶里可能有多个数
				for(int num : buckets[i]){
					if(k > 0){
						k--;
						results.add(num);
					}else{
						break;
					}
				}
			}
		}
		return results;
	}
}
