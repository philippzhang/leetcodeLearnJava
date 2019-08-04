package com.learn.java.leetcode.lc1115;

import java.util.concurrent.Semaphore;

public class FooBar {
	private int n;
	private Semaphore semaphoreFoo = new Semaphore(0);
	private Semaphore semaphoreBar = new Semaphore(1);

	public FooBar(int n) {
		this.n = n;
	}

	public void foo(Runnable printFoo) throws InterruptedException {

		for (int i = 0; i < n; i++) {
			semaphoreBar.acquire();
			// printFoo.run() outputs "foo". Do not change or remove this line.
			printFoo.run();
			semaphoreFoo.release();
		}
	}

	public void bar(Runnable printBar) throws InterruptedException {

		for (int i = 0; i < n; i++) {
			semaphoreFoo.acquire();
			// printBar.run() outputs "bar". Do not change or remove this line.
			printBar.run();
			semaphoreBar.release();
		}
	}
}
