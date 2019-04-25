package com.learn.java.leetcode.lc0089;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;

import java.util.List;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	@Override
	public boolean outputVerify(Object[] inputObjArr, List<String> trueResultList, Object outputObj, List<String> dataList, List tempList) {

		boolean resultFlag = false;
		List<Integer> testList = (List<Integer>) outputObj;
		String testResult = Utilitys.format(testList);
		for (int i = 0; i < trueResultList.size(); i++) {
			String trueResult = trueResultList.get(i);
			if (trueResult.equals("null") && outputObj == null) {
				printOutVerify(trueResultList, null, true);
				return true;
			}

			List<Integer> trueList = Utilitys.buildList(trueResult);
			resultFlag = Utilitys.compareListsIgnoreOrder(trueList, testList);
			if (resultFlag) {
				printOutVerify(trueResultList, testResult, resultFlag);
				return true;
			}
		}
		printOutVerify(trueResultList, testResult, resultFlag);
		return resultFlag;
	}
}
