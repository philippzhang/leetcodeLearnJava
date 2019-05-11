package com.learn.java.leetcode.lc0040;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.utils.Build;
import com.learn.java.leetcode.base.utils.Format;

import java.util.List;

public class Main extends CallBack {
	@Override
	public boolean outputVerify(Object[] inputObjArr, List<String> trueResultList, Object outputObj, List<String> dataList, List tempList) {
		boolean resultFlag = false;
		String testResult = Format.format(outputObj);
		for (int i = 0; i < trueResultList.size(); i++) {
			String trueResult = trueResultList.get(i);
			if (trueResult.equals("null") && outputObj == null) {
				printOutVerify(trueResultList, null, true);
				return true;
			}
			try {
				List<List<Integer>> trueResultsList = Build.buildList(trueResult);
				List<List<Integer>> testResultsList = Build.buildList(testResult);

				resultFlag = Utilitys.compareListsIgnoreOrder(trueResultsList,testResultsList);

				if (resultFlag) {
					printOutVerify(trueResultList, testResult, resultFlag);
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
				printOutVerify(trueResultList, e.getMessage(), false);
				return false;
			}
		}

		printOutVerify(trueResultList, testResult, resultFlag);
		return resultFlag;

	}

	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}
}
