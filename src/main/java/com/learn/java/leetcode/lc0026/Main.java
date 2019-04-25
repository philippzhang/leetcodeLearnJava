package com.learn.java.leetcode.lc0026;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;

import java.util.List;


public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	@Override
	public boolean inputVerify(Object[] inputObjArr, String trueInputResult, Object outputObj, int inputIndex, List tempList) {
		Object inputObj = inputObjArr[inputIndex];
		String testInputResult = Utilitys.format(inputObj);
		//根据trueResult对应的长度，截取testInputResult对应的数组并转化成字符串
		testInputResult = Utilitys.copyNewArrayToString(testInputResult, outputObj.toString());
		boolean resultFlag = trueInputResult.equals(testInputResult);
		printInputVerify(trueInputResult, testInputResult, resultFlag);
		return resultFlag;
	}
}
