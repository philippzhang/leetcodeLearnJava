package com.learn.java.leetcode.lc0307;

import java.util.ArrayList;
import java.util.List;

public class NumArray {
	/**
	 * 线段树，建树O(NlogN),其他O(logN)
	 * @param value
	 * @param nums
	 * @param pos
	 * @param left
	 * @param right
	 */
	private void buildSegmentTree(List<Integer> value,int[] nums,int pos, int left, int right){
		if(left==right){
			value.set(pos,nums[left]);
			return;
		}
		int mid = (left+right)/2;

		buildSegmentTree(value,nums,pos*2+1,left,mid);

		buildSegmentTree(value,nums,pos*2+2,mid+1,right);

		value.set(pos,(value.get(pos*2+1)+value.get(pos*2+2)));

	}
	private  int sumRangeSegmentTree(List<Integer> value,int pos, int left,int right,int qleft,int qright){
		if(qleft>right||qright<left){
			return 0;
		}
		if(qleft<=left&&qright>=right){
			return value.get(pos);
		}
		int mid = (left+right)/2;
		return sumRangeSegmentTree(value,pos*2+1,left,mid,qleft,qright)
				+sumRangeSegmentTree(value,pos*2+2,mid+1,right,qleft,qright);
	}

	private void updateSegmentTree(List<Integer> value,int pos, int left,int right,int index, int newValue){
		if(left==right&&left==index){
			value.set(pos,newValue);
			return;
		}
		int mid = (left+right)/2;
		if(index<=mid){
			updateSegmentTree(value,pos*2+1,left,mid,index,newValue);
		}else{
			updateSegmentTree(value,pos*2+2,mid+1,right,index,newValue);
		}
		value.set(pos,(value.get(pos*2+1)+value.get(pos*2+2)));
	}

	private List<Integer> valueList;
	private int rightEnd;

	public NumArray(int[] nums) {
		if(nums==null||nums.length==0){
			return ;
		}
		valueList = new ArrayList<>();
		//一般线段树数组大小是原数组大小长度的4倍
		int n = nums.length*4;
		for(int i =0;i<n;i++){
			valueList.add(0);
		}
		buildSegmentTree(valueList,nums,0,0,nums.length-1);
		rightEnd = nums.length-1;
	}

	public void update(int i, int val) {
		updateSegmentTree(valueList,0,0,rightEnd,i,val);
	}

	public int sumRange(int i, int j) {
		return sumRangeSegmentTree(valueList,0,0,rightEnd,i,j);
	}
}
