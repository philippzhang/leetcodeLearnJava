package com.learn.java.leetcode.lc0078;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.utils.Build;
import com.learn.java.leetcode.base.utils.Format;

import java.util.List;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}


	@Override
	public boolean outputVerify(Object[] inputObjArr, List<String> trueResultList, Object outputObj, List<String> dataList, List tempList) {


		boolean resultFlag = false;
		String testResult = Format.format(outputObj);
		List testResultList = Build.buildList(testResult);
		for (int i = 0; i < trueResultList.size(); i++) {
			String trueResult = trueResultList.get(i);
			if (trueResult.equals("null") && outputObj == null) {
				printOutVerify(trueResultList, null, true);
				return true;
			}

			List trueResultValueList = Build.buildList(trueResult);
			resultFlag = Utilitys.compareListsIgnoreOrder(trueResultValueList, testResultList);
			if (resultFlag) {
				printOutVerify(trueResultList, testResult, resultFlag);
				return true;
			}

		}

		printOutVerify(trueResultList, testResult, resultFlag);
		return resultFlag;

	}

}
