package com.learn.java.leetcode.lc0341;

import com.learn.java.leetcode.base.structure.NestedInteger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NestedIterator implements Iterator<Integer> {
	Queue<Integer> queue = new LinkedList<>();
	public NestedIterator(List<NestedInteger> nestedList) {
		getInteger(nestedList);
	}
	private void getInteger(List<NestedInteger> nestedList){
		for(NestedInteger nestedInteger:nestedList){
			if(nestedInteger.isInteger()){
				queue.offer(nestedInteger.getInteger());
			}else {
				getInteger(nestedInteger.getList());
			}
		}
	}

	@Override
	public Integer next() {
		return queue.poll();
	}

	@Override
	public boolean hasNext() {
		return !queue.isEmpty();
	}
}
