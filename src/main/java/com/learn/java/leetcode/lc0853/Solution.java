package com.learn.java.leetcode.lc0853;

import com.learn.java.leetcode.base.utils.Print;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	/**
	 * 解法：先把车按照位置进行排序，然后计算出每个车在无阻拦的情况下到达终点的时间，如果后面的车到达终点所用的时间比前面车小，那么说明后车会比前面的车先到，由于后车不能超过前车，所以这种情况下就会合并成一个车队。
	 * 用栈来存，对时间进行遍历，对于那些应该合并的车不进栈就行了，最后返回栈的长度。或者直接用一个变量存最近前车到达时间，用另一变量记录车队的数量，如果循环的时间大于记录的前车时间，则当前的车不会比之前的车先到达，为一个新车队，更新变量。
	 * @param target
	 * @param position
	 * @param speed
	 * @return
	 */
	public int carFleet(int target, int[] position, int[] speed) {
		if(position==null||position.length==0){
			return 0;
		}
		if(position.length==1){
			return 1;
		}
		double[][] cars = new double[position.length][2];
		for(int i =0 ;i<position.length;i++){
			cars[i] = new double[]{position[i],(double)(target-position[i])/(speed[i])};
		}
		Arrays.sort(cars, Comparator.comparingDouble(a -> a[0]));
		double cur = 0;
		int res = 0;

		//从后往前比较
		for (int i = position.length - 1; i >= 0; i--) {
			if (cars[i][1] > cur) {
				cur = cars[i][1];
				res++;
			}
		}
		return res;

	}
}
