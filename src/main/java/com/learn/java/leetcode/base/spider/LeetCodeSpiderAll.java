package com.learn.java.leetcode.base.spider;

import com.learn.java.leetcode.base.utils.InitializationConfig;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * 生成当前页面的README.md,爬取所有题目url
 */
public class LeetCodeSpiderAll implements Spider {

	private final static String CN_TARGET_URL = InitializationConfig.readProperties().getProperty("LeetCodeCnAllUrl");

	private static final String package_parent = InitializationConfig.readProperties().getProperty("LeetCodeSpiderAllPath");

	private static final String userDir = System.getProperty("user.dir");

	@Override
	public void run() throws InterruptedException {

		WebDriver endriver = null;
		try {
			endriver = MyWebDriver.createWebDriver();
			endriver.get(CN_TARGET_URL);
			Thread.sleep(10000);


			Select level = new Select(endriver.findElement(By.cssSelector("table > tbody.reactable-pagination > tr > td > span.row-selector > select")));
			List<WebElement> webElements = level.getOptions();

			for (int i = 0; i < webElements.size(); i++) {
				WebElement webElement = webElements.get(i);

				if (i == webElements.size() - 1) {
					webElement.click();
				}
			}


			//level.selectByValue ( value);
			Thread.sleep(2000);
			Document enDoc = Jsoup.parse(endriver.getPageSource());
			Elements enElements = enDoc.select("table > tbody.reactable-data").first().children();

			int length = enElements.size();
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append("# LeetCode题网页\n\n");
			for (int i = 0; i < length; i++) {
				Element element = enElements.get(i);
				Elements enElementsTd = element.children();
				String id = enElementsTd.get(1).text();
				Element enElementsTdHref = enElementsTd.get(2).children().first().children().first();
				String href = enElementsTdHref.attr("href");
				String title = href.substring("/problems/".length());
				String cnHref = "https://leetcode-cn.com" + enElementsTdHref.attr("href") + "/";
				String enHref = "https://leetcode.com" + enElementsTdHref.attr("href") + "/";

				stringBuffer.append(id + " " + enHref + " " + cnHref + " " +title+ " \""+ enElementsTdHref.text() + "\"\n\n");
			}

			stringBuffer.append("# 共"+length+"题\n\n");

			String packagePath = userDir + package_parent ;

			MyFileWriter.writeString(packagePath + "/README.md", stringBuffer.toString());

			System.out.println("共"+length+"题");

			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (endriver != null) {
				endriver.quit();
				try {
					endriver.close();
				} catch (Exception e) {

				}
			}
		}


	}

	public static void main(String[] args) {
		try {
			new LeetCodeSpiderAll().run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
