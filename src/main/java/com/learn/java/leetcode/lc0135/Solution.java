package com.learn.java.leetcode.lc0135;

import java.util.Arrays;

public class Solution {
	/**
	 * 暴力求解 时间 O(n^2) 空间O(n)
	 * 最简单的方法是使用一个一维的数组 candiescandies 去记录给学生的糖果数。
	 * 首先我们给每个学生 1 个糖果。然后我们开始从左到右扫描数组。
	 * 对每一个学生，如果当前的评分 ratings[i]ratings[i] 比前一名学生的评分
	 * ratings[i - 1]ratings[i−1] 高，且 candies[i]<=candies[i - 1]candies[i]<=candies[i−1] ，
	 * 那么我们更新 candies[i] = candies[i-1] + 1candies[i]=candies[i−1]+1。
	 * 这样，这两名学生之间的糖果分配目前是正确的。同样的，我们检查当前学生的评分
	 * ratings[i]ratings[i] 是否比 ratings[i+1]ratings[i+1] 高，如果成立，
	 * 我们同样更新 candies[i]=candies[i+1] + 1candies[i]=candies[i+1]+1 。
	 * 我们继续对 ratingsratings 数组重复此步骤。如果在某次遍历中， candiescandies 数组不再变化，
	 * 意味着我们已经得到了最后的糖果分布，此时可以停止遍历。
	 * 为了记录是否到达最终状态，我们用 flagflag 记录每次遍历是否有糖果数目变化，
	 * 如果有，则为 True ，否则为 False 。
	 *
	 * @param ratings
	 * @return
	 */
	public int candy1(int[] ratings) {
		int[] candies = new int[ratings.length];
		Arrays.fill(candies,1);
		boolean flag = true;
		int sum = 0;
		while(flag){
			flag = false;
			for(int i = 0;i<ratings.length;i++){
				if(i!=ratings.length-1&&ratings[i]>ratings[i+1]&&candies[i]<=candies[i+1]){
					candies[i]=candies[i+1]+1;
					flag = true;
				}
				if(i>0&&ratings[i]>ratings[i-1]&&candies[i]<=candies[i-1]){
					candies[i]=candies[i-1]+1;
					flag = true;
				}
			}
		}
		for(int candy:candies){
			sum+=candy;
		}
		return sum;
	}

	/**
	 * 使用两个数组
	 * 时间O(n),空间O(n)
	 *
	 * @param ratings
	 * @return
	 */
	public int candy2(int[] ratings) {
		int sum = 0;
		int[] left2right = new int[ratings.length];
		int[] right2left = new int[ratings.length];
		Arrays.fill(left2right,1);
		Arrays.fill(right2left,1);
		for(int i = 1;i<ratings.length;i++){
			if(ratings[i]>ratings[i-1]){
				left2right[i] = left2right[i-1]+1;
			}
		}
		for(int i =ratings.length-2;i>=0;i--){
			if(ratings[i]>ratings[i+1]){
				right2left[i]=right2left[i+1]+1;
			}
		}
		for(int i = 0;i<ratings.length;i++){
			sum+=Math.max(left2right[i],right2left[i]);
		}
		return sum;
	}

	/**
	 * 使用一个数组
	 * 时间O(n),空间O(n)
	 *
	 * @param ratings
	 * @return
	 */
	public int candy(int[] ratings) {
		int[] candies = new int[ratings.length];
		Arrays.fill(candies, 1);
		for(int i = 1;i<ratings.length;i++){
			if(ratings[i]>ratings[i-1]){
				candies[i]=candies[i-1]+1;
			}
		}
		int sum = candies[ratings.length-1];
		for(int i =ratings.length-2;i>=0;i--){
			if(ratings[i]>ratings[i+1]){
				candies[i] = Math.max(candies[i],candies[i+1]+1);
			}
			sum+=candies[i];
		}
		return sum;
	}
}
