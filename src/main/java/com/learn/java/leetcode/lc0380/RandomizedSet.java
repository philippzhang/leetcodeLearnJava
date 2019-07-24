package com.learn.java.leetcode.lc0380;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {
	private Map<Integer,Integer> map;
	/** Initialize your data structure here. */
	public RandomizedSet() {
		map = new HashMap<>(16);
	}

	/** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	public boolean insert(int val) {
		if(map.containsKey(val)){
			return false;
		}else {
			map.put(val,val);
			return true;
		}
	}

	/** Removes a value from the set. Returns true if the set contained the specified element. */
	public boolean remove(int val) {
		if(map.containsKey(val)){
			map.remove(val);
			return true;
		}else {
			return false;
		}
	}

	/** Get a random element from the set. */
	public int getRandom() {
		Integer[] keys =  map.keySet().toArray(new Integer[]{});
		return keys[new Random().nextInt(keys.length)];
	}
}
