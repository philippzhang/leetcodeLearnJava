package com.learn.java.leetcode.offer65;

public class Solution {
	/**
	 * {
	 * n=a⊕b
	 * c=a&b<<1
	 *
	 * 非进位和：异或运算
	 * 进位：与运算+左移一位
	 *
	 *
	 * （和 ss ）==（非进位和 nn ）++（进位 cc ）。即可将 s = a + bs=a+b 转化为：
	 *
	 * s = a + b => s = n + c
	 * s=a+b⇒s=n+c
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b) {
		while (b!=0){
			int c = (a&b)<<1;
			a ^= b;
			b = c;
		}
		return a;
	}
}
