package com.learn.java.leetcode.base.structure;

import java.util.ArrayList;
import java.util.List;

public class NestedInteger {
	// Constructor initializes an empty nested list.

	private Integer value;

	private List<NestedInteger> nestedIntegerList;

	public NestedInteger(){

	}
	// Constructor initializes a single integer.
	public NestedInteger(int value){
		this.value = value;
	}

	public NestedInteger(List<NestedInteger> nestedIntegerList){
		this.nestedIntegerList = nestedIntegerList;
	}

	// @return true if this NestedInteger holds a single integer, rather than a nested list.
	public boolean isInteger(){
		return value!=null;
	}

	// @return the single integer that this NestedInteger holds, if it holds a single integer
	// Return null if this NestedInteger holds a nested list
	public Integer getInteger(){
		return value;
	}

	// Set this NestedInteger to hold a single integer.
	public void setInteger(int value){
		this.value = value;
	}

	// Set this NestedInteger to hold a nested list and adds a nested integer to it.
	public void add(NestedInteger ni){
		if(nestedIntegerList==null){
			nestedIntegerList = new ArrayList<>();
		}
		nestedIntegerList.add(ni);
	}

	// @return the nested list that this NestedInteger holds, if it holds a nested list
	// Return null if this NestedInteger holds a single integer
	public List<NestedInteger> getList(){
		return nestedIntegerList;
	}
}
