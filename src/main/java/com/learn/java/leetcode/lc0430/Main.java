package com.learn.java.leetcode.lc0430;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;

import java.util.List;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	@Override
	public void inputBuild(Class<?>[] parameterTypes, Object[] inputObjArr, List<String> dataList, List tempList) {
		String data = dataList.get(0);
		Node head = Utils.buildNode(data);
		inputObjArr[0] = head;
	}

	@Override
	public void printOutput(Object outputObj) {

	}

	@Override
	public boolean outputVerify(Object[] inputObjArr, List<String> trueResultList, Object outputObj, List<String> dataList, List tempList) {
		boolean resultFlag = false;
		Node copyHead = (Node) outputObj;
		String testResult = Utils.format(copyHead);
		JsonParser parser = new JsonParser();
		JsonObject testObj = null;
		if (testResult != null) {
			testObj = (JsonObject) parser.parse(testResult);
		}
		for (int i = 0; i < trueResultList.size(); i++) {
			String trueResult = trueResultList.get(i);
			if ((trueResult.equals("null") || trueResult.equals("{}")) && copyHead == null) {
				printOutVerify(trueResultList, null, true);
				return true;
			}
			if ((trueResult == null || trueResult.equals("null") || trueResult.equals("{}")) && copyHead != null) {
				continue;
			}
			if (copyHead == null) {
				continue;
			}

			JsonObject trueObj = (JsonObject) parser.parse(trueResult);
			resultFlag = trueObj.equals(testObj);

			if (resultFlag) {
				break;
			}
		}

		printOutVerify(trueResultList, testResult, resultFlag);
		return resultFlag;
	}
}
