package com.learn.java.leetcode.lc0341;

import com.learn.java.leetcode.base.CallBack;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.structure.ListNode;
import com.learn.java.leetcode.base.structure.NestedInteger;
import com.learn.java.leetcode.base.utils.Build;

import java.util.ArrayList;
import java.util.List;

public class Main extends CallBack {
	public static void main(String[] args) {
		Utilitys.test(Main.class);
	}


	@Override
	public void inputBuild(Class<?>[] parameterTypes, Object[] objArr, List<String> dataList, List tempList) {
		String data = dataList.get(0);
		List<NestedInteger> nestedList = Build.buildNestedIntegerList(data);
		objArr[0] = nestedList;

	}

	public List<Integer> test(List<NestedInteger> nestedList){
		NestedIterator i = new NestedIterator(nestedList);
		List<Integer> list = new ArrayList();
		while (i.hasNext()){
			list.add(i.next());
		}
		return list;
	}
}
