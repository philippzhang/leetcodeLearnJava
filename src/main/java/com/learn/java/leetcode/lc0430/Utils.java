package com.learn.java.leetcode.lc0430;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.learn.java.leetcode.base.Utilitys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Utils {

	/**
	 * 构建带子指针的双向链表
	 * @param data
	 * @return
	 */
	static Node buildNode(String data) {
		if (data == null || data.trim().length() <= 0 || data.equals("null") || data.equals("{}")) {
			return null;
		}

		//创建json解析器,注意这里如果用fastJson解析不了
		JsonParser parse = new JsonParser();

		JsonObject jsonObject = (JsonObject) parse.parse(data);
		Map<Integer, Node> map = new HashMap<>();
		List<Node> list = new ArrayList<>();
		Map<Integer, Integer> prevMap = new HashMap<>();

		int i = 0;
		while (jsonObject != null && jsonObject.size() > 0) {
			Integer id = Integer.parseInt(jsonObject.get("$id").getAsString());
			int val = jsonObject.get("val").getAsInt();

			Node node = new Node(val, null, null, null);
			list.add(node);
			map.put(id, node);

			JsonElement preJsonElement = jsonObject.get("prev");
			JsonObject prevJsonObject = preJsonElement!=null&&!preJsonElement.isJsonNull()?preJsonElement.getAsJsonObject():null;
			if (prevJsonObject != null && !prevJsonObject.get("$ref").isJsonNull()) {
				prevMap.put(i, prevJsonObject.get("$ref").getAsInt());
			}

			JsonElement childJsonElement = jsonObject.get("child");
			JsonObject childJsonObject = childJsonElement!=null&&!childJsonElement.isJsonNull()?childJsonElement.getAsJsonObject():null;
			if(childJsonObject!=null){
				String childData = childJsonObject.toString();
				Node temp =  buildNode(childData);
				node.child = temp;
			}

			if (!jsonObject.get("next").isJsonNull()) {
				jsonObject = jsonObject.getAsJsonObject("next");
			} else {
				break;
			}
			i++;
		}

		for (i = 0; i < list.size(); i++) {
			if (i < list.size() - 1) {
				list.get(i).next = list.get(i + 1);
			}
			if (prevMap.containsKey(i)) {
				Integer ref = prevMap.get(i);
				Node node = map.get(ref);
				list.get(i).prev = node;
			}
		}
		return list.get(0);
	}


	/**
	 * 格式化带子指针的双向链表
	 *
	 * @param head
	 * @return
	 */
	static String format(Node head) {
		if (head == null) {
			return null;
		}
		Map<String, Integer> map = new HashMap<>();
		Utilitys.Counter counter = new Utilitys.Counter();
		counter.index = 0;
		Node cur = head;

		JsonObject jsonObject = format(cur, map, counter);

		JsonObject retJsonObject = jsonObject;

		changePrevId(jsonObject,map);

		return Utilitys.sortJsonObject(retJsonObject.toString());

	}


	private static JsonObject format(Node cur, Map<String, Integer> map, Utilitys.Counter counter) {
		if (cur == null) {
			return null;
		}
		JsonObject jsonObject = new JsonObject();
		counter.index++;
		map.put(cur.toString(), counter.index);
		jsonObject.addProperty("$id", counter.index.toString());

		jsonObject.add("next", format(cur.next, map, counter));
		if (cur.prev != null) {
			JsonObject refJSONObject = new JsonObject();
			refJSONObject.addProperty("$ref", cur.prev.toString());
			jsonObject.add("prev", refJSONObject);
		}else{
			jsonObject.add("prev",null);
		}

		if (cur.child != null) {
			jsonObject.add("child",format(cur.child,map,  counter));
		}else {
			jsonObject.add("child",null);
		}

		jsonObject.addProperty("val", cur.val);


		return jsonObject;
	}


	private static void changePrevId(JsonObject jsonObject, Map<String, Integer> map){
		while (jsonObject != null && jsonObject.size() > 0) {
			JsonObject prevJsonObject = jsonObject.get("prev")!=null&&!jsonObject.get("prev").isJsonNull() ? jsonObject.get("prev").getAsJsonObject() : null;
			if (prevJsonObject != null && prevJsonObject.get("$ref") != null && !prevJsonObject.get("$ref").isJsonNull()) {
				String nodeAddr = prevJsonObject.get("$ref").getAsString();
				Integer ref = map.get(nodeAddr);
				prevJsonObject.addProperty("$ref", ref.toString());
			}

			JsonObject childJsonObject = jsonObject.get("child")!=null&&!jsonObject.get("child").isJsonNull() ? jsonObject.get("child").getAsJsonObject() : null;
			changePrevId(childJsonObject,map);

			if (!jsonObject.get("next").isJsonNull()) {
				jsonObject = jsonObject.getAsJsonObject("next");
			} else {
				break;
			}
		}
	}
}
