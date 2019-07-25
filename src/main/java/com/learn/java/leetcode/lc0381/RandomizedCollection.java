package com.learn.java.leetcode.lc0381;

import java.util.*;

/**
 * 维护一个list存储所有val的值
 * 维护一个map存储每个val在List的位置
 * 随机只需要再list随机
 * 删除操作是将所要删除的数将在list中最后一个位置的数放到所要删除的位置
 * 在更新一下最有一个数在map中的位置即可
 */
public class RandomizedCollection {
	private Map<Integer,Set<Integer>> map;
	private List<Integer> list;
	private Random random  ;
	int size;
	/** Initialize your data structure here. */
	public RandomizedCollection() {
		map = new HashMap<>(16);
		list = new ArrayList<>();
		random = new Random();
		size = 0;
	}

	/** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
	public boolean insert(int val) {
		if(map.containsKey(val)){
			Set<Integer> indexes = map.get(val);
			list.add(size,val);
			indexes.add(size);
			size++;
			return false;
		}else {
			Set<Integer> indexes = new HashSet<>();
			list.add(size,val);
			indexes.add(size);
			map.put(val,indexes);
			size++;
			return true;
		}
	}

	/** Removes a value from the collection. Returns true if the collection contained the specified element. */
	public boolean remove(int val) {
		if(!map.containsKey(val)){
			return false;
		}
		Set<Integer> indexes = map.get(val);
		if(list.get(size-1)==val){
			indexes.remove(size-1);
			size--;
		}else {
			Iterator<Integer> it = indexes.iterator();
			int index = it.next();
			it.remove();
			int last = list.get(size - 1);
			list.set(index, last);
			Set<Integer> ret = map.get(last);
			ret.remove(size - 1);
			ret.add(index);
			size--;
		}


		if(indexes.size()==0){
			map.remove(val);
		}
		return true;
	}

	/** Get a random element from the collection. */
	public int getRandom() {
		return list.get(random.nextInt(size));
	}
}
