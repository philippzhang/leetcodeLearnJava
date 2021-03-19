package com.learn.java.leetcode.offer68i;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.List;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	@Override
	public boolean outputVerify(Object[] inputObjArr, List<String> trueResultList, Object outputObj, List<String> dataList, List tempList) {

		boolean resultFlag = false;
		String testResult;
		if (outputObj != null) {
			TreeNode treeNode = (TreeNode) outputObj;
			testResult = String.valueOf(treeNode.val);
		} else {
			testResult = "null";
		}
		for (int i = 0; i < trueResultList.size(); i++) {
			String trueResult = trueResultList.get(i);
			if (trueResult.equals("null") && outputObj == null) {
				printOutVerify(trueResultList, null, true);
				return true;
			}
			resultFlag = trueResult.equals(testResult);
			if (resultFlag) {
				printOutVerify(trueResultList, testResult, resultFlag);
				return true;
			}
		}

		printOutVerify(trueResultList, testResult, resultFlag);
		return resultFlag;
	}

}
