package com.learn.java.leetcode.lc0341;

import java.util.List;

public class NestedIntegerImpl implements NestedInteger {
	private Object obj;
	public NestedIntegerImpl(Object obj){
		this.obj = obj;
	}
	@Override
	public boolean isInteger() {
		return obj instanceof Integer;
	}

	@Override
	public Integer getInteger() {
		return (obj instanceof Integer)? Integer.valueOf(obj.toString()):null;
	}

	@Override
	public List<NestedInteger> getList() {
		return (List<NestedInteger>)obj;
	}
}
