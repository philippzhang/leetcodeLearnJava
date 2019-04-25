package com.learn.java.leetcode.base;

import com.learn.java.leetcode.base.structure.ListNode;
import com.learn.java.leetcode.base.structure.TreeNode;

import java.util.List;

/**
 * Main的基类
 *
 * @author zhangyangshuo
 */
public class CallBack {

	/**
	 * 打印输入参数方法
	 *
	 * @param dataList    读入数据列表
	 * @param paramLength 算法方法中参数个数
	 */
	public void printInput(List<String> dataList, int paramLength) {
		if (dataList == null) {
			return;
		}
		for (int i = 0; i < dataList.size() && i < paramLength; i++) {
			Utilitys.print(dataList.get(i));
		}
	}

	/**
	 * 入参构建方法
	 *
	 * @param parameterTypes 算法方法中参数列表
	 * @param inputObjArr    调用算法的参数值列表
	 * @param dataList       读入数据列表
	 * @param tempList       临时缓存，用于数据传递
	 */
	public void inputBuild(Class<?>[] parameterTypes, Object[] inputObjArr, List<String> dataList, List tempList) {
		for (int j = 0; j < parameterTypes.length; j++) {
			String parameterName = parameterTypes[j].getName();
			String data = dataList.get(j);
			if (parameterName.equals("com.learn.java.leetcode.base.structure.ListNode")) {
				ListNode listNode = Utilitys.buildListNode(data);
				inputObjArr[j] = listNode;
			} else if (parameterName.equals("[Lcom.learn.java.leetcode.base.structure.ListNode;")) {
				ListNode[] listNode = Utilitys.buildListNodeArray(data);
				inputObjArr[j] = listNode;
			} else if (parameterName.equals("com.learn.java.leetcode.base.structure.TreeNode")) {
				TreeNode treeNode = Utilitys.buildBinaryTree(data);
				inputObjArr[j] = treeNode;
			} else if (parameterName.equals("int")) {
				inputObjArr[j] = Integer.parseInt(data);
			} else if (parameterName.equals("long")) {
				inputObjArr[j] = Long.parseLong(data);
			} else if (parameterName.equals("double")) {
				inputObjArr[j] = Double.parseDouble(data);
			} else if (parameterName.equals("float")) {
				inputObjArr[j] = Float.parseFloat(data);
			} else if (parameterName.equals("boolean")) {
				inputObjArr[j] = Boolean.parseBoolean(data);
			} else if (parameterName.equals("java.lang.Integer")) {
				inputObjArr[j] = Integer.valueOf(data);
			} else if (parameterName.equals("java.lang.Long")) {
				inputObjArr[j] = Long.valueOf(data);
			} else if (parameterName.equals("java.lang.Double")) {
				inputObjArr[j] = Double.valueOf(data);
			} else if (parameterName.equals("java.lang.Float")) {
				inputObjArr[j] = Float.valueOf(data);
			} else if (parameterName.equals("java.lang.Boolean")) {
				inputObjArr[j] = Boolean.valueOf(data);
			} else if (parameterName.equals("java.lang.String")) {
				inputObjArr[j] = Utilitys.chageStr(data);
			} else if (parameterName.equals("[I")) {
				int[] array = Utilitys.buildArray(data);
				inputObjArr[j] = array;
			} else if (parameterName.equals("[C")) {
				char[] array = Utilitys.buildArrayChar(data);
				inputObjArr[j] = array;
			} else if (parameterName.equals("[[I")) {
				int[][] matrix = Utilitys.buildMatrix(data);
				inputObjArr[j] = matrix;
			} else if (parameterName.equals("[Ljava.lang.String;")) {
				String[] array = Utilitys.buildArrayString(data);
				inputObjArr[j] = array;
			} else if (parameterName.equals("java.util.List")) {
				List list = Utilitys.buildList(data);
				inputObjArr[j] = list;
			}
		}
	}

	/**
	 * 打印输出参数方法
	 *
	 * @param outputObj 算法输出值
	 */
	public void printOutput(Object outputObj) {
		System.out.println("格式输出:");
		Utilitys.print(outputObj);
	}

	/**
	 * 输出参数验证方法
	 *
	 * @param inputObjArr    调用算法的参数值列表
	 * @param trueResultList 正确结果集，如果存在多个正确值，任意结果均正确
	 * @param outputObj      算法输出值
	 * @param dataList       读入数据列表
	 * @param tempList       临时缓存，用于数据传递
	 */
	public boolean outputVerify(Object[] inputObjArr, List<String> trueResultList, Object outputObj, List<String> dataList, List tempList) {
		boolean resultFlag = false;
		String testResult = Utilitys.format(outputObj);
		for (int i = 0; i < trueResultList.size(); i++) {
			String trueResult = trueResultList.get(i);
			if (trueResult.equals("null") && outputObj == null) {
				printOutVerify(trueResultList, null, true);
				return true;
			}
			try {

				resultFlag = trueResult.equals(testResult);
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

	protected void printOutVerify(List<String> trueResultList, String testResult, boolean resultFlag) {
		System.out.println("输出结果:");
		System.out.println(testResult);
		System.out.println("预期结果"+(trueResultList.size()>1?" (以下任意结果均正确) ":"")+":");
		for (int i = 0; i < trueResultList.size(); i++) {
			System.out.println(trueResultList.get(i));
		}
		System.out.print("验证结果: ");
		if (resultFlag) {
			System.out.println("正确");
		} else {
			System.out.println("错误");
		}
	}

	/**
	 * 输入参数验证方法
	 *
	 * @param inputObjArr     调用算法的参数值列表
	 * @param trueInputResult 正确输入结果
	 * @param outputObj       算法输出值
	 * @param inputIndex      需要验证的入参参数序号
	 * @param tempList        临时缓存，用于数据传递
	 */
	public boolean inputVerify(Object[] inputObjArr, String trueInputResult, Object outputObj, int inputIndex, List tempList) {
		try {
			Object inputObj = inputObjArr[inputIndex];
			String testInputResult = Utilitys.format(inputObj);
			boolean resultFlag = trueInputResult.equals(testInputResult);
			printInputVerify(trueInputResult, testInputResult, resultFlag);
			return resultFlag;
		} catch (Exception e) {
			e.printStackTrace();
			printInputVerify(trueInputResult, e.getMessage(), false);
			return false;
		}
	}

	protected void printInputVerify(String trueInputResult, String testInputResult, boolean resultFlag) {
		System.out.println("入参输出:");
		System.out.println(testInputResult);
		System.out.println("入参预期结果:");
		System.out.println(trueInputResult);
		System.out.print("入参验证结果: ");
		if (resultFlag) {
			System.out.println("正确");
		} else {
			System.out.println("错误");
		}
	}

	/**
	 * 列表式方式参数调用
	 * 例如
	 * ["LRUCache","put","put","get","put","get","put","get","get","get"]
	 * [[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]
	 * 第一个参数第一个值是构造函数
	 *
	 * @param funcList  方法列表
	 * @param paramList 参数列表
	 * @return
	 */
	public List funcListTest(List funcList, List paramList) {
		List retList = Utilitys.funcListTest(getClass(), funcList, paramList);
		return retList;
	}
}
