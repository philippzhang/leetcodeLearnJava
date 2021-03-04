package com.learn.java.leetcode.base.spider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class LeetCodeSpider {
	private static Map<String, List<String>> questionMap;

	static {
		questionMap = SpiderUtils.getQuestionMap(LeetCodeSpider.class);
	}

	public static String GetQuestionMd(String QUESTION_ID) {
		if (questionMap == null || questionMap.size() <= 0) {
			questionMap = SpiderUtils.getQuestionMap(LeetCodeSpider.class);
		}
		List<String> targetUrlList = questionMap.get(QUESTION_ID);
		//SpiderUtils.readReadmeFile(LeetCodeSpider.class, QUESTION_ID);
		if (targetUrlList == null || targetUrlList.size() <= 1) {
			return null;
		}
		String EN_TARGET_URL = targetUrlList.get(0);
		String CN_TARGET_URL = targetUrlList.get(1);


		String retInfo = null;

		try {
			retInfo = QUESTION_ID.matches("[0-9]+]") ? LeetCodeSpider.func(EN_TARGET_URL, CN_TARGET_URL) : LeetCodeSpider.funcCN(CN_TARGET_URL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retInfo;
	}


	public static String func(String EN_TARGET_URL, String CN_TARGET_URL) throws Exception {
		StringBuffer stringBuffer = new StringBuffer();

		WebDriver enDriver = null;
		String enTitle = null;
		String enDegree = null;

		try {
			enDriver = MyWebDriver.createWebDriver();
			enDriver.get(EN_TARGET_URL);
			Thread.sleep(5000);
			//解决英文跳转到中文的问题
			enDriver.get(EN_TARGET_URL);
			Thread.sleep(10000);

			int i = 0;
			Document enDoc = Jsoup.parse(enDriver.getPageSource());
			Elements enElements1 = enDoc.select("div.css-v3d350");
			while ((enElements1 == null || enElements1.size() <= 0) && i < 10) {
				//解决外网延迟
				Thread.sleep(2000);
				i++;
			}


			enTitle = enElements1.text();
			Elements enElements2 = enDoc.select("div.css-101rr4k > div.css-10o4wqw > div");
			enDegree = enElements2.text();
			Elements enElements33 = enDoc.select("div.content__u3I1.question-content__JfgR");

			String enContent = "";
			Elements enElements30 = enElements33.first().children();
			if (enElements30 != null && enElements30.size() > 0) {
				for (int j = 0; j < enElements30.size(); j++) {
					//Elements enElements3 = enElements30.get(j).children();
					//String enHtml = enElements3.toString();

					Element enElements3 = enElements30.get(j);
					String enHtml = null;
					if(enElements3.tagName().equals("div")){
						enHtml = enElements3.children().toString();
					}else{
						enHtml = enElements3.toString();
					}

					enContent += Html2MdEn.getMarkDownText(enHtml) + "\n\n";
				}
			}

			//Elements enElements3 = enElements33.first().children().first().children();
			//String enHtml = enElements3.toString();
			//String enContent = Html2MdEn.getMarkDownText(enHtml);

			stringBuffer.append("# [" + enTitle + "][enTitle]\n\n").append("**").append(enDegree).append("**\n\n").append(enContent);

			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (enDriver != null) {
				enDriver.quit();
				try {
					enDriver.close();
				} catch (Exception e) {

				}
			}
		}
		WebDriver cnDriver = null;
		try {
			cnDriver = MyWebDriver.createWebDriver();
			cnDriver.get(CN_TARGET_URL);
			Thread.sleep(10000);


			//3、得到执行代码
			//WebElement submitElement = cnDriver.findElement(By.cssSelector("button.runcode__QfP3.css-1m578n4-sm-Btn.e5i1odf0"));
			//4、点击百度一下
			//PageUtils.scrollToElementAndClick(submitElement, cnDriver);

			//WebDriver driver = MyWebDriver.createWebDriver();

			//driver.get("https://github.com/login");
			//WebElement elemUsername = cnDriver.findElement(By.cssSelector("div.css-1numy7u-ModalContent.e5i1odf10 > div > div > form > div:nth-child(1) > input"));
			//WebElement elemPassword = cnDriver.findElement(By.cssSelector("div.css-1numy7u-ModalContent.e5i1odf10 > div > div > form > div:nth-child(3) > input"));
			//WebElement btn = cnDriver.findElement(By.cssSelector("div.css-1numy7u-ModalContent.e5i1odf10 > div > div > button"));
			//elemUsername.sendKeys("XXXXX");
			//elemPassword.sendKeys("XXXXX");
			//btn.click();

			//获取标题，中文的界面经常变化
			Document cnDoc = Jsoup.parse(cnDriver.getPageSource());
			Elements cnElements1 = cnDoc.select("div.css-xfm0cl-Container.eugt34i0 > h4 > a");
			int i = 0;
			while ((cnElements1 == null || cnElements1.size() <= 0) && i < 10) {
				//解决外网延迟
				Thread.sleep(2000);
				i++;
			}

			String cnTitle = cnElements1.text();

			//获取难度，中文的界面经常变化
			Elements cnElements2 = cnDoc.select("div.css-xfm0cl-Container.eugt34i0 > div > span:nth-child(2)");
			String cnDegree = cnElements2.text();

			//获取内容，中文的界面经常变化
			Elements cnElements30 = cnDoc.select("div.content__1Y2H").first().children();

			String cnContent = "";
			for (int j = 0; j < cnElements30.size(); j++) {
				//Elements cnElements3 = cnElements30.get(j).children();
				//String cnHtml = cnElements3.toString();

				Element cnElements3 = cnElements30.get(j);
				String cnHtml = null;
				if(cnElements3.tagName().equals("div")){
					cnHtml = cnElements3.children().toString();
				}else{
					cnHtml = cnElements3.toString();
				}

				cnContent += Html2MdCn.getMarkDownText(cnHtml) + "\n\n";
			}

			//Elements cnElements3 = cnDoc.select("div.content__2ebE").first().children().first().children();
			//String cnHtml = cnElements3.toString();
			//String cnContent = Html2MdCn.getMarkDownText(cnHtml);


			//WebElement cnElements4 = cnDriver.findElement(By.cssSelector("#lang-select"));
			//cnElements4.sendKeys("Java");

			//Elements cnElements4 = cnDoc.select("div.css-567rnd-TabContent.e5i1odf5 > div > div > div:nth-child(2) > div.css-1gzlqzt-ValueContainer.e5i1odf3 > div");
			//Elements cnElements5 = cnDoc.select("div.css-567rnd-TabContent.e5i1odf5 > div > div > div:nth-child(4) > div.css-1gzlqzt-ValueContainer.e5i1odf3");

			stringBuffer.append("# [" + cnTitle + "][cnTitle]\n\n").append("**").append(cnDegree).append("**\n\n").append(cnContent);

			stringBuffer.append("\n\n");

			stringBuffer.append("# 算法思路\n\n");

			stringBuffer.append("# 测试用例\n");
			stringBuffer.append("```\n");
			stringBuffer.append(enTitle).append(' ').append(cnTitle).append(' ').append(enDegree).append("\n");
			stringBuffer.append("```\n\n");

			stringBuffer.append("[enTitle]: " + EN_TARGET_URL + "\n");
			stringBuffer.append("[cnTitle]: " + CN_TARGET_URL + "\n");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (cnDriver != null) {
				cnDriver.quit();
				try {
					cnDriver.close();
				} catch (Exception e) {

				}
			}
		}
		return stringBuffer.toString();
	}


	public static String funcCN(String CN_TARGET_URL) throws Exception {
		StringBuffer stringBuffer = new StringBuffer();

		WebDriver cnDriver = null;
		try {
			cnDriver = MyWebDriver.createWebDriver();
			cnDriver.get(CN_TARGET_URL);
			Thread.sleep(10000);


			//获取标题，中文的界面经常变化
			Document cnDoc = Jsoup.parse(cnDriver.getPageSource());
			Elements cnElements1 = cnDoc.select("div.css-xfm0cl-Container.eugt34i0 > h4 > a");
			int i = 0;
			while ((cnElements1 == null || cnElements1.size() <= 0) && i < 10) {
				//解决外网延迟
				Thread.sleep(2000);
				i++;
			}

			String cnTitle = cnElements1.text();

			//获取难度，中文的界面经常变化
			Elements cnElements2 = cnDoc.select("div.css-xfm0cl-Container.eugt34i0 > div > span:nth-child(2)");
			String cnDegree = cnElements2.text();

			//获取内容，中文的界面经常变化
			Elements cnElements30 = null;

			if (cnDoc.select("div.content__1Y2H").size()>0){
				cnElements30 = cnDoc.select("div.content__1Y2H").first().children();
			}else if(cnDoc.select("div.css-1708ckn").size()>0){
				cnElements30 = cnDoc.select("div.css-1708ckn").first().children();
			}


			String cnContent = "";
			for (int j = 0; j < cnElements30.size(); j++) {
				//Elements cnElements3 = cnElements30.get(j).children();
				Element cnElements3 = cnElements30.get(j);
				String cnHtml = null;
				if(cnElements3.tagName().equals("div")){
					cnHtml = cnElements3.children().toString();
				}else{
					cnHtml = cnElements3.toString();
				}
				cnContent += Html2MdCn.getMarkDownText(cnHtml) + "\n\n";
			}

			stringBuffer.append("# [" + cnTitle + "][cnTitle]\n\n").append("**").append(cnDegree).append("**\n\n").append(cnContent);

			stringBuffer.append("\n\n");

			stringBuffer.append("# 算法思路\n\n");

			stringBuffer.append("# 测试用例\n");
			stringBuffer.append("```\n");
			stringBuffer.append("```\n\n");

			stringBuffer.append("[cnTitle]: " + CN_TARGET_URL + "\n");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (cnDriver != null) {
				cnDriver.quit();
				try {
					cnDriver.close();
				} catch (Exception e) {

				}
			}
		}
		return stringBuffer.toString();
	}

}
