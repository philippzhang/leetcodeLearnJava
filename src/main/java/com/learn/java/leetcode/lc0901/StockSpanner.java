package com.learn.java.leetcode.lc0901;

import java.util.ArrayList;
import java.util.List;

public class StockSpanner {
	private List<Integer> history = null;
	private List<Integer> record = null;

	public StockSpanner() {
		history = new ArrayList();
		record = new ArrayList<>();
	}

	public int next(int price) {
		history.add(price);
		if(record.size()==0){
			record.add(1);
			return 1;
		}
		int cur = record.size()-1;
		int res = 1;
		while(cur>=0&&history.get(cur)<price){
			res += record.get(cur);
			cur -= record.get(cur);
		}
		if(cur>=0&&history.get(cur)==price){
			res += record.get(cur);
		}

		record.add(res);
		return res;

	}
}
