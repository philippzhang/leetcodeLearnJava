package com.learn.java.leetcode.lc1114;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	public String test(List<Integer> list) throws InterruptedException {
		Foo foo = new Foo();
		StringBuffer stringBuffer = new StringBuffer();

		Runnable first = () -> stringBuffer.append("one");
		Runnable second = () -> stringBuffer.append("two");
		Runnable third = () -> stringBuffer.append("three");

		Map<Integer,Thread> threadMap = new HashMap<>();

		//线程 A 将会调用 one() 方法
		Thread A =
				new Thread(() -> {
					try {
						foo.first(first);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				});

		//线程 B 将会调用 two() 方法
		Thread B = new Thread(() -> {
			try {
				foo.second(second);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		//线程 C 将会调用 three() 方法
		Thread C  = new Thread(() -> {
			try {
				foo.third(third);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		threadMap.put(1,A);
		threadMap.put(2,B);
		threadMap.put(3,C);

		for(Integer i : list){
			threadMap.get(i).start();
		}


		for(Integer i : list){
			threadMap.get(i).join();
		}


		return stringBuffer.toString();
	}
}
