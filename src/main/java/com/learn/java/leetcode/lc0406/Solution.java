package com.learn.java.leetcode.lc0406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	/**
	 * 归约：先将原数组根据子数组第一个元素进行降序排序，得到一个身高从高到矮的列表。
	 * 贪心算法求解：从头开始遍历，以子数组的第二个元素作为索引插入到列表中相应位置（插队），直到遍历完成，则队列重建完毕。
	 * @param people
	 * @return
	 */
	public int[][] reconstructQueue(int[][] people) {
		if(people.length==0||people[0].length==0){
			return new int[0][0];
		}
		//按身高降序，K升序排序
		Arrays.sort(people, (o1, o2) -> o1[0] == o2[0]?o1[1]-o2[1]:o2[0]-o1[0]);

		List<int[]> list = new ArrayList<>();
		//K值定义为 排在h前面且身高大于或等于h的人数
		//因为从身高降序开始插入，此时所有人身高都大于等于h
		//因此K值即为需要插入的位置
		for(int i = 0;i<people.length;i++){
			list.add(people[i]);
		}

		for(int i = 0;i<list.size();i++){
			int[] temp = list.get(i);
			list.remove(i);
			list.add(temp[1],temp);
		}

		return list.toArray(new int[list.size()][]);
	}
}
