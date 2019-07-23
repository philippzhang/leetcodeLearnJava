package com.learn.java.leetcode.lc0975;

import java.util.TreeMap;

public class Solution {
	/**
	 * 我们可以使用 TreeMap，一个维护有序数据的绝佳数据结构。我们将索引 i 映射到 v = A[i] 上。
	 *
	 * 从 i = N-2 到 i = 0 的遍历过程中，对于 v = A[i]， 我们想知道比它略大一点和略小一点的元素是谁。
	 * TreeMap.lowerKey 与 TreeMap.higherKey 函数就是用来做这样一件事情的。
	 *
	 * 了解这一点之后，解法接下来的内容就非常直接了： 我们使用动态规划来维护 odd[i] 和 even[i]：
	 * 从索引 i 出发奇数次跳跃与偶数次跳跃是否能到达数组末尾。
	 *
	 * @param A
	 * @return
	 */
	public int oddEvenJumps(int[] A) {
		int N = A.length;
		if(N<=1){
			return N;
		}
		boolean[] odd = new boolean[N];
		boolean[] even = new boolean[N];
		odd[N-1] = even[N-1] = true;

		TreeMap<Integer,Integer> treeMap = new TreeMap<>();
		treeMap.put(A[N-1],N-1);
		for(int i = N-2;i>=0;i--){
			int v =A[i];
			if(treeMap.containsKey(v)){
				odd[i] = even[treeMap.get(v)];
				even[i] = odd[treeMap.get(v)];
			}else{
				//返回该map中小于指定key的最大的key
				Integer lower = treeMap.lowerKey(v);
				//返回该map中大于指定key的最小的key
				Integer higher = treeMap.higherKey(v);
				if(lower!=null){
					even[i] = odd[treeMap.get(lower)];
				}
				if(higher!=null){
					odd[i] = even[treeMap.get(higher)];
				}
			}
			treeMap.put(v,i);
		}

		int result = 0;
		for(boolean b:odd){
			if(b){
				result++;
			}
		}
		return result;
	}
}
