package com.learn.java.leetcode.lc1117;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
class H2O {

	private ReentrantLock lock = new ReentrantLock();
	private Condition hCondition = lock.newCondition();
	private Condition oCondition = lock.newCondition();
	private volatile int hCount = 2;

	public H2O() {

	}

	public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

		// releaseHydrogen.run() outputs "H". Do not change or remove this line.
		lock.lock();
		try {
			while (hCount == 2) {
				hCondition.await();
			}
			hCount++;
			releaseHydrogen.run();
			if (hCount == 2) {
				oCondition.signal();
			} else {
				hCondition.signal();
			}
		} finally {
			lock.unlock();
		}
	}

	public void oxygen(Runnable releaseOxygen) throws InterruptedException {

		// releaseOxygen.run() outputs "H". Do not change or remove this line.
		lock.lock();
		try {
			while (hCount != 2) {
				oCondition.await();
			}
			hCount = 0;
			releaseOxygen.run();
			hCondition.signalAll();
		} finally {
			lock.unlock();
		}
	}
}