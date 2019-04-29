package com.learn.java.leetcode.lc0160;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.structure.ListNode;
import com.learn.java.leetcode.base.utils.Build;
import com.learn.java.leetcode.base.utils.Print;

import java.util.List;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	@Override
	public void inputBuild(Class<?>[] parameterTypes, Object[] inputObjArr, List<String> dataList, List tempList) {
		String intersectVal = dataList.remove(0);
		super.inputBuild(parameterTypes, inputObjArr, dataList, tempList);
		dataList.add(0, intersectVal);
		ListNode listA = (ListNode) inputObjArr[0];
		ListNode listB = (ListNode) inputObjArr[1];
		int skipA = Integer.parseInt(dataList.get(3));
		int skipB = Integer.parseInt(dataList.get(4));
		//构造相交链表
		ListNode[] listNodeArr = Build.buildIntersectListNode(listA, listB, skipA, skipB);
		if (listNodeArr != null && listNodeArr.length > 1) {
			inputObjArr[0] = listNodeArr[0];
			inputObjArr[1] = listNodeArr[1];
		}

	}


	@Override
	public void printInput(List<String> dataList, int paramLength) {
		if (dataList == null) {
			return;
		}
		for (int i = 0; i < dataList.size() && i < paramLength + 3; i++) {
			Print.print(dataList.get(i));
		}

	}

	@Override
	public void printOutput(Object obj) {
		//不打印交叉链表
	}

	@Override
	public boolean outputVerify(Object[] inputObjArr, List<String> trueResultList, Object outputObj, List<String> dataList, List tempList) {


		boolean resultFlag = false;
		ListNode list = (ListNode) outputObj;

		String testResult = list != null ? "Intersected at '" + list.val + "'" : "No intersection";
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
