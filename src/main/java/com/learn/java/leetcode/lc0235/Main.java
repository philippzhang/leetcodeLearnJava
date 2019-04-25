package com.learn.java.leetcode.lc0235;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.List;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	/**
	 * 构建树和结点
	 *
	 * @param inputObjArr
	 */
	@Override
	public void inputBuild(Class<?>[] parameterTypes, Object[] inputObjArr, List<String> dataList, List tempList) {
		String data = dataList.get(0);
		int ip = Integer.parseInt(dataList.get(1));
		int iq = Integer.parseInt(dataList.get(2));
		TreeNode root = Utilitys.buildBinaryTree(data);
		TreeNode p = Utilitys.searchBinaryTree(root, ip);
		TreeNode q = Utilitys.searchBinaryTree(root, iq);
		inputObjArr[0] = root;
		inputObjArr[1] = p;
		inputObjArr[2] = q;
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
