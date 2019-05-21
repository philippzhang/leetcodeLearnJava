package com.learn.java.leetcode.lc0012;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String intToRoman(int num) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1000);
		list1.add(900);
		list1.add(500);
		list1.add(400);
		list1.add(100);
		list1.add(90);
		list1.add(50);
		list1.add(40);
		list1.add(10);
		list1.add(9);
		list1.add(5);
		list1.add(4);
		list1.add(1);

		List<String> list2 = new ArrayList<>();
		list2.add("M");
		list2.add("CM");
		list2.add("D");
		list2.add("CD");
		list2.add("C");
		list2.add("XC");
		list2.add("L");
		list2.add("XL");
		list2.add("X");
		list2.add("IX");
		list2.add("V");
		list2.add("IV");
		list2.add("I");

		if (num<=0){
			return "";
		}
		if(list1.contains(num)){
			return list2.get(list1.indexOf(num));
		}

		StringBuffer stringBuffer = new StringBuffer();
		for(int i =0;i<list1.size();i++){
			int l = list1.get(i);
			if(num>=l){
				int n = num/l;
				for(int j=0;j<n;j++){
					stringBuffer.append(list2.get(i));
				}
				num = num%l;
			}
			if(num==0){
				break;
			}
		}
		return stringBuffer.toString();
	}
}
