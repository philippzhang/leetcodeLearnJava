package com.learn.java.leetcode.offer64;

public class Solution {
	public int sumNums(int n) {
		boolean flag = n>0 && (n+=sumNums(n-1))>0;
		return n;
	}

	/**
	 * 采用俄罗斯农业乘法
	 * 考虑 A 和 B 两数相乘的时候我们如何利用加法和位运算来模拟，
	 * 其实就是将 B 二进制展开，如果 B 的二进制表示下第 ii 位为 1，
	 * 那么这一位对最后结果的贡献就是 A*(1<<i)A∗(1<<i) ，即 A<<iA<<i。
	 * 我们遍历 B 二进制展开下的每一位，将所有贡献累加起来就是最后的答案
	 *
	 * A*B =
	 * int quickMulti(int A, int B) {
	 *     int ans = 0;
	 *     for ( ; B; B >>= 1) {
	 *         if (B & 1) {
	 *             ans += A;
	 *         }
	 *         A <<= 1;
	 *     }
	 *     return ans;
	 * }
	 *
	 *
	 * 由等差数列求和公式我们可以知道，那么等式变成了 n(n+1)>>1
	 * ，剩下不符合题目要求的部分即为 n(n+1)，
	 * 根据上文提及的快速乘，我们可以将两个数相乘用加法和位运算来模拟，
	 * 但是可以看到上面的 实现里我们还是需要循环语句，有没有办法去掉这个循环语句呢？
	 * 答案是有的，那就是自己手动展开，因为题目数据范围 nn 为 [1,10000]
	 * 所以 n 二进制展开最多不会超过 14 位，我们手动展开 14 层代替循环即可，至此满足了题目的要求
	 *
	 *
	 * @param n
	 * @return
	 */
	public int sumNums2(int n) {
		int ans = 0, A = n, B = n + 1;
		boolean flag;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		flag = ((B & 1) > 0) && (ans += A) > 0;
		A <<= 1;
		B >>= 1;

		return ans >> 1;
	}

}
