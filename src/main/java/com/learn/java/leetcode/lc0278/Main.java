package com.learn.java.leetcode.lc0278;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	public int test(int n,int version){
		Solution solution = new Solution();
		solution.setVersion(version);
		return solution.firstBadVersion(n);
	}
}
