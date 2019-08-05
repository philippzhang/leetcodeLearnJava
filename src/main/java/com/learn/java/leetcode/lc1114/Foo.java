package com.learn.java.leetcode.lc1114;

import java.util.concurrent.CountDownLatch;

public class Foo {
	private CountDownLatch second = new CountDownLatch(1);
	private CountDownLatch third = new CountDownLatch(1);
	public Foo() {

	}

	public void first(Runnable printFirst) throws InterruptedException {

		// printFirst.run() outputs "first". Do not change or remove this line.
		printFirst.run();
		//second启动
		second.countDown();
	}

	public void second(Runnable printSecond) throws InterruptedException {
		//second阻塞
		second.await();
		// printSecond.run() outputs "second". Do not change or remove this line.
		printSecond.run();
		//third启动
		third.countDown();
	}

	public void third(Runnable printThird) throws InterruptedException {
		//third阻塞
		third.await();
		// printThird.run() outputs "third". Do not change or remove this line.
		printThird.run();
	}
}
