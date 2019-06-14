package com.learn.java.leetcode.lc0237;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.structure.ListNode;
import com.learn.java.leetcode.base.utils.Format;
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
		for (int i = 0; i < dataList.size() && i < paramLength + 1; i++) {
			Print.print(dataList.get(i));
		}
	}

	@Override
	public void inputBuild(Class<?>[] parameterTypes, Object[] inputObjArr, List<String> dataList, List tempList) {
		super.inputBuild(parameterTypes, inputObjArr, dataList, tempList);
		int node = Integer.parseInt(dataList.get(1));
		ListNode listNode = (ListNode) inputObjArr[0];
		ListNode newNode = Utilitys.searchListNode(listNode, node);
		inputObjArr[0] = newNode;
		//用临时集合保存原始链表
		tempList.add(listNode);
	}


	@Override
	public boolean inputVerify(Object[] inputObjArr, String trueInputResult, Object outputObj, int inputIndex,List<String> dataList,  List tempList) {
		ListNode listNode = (ListNode) tempList.get(0);
		String testInputResult = Format.format(listNode);
		boolean resultFlag = trueInputResult.equals(testInputResult);
		printInputVerify(trueInputResult, testInputResult, resultFlag);
		return resultFlag;
	}

}
