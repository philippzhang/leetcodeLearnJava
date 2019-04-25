package com.learn.java.leetcode.lc0070;

/**
 * 70. Climbing Stairs 70. 爬楼梯 Easy
 */
public class Solution {

	/**
	 * 这个问题似乎是一个动态编程问题。提示：标签也表明了这一点！下面是逐步获得解决方案的步骤。
	 * <p>
	 * 基本案例：
	 * <p>
	 * 如果n<=0，则通道数应为零。如果n==1，那么只有爬楼梯的方法。如果n=2，那么有两种爬楼梯的方法。一个解决方案是一步一步，另一个解决方案是一次两步。
	 * <p>
	 * 解决这个问题的关键直觉是，给定一个楼梯数n，如果我们知道到达点[n-1]和[n-2]的方法，分别表示为n1和n2，那么到达点[n]的总方法是n1+
	 * <p>
	 * N2。因为从[N-1]点出发，我们可以走一步到达[N]。从n-2点出发，我们可以采取两个步骤到达那里。这两个解集之间没有重叠，因为我们在最后一步有所不同。
	 * <p>
	 * 现在，根据上述直觉，我们可以构造一个数组，其中每个节点存储每个数字n的解。或者，如果我们仔细观察它，很明显这基本上是一个斐波那契数，起始数字是1和2，而不是1和1。
	 *
	 * @param n
	 * @return
	 */
	public int climbStairs(int n) {
		if (n == 0 || n == 1 || n == 2) {
			return n;
		}
		int[] feb = new int[n];
		feb[0] = 1;
		feb[1] = 2;
		for (int i = 2; i < n; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
		}
		return feb[n - 1];
	}


	public int climbStairs2(int n) {
		int a = 1, b = 1;
		while (n-- > 0) {
			a = (b += a) - a;
		}
		return a;
	}
}
