package com.learn.java.leetcode.lc0342;

public class Solution {
	public boolean isPowerOfFour2(int num) {
		return Math.log10(num)/Math.log10(4)%1==0;
	}

	/**
	 * 理论上数字4幂的二进制类似于100，10000，1000000，etc...形式。可以有如下结论：
	 *
	 * 4的幂一定是2的。
	 * 4的幂和2的幂一样，只会出现一位1。但是，4的1总是出现在奇数位。
	 * 0x5 = 0101b可以用来校验奇数位上的1。
	 * @param num
	 * @return
	 */
	public boolean isPowerOfFour(int num) {
		return ((num & 0x55555555) != 0) && ((num & (num - 1)) == 0);
	}
}


