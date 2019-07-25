package com.learn.java.leetcode.lc0460;



import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LFUCache {

	//key,value
	private Map<Integer,Integer> valuesCache;

	//key count
	private Map<Integer,Integer> countsCache;

	//count->List<key>
	private Map<Integer,LinkedHashSet<Integer>> lists;

	private int capacity ;

	private int min = -1;




	public LFUCache(int capacity) {
		this.capacity = capacity;
		valuesCache = new HashMap<>();
		countsCache = new HashMap<>();
		lists = new HashMap<>();
		lists.put(1,new LinkedHashSet<>());

	}

	public int get(int key) {
		if(!valuesCache.containsKey(key)){
			return -1;
		}

		int count = countsCache.get(key);
		countsCache.put(key,count+1);

		lists.get(count).remove(key);

		if(count == min && lists.get(count).size()==0){
			min ++;
		}

		if(!lists.containsKey(count+1)){
			lists.put(count+1,new LinkedHashSet<>());
		}

		lists.get(count+1).add(key);

		return valuesCache.get(key);
	}

	public void put(int key, int value) {
		if(capacity<=0){
			return;
		}

		if(valuesCache.containsKey(key)){
			valuesCache.put(key,value);
			get(key);
			return;
		}
		if(valuesCache.size()>=capacity){
			int remove = lists.get(min).iterator().next();
			lists.get(min).remove(remove);
			valuesCache.remove(remove);
			countsCache.remove(remove);
		}

		valuesCache.put(key,value);
		countsCache.put(key,1);
		min = 1;
		lists.get(1).add(key);
	}
}
