package com.learn.java.leetcode.test001;

public class Test {

	public static int cal(int n){
		if (n <= 1) {
			return n;
		}

		return cal(n-1)+n;

	}

	public static void main(String[] args) {

		System.out.println(cal(1000));

	}
}
