package com.learn.java.leetcode.lc0341;

import com.learn.java.leetcode.base.utils.StringUtil;

import java.util.ArrayList;
import java.util.List;

class Utils {

	public static List<NestedInteger> buildList(String data) {
		if (data == null || data.trim().length() == 0 || data.equals("null") || data.indexOf("[") < 0) {
			return null;
		}
		if (data.equals("[]")) {
			return new ArrayList<>();
		}
		data = data.trim();
		//去掉最外层的[]
		data = data.substring(1, data.length() - 1);

		String splitStr;

		String[] arr = null;
		if (data.indexOf("[") >= 0) {
			List<String> vList = new ArrayList<>();
			int count = 0;
			StringBuffer stringBuffer = new StringBuffer();
			for (int i = 0; i < data.length(); i++) {
				char c = data.charAt(i);
				stringBuffer.append(c);
				if (c == '[') {
					count++;
				} else if (c == ']') {
					count--;
				} else if (c == ',' && count == 0) {
					stringBuffer.deleteCharAt(stringBuffer.length() - 1);
					vList.add(stringBuffer.toString());
					stringBuffer = new StringBuffer();
				}
			}
			vList.add(stringBuffer.toString());
			arr = new String[vList.size()];
			for (int i = 0; i < vList.size(); i++) {
				arr[i] = vList.get(i);
			}

		} else {
			splitStr = ",";
			arr = data.split(splitStr, -1);
		}

		boolean flag;
		int length = arr.length;
		List<NestedInteger> list = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			String newData = arr[i];
			flag = false;
			if (newData.indexOf("[") >= 0) {
				flag = true;
			}
			if (flag) {
				list.add(new NestedIntegerImpl(buildList(newData)));
			} else {
				if (arr[i] == null || arr[i].trim().length() == 0) {
					list.add(null);
				} else {
					if (StringUtil.judgeNumber(arr[i])) {
						list.add(new NestedIntegerImpl(Integer.parseInt(arr[i])));
					}
				}
			}
		}
		return list;
	}
}
