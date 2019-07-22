package com.learn.java.leetcode.lc0895;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FreqStack {
	Map<Integer,Integer> freqMap;
	Map<Integer,Stack<Integer>> groupMap;
	int maxFreq = 0;

	public FreqStack() {
		freqMap = new HashMap<>();
		groupMap = new HashMap<>();
		maxFreq = 0;
	}

	public void push(int x) {
		int f  = !freqMap.containsKey(x)?1:freqMap.get(x)+1;
		freqMap.put(x,f);
		if(groupMap.containsKey(f)){
			groupMap.get(f).push(x);
		}else{
			Stack<Integer> stack = new Stack<>();
			stack.push(x);
			groupMap.put(f,stack);
		}
		maxFreq = f>maxFreq?f:maxFreq;
	}

	public int pop() {
		if(!groupMap.containsKey(maxFreq)||groupMap.get(maxFreq).empty()){
			return 0;
		}else{
			int x = groupMap.get(maxFreq).pop();
			freqMap.put(x,freqMap.get(x)-1);
			if(groupMap.get(maxFreq).empty()){
				groupMap.remove(maxFreq);
				maxFreq--;
			}
			return x;
		}
	}
}
