package com.learn.java.leetcode.lc0078;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets 78. 子集 Medium
 */
public class Solution {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		dfs(result, temp, nums, 0);
		return result;
	}

	/**
	 * 使用回溯法，递归求解，在循环中套用递归，递归中也就含有循环。
	 * <p>
	 * 创建一个result结果集合，和一个临时存放的temp集合，dfs函数得到result集合的最后结果。
	 * <p>
	 * dfs函数：先将temp集合内容添加到result集合中，然后进入循环，依次将nums数组中的数字添加到temp集合中，即temp.add(nums[i])，之后递归再次添加时添加为当前索引+1的数字即添加nums[i+1]，直到当前递归结束也就是i<nums.length，返回上层删除最新加入到temp中的数字，即temp.remove(temp.size()-1) 。
	 * <p>
	 * 也就是循环将nums数组的数字加入到temp中，递归循环，删除添加的数字。
	 *
	 * @param result
	 * @param temp
	 * @param nums
	 * @param j
	 */
	private void dfs(List<List<Integer>> result, List<Integer> temp, int[] nums, int j) {
		result.add(new ArrayList<Integer>(temp));
		for (int i = j; i < nums.length; i++) {
			temp.add(nums[i]);
			dfs(result, temp, nums, i + 1);
			temp.remove(temp.size() - 1);
		}
	}

	/**
	 * 思路： 本题利用位运算操作 来输出所有的数组情况：
	 * <p>
	 * 例如nums内 000 ，表示没有元素，001 表示只有第一个元素， 010表示只有第二个的元素，100表示 只有第三个元素
	 * <p>
	 *  那如何判断集合内有哪几个元素呢？    首先一共是有2^nums.length种情况，
	 * <p>
	 * 假如是第i种情况： i&001为真 就说明这种情况中有第一个元素，为假就说明没有
	 * <p>
	 *  然后推广一下：  i&(1<<j)为真 就说明这种情况中有第j个元素，为假就说明没有
	 * <p>
	 * 然后用两个循环就能遍历所有情况
	 *
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> subsets2(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		int all_set = 1 << nums.length;

		for (int i = 0; i < all_set; i++) {
			List<Integer> elem = new ArrayList<>();
			for (int j = 0; j < nums.length; j++) {
				if ((i & (1 << j)) != 0) {
					elem.add(nums[j]);
				}
			}
			ans.add(elem);
		}
		return ans;
	}
}
