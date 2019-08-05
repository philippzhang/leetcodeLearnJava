package com.learn.java.leetcode.lc0220;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	/**
	 * 计算桶宽度
	 * @param x
	 * @param w
	 * @return
	 */
	private long getID(long x, long w) {
		return x < 0 ? (x + 1) / w - 1 : x / w;
	}

	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if(t<0){
			return false;
		}
		Map<Long,Long> map = new HashMap<>();
		long w = (long)t+1;
		for(int i = 0;i<nums.length;i++){
			long m = getID(nums[i],w);
			if(map.containsKey(m)){
				return true;
			}

			if(map.containsKey(m-1)&&Math.abs(nums[i]-map.get(m-1))<w){
				return true;
			}

			if(map.containsKey(m+1)&&Math.abs(nums[i]-map.get(m+1))<w){
				return true;
			}

			map.put(m,(long)nums[i]);
			if(i>=k){
				map.remove(getID(nums[i-k],w));
			}
		}
		return false;
	}
}
