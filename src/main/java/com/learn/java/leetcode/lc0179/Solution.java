package com.learn.java.leetcode.lc0179;

import java.util.Arrays;


public class Solution {
	public String largestNumber(int[] nums) {
		String[] strNums = new String[nums.length];
		for(int i = 0;i<nums.length;i++){
			strNums[i] = String.valueOf(nums[i]);
		}

		Arrays.sort(strNums, (a, b) -> {
			String order1 = a + b;
			String order2 = b + a;
			return order2.compareTo(order1);
		});

		if(strNums[0].equals("0")){
			return "0";
		}

		StringBuffer stringBuffer = new StringBuffer();
		for(String s:strNums){
			stringBuffer.append(s);
		}
		return stringBuffer.toString();

	}
}
