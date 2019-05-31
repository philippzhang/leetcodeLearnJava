package com.learn.java.leetcode;

import com.learn.java.leetcode.base.utils.NoImplException;
import com.learn.java.leetcode.base.Utilitys;
import com.learn.java.leetcode.base.utils.Format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 测试所有题目
 */
public class AllMain {
	public static void main(String[] args) {
		List<String> packageList = new ArrayList<>();
		String path = AllMain.class.getResource(".").getFile();
		Utilitys.getAllLCFileName(path, packageList);
		Object[] packageArray = packageList.toArray();
		Arrays.sort(packageArray);
		int successCount = 0;
		int failCount = 0;
		int noCount = 0;
		List<String> failList = new ArrayList<>();
		List<String> noList = new ArrayList<>();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < packageArray.length; i++) {
			String packageName = packageArray[i].toString();
			try {
				boolean flag = Utilitys.funcInvoke(AllMain.class.getPackage().getName() + "." + packageName + ".Main");
				if (flag) {
					successCount++;
				} else {
					failCount++;
					failList.add(packageName.substring(2));
				}
			}catch (NoImplException e){
				noCount++;
				noList.add(packageName.substring(2));
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("总题数:" + packageArray.length + ", 正确数:" + successCount + ", 错误数:" + failCount+", 未做:"+noCount);
		if (failList.size() > 0) {
			System.out.println("错误题目: " + Format.format(failList));
		}
		if (noList.size() > 0) {
			System.out.println("未做题目: " + Format.format(noList));
		}
		System.out.println("计算时长: " + (endTime - startTime) + "ms");




	}
}
