package com.learn.java.leetcode.base;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.learn.java.leetcode.base.structure.ListNode;
import com.learn.java.leetcode.base.structure.TreeNode;
import com.learn.java.leetcode.base.utils.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.*;


/**
 * Leetcode测试工具类
 *
 * @author zhangyangshuo
 */
public class Utilitys {


	/**
	 * 批量测试
	 *
	 * @param mainClass
	 */
	public static boolean test(Class<? extends CallBack> mainClass) {
		List<List<String>> testList = readTxtFile(mainClass);
		//类方法定义
		List<String> classList = testList.get(0);
		if (classList==null||classList.size() <= 1) {

			System.out.println("未定义算法主类和方法!");
			System.out.println("-----------------------------");
			//return false;
			throw new NoImplException("未定义算法主类和方法!");
		}
		//备注
		String algorithmRemark = classList.get(0);


		System.out.println(algorithmRemark);
		System.out.println("-----------------------------");

		boolean testFlag = true;

		for (int i = 1; i < classList.size(); i++) {
			String funcStr = classList.get(i);
			if (funcStr.trim().length() <= 0) {
				continue;
			}
			String funcRemark = null;
			int index = funcStr.indexOf("#");
			if (index >= 0) {
				funcRemark = funcStr.substring(index + 1);
				funcStr = funcStr.substring(0, index);
			}
			String[] funcArr = funcStr.split("\\.");
			if (funcArr.length < 2) {
				//throw new RuntimeException("方法参数定义错误,应该是: className.funcName");
				System.out.println("方法参数定义错误,应该是: className.funcName");
				return false;
			}
			String algorithmClassName = funcArr[0];
			String algorithmFuncName = funcArr[1].trim();
			if (StringUtils.isBlank(funcRemark)) {
				funcRemark = algorithmFuncName;
			} else {
				funcRemark = algorithmFuncName + " " + funcRemark;
			}

			System.out.println(funcRemark);
			System.out.println("-----------------------------");

			int jCount = 1;
			for (int j = 1; j < testList.size(); j++) {
				//数据
				List<String> dataList = testList.get(j);
				if (dataList != null ) {
					if(dataList.size()>0) {
						System.out.println("第" + jCount + "组数据:");
					}
					boolean resultFlag = test(mainClass, algorithmClassName, algorithmFuncName, dataList);
					if (!resultFlag) {
						testFlag = false;
					}
					System.out.println("-----------------------------");
					jCount++;
				}
			}
		}
		if (!testFlag) {
			System.out.println("存在错误!");
			System.out.println("-----------------------------");
		}
		return testFlag;
	}

	/**
	 * 测试单条
	 *
	 * @param mainClass
	 * @param algorithmClassName
	 * @param algorithmFuncName
	 * @param dataList
	 */
	private static boolean test(Class<? extends CallBack> mainClass, String algorithmClassName, String algorithmFuncName, List<String> dataList) {
		boolean testFlag = true;
		try {
			String packageName = mainClass.getPackage().getName();
			CallBack callBack = mainClass.newInstance();
			Class<?> algorithmClass = Class.forName(packageName + "." + algorithmClassName);
			Method[] methods = algorithmClass.getMethods();
			//algorithmClass.getDeclaredMethods();

			for (int i = 0; i < methods.length; i++) {
				Method method = methods[i];
				if (algorithmFuncName.equals(methods[i].getName())) {

					boolean invokeFlag = true;
					// 得到方法的返回值类型的类型
					Class<?> returnType = methods[i].getReturnType();
					String returnTypeName = returnType.getName();

					Class<?>[] parameterTypes = methods[i].getParameterTypes();
					int paramLength = parameterTypes.length;
					Object[] inputObjArr = new Object[paramLength];

					//临时集合，用于输入和输出之间传递
					List tempList = new ArrayList();

					if(paramLength>0) {
						System.out.println("输入:");
						//打印输入参数
						try {
							callBack.printInput(dataList, paramLength);
						} catch (Exception e) {
							e.printStackTrace();
							testFlag = false;
							invokeFlag = false;
						}
					}

					//如果入参需要重构
					try {
						callBack.inputBuild(parameterTypes, inputObjArr, dataList, tempList);
					} catch (Exception e) {
						e.printStackTrace();
						testFlag = false;
						invokeFlag = false;
					}
					long startTime = System.currentTimeMillis();
					//调用算法
					Object outputObj = null;
					try {
						if (invokeFlag) {
							outputObj = method.invoke(algorithmClass.newInstance(), inputObjArr);
						}
					} catch (Exception e) {
						e.printStackTrace();
						testFlag = false;
					}
					long endTime = System.currentTimeMillis();

					List<String> trueResultOutputList = new ArrayList<>();
					for (int k = paramLength; k < dataList.size(); k++) {

						String trueResult = dataList.get(k);
						if (StringUtils.isNotBlank(trueResult)) {
							if (trueResult.startsWith("=")) {
								trueResult = trueResult.substring(1);
								if (StringUtils.isNotBlank(trueResult)) {
									trueResultOutputList.add(trueResult);
								}
							}
						}
					}
					//格式化打印
					if (!"void".equals(returnTypeName)) {
						boolean enprint = true;
						for (int j = inputObjArr.length; j < dataList.size(); j++) {
							if (dataList.get(j).equals("$disprint")) {
								enprint = false;
								break;
							}
						}
						if(enprint&&(Print.judgePrint(outputObj)|| trueResultOutputList.size() == 0)) {
							//打印输出
							try {
								callBack.printOutput(outputObj);
							} catch (Exception e) {
								e.printStackTrace();
								testFlag = false;
							}
						}
					}


					for (int k = paramLength; k < dataList.size(); k++) {

						String trueResult = dataList.get(k);
						if (StringUtils.isNotBlank(trueResult)) {
							if (StringUtil.judgeINumber(trueResult)) {
								/**
								 * 验证输入参数
								 */
								int inputIndex = Integer.parseInt(trueResult.substring(1, 2));
								String trueInputResult = trueResult.substring(3).trim();
								if (StringUtils.isNotBlank(trueInputResult) && inputIndex >= 0 && inputIndex < inputObjArr.length) {
									try {

										Object inputObj = inputObjArr[inputIndex];
										boolean enprint = true;
										for (int j = inputObjArr.length; j < dataList.size(); j++) {
											if (dataList.get(j).equals("$disprint")) {
												//打印输入
												enprint = false;
												break;
											}
										}
										if(enprint&&Print.judgePrint(inputObj)) {
											//打印输入
											try {
												callBack.printInput(inputObj);
											} catch (Exception e) {
												e.printStackTrace();
												testFlag = false;
											}
										}

										boolean resultFlag = callBack.inputVerify(inputObjArr, trueInputResult, outputObj, inputIndex, dataList, tempList);
										if (!resultFlag) {
											testFlag = false;
										}else{
											//支持多个答案
											testFlag = true;
											break;
										}
									} catch (Exception e) {
										e.printStackTrace();
										testFlag = false;
										callBack.printInputVerify(trueInputResult, e.getMessage(), false);
									}
								}
							}
						}
					}

					if (trueResultOutputList.size() > 0) {
						/**
						 * 验证输出结果
						 */
						try {
							boolean resultFlag = callBack.outputVerify(inputObjArr, trueResultOutputList, outputObj, dataList, tempList);
							if (!resultFlag) {
								testFlag = false;
							}
						} catch (Exception e) {
							e.printStackTrace();
							testFlag = false;
							callBack.printOutVerify(trueResultOutputList, e.getMessage(), false);
						}
					}

					System.out.println("计算时长: " + (endTime - startTime) + "ms");

					break;

				}

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			testFlag = false;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			testFlag = false;
		} catch (InstantiationException e) {
			e.printStackTrace();
			testFlag = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testFlag;
	}

	/**
	 * 用于实现调用多个方法的列表执行
	 *
	 * @param mainClass
	 * @param funcList
	 * @param paramList
	 * @return
	 */
	public static List funcListTest(Class<? extends CallBack> mainClass, List funcList, List paramList) {
		List retList = new ArrayList();
		if (funcList != null && funcList.size() > 0 && paramList != null && paramList.size() > 0) {
			Object obj = null;
			Class<?> algorithmClass = null;
			String packageName = mainClass.getPackage().getName();
			for (int i = 0; i < funcList.size(); i++) {
				String funcName = funcList.get(i).toString();
				List params = (List) paramList.get(i);
				if (i == 0) {
					//第一个值是构造方法
					try {
						algorithmClass = Class.forName(packageName + "." + funcName);

						Constructor<?>[] constructors = algorithmClass.getConstructors();
						for (int j = 0; j < constructors.length; j++) {
							Constructor c = constructors[j];
							if (params.size() == 0 && c.getParameterTypes().length == 0) {
								obj = c.newInstance();
							}
							//通过参数个数判断,可能有更好的办法
							else if (params.size() > 0 && c.getParameterTypes().length == params.size()) {
								boolean flag = true;
								Object[] inputObjArr = new Object[params.size()];
								for (int k = 0; k < params.size(); k++) {
									String parameterName = c.getParameterTypes()[k].getName();
									Object data = params.get(k);

									if (parameterName.equals("int") && data instanceof Integer) {
										inputObjArr[k] = Integer.parseInt(data.toString());
									} else if (parameterName.equals("long") && data instanceof Long) {
										inputObjArr[k] = Long.parseLong(data.toString());
									} else if (parameterName.equals("double") && data instanceof Double) {
										inputObjArr[k] = Double.parseDouble(data.toString());
									} else if (parameterName.equals("float") && data instanceof Float) {
										inputObjArr[k] = Float.parseFloat(data.toString());
									} else if (parameterName.equals("boolean") && data instanceof Boolean) {
										inputObjArr[k] = Boolean.parseBoolean(data.toString());
									} else if (parameterName.equals("java.lang.Integer") && data instanceof Integer) {
										inputObjArr[k] = Integer.valueOf(data.toString());
									} else if (parameterName.equals("java.lang.Long") && data instanceof Long) {
										inputObjArr[k] = Long.valueOf(data.toString());
									} else if (parameterName.equals("java.lang.Double") && data instanceof Double) {
										inputObjArr[k] = Double.valueOf(data.toString());
									} else if (parameterName.equals("java.lang.Float") && data instanceof Float) {
										inputObjArr[k] = Float.valueOf(data.toString());
									} else if (parameterName.equals("java.lang.Boolean") && data instanceof Boolean) {
										inputObjArr[k] = Boolean.valueOf(data.toString());
									} else if (parameterName.equals("java.lang.String") && data instanceof String) {
										inputObjArr[k] = StringUtil.changeStr(data.toString());
									} else if (parameterName.equals("[I") && data instanceof List) {
										int[] array = Build.buildArray((List) data);
										inputObjArr[k] = array;
									} else if (parameterName.equals("[[I")&& data instanceof List){
										int[][] matrix = Build.buildMatrix((List) data);
										inputObjArr[k] = matrix;
									} else if (parameterName.equals("[B")&& data instanceof List) {
										boolean[] array = Build.buildArrayBoolean((List)data);
										inputObjArr[k] = array;
									} else if (parameterName.equals("[[B")&& data instanceof List) {
										boolean[][] matrix = Build.buildMatrixBoolean((List)data);
										inputObjArr[k] = matrix;
									} else if (parameterName.equals("[D")&& data instanceof List) {
										double[] array = Build.buildArrayDouble((List)data);
										inputObjArr[k] = array;
									} else if (parameterName.equals("[[D")&& data instanceof List) {
										double[][] matrix = Build.buildMatrixDouble((List)data);
										inputObjArr[k] = matrix;
									} else if (parameterName.equals("[F")&& data instanceof List) {
										float[] array = Build.buildArrayFloat((List)data);
										inputObjArr[k] = array;
									} else if (parameterName.equals("[[F")&& data instanceof List) {
										float[][] matrix = Build.buildMatrixFloat((List)data);
										inputObjArr[k] = matrix;
									} else if (parameterName.equals("[C") && data instanceof List) {
										char[] array = Build.buildArrayChar((List) data);
										inputObjArr[k] = array;
									} else if (parameterName.equals("[[C") && data instanceof List) {
										char[][] matrix = Build.buildMatrixChar((List) data);
										inputObjArr[k] = matrix;
									} else if (parameterName.equals("[Ljava.lang.String;") && data instanceof List) {
										String[] array = Build.buildArrayString((List) data);
										inputObjArr[k] = array;
									} else if (parameterName.equals("[[Ljava.lang.String;") && data instanceof List) {
										String[][] matrix = Build.buildMatrixString((List) data);
										inputObjArr[k] = matrix;
									} else if (parameterName.equals("java.util.List") && data instanceof List) {
										List list = (List) data;
										inputObjArr[k] = list;
									} else if (parameterName.equals("com.learn.java.leetcode.base.structure.TreeNode") && data instanceof List) {
										TreeNode treeNode = Build.buildBinaryTree((List) data);
										inputObjArr[k] = treeNode;
									} else if (parameterName.equals("com.learn.java.leetcode.base.structure.ListNode") && data instanceof List) {
										ListNode listNode = Build.buildListNode((List) data);
										inputObjArr[k] = listNode;
									} else if (parameterName.equals("[Lcom.learn.java.leetcode.base.structure.ListNode;") && data instanceof List) {
										ListNode[] listNode = Build.buildListNodeArray((List) data);
										inputObjArr[k] = listNode;
									} else if (parameterName.equals("java.util.Iterator")&& data instanceof List){
										Iterator iter = ((List)data).iterator();
										inputObjArr[k] = iter;
									} else {
										//可能有未处理的类型
										flag = false;
										break;
									}

								}
								if (flag) {
									obj = c.newInstance(inputObjArr);
									break;
								}
							}
						}

						if(obj==null){
							throw new RuntimeException("无有效的构造方法，初始化失败!");
						}
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					//构造函数返回结果
					retList.add(null);
				} else {
					Method[] methods = algorithmClass.getDeclaredMethods();
					for (int k = 0; k < methods.length; k++) {
						Method method = methods[k];
						if (funcName.equals(method.getName())) {
							Class<?>[] parameterTypes = method.getParameterTypes();
							int paramLength = parameterTypes.length;
							Object[] inputObjArr = new Object[paramLength];
							for (int j = 0; j < paramLength; j++) {
								String parameterName = parameterTypes[j].getName();
								Object data = params.get(j);
								if (parameterName.equals("int")) {
									inputObjArr[j] = Integer.parseInt(data.toString());
								} else if (parameterName.equals("long")) {
									inputObjArr[j] = Long.parseLong(data.toString());
								} else if (parameterName.equals("double")) {
									inputObjArr[j] = Double.parseDouble(data.toString());
								} else if (parameterName.equals("float")) {
									inputObjArr[j] = Float.parseFloat(data.toString());
								} else if (parameterName.equals("boolean")) {
									inputObjArr[j] = Boolean.parseBoolean(data.toString());
								} else if (parameterName.equals("java.lang.Integer")) {
									inputObjArr[j] = Integer.valueOf(data.toString());
								} else if (parameterName.equals("java.lang.Long")) {
									inputObjArr[j] = Long.valueOf(data.toString());
								} else if (parameterName.equals("java.lang.Double")) {
									inputObjArr[j] = Double.valueOf(data.toString());
								} else if (parameterName.equals("java.lang.Float")) {
									inputObjArr[j] = Float.valueOf(data.toString());
								} else if (parameterName.equals("java.lang.Boolean")) {
									inputObjArr[j] = Boolean.valueOf(data.toString());
								} else if (parameterName.equals("java.lang.String")) {
									inputObjArr[j] = StringUtil.changeStr(data.toString());
								} else if (parameterName.equals("[I")&& data instanceof List) {
									int[] array = Build.buildArray((List)data);
									inputObjArr[j] = array;
								} else if (parameterName.equals("[[I")&& data instanceof List) {
									int[][] matrix = Build.buildMatrix((List)data);
									inputObjArr[j] = matrix;
								} else if (parameterName.equals("[B")&& data instanceof List) {
									boolean[] array = Build.buildArrayBoolean((List)data);
									inputObjArr[j] = array;
								} else if (parameterName.equals("[[B")&& data instanceof List) {
									boolean[][] matrix = Build.buildMatrixBoolean((List)data);
									inputObjArr[j] = matrix;
								} else if (parameterName.equals("[D")&& data instanceof List) {
									double[] array = Build.buildArrayDouble((List)data);
									inputObjArr[j] = array;
								} else if (parameterName.equals("[[D")&& data instanceof List) {
									double[][] matrix = Build.buildMatrixDouble((List)data);
									inputObjArr[j] = matrix;
								} else if (parameterName.equals("[F")&& data instanceof List) {
									float[] array = Build.buildArrayFloat((List)data);
									inputObjArr[j] = array;
								} else if (parameterName.equals("[[F")&& data instanceof List) {
									float[][] matrix = Build.buildMatrixFloat((List)data);
									inputObjArr[j] = matrix;
								} else if (parameterName.equals("[C")&& data instanceof List) {
									char[] array = Build.buildArrayChar((List)data);
									inputObjArr[j] = array;
								} else if (parameterName.equals("[[C")&& data instanceof List) {
									char[][] matrix = Build.buildMatrixChar((List)data);
									inputObjArr[j] = matrix;
								} else if (parameterName.equals("[Ljava.lang.String;")&& data instanceof List) {
									String[] array = Build.buildArrayString((List)data);
									inputObjArr[j] = array;
								} else if (parameterName.equals("[[Ljava.lang.String;")&& data instanceof List) {
									String[][] matrix = Build.buildMatrixString((List)data);
									inputObjArr[j] = matrix;
								} else if (parameterName.equals("java.util.List")&& data instanceof List) {
									List list = (List) data;
									inputObjArr[j] = list;
								} else if (parameterName.equals("com.learn.java.leetcode.base.structure.TreeNode") && data instanceof List) {
									TreeNode treeNode = Build.buildBinaryTree((List) data);
									inputObjArr[j] = treeNode;
								} else if (parameterName.equals("com.learn.java.leetcode.base.structure.ListNode") && data instanceof List) {
									ListNode listNode = Build.buildListNode((List) data);
									inputObjArr[j] = listNode;
								} else if (parameterName.equals("[Lcom.learn.java.leetcode.base.structure.ListNode;") && data instanceof List) {
									ListNode[] listNode = Build.buildListNodeArray((List) data);
									inputObjArr[j] = listNode;
								} else {
									throw new RuntimeException("未定义的参数类型，初始化失败!");
								}
							}
							//调用方法
							try {
								Object outputObj = method.invoke(obj, inputObjArr);
								retList.add(outputObj);
							} catch (IllegalAccessException e) {
								e.printStackTrace();
							} catch (InvocationTargetException e) {
								e.printStackTrace();
							}

							break;

						}
					}
				}

			}
		}
		return retList;
	}

	/**
	 * 读入数据
	 *
	 * @param clazz
	 * @return
	 */
	private static List<List<String>> readTxtFile(Class clazz) {
		String packageName = clazz.getPackage().getName();
		String path = "/" + packageName.replaceAll("\\.", "/") + "/README.md";
		String str = readTxtFile(path);
		String[] strArr = str.split("---\r", -1);
		List<List<String>> dataList = new ArrayList<>();
		for (int i = 0; i < strArr.length; i++) {
			List<String> itemsList = new ArrayList<>();
			String[] strArr2 = strArr[i].split("\r", -1);
			for (int j = 0; j < strArr2.length; j++) {
				String tempTrim = strArr2[j].trim();
				if (tempTrim.length() > 0 && !tempTrim.startsWith("#")) {
					String temp = strArr2[j];
					itemsList.add(temp);
				}
			}
			dataList.add(itemsList);
		}
		return dataList;
	}


	private static String readTxtFile(String path) {
		StringBuilder lastJson = new StringBuilder();
		BufferedReader reader = null;
		try {
			InputStream is = Utilitys.class.getResourceAsStream(path);
			reader = new BufferedReader(new InputStreamReader(is));
			String tempString = null;

			int i = 0;
			// 一次读入一行，直到读入null为文件结束
			boolean flag = false;
			while ((tempString = reader.readLine()) != null) {
				if (tempString.equals("# 测试用例")) {
					flag = true;
				}
				if (flag && tempString.equals("```")) {
					i++;
				} else {
					if (i == 1 && tempString.length() > 0 && !tempString.startsWith("#")) {
						lastJson.append(tempString).append("\r");
					}
				}
				if (i == 2) {
					break;
				}

			}

		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return lastJson.toString();
	}

	/**
	 * 根据trueResult对应的长度，截取testInputResult对应的数组并转化成字符串
	 * 适用于026,027
	 *
	 * @param testInputResult
	 * @param trueResult
	 * @return
	 */
	public static String copyNewArrayToString(String testInputResult, String trueResult) {
		int[] array = Build.buildArray(testInputResult);
		int[] newArray = Arrays.copyOf(array, Integer.parseInt(trueResult));
		return Format.format(newArray);
	}

	public static boolean compareArrays(int[] array1, int[] array2) {
		if (array1 == null && array2 == null) {
			return true;
		}
		if (array1 == null || array2 == null) {
			return false;
		}
		if (array1.length != array2.length) {
			return false;
		}


		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean compareArraysString(String[] array1, String[] array2) {
		if (array1 == null && array2 == null) {
			return true;
		}
		if (array1 == null || array2 == null) {
			return false;
		}
		if (array1.length != array2.length) {
			return false;
		}


		for (int i = 0; i < array1.length; i++) {
			if (array1[i].equals(array2[i])) {
				return false;
			}
		}
		return true;
	}

	public static boolean compareArraysChar(char[] array1, char[] array2) {
		if (array1 == null && array2 == null) {
			return true;
		}
		if (array1 == null || array2 == null) {
			return false;
		}
		if (array1.length != array2.length) {
			return false;
		}


		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean compareMatrix(int[][] m1, int[][] m2) {
		if (m1 == null && m2 == null) {
			return true;
		}
		if (m1 == null || m2 == null) {
			return false;
		}
		if (m1.length != m2.length || m1[0].length != m2[0].length) {
			return false;
		}
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Compare 2 lists ignoring order.
	 */
	public static <T> boolean compareListsIgnoreOrder(List<T> list1, List<T> list2) {
		if (list1 == null && list2 == null) {
			return true;
		}
		if (list1 == null || list2 == null) {
			return false;
		}
		if (list1.size() != list2.size()) {
			return false;
		}
		sortList(list1);
		sortList(list2);
		Set<T> set1 = new HashSet<>(list1);
		Set<T> set2 = new HashSet<>(list2);
		return set1.equals(set2);
	}



	public static  void sortList(List list){
		if(list!=null&&list.size()>0){
			Object o = list.get(0);
			if(o instanceof List){
				for(int i =0 ;i<list.size();i++){
					List list1 = (List)list.get(i);
					sortList(list1);
					//list.set(i,list1);
				}
			}else{
				Collections.sort(list);
			}
		}
	}




	public static boolean compareTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		if (root1.val != root2.val) {
			return false;
		}
		return compareTrees(root1.left, root2.left) && compareTrees(root1.right, root2.right);
	}

	/**
	 * 二叉树搜索结点
	 *
	 * @param root
	 * @param val
	 * @return
	 */
	public static TreeNode searchBinaryTree(TreeNode root, int val) {
		if (root == null) {
			return null;
		}
		if (root.val == val) {
			return root;
		} else {
			TreeNode search = searchBinaryTree(root.left, val);
			if (search != null) {
				return search;
			} else {
				return searchBinaryTree(root.right, val);
			}
		}
	}

	/**
	 * 搜索链表
	 *
	 * @param head
	 * @param val
	 * @return
	 */
	public static ListNode searchListNode(ListNode head, int val) {
		if (head == null) {
			return null;
		}
		ListNode p = head;
		while (p != null) {
			if (p.val == val) {
				return p;
			}
			p = p.next;
		}
		return null;
	}

	/**
	 * 调用test
	 *
	 * @param className
	 * @return
	 */
	public static boolean funcInvoke(String className) {
		try {
			Class<?> algorithmClass = Class.forName(className);
			CallBack callBack = (CallBack) algorithmClass.newInstance();
			return test(callBack.getClass());
		} catch (NoImplException e){
			throw e;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 获取某个文件夹下的所有文件
	 *
	 * @param packageList 存放包名称的list
	 * @param path        文件夹的路径
	 * @return
	 */
	public static void getAllLCFileName(String path, List<String> packageList) {
		File file = new File(path);
		File[] tempList = file.listFiles();
		for (int i = 0; i < tempList.length; i++) {
			if (tempList[i].isDirectory()) {
				String packageName = tempList[i].getName();
				if (packageName.startsWith("lc")) {
					packageList.add(packageName);
				}
			}
		}
	}


	public static void sort(JsonElement e) {
		if (e.isJsonNull()) {
			return;
		}

		if (e.isJsonPrimitive()) {
			return;
		}

		if (e.isJsonArray()) {
			JsonArray a = e.getAsJsonArray();
			for (Iterator<JsonElement> it = a.iterator(); it.hasNext(); ) {
				sort(it.next());
			}
			return;
		}

		if (e.isJsonObject()) {
			Map<String, JsonElement> tm = new TreeMap<String, JsonElement>(String::compareTo);
			for (Map.Entry<String, JsonElement> en : e.getAsJsonObject().entrySet()) {
				tm.put(en.getKey(), en.getValue());
			}

			for (Map.Entry<String, JsonElement> en : tm.entrySet()) {
				e.getAsJsonObject().remove(en.getKey());
				e.getAsJsonObject().add(en.getKey(), en.getValue());
				sort(en.getValue());
			}
			return;
		}
	}

	/**
	 * 排序Json字符串
	 *
	 * @param json
	 * @return
	 */
	public static String sortJsonObject(String json) {
		JsonParser p = new JsonParser();
		JsonElement e = p.parse(json);

		sort(e);
		return e.toString();
	}

}
