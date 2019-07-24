package com.learn.java.algorithm.search;

/**
 * 查找算法类
 */
public class MySearch {
	/**
	 * 顺序查找
	 */
	public static int seqSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 二分法查找(折半查找)
	 * 条件：
	 * 顺序存储的有序表(从小到大)
	 */
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			//中间位置，当前比较的数据元素位置
			int mid = (low + high) / 2;
			if (key < arr[mid]) {
				high = mid - 1;
			} else if (key > arr[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	/**
	 * 测试
	 */
	public static void main(String[] args) {
		int[] arr = {7,5,2,3,4,9,1,0,2};
		System.out.println(MySearch.seqSearch(arr, 7));

		int[] brr = {1,2,3,4,5,6,7,8,9};
		System.out.println(MySearch.binarySearch(brr, 7));
	}

}
