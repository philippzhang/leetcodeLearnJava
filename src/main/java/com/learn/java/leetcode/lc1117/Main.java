package com.learn.java.leetcode.lc1117;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	public String test(String input) throws InterruptedException {
		H2O h2O = new H2O();
		StringBuffer stringBuffer = new StringBuffer();
		Runnable h = () -> stringBuffer.append("H");
		Runnable o = () -> stringBuffer.append("O");

		char[] chars = input.toCharArray();

		/*class H extends Thread{
			@Override
			public void run() {
				try {
					h2O.hydrogen(h);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		class O extends Thread{
			@Override
			public void run() {
				try {
					h2O.oxygen(o);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		Thread H =
				new Thread(() -> {
					try {
						h2O.hydrogen(h);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				});



		Thread O = new Thread(() -> {
			try {
				h2O.oxygen(o);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});*/

		/*List<Thread> list = new ArrayList();

		for(char c:chars){

			if(c=='H'){
				Thread t = new H();
				list.add(t);
				t.start();
			}else {
				Thread t = new O();
				list.add(t);
				t.start();
			}
		}

		for(Thread t:list){
			t.join();
		}
*/

		//模拟氢氧两个线程
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
		for (char c : chars) {
			pool.schedule(() -> {
				if (c == 'H') {
					try {
						h2O.hydrogen(h);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					try {
						h2O.oxygen(o);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}, 1, TimeUnit.MILLISECONDS);
		}
		pool.shutdown();

		while (true) {
			if (pool.isTerminated()) {
				break;
			}
			//Thread.sleep(1);
		}


		return stringBuffer.toString();
	}
}
