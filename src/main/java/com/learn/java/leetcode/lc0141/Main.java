package com.learn.java.leetcode.lc0141;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.structure.ListNode;

import java.util.List;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}

	@Override
	public void inputBuild(Class<?>[] parameterTypes, Object[] objArr, List<String> dataList, List tempList) {
		super.inputBuild(parameterTypes, objArr, dataList, tempList);
		ListNode listNode = (ListNode) objArr[0];
		int pos = Integer.parseInt(dataList.get(1));
		//构建带环链表
		Utilitys.buildCycleListNode(listNode, pos);
	}

	@Override
	public void printInput(List<String> dataList, int paramLength) {
		if (dataList == null) {
			return;
		}
		for (int i = 0; i < dataList.size() && i < paramLength; i++) {
			Utilitys.print(dataList.get(i));
		}
		if (dataList.size() > paramLength) {
			Utilitys.print(dataList.get(paramLength));
		}
	}
}
