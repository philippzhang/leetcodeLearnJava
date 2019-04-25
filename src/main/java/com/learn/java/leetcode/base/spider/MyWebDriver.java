package com.learn.java.leetcode.base.spider;

import com.learn.java.leetcode.base.utils.InitializationConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyWebDriver {

	private final static String CHROME_DRIVER_PATH = InitializationConfig.readProperties().getProperty("chromedriver");

	public static WebDriver createWebDriver() {
		String userDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", userDir + CHROME_DRIVER_PATH);
		return new ChromeDriver();
	}
}
