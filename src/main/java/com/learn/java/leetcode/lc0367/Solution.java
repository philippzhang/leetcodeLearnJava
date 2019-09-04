package com.learn.java.leetcode.lc0367;

public class Solution {
	public boolean isPerfectSquare(int num) {
		//牛顿迭代法
		if(1 == num) {
			return true;
		}
		int i = num / 2;
		while((double)i * i > num){
			i = (i + num / i) / 2;
		}
		return i * i == num;
	}


	public boolean isPerfectSquare2(int num){
		//二分查找
		 int left = 1;
		 int right = num;
		 while(left <= right){
		     int mid = (left + right) >>> 1;
		     if((double)mid * mid < num) {
				 left = mid + 1;
			 } else if((double)mid * mid > num) {
				 right = mid - 1;
			 } else {
				 return true;
			 }
		 }
		 return false;

	}
}
