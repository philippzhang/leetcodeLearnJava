package com.learn.java.leetcode.lc0096;

public class Solution {
	/**
	 * 动态规划
	 *
	 * 假设n个节点存在二叉排序树的个数是G(n)，令f(i)为以i为根的二叉搜索树的个数
	 *
	 * 即有:G(n) = f(1) + f(2) + f(3) + f(4) + ... + f(n)
	 *
	 * n为根节点，当i为根节点时，其左子树节点个数为[1,2,3,...,i-1]，右子树节点个数为[i+1,i+2,...n]，所以当i为根节点时，其左子树节点个数为i-1个，右子树节点为n-i，即f(i) = G(i-1)*G(n-i),
	 *
	 * 上面两式可得:G(n) = G(0)*G(n-1)+G(1)*G(n-2)+...+G(n-1)*G(0)
	 * @param n
	 * @return
	 */
	public int numTrees(int n) {
		int[] dp = new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i = 2;i<=n;i++){
			for(int j =0;j<i;j++){
				dp[i] += dp[j]*dp[i-j-1];
			}
		}
		return dp[n];
	}
}
