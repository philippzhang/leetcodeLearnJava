package com.learn.java.leetcode.base.spider;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {

	public static void writeString(String fileName, String content) {
		FileWriter fileWriter = null;
		try {
			File file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}

			fileWriter = new FileWriter(file);
			fileWriter.write(content);
			fileWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 获取题的报名
	 *
	 * @param QUESTION_ID
	 * @return
	 */
	public static String GetQuestionName(String QUESTION_ID) {
		if(QUESTION_ID.matches("[0-9]+")){
			int questionId = Integer.parseInt(QUESTION_ID);
			return "lc" + (questionId < 10 ? ("000" + QUESTION_ID) : questionId < 100 ? ("00" + QUESTION_ID) : questionId < 1000 ? ("0" + QUESTION_ID) : ("" + QUESTION_ID));
		}else{
			return QUESTION_ID;
		}
	}

	/**
	 * 获取Main类内容
	 *
	 * @param questionName
	 * @return
	 */
	public static String getMainFileInfo(String questionName) {
		StringBuffer mainStringBuffer = new StringBuffer();
		mainStringBuffer.append("package com.learn.java.leetcode.").append(questionName).append(";\n\n");
		mainStringBuffer.append("import com.learn.java.leetcode.base.CallBack;\n");
		mainStringBuffer.append("import com.learn.java.leetcode.base.Utilitys;\n\n");

		mainStringBuffer.append("public class Main extends CallBack {\n");
		mainStringBuffer.append("	public static void main(String[] args) {\n");
		mainStringBuffer.append("		Utilitys.test(Main.class);\n");
		mainStringBuffer.append("	}\n");
		mainStringBuffer.append("}\n");
		return mainStringBuffer.toString();
	}
}
