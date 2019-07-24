package com.learn.java.leetcode.lc0284;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {

	private Iterator<Integer> iterator;
	private Integer cache = null;
	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.
		this.iterator = iterator;
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		if(cache==null){
			cache = iterator.next();
		}
		return cache;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		if(cache==null&&iterator.hasNext()){
			return iterator.next();
		}else{
			Integer temp = cache;
			cache = null;
			return temp;
		}

	}

	@Override
	public boolean hasNext() {
		return cache!=null||iterator.hasNext();
	}
}
