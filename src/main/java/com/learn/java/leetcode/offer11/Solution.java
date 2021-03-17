package com.learn.java.leetcode.offer11;

public class Solution {
	public int minArray(int[] numbers) {
		if(numbers==null||numbers.length<0){
			return Integer.MIN_VALUE;
		}
		if(numbers.length==1){
			return numbers[0];
		}
		if(numbers.length==2){
			return Math.min(numbers[0],numbers[1]);
		}
		int left = 0,right = numbers.length-1;
		while(left<right){
			int mid = (left+right)/2;
			if(numbers[mid]<numbers[right]){
				right = mid;
			}else if(numbers[mid]>numbers[right]){
				left = mid+1;
			}else{
				//相等时退位
				right--;
			}
		}
		return numbers[left];

	}
}
