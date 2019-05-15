package com.learn.java.leetcode.lc0315;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	class KV<T>{
		private T key;
		private T value;

		public KV(T key, T value) {
			this.key = key;
			this.value = value;
		}

		public T getKey() {
			return key;
		}

		public void setKey(T key) {
			this.key = key;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}
	}
	public List<Integer> countSmaller(int[] nums) {
		int[] counts = new int[nums.length];
		List<KV<Integer>> list = new ArrayList<>();
		for(int i =0;i<nums.length;i++){
			list.add(new KV(nums[i],i));
			counts[i]=0;
		}
		mergeSort(counts,list);
		List<Integer> results = new ArrayList<>();
		for(int i =0;i<counts.length;i++){
			results.add(counts[i]);
		}
		return results;
	}

	private void mergeSort(int[] counts,List<KV<Integer>> list){
		if(list.size()<2){
			return ;
		}
		int mid = list.size()/2;
		List<KV<Integer>> list1 = new ArrayList<>();
		List<KV<Integer>> list2 = new ArrayList<>();
		for(int i = 0;i<mid;i++){
			list1.add(list.get(i));
		}
		for(int i = mid;i<list.size();i++){
			list2.add(list.get(i));
		}
		mergeSort(counts,list1);
		mergeSort(counts,list2);
		list.clear();
		mergeTwoList(list1,list2,list,counts);
	}

	private void mergeTwoList(List<KV<Integer>> list1,List<KV<Integer>> list2,List<KV<Integer>> list,int[] counts){
		int i =0;
		int j =0;
		while(i<list1.size()&&j<list2.size()){
			if(list1.get(i).getKey()<=list2.get(j).getKey()){
				counts[list1.get(i).getValue()]+=j;
				list.add(list1.get(i));
				i++;
			}else{
				list.add(list2.get(j));
				j++;
			}
		}
		for(;i<list1.size();i++){
			counts[list1.get(i).getValue()]+=j;
			list.add(list1.get(i));
		}
		for(;j<list2.size();j++){
			list.add(list2.get(j));
		}
	}
}
