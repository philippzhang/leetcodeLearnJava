package com.learn.java.leetcode.lc1116;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	public String test(int n) throws InterruptedException {
		ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(n);
		StringBuffer stringBuffer = new StringBuffer();
		Thread t1 =
		new Thread(() -> {
			try {
				zeroEvenOdd.zero(x -> stringBuffer.append(x));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t1.start();


		Thread t2 = new Thread(() -> {
			try {
				zeroEvenOdd.even(x -> stringBuffer.append(x));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t2.start();


		Thread t3  = new Thread(() -> {
			try {
				zeroEvenOdd.odd(x -> stringBuffer.append(x));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t3.start();



		t1.join();
		t2.join();
		t3.join();
		return stringBuffer.toString();
	}

}
