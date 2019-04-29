package com.learn.java.leetcode.lc0142;

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
	public void printInput(List<String> dataList, int paramLength) {
		if (dataList == null) {
			return;
		}
		for (int i = 0; i < dataList.size() && i < paramLength; i++) {
			Print.print(dataList.get(i));
		}
		if (dataList.size() > paramLength) {
			Print.print(dataList.get(paramLength));
		}
	}

	@Override
	public void inputBuild(Class<?>[] parameterTypes, Object[] objArr, List<String> dataList, List tempList) {
		super.inputBuild(parameterTypes, objArr, dataList, tempList);
		ListNode listNode = (ListNode) objArr[0];
		int pos = Integer.parseInt(dataList.get(1));
		//构建带环链表
		Build.buildCycleListNode(listNode, pos);
	}

	@Override
	public void printOutput(Object obj) {
		//不打印环形链表
	}

	@Override
	public boolean outputVerify(Object[] inputObjArr, List<String> trueResultList, Object outputObj, List<String> dataList, List tempList) {

		boolean resultFlag = false;

		ListNode list = (ListNode) outputObj;
		ListNode head = (ListNode) inputObjArr[0];
		int j = 0;
		boolean flag = false;
		while (head != null) {
			if (head == list) {
				flag = true;
				break;
			}
			head = head.next;
			j++;
		}
		String testResult;
		if (!flag) {
			testResult = "no cycle";
		} else {
			testResult = "tail connects to node index " + j;
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
