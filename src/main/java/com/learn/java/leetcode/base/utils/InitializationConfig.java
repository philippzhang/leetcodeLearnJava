package com.learn.java.leetcode.base.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * 读取配置文件
 *
 * @author zhangyangshuo
 */
public class InitializationConfig {

	private static Properties processorConfigs;

	static {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"leetCode-spring.xml"});
		processorConfigs = applicationContext.getBean("processorConfig", Properties.class);
		applicationContext.close();
	}

	public static Properties readProperties() {
		return processorConfigs;
	}
}
