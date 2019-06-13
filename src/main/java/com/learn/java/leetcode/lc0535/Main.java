package com.learn.java.leetcode.lc0535;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	public String test(String url){
		Codec codec = new Codec();
		return codec.decode(codec.encode(url));
	}
}
