package com.learn.java.algorithm.sort;

import com.learn.java.algorithm.nolinear.heap.Heap;

import java.util.Arrays;

/**
 * 1.顺序存储结构
 * 2.整型数组为例
 * 3.从小到大排序
 */
public class SortArray {
	/**
	 * 两个整型数组交换
	 */
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * 冒泡排序
	 * 时间复杂度：O(n2)
	 * 空间复杂度：O(1)
	 * 稳定的排序算法
	 */
	public static int[] bubbleSort(int[] arr) {
		if (arr==null||arr.length < 2) {
			return arr;
		}
		boolean flag = true;
		for (int i = 1; i < arr.length && flag; i++) {
			flag = false;
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					flag = true;
				}
			}
		}
		return arr;
	}

	/**
	 * 直接选择排序
	 * 时间复杂度：O(n2)
	 * 空间复杂度：O(1)
	 * 稳定的排序算法
	 */
	public static int[] selectSort(int[] arr) {
		if (arr==null||arr.length < 2) {
			return arr;
		}
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					min = j;
				}
			}
			swap(arr, i, min);
		}
		return arr;
	}

	/**
	 * 直接插入排序
	 * 时间复杂度：O(n2)
	 * 空间复杂度：O(1)
	 * 稳定的排序算法
	 */
	public static int[] insertSort(int[] arr) {
		if (arr==null||arr.length < 2) {
			return arr;
		}
		int temp;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			int j;
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			//存在比其小的数，插入
			arr[j + 1] = temp;
		}
		return arr;
	}

	/**
	 * 希尔排序
	 * 时间复杂度：平均：O(nlogn), 最坏为O(n2)
	 * 空间复杂度：O(1)
	 * 不稳定的排序算法
	 */

	public static int[] shellSort(int[] arr) {
		if (arr==null||arr.length < 2) {
			return arr;
		}
		//希尔排序 knuth 间隔序列 3h+1
		int step = 1;
		int len = arr.length;
		while (step <= len / 3) {
			step = step * 3 + 1;
		}
		while (step > 0) {
			int temp;
			for (int i = step; i < len; i++) {
				temp = arr[i];
				int j;
				for (j = i - step; j >= 0 && arr[j] > temp; j -= step) {
					arr[j + step] = arr[j];
				}
				//存在比其小的数，插入
				arr[j + step] = temp;
			}
			step = (step - 1) / 3;
		}

		return arr;
	}

	/**
	 * 快速排序
	 * 时间复杂度：平均：O(nlogn), 最坏为O(n2)
	 * 空间复杂度：O(logn), 最坏为O(n)
	 * 不稳定的排序算法
	 */
	public static int[] quickSort(int[] arr) {
		if (arr==null||arr.length < 2) {
			return arr;
		}
		return quickSort(arr, 0, arr.length - 1);
	}

	private static int[] quickSort(int[] arr, int left, int right) {
		if (right <= left) {
			int partition = partitionIt(arr, left, right);
			// 对上一轮排序(切分)时，基准元素左边的子数组进行递归
			quickSort(arr, left, partition - 1);
			// 对上一轮排序(切分)时，基准元素右边的子数组进行递归
			quickSort(arr, partition + 1, right);
		}
		return arr;
	}

	//一趟快速排序
	private static int partitionIt(int[] array, int left, int right) {
		//为什么 j加一个1，而i没有加1,是因为下面的循环判断是从--j和++i开始的.
		//而基准元素选的array[left],即第一个元素，所以左游标从第二个元素开始比较
		int i = left;
		int j = right ;
		// pivot 为选取的基准元素（头元素）
		int pivot = array[left];
		while (i<j) {
			while (i < j && array[j] >= pivot) {
				j--;
			}
			while (i < j && array[i] <= pivot) {
				i++;
			}
			if(i<j){
				swap(array,i,j);
			}
		}
		//基准元素和游标相遇时所指元素交换，为最后一次交换
		swap(array, left, j);
		// 一趟排序完成， 返回基准元素位置(注意这里基准元素已经交换位置了)
		return j;
	}


	//取数组下标第一个数、中间的数、最后一个数的中间值
	private static int medianOf3(int[] array, int left, int right) {
		int center = (right - left) / 2 + left;
		if (array[left] > array[right]) {
			//得到 array[left] < array[right]
			swap(array, left, right);
		}
		if (array[center] > array[right]) {
			//得到 array[left] array[center] < array[right]
			swap(array, center, right);
		}
		if (array[center] > array[left]) {
			//得到 array[center] <  array[left] < array[right]
			swap(array, center, left);
		}
		//array[left]的值已经被换成三数中的中位数， 将其返回
		return array[left];
	}

	/**
	 * 对划分进行优化
	 *
	 * @param array
	 * @param left
	 * @param right
	 * @return
	 */
	private static int partitionIt2(int[] array, int left, int right) {
		//为什么 j加一个1，而i没有加1,是因为下面的循环判断是从--j和++i开始的.
		//而基准元素选的array[left],即第一个元素，所以左游标从第二个元素开始比较
		int i = left;
		int j = right + 1;
		int pivot = array[left];// pivot 为选取的基准元素（头元素）

		int size = right - left + 1;
		if (size >= 3) {
			pivot = medianOf3(array, left, right); //数组范围大于3，基准元素选择中间值。
		}
		while (true) {
			while (i < right && array[++i] < pivot) {
			}

			while (j > 0 && array[--j] > pivot) {
			}

			if (i >= j) {// 左右游标相遇时候停止， 所以跳出外部while循环
				break;
			} else {
				swap(array, i, j);// 左右游标未相遇时停止, 交换各自所指元素，循环继续
			}
		}
		swap(array, left, j);//基准元素和游标相遇时所指元素交换，为最后一次交换
		return j;// 一趟排序完成， 返回基准元素位置(注意这里基准元素已经交换位置了)
	}

	/**
	 * 堆排序算法的性能分析：
	 *
	 * 　　空间复杂度:o(1)；
	 *
	 * 　　时间复杂度:建堆：o(n)，每次调整o(log n)，故最好、最坏、平均情况下：o(n*logn);
	 *
	 * 　　稳定性：不稳定
	 * @param arr
	 * @return
	 */
	public static int[] heapSort(int[] arr) {
		if (arr==null||arr.length < 2) {
			return arr;
		}
		Heap<Integer> heap = new Heap(arr.length);
		//构建堆
		for(int i = 0;i<arr.length;i++){
			heap.insert(arr[i]);
		}
		for(int i = arr.length-1;i>=0;i--){
			int top = heap.getTop();
			arr[i]=top;
			heap.remove();
		}
		return arr;
	}

	/**
	 * 归并排序
	 * 时间复杂度：O(nlogn)
	 * 空间复杂度：O(n)
	 * 稳定的排序算法
	 */

	public static int[] mergeSort(int[] arr) {
		if (arr==null||arr.length < 2) {
			return arr;
		}
		int mid = arr.length/2;
		int[] leftArr = Arrays.copyOfRange(arr,0,mid);
		int[] rightArr = Arrays.copyOfRange(arr,mid,arr.length);
		return merge(mergeSort(leftArr),mergeSort(rightArr));
	}

	private static int[] merge(int[] leftArr,int[] rightArr){
		int[] r = new int[leftArr.length+rightArr.length];
		for(int index=0,i=0,j=0;index<r.length;index++){
			if(i>=leftArr.length){
				r[index]=rightArr[j++];
			}else if(j>=rightArr.length){
				r[index]=leftArr[i++];
			}else if(leftArr[i]<rightArr[j]){
				r[index]=leftArr[i++];
			}else{
				r[index]=rightArr[j++];
			}
		}
		return r;
	}

	public static void main(String[] args) {
		int[] arr = {7, 2, 4, 5, 3, 6, 2, 8};
		int[] brr = null;

		brr = SortArray.bubbleSort(arr);
		System.out.println(Arrays.toString(brr));

		brr = SortArray.selectSort(arr);
		System.out.println(Arrays.toString(brr));

		brr = SortArray.insertSort(arr);
		System.out.println(Arrays.toString(brr));

		brr = SortArray.shellSort(arr);
		System.out.println(Arrays.toString(brr));

		brr = SortArray.quickSort(arr);
		System.out.println(Arrays.toString(brr));

		brr = SortArray.heapSort(arr);
		System.out.println(Arrays.toString(brr));

		brr = SortArray.mergeSort(arr);
		System.out.println(Arrays.toString(brr));
	}


}
