package com.learn.java.leetcode.base.spider;

import com.learn.java.leetcode.base.utils.InitializationConfig;
import org.apache.commons.lang.StringUtils;

import java.io.File;

/**
 * 生成题目
 *
 * @author zhangyangshuo
 */
public class GetQuestion {
	private static final String[] QUESTION_IDS = {"409","290","49","187","76"};
	private static final String package_parent = InitializationConfig.readProperties().getProperty("GetQuestionPath");

	private static final String userDir = System.getProperty("user.dir");

	public static void main(String[] args) {
		for (String questionId : QUESTION_IDS) {
			try {
				getQuestion(questionId);
			} catch (Exception e) {
				System.out.println("==================");
				System.out.println(questionId);
				System.out.println("==================");
				e.printStackTrace();
			}
		}

	}

	private static void getQuestion(String questionId) {

		String questionName = MyFileWriter.GetQuestionName(questionId);
		String packagePath = userDir + package_parent + "/" + questionName;
		File path = new File(packagePath);
		if (!path.exists()) {
			path.mkdir();
		} else {
			//System.out.println(packagePath + " exists!");
			//return;
		}

		if (new File(packagePath + "/Main.java").exists() || new File(packagePath + "/README.md").exists()) {
			System.out.println(packagePath + " exists!");
			return;
		}

		String retInfo = LeetCodeSpider.GetQuestionMd(questionId);

		if (StringUtils.isBlank(retInfo)) {
			System.out.println("get data is null!");
			return;
		}

		MyFileWriter.writeString(packagePath + "/README.md", retInfo);

		String mainFileInfo = MyFileWriter.getMainFileInfo(questionName);

		MyFileWriter.writeString(packagePath + "/Main.java", mainFileInfo);
	}
}
