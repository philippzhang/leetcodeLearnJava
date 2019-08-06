package com.learn.java.leetcode.lc0260;

public class Solution {
	/**
	 有两个数只出现了一次记为 num1、num2 初始化为 0, 其余的数出现了两次,
	 我们可以对所有的数进行一次异或操作, 易知这个结果就等于 num1 和 num2
	 的异或结果(相同的数异或结果都为 0, 0和任意数异或结果都为那个数).

	 那么我可以考虑异或结果的某个非 0 位如最后一个非 0 位, 因为我们知道只
	 有当 num1、num2 在该位不一样的时候才会出现异或结果为 1. 所以我们以该
	 位是否为 1 对数组进行划分, 只要该位为 1 就和 num1 异或, 只要该位为 0
	 就和 num2 异或, 这样最终得到就是只出现过一次的两个数(其他在该位为 1 或
	 0 的数必然出现 0/2 次对异或结果无影响)
	 **/

	public int[] singleNumber(int[] nums) {
		int num1 =0, num2 = 0;
		int xor =0;
		for(int num:nums){
			xor ^= num;
		}
		int bit1 = 1;
		while((xor&1)==0){
			xor>>=1;
			bit1<<=1;
		}

		for(int num:nums){
			if((num&bit1)==0){
				num1^=num;
			}else {
				num2^=num;
			}
		}

		return new int[]{num1,num2};
	}
}
