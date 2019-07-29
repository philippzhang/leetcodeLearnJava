package com.learn.java.leetcode.lc0137;

public class Solution {
	public int singleNumber2(int[] nums) {
		int one = 0, two = 0, three;
		for (int num : nums) {
			// two的相应的位等于1，表示该位出现2次
			two |= (one & num);
			// one的相应的位等于1，表示该位出现1次
			one ^= num;
			// three的相应的位等于1，表示该位出现3次
			three = (one & two);
			// 如果相应的位出现3次，则该位重置为0
			two &= ~three;
			one &= ~three;
		}
		return one;
	}

	/**
	 * 假设有一个数为x,那么则有如下规律：
	 * 0 ^ x = x,
	 *
	 * x ^ x = 0；
	 *
	 * x & ~x = 0,
	 *
	 * x & ~0 =x;
	 *
	 * -那么就是很好解释上面的代码了。一开始a = 0, b = 0;
	 *
	 * x第一次出现后，a = (a ^ x) & ~b的结果为 a = x, b = (b ^ x) & ~a的结果为此时
	 * 因为a = x了，所以b = 0。
	 *
	 * x第二次出现：a = (a ^ x) & ~b, a = (x ^ x) & ~0, a = 0; b = (b ^ x) & ~a
	 * 化简， b = (0 ^ x) & ~0 ,b = x;
	 *
	 * x第三次出现：a = (a ^ x) & ~b， a = (0 ^ x) & ~x ,a = 0; b = (b ^ x) & ~a
	 * 化简， b = (x ^ x) & ~0 , b = 0;所以出现三次同一个数，a和b最终都变回了0.
	 *
	 * 只出现一次的数，按照上面x第一次出现的规律可知a = x, b = 0;因此最后返回a.
	 * @param nums
	 * @return
	 */
	public int singleNumber(int[] nums) {
		int a = 0, b = 0;
		for (int num : nums)
		{
			a = (a ^ num) & ~b;
			b = (b ^ num) & ~a;
		}
		return a;
	}
}
