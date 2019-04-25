package com.learn.java.leetcode.base.spider;

import org.apache.commons.lang3.StringEscapeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;


public class Html2MdCn {
	private Html2MdCn() {
	}

	public static String getMarkDownText(String html) {
		StringBuilder result = new StringBuilder();

		Document document = Jsoup.parseBodyFragment(html.replaceAll("&nbsp;", " ").replaceAll("<span>", "").replaceAll("</span>", ""));
		// 遍历所有直接子节点
		for (Node node : document.body().childNodes()) {
			result.append(handleNode(node));
		}
		return StringEscapeUtils.unescapeHtml4(result.toString());
	}

	/**
	 * 处理Node，目前支持处理p、pre、ul和ol四种节点
	 *
	 * @param node
	 * @return
	 */
	private static String handleNode(Node node) {
		String nodeName = node.nodeName();
		String nodeStr = node.toString();
		switch (nodeName) {
			case "div":
				Element divElement = Jsoup.parseBodyFragment(nodeStr).body().getElementsByTag("div").first();
				StringBuilder result = new StringBuilder();
				for (Node childNode : divElement.childNodes()) {
					result.append(handleNode(childNode));
				}

				return result.toString() + "\n";
			case "p":
				Element pElement = Jsoup.parseBodyFragment(nodeStr).body().getElementsByTag("p").first();
				String pStr = pElement.html();
				for (Element child : pElement.children()) {
					pStr = handleInnerHtml(pStr, child);
				}
				return pStr + "\n";
			case "a":
				Element aElement = Jsoup.parseBodyFragment(nodeStr).body().getElementsByTag("a").first();
				String aStr = aElement.html();
				for (Element child : aElement.children()) {
					aStr = handleInnerHtml(aStr, child);
				}
				return aStr + "\n";
			//case "pre":
			//	return "```\n" + Jsoup.parseBodyFragment(nodeStr).body().text() + "\n```\n";
			case "pre":
				Element preElement = Jsoup.parseBodyFragment(nodeStr).body().getElementsByTag("pre").first();
				String preStr = preElement.htmlNoPretty();
				if (preStr.indexOf("<sup>") >= 0 || preStr.indexOf("<sub>") >= 0|| preStr.indexOf("<img") >= 0) {
					return "\n<pre>" + preStr + "</pre>\n";
				} else {
					for (Element child : preElement.children()) {
						preStr = handleInnerHtmlPre(preStr, child);
					}
					return "```\n" + preStr + "\n```\n";
				}
			case "ul":
				Element ulElement = Jsoup.parseBodyFragment(nodeStr).body().getElementsByTag("ul").first();
				String ulStr = ulElement.html().replace("<li>", "- ").replace("</li>", "");
				for (Element li : ulElement.getElementsByTag("li")) {
					for (Element child : li.children()) {
						ulStr = handleInnerHtml(ulStr, child);
					}
				}
				return ulStr + "\n";
			case "ol":
				Element olElement = Jsoup.parseBodyFragment(nodeStr).body().getElementsByTag("ol").first();
				String olStr = olElement.html();

				Elements liElements = olElement.getElementsByTag("li");
				for (int i = 1; i <= liElements.size(); i++) {
					Element li = liElements.get(i - 1);
					olStr = olStr.replace(li.toString(), li.toString().replace("<li>", i + ". ").replace("</li>", ""));

				}
				for (int i = 1; i <= liElements.size(); i++) {
					Element li = liElements.get(i - 1);

					for (Element child : li.children()) {
						olStr = handleInnerHtml(olStr, child);
					}
				}
				return olStr + "\n";
			// 非HTML元素
			case "#text":
				return "\n";
			case "img":
				Element imgElement = Jsoup.parseBodyFragment(nodeStr).body().getElementsByTag("img").first();
				String src = imgElement.attr("src");
				if (src.charAt(0) == '/') {
					src = "https://leetcode-cn.com" + src;
				}
				return "![img](" + src + ")\n";
		}
		return "";
	}

	/**
	 * 处理innerHTML中的HTML元素，目前支持处理的子元素包括strong、img、em
	 *
	 * @param innerHTML
	 * @param child
	 * @return
	 */
	private static String handleInnerHtml(String innerHTML, Element child) {
		switch (child.tag().toString()) {
			case "strong":
				if (child.toString().indexOf("<img") >= 0) {
					Elements elements = child.children();
					innerHTML = elements.toString();
					innerHTML = handleInnerHtml(innerHTML, elements.first());
				} else {
					innerHTML = innerHTML.replace(child.toString(), "**" + child.text() + "** ");
				}
				break;
			case "img":
				String src = child.attr("src");
				if (src.charAt(0) == '/') {
					src = "https://leetcode-cn.com" + src;
				}

				innerHTML = innerHTML.replace(child.toString(), "![img](" + src + ")");
				break;
			case "em":
				String txt = child.text();
				if (txt.trim().length() > 0) {
					innerHTML = innerHTML.replace(child.toString(), " *" + txt + "* ");
				} else {
					innerHTML = innerHTML.replace(child.toString(), txt);
				}
				break;
			case "code":
				String txt1 = child.text();
				if (txt1.trim().length() > 0) {
					innerHTML = innerHTML.replace(child.toString(), " *" + txt1 + "* ");
				} else {
					innerHTML = innerHTML.replace(child.toString(), txt1);
				}
				break;
			case "sup":
				break;
			case "sub":
				break;
			case "a":
				Elements elements = child.children();
				if (elements.size() > 0) {
					innerHTML = elements.toString();
					innerHTML = handleInnerHtml(innerHTML, elements.first());
				} else {
					innerHTML = innerHTML.replace(child.toString(), child.text());
				}
				break;
			default:
				innerHTML = innerHTML.replace(child.toString(), child.text());
				break;
		}
		return innerHTML;
	}

	private static String handleInnerHtmlPre(String innerHTML, Element child) {
		switch (child.tag().toString()) {
			case "sup":
				break;
			case "sub":
				break;
			case "a":
				Elements elements = child.children();
				if (elements.size() > 0) {
					innerHTML = elements.toString();
					innerHTML = handleInnerHtml(innerHTML, elements.first());
				} else {
					innerHTML = innerHTML.replace(child.toString(), child.text());
				}
				break;
			default:
				innerHTML = innerHTML.replace(child.toString(), child.text());
				break;
		}
		return innerHTML;
	}


}
