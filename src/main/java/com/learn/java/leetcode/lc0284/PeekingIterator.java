package com.learn.java.leetcode.lc0284;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {

	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.

	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return 0;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		return 0;
	}

	@Override
	public boolean hasNext() {
		return true;
	}
}
