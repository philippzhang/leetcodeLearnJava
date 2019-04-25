package com.learn.java.leetcode.lc0862;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
	public int shortestSubarray2(int[] A, int K) {
		if(A==null||A.length==0){
			return -1;
		}
		int result = -1;
		int i =0;
		int number = 0;
		while(i<A.length){
			int j = i;
			number = A[j];
			if(number>=K){
				return 1;
			}
			while(j<A.length){
				if(number>=K) {
					if (result == -1) {
						result = j - i + 1;
					} else {
						result = Math.min(result, j - i + 1);
					}
					break;
				}
				j++;
				if(j<=A.length-1){
					number+=A[j];
				}
			}
			i++;
		}

		return result;
	}

	/**
	 * P[x]表示数列的前缀和，考虑点 x1 ,x2 若 x1<x2 ,且P[x1]>=p[x2]，那么选择x2肯定来的比x1短；
	 *
	 * 考虑y1<y2,若 满足 y1 ，y2都是x点，那么y1肯定比y2好。
	 *
	 * 维护一个双端队列，每次入队前 和 尾端的P[x]比较，若比原来的小则弹出原来的值；
	 *
	 * 和队首比较，若满足差值至少为K，则将队首的值出列。
	 *
	 * 我们可以将其重新表述为关于a的前缀和的问题。让p[i]=a[0]+a[1]+…+A[I-1 ]。我们需要最小的y-x，这样y>x和p[y]-p[x]>=k。
	 *
	 *
	 *
	 * 受这个方程的激励，让opt（y）是最大的x，这样p[x]<=p[y]-k。我们需要两个关键的观察：
	 *
	 *
	 *
	 * 如果x1<x2和p[x2]<=p[x1]，那么opt（y）永远不能是x1，就像p[x1]<=p[y]-k，那么p[x2]<=p[x1]<=p[y]-k，但是y-x2较小。这意味着我们的opt（y）候选人x的p[x]值将增加。
	 *
	 *
	 *
	 * 如果opt（y1）=x，那么我们不需要再考虑这个x。因为如果我们找到一些y2>y1，其中opt（y2）=x，那么它表示y2-x的答案，比y1-x更糟（更大）。
	 *
	 *
	 *
	 * 算法
	 *
	 *
	 *
	 * 保持p的“单队列”索引：索引x_0，x_1，…这样p[x_0]、p[x_1]…正在增加。
	 *
	 *
	 *
	 * 当添加一个新的索引y时，我们将从deque的末尾弹出x_i，这样p[x_0]、p[x_1]、…、p[y]将增加。
	 *
	 *
	 *
	 * 如果p[y]>=p[x_0]+k，那么（如前所述），我们不需要再考虑这个x_0，我们可以从deque前面弹出它。
	 * @param A
	 * @param K
	 * @return
	 */
	public int shortestSubarray(int[] A, int K) {

		int n = A.length;
		long[] p = new long[n+1];
		for(int i=0;i<n;i++) {
			p[i+1] = (A[i] + p[i]);
		}
		Deque<Integer> qt = new LinkedList<>();
		int res = n +1;
		for(int i=0;i<=n;i++)
		{
			while(!qt.isEmpty() && p[i]<=p[qt.getLast()]) {
				qt.removeLast();
			}
			while(!qt.isEmpty() && p[i]>=p[qt.getFirst()]+K) {
				res = Math.min(res, i - qt.removeFirst());
			}
			qt.addLast(i);
		}
		return (res==n+1)?-1:res;
	}


	public int shortestSubarray3(int[] A, int K) {
		int result = 0x7fffffff;

		int[] distance = new int[A.length + 1];
		distance[0] = 0;
		for(int i = 1; i <= A.length; i++) {
			distance[i] = A[i - 1] + distance[i-1];
		}

		//维护单调栈 从右边开始入栈 栈底就是当前元素往右走最大的元素
		//如果从该元素出发有最解 则解的右端必定位于当前元素与当前元素往右的最大元素之间
		//且解的右端必定在栈内（因为栈单调往栈底递减 所有比当前元素大的元素均在栈中）
		//再对该区间进行二分法求最靠近左端的元素

		//进一步优化可以使用单调队列
		//将过于遥远（大于当前最优解距离）的栈底最大元素变为队列头部出队


		LinkedList<Integer> queue = new LinkedList<>();

		for(int i = A.length; i >= 0; i--) {
			//去除过于遥远的队头元素
			while(!queue.isEmpty() && queue.peek()-i >= result) {
				queue.removeFirst();
			}
			//当新入队元素比队尾元素大时 队尾元素出队
			while(!queue.isEmpty() && distance[queue.peekLast()] <= distance[i]) {
				queue.removeLast();
			}
			//当前元素入队
			queue.add(i);
			//开始二分搜索
			if(distance[queue.peek()] >= distance[i] + K) { //先直接判断最大元素是否满足条件
				//二分搜索最短距离
				int currentMinLength = binarySearch(queue, i, distance, K);
				//判断是否当前最短距离
				result = result < currentMinLength? result : currentMinLength;
			}
		}

		return result == 0x7fffffff ? -1 : result;
	}

	public int binarySearch(LinkedList<Integer> queue, int i, int[] distance, int K) {
		//二分搜索初始上下边界
		int downer = 0, upper = queue.size()-1, mid = 0;
		//最终结果下标
		int j = 0x7fffffff;

		while(upper >= downer) {
			mid = (upper + downer) >> 1;
			if(distance[queue.get(mid)] >= distance[i] + K) {
				j = queue.get(mid);
				downer = mid + 1;
			}
			else {
				upper = mid - 1;
			}
		}

		return j == 0x7fffffff ? 0x7fffffff : (j - i);
	}

}
