package com.learn.java.leetcode.lc0138;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.learn.java.leetcode.base.Utilitys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 包下的工具类
 *
 * @author zhangyangshuo
 */
class Utils {
	/**
	 * 构建带随机指针的链表
	 *
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
		Map<Integer, Integer> randomMap = new HashMap<>();

		int i = 0;
		while (jsonObject != null && jsonObject.size() > 0) {
			Integer id = Integer.parseInt(jsonObject.get("$id").getAsString());
			int val = jsonObject.get("val").getAsInt();
			JsonObject randomJsonObject = jsonObject.getAsJsonObject("random");

			Node node = new Node(val, null, null);
			list.add(node);
			map.put(id, node);
			if (randomJsonObject != null && !randomJsonObject.get("$ref").isJsonNull()) {
				randomMap.put(i, randomJsonObject.get("$ref").getAsInt());
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
			if (randomMap.containsKey(i)) {
				Integer ref = randomMap.get(i);
				Node node = map.get(ref);
				list.get(i).random = node;
			}
		}
		return list.get(0);
	}


	/**
	 * 格式化带随机指针链表
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

		while (jsonObject != null && jsonObject.size() > 0) {
			JsonObject randomJsonObject = !jsonObject.get("random").isJsonNull() ? jsonObject.get("random").getAsJsonObject() : null;
			if (randomJsonObject != null && randomJsonObject.get("$ref") != null && !randomJsonObject.get("$ref").isJsonNull()) {
				String nodeAddr = randomJsonObject.get("$ref").getAsString();
				Integer ref = map.get(nodeAddr);
				randomJsonObject.addProperty("$ref", ref.toString());
			}
			if (!jsonObject.get("next").isJsonNull()) {
				jsonObject = jsonObject.getAsJsonObject("next");
			} else {
				break;
			}
		}

		return  Utilitys.sortJsonObject(retJsonObject.toString());

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
		if (cur.random != null) {
			JsonObject refJSONObject = new JsonObject();
			refJSONObject.addProperty("$ref", cur.random.toString());
			jsonObject.add("random", refJSONObject);
		}
		jsonObject.addProperty("val", cur.val);


		return jsonObject;
	}
}
