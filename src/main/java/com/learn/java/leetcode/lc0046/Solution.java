package com.learn.java.leetcode.lc0046;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 46. Permutations 46. 全排列 Medium
 */
public class Solution {
	/**
	 * 非递归
	 *
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return res;
		}
		List<Integer> first = new ArrayList<>();
		first.add(nums[0]);
		res.add(first);     //res.add(new ArrayList<>(nums[0]));//不能这样写
		List<List<Integer>> newRes;
		for (int i = 1; i < nums.length; i++) {
			newRes = new ArrayList<>();
			for (List<Integer> item : res) {
				for (int j = 0; j <= item.size(); j++) { //注意这里是<= 有这么多个位置可以插入
					List<Integer> temp = new ArrayList<>(item);
					temp.add(j, nums[i]); //在j位置放入nums[i]
					newRes.add(temp);
				}
			}
			res = newRes;
		}
		return res;
	}

	/**
	 * 非递归
	 *
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> permute3(int[] nums) {
		LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
		res.add(new ArrayList<>());
		for (int i = 0; i < nums.length; i++) {
			int size = res.size();
			for (; size > 0; size--) {
				List<Integer> item = res.pollFirst(); //每次取出来一个并且弹出
				for (int j = 0; j <= item.size(); j++) {
					List<Integer> temp = new ArrayList<>(item);
					temp.add(j, nums[i]);
					res.add(temp);
				}
			}
		}
		return res;
	}

	/**
	 * 第一种递归实现，交换元素
	 *
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> permute1(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		dfs(res, nums, 0);
		return res;
	}

	public void dfs(List<List<Integer>> res, int[] nums, int cur) {
		if (cur == nums.length) {
			List<Integer> temp = new ArrayList<>();
			for (Integer item : nums) {
				temp.add(item);
			}
			res.add(temp);
		} else {
			for (int i = cur; i < nums.length; i++) {
				swap(nums, cur, i);
				dfs(res, nums, cur + 1);
				//这里一定要交换回来，因为不是和C++一样是数组的拷贝，Java中是数组的引用，不能改变，不然得不到正确的结果
				swap(nums, cur, i);
			}
		}
	}

	public void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	/**
	 * 第二种递归实现：利用一个bool数组标记是否被访问
	 *
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> permute2(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		dfs(res, new ArrayList<>(), nums, new boolean[nums.length]);
		return res;
	}

	public void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] used) {
		if (temp.size() == nums.length) {
			//注意不能直接添加temp
			//以一个集合或数组初始化ArrayList al = new ArrayList(a);//a为集合或数组
			res.add(new ArrayList<>(temp));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!used[i]) {//记录某个下标的数是否被使用过
				temp.add(nums[i]);
				used[i] = true;
				dfs(res, temp, nums, used);
				temp.remove(temp.size() - 1); //移除最后一个
				used[i] = false;
			}
		}
	}

}
