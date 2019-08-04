package com.learn.java.leetcode.lc1115;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	public String test(int n) throws InterruptedException {
		FooBar fooBar = new FooBar(n);
		StringBuffer stringBuffer = new StringBuffer();

		Runnable foo = () -> stringBuffer.append("foo");
		Runnable bar = () -> stringBuffer.append("bar");

		Thread t1 =
				new Thread(() -> {
					try {
						fooBar.foo(foo);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				});
		t1.start();


		Thread t2 = new Thread(() -> {
			try {
				fooBar.bar(bar);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t2.start();




		t1.join();
		t2.join();

		return stringBuffer.toString();
	}
}
