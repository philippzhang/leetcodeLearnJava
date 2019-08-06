package com.learn.java.leetcode.lc0258;

public class Solution {
	public int addDigits2(int num) {
		int sum = 0;
		while(num>=10){
			sum = 0;
			while(num>0){
				sum += num%10;
				num/=10;
			}
			num = sum;
		}

		return num;
	}

	/**
	 *  O(1)
	 *  设三位数 n = 100a + 10b + c 则 n - ( a+b+c) = 99a + 9b 也就是说每次n的各位求和结果与原n相比，
	 *  都减少了9的倍数（它俩的差是9的倍数），所以n对9取余的结果就是所求结果。
	 *  n为其他位数时等同，注意 n > 0 且 n % 9 == 0 时，结果应为9
	 *
	 * @param num
	 * @return
	 */
	public int addDigits(int num) {
		int res = num % 9;
		if( res == 0 && num > 0) {
			return 9;
		} else {
			return res;
		}
	}
}
