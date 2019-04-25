//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jsoup.nodes;

import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.*;
import org.jsoup.select.Evaluator.*;
import org.jsoup.select.Evaluator.Attribute;
import org.jsoup.select.Evaluator.Class;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Element extends Node {
	private static final List<Node> EMPTY_NODES = Collections.emptyList();
	private static final Pattern classSplit = Pattern.compile("\\s+");
	private Tag tag;
	private WeakReference<List<Element>> shadowChildrenRef;
	List<Node> childNodes;
	private Attributes attributes;
	private String baseUri;

	public Element(String tag) {
		this(Tag.valueOf(tag), "", new Attributes());
	}

	public Element(Tag tag, String baseUri, Attributes attributes) {
		Validate.notNull(tag);
		Validate.notNull(baseUri);
		this.childNodes = EMPTY_NODES;
		this.baseUri = baseUri;
		this.attributes = attributes;
		this.tag = tag;
	}

	public Element(Tag tag, String baseUri) {
		this(tag, baseUri, (Attributes)null);
	}

	protected List<Node> ensureChildNodes() {
		if (this.childNodes == EMPTY_NODES) {
			this.childNodes = new Element.NodeList(this, 4);
		}

		return this.childNodes;
	}

	protected boolean hasAttributes() {
		return this.attributes != null;
	}

	public Attributes attributes() {
		if (!this.hasAttributes()) {
			this.attributes = new Attributes();
		}

		return this.attributes;
	}

	public String baseUri() {
		return this.baseUri;
	}

	protected void doSetBaseUri(String baseUri) {
		this.baseUri = baseUri;
	}

	public int childNodeSize() {
		return this.childNodes.size();
	}

	public String nodeName() {
		return this.tag.getName();
	}

	public String tagName() {
		return this.tag.getName();
	}

	public Element tagName(String tagName) {
		Validate.notEmpty(tagName, "Tag name must not be empty.");
		this.tag = Tag.valueOf(tagName, ParseSettings.preserveCase);
		return this;
	}

	public Tag tag() {
		return this.tag;
	}

	public boolean isBlock() {
		return this.tag.isBlock();
	}

	public String id() {
		return this.attributes().getIgnoreCase("id");
	}

	public Element attr(String attributeKey, String attributeValue) {
		super.attr(attributeKey, attributeValue);
		return this;
	}

	public Element attr(String attributeKey, boolean attributeValue) {
		this.attributes().put(attributeKey, attributeValue);
		return this;
	}

	public Map<String, String> dataset() {
		return this.attributes().dataset();
	}

	public final Element parent() {
		return (Element)this.parentNode;
	}

	public Elements parents() {
		Elements parents = new Elements();
		accumulateParents(this, parents);
		return parents;
	}

	private static void accumulateParents(Element el, Elements parents) {
		Element parent = el.parent();
		if (parent != null && !parent.tagName().equals("#root")) {
			parents.add(parent);
			accumulateParents(parent, parents);
		}

	}

	public Element child(int index) {
		return (Element)this.childElementsList().get(index);
	}

	public Elements children() {
		return new Elements(this.childElementsList());
	}

	private List<Element> childElementsList() {
		Object children;
		if (this.shadowChildrenRef == null || (children = (List)this.shadowChildrenRef.get()) == null) {
			int size = this.childNodes.size();
			children = new ArrayList(size);

			for(int i = 0; i < size; ++i) {
				Node node = (Node)this.childNodes.get(i);
				if (node instanceof Element) {
					((List)children).add((Element)node);
				}
			}

			this.shadowChildrenRef = new WeakReference(children);
		}

		return (List)children;
	}

	void nodelistChanged() {
		super.nodelistChanged();
		this.shadowChildrenRef = null;
	}

	public List<TextNode> textNodes() {
		List<TextNode> textNodes = new ArrayList();
		Iterator var2 = this.childNodes.iterator();

		while(var2.hasNext()) {
			Node node = (Node)var2.next();
			if (node instanceof TextNode) {
				textNodes.add((TextNode)node);
			}
		}

		return Collections.unmodifiableList(textNodes);
	}

	public List<DataNode> dataNodes() {
		List<DataNode> dataNodes = new ArrayList();
		Iterator var2 = this.childNodes.iterator();

		while(var2.hasNext()) {
			Node node = (Node)var2.next();
			if (node instanceof DataNode) {
				dataNodes.add((DataNode)node);
			}
		}

		return Collections.unmodifiableList(dataNodes);
	}

	public Elements select(String cssQuery) {
		return Selector.select(cssQuery, this);
	}

	public Element selectFirst(String cssQuery) {
		return Selector.selectFirst(cssQuery, this);
	}

	public boolean is(String cssQuery) {
		return this.is(QueryParser.parse(cssQuery));
	}

	public boolean is(Evaluator evaluator) {
		return evaluator.matches((Element)this.root(), this);
	}

	public Element appendChild(Node child) {
		Validate.notNull(child);
		this.reparentChild(child);
		this.ensureChildNodes();
		this.childNodes.add(child);
		child.setSiblingIndex(this.childNodes.size() - 1);
		return this;
	}

	public Element appendTo(Element parent) {
		Validate.notNull(parent);
		parent.appendChild(this);
		return this;
	}

	public Element prependChild(Node child) {
		Validate.notNull(child);
		this.addChildren(0, new Node[]{child});
		return this;
	}

	public Element insertChildren(int index, Collection<? extends Node> children) {
		Validate.notNull(children, "Children collection to be inserted must not be null.");
		int currentSize = this.childNodeSize();
		if (index < 0) {
			index += currentSize + 1;
		}

		Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");
		ArrayList<Node> nodes = new ArrayList(children);
		Node[] nodeArray = (Node[])nodes.toArray(new Node[nodes.size()]);
		this.addChildren(index, nodeArray);
		return this;
	}

	public Element insertChildren(int index, Node... children) {
		Validate.notNull(children, "Children collection to be inserted must not be null.");
		int currentSize = this.childNodeSize();
		if (index < 0) {
			index += currentSize + 1;
		}

		Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");
		this.addChildren(index, children);
		return this;
	}

	public Element appendElement(String tagName) {
		Element child = new Element(Tag.valueOf(tagName), this.baseUri());
		this.appendChild(child);
		return child;
	}

	public Element prependElement(String tagName) {
		Element child = new Element(Tag.valueOf(tagName), this.baseUri());
		this.prependChild(child);
		return child;
	}

	public Element appendText(String text) {
		Validate.notNull(text);
		TextNode node = new TextNode(text);
		this.appendChild(node);
		return this;
	}

	public Element prependText(String text) {
		Validate.notNull(text);
		TextNode node = new TextNode(text);
		this.prependChild(node);
		return this;
	}

	public Element append(String html) {
		Validate.notNull(html);
		List<Node> nodes = Parser.parseFragment(html, this, this.baseUri());
		this.addChildren((Node[])nodes.toArray(new Node[nodes.size()]));
		return this;
	}

	public Element prepend(String html) {
		Validate.notNull(html);
		List<Node> nodes = Parser.parseFragment(html, this, this.baseUri());
		this.addChildren(0, (Node[])nodes.toArray(new Node[nodes.size()]));
		return this;
	}

	public Element before(String html) {
		return (Element)super.before(html);
	}

	public Element before(Node node) {
		return (Element)super.before(node);
	}

	public Element after(String html) {
		return (Element)super.after(html);
	}

	public Element after(Node node) {
		return (Element)super.after(node);
	}

	public Element empty() {
		this.childNodes.clear();
		return this;
	}

	public Element wrap(String html) {
		return (Element)super.wrap(html);
	}

	public String cssSelector() {
		if (this.id().length() > 0) {
			return "#" + this.id();
		} else {
			String tagName = this.tagName().replace(':', '|');
			StringBuilder selector = new StringBuilder(tagName);
			String classes = StringUtil.join(this.classNames(), ".");
			if (classes.length() > 0) {
				selector.append('.').append(classes);
			}

			if (this.parent() != null && !(this.parent() instanceof Document)) {
				selector.insert(0, " > ");
				if (this.parent().select(selector.toString()).size() > 1) {
					selector.append(String.format(":nth-child(%d)", this.elementSiblingIndex() + 1));
				}

				return this.parent().cssSelector() + selector.toString();
			} else {
				return selector.toString();
			}
		}
	}

	public Elements siblingElements() {
		if (this.parentNode == null) {
			return new Elements(0);
		} else {
			List<Element> elements = this.parent().childElementsList();
			Elements siblings = new Elements(elements.size() - 1);
			Iterator var3 = elements.iterator();

			while(var3.hasNext()) {
				Element el = (Element)var3.next();
				if (el != this) {
					siblings.add(el);
				}
			}

			return siblings;
		}
	}

	public Element nextElementSibling() {
		if (this.parentNode == null) {
			return null;
		} else {
			List<Element> siblings = this.parent().childElementsList();
			Integer index = indexInList(this, siblings);
			Validate.notNull(index);
			return siblings.size() > index + 1 ? (Element)siblings.get(index + 1) : null;
		}
	}

	public Element previousElementSibling() {
		if (this.parentNode == null) {
			return null;
		} else {
			List<Element> siblings = this.parent().childElementsList();
			Integer index = indexInList(this, siblings);
			Validate.notNull(index);
			return index > 0 ? (Element)siblings.get(index - 1) : null;
		}
	}

	public Element firstElementSibling() {
		List<Element> siblings = this.parent().childElementsList();
		return siblings.size() > 1 ? (Element)siblings.get(0) : null;
	}

	public int elementSiblingIndex() {
		return this.parent() == null ? 0 : indexInList(this, this.parent().childElementsList());
	}

	public Element lastElementSibling() {
		List<Element> siblings = this.parent().childElementsList();
		return siblings.size() > 1 ? (Element)siblings.get(siblings.size() - 1) : null;
	}

	private static <E extends Element> int indexInList(Element search, List<E> elements) {
		for(int i = 0; i < elements.size(); ++i) {
			if (elements.get(i) == search) {
				return i;
			}
		}

		return 0;
	}

	public Elements getElementsByTag(String tagName) {
		Validate.notEmpty(tagName);
		tagName = Normalizer.normalize(tagName);
		return Collector.collect(new Evaluator.Tag(tagName), this);
	}

	public Element getElementById(String id) {
		Validate.notEmpty(id);
		Elements elements = Collector.collect(new Id(id), this);
		return elements.size() > 0 ? (Element)elements.get(0) : null;
	}

	public Elements getElementsByClass(String className) {
		Validate.notEmpty(className);
		return Collector.collect(new Class(className), this);
	}

	public Elements getElementsByAttribute(String key) {
		Validate.notEmpty(key);
		key = key.trim();
		return Collector.collect(new Attribute(key), this);
	}

	public Elements getElementsByAttributeStarting(String keyPrefix) {
		Validate.notEmpty(keyPrefix);
		keyPrefix = keyPrefix.trim();
		return Collector.collect(new AttributeStarting(keyPrefix), this);
	}

	public Elements getElementsByAttributeValue(String key, String value) {
		return Collector.collect(new AttributeWithValue(key, value), this);
	}

	public Elements getElementsByAttributeValueNot(String key, String value) {
		return Collector.collect(new AttributeWithValueNot(key, value), this);
	}

	public Elements getElementsByAttributeValueStarting(String key, String valuePrefix) {
		return Collector.collect(new AttributeWithValueStarting(key, valuePrefix), this);
	}

	public Elements getElementsByAttributeValueEnding(String key, String valueSuffix) {
		return Collector.collect(new AttributeWithValueEnding(key, valueSuffix), this);
	}

	public Elements getElementsByAttributeValueContaining(String key, String match) {
		return Collector.collect(new AttributeWithValueContaining(key, match), this);
	}

	public Elements getElementsByAttributeValueMatching(String key, Pattern pattern) {
		return Collector.collect(new AttributeWithValueMatching(key, pattern), this);
	}

	public Elements getElementsByAttributeValueMatching(String key, String regex) {
		Pattern pattern;
		try {
			pattern = Pattern.compile(regex);
		} catch (PatternSyntaxException var5) {
			throw new IllegalArgumentException("Pattern syntax error: " + regex, var5);
		}

		return this.getElementsByAttributeValueMatching(key, pattern);
	}

	public Elements getElementsByIndexLessThan(int index) {
		return Collector.collect(new IndexLessThan(index), this);
	}

	public Elements getElementsByIndexGreaterThan(int index) {
		return Collector.collect(new IndexGreaterThan(index), this);
	}

	public Elements getElementsByIndexEquals(int index) {
		return Collector.collect(new IndexEquals(index), this);
	}

	public Elements getElementsContainingText(String searchText) {
		return Collector.collect(new ContainsText(searchText), this);
	}

	public Elements getElementsContainingOwnText(String searchText) {
		return Collector.collect(new ContainsOwnText(searchText), this);
	}

	public Elements getElementsMatchingText(Pattern pattern) {
		return Collector.collect(new Matches(pattern), this);
	}

	public Elements getElementsMatchingText(String regex) {
		Pattern pattern;
		try {
			pattern = Pattern.compile(regex);
		} catch (PatternSyntaxException var4) {
			throw new IllegalArgumentException("Pattern syntax error: " + regex, var4);
		}

		return this.getElementsMatchingText(pattern);
	}

	public Elements getElementsMatchingOwnText(Pattern pattern) {
		return Collector.collect(new MatchesOwn(pattern), this);
	}

	public Elements getElementsMatchingOwnText(String regex) {
		Pattern pattern;
		try {
			pattern = Pattern.compile(regex);
		} catch (PatternSyntaxException var4) {
			throw new IllegalArgumentException("Pattern syntax error: " + regex, var4);
		}

		return this.getElementsMatchingOwnText(pattern);
	}

	public Elements getAllElements() {
		return Collector.collect(new AllElements(), this);
	}

	public String text() {
		final StringBuilder accum = new StringBuilder();
		NodeTraversor.traverse(new NodeVisitor() {
			public void head(Node node, int depth) {
				if (node instanceof TextNode) {
					TextNode textNode = (TextNode)node;
					Element.appendNormalisedText(accum, textNode);
				} else if (node instanceof Element) {
					Element element = (Element)node;
					if (accum.length() > 0 && (element.isBlock() || element.tag.getName().equals("br")) && !TextNode.lastCharIsWhitespace(accum)) {
						accum.append(' ');
					}
				}

			}

			public void tail(Node node, int depth) {
				if (node instanceof Element) {
					Element element = (Element)node;
					if (element.isBlock() && node.nextSibling() instanceof TextNode && !TextNode.lastCharIsWhitespace(accum)) {
						accum.append(' ');
					}
				}

			}
		}, this);
		return accum.toString().trim();
	}

	public String wholeText() {
		final StringBuilder accum = new StringBuilder();
		NodeTraversor.traverse(new NodeVisitor() {
			public void head(Node node, int depth) {
				if (node instanceof TextNode) {
					TextNode textNode = (TextNode)node;
					accum.append(textNode.getWholeText());
				}

			}

			public void tail(Node node, int depth) {
			}
		}, this);
		return accum.toString();
	}

	public String ownText() {
		StringBuilder sb = new StringBuilder();
		this.ownText(sb);
		return sb.toString().trim();
	}

	private void ownText(StringBuilder accum) {
		Iterator var2 = this.childNodes.iterator();

		while(var2.hasNext()) {
			Node child = (Node)var2.next();
			if (child instanceof TextNode) {
				TextNode textNode = (TextNode)child;
				appendNormalisedText(accum, textNode);
			} else if (child instanceof Element) {
				appendWhitespaceIfBr((Element)child, accum);
			}
		}

	}

	private static void appendNormalisedText(StringBuilder accum, TextNode textNode) {
		String text = textNode.getWholeText();
		if (!preserveWhitespace(textNode.parentNode) && !(textNode instanceof CDataNode)) {
			StringUtil.appendNormalisedWhitespace(accum, text, TextNode.lastCharIsWhitespace(accum));
		} else {
			accum.append(text);
		}

	}

	private static void appendWhitespaceIfBr(Element element, StringBuilder accum) {
		if (element.tag.getName().equals("br") && !TextNode.lastCharIsWhitespace(accum)) {
			accum.append(" ");
		}

	}

	static boolean preserveWhitespace(Node node) {
		if (node != null && node instanceof Element) {
			Element el = (Element)node;
			int i = 0;

			do {
				if (el.tag.preserveWhitespace()) {
					return true;
				}

				el = el.parent();
				++i;
			} while(i < 6 && el != null);
		}

		return false;
	}

	public Element text(String text) {
		Validate.notNull(text);
		this.empty();
		TextNode textNode = new TextNode(text);
		this.appendChild(textNode);
		return this;
	}

	public boolean hasText() {
		Iterator var1 = this.childNodes.iterator();

		while(var1.hasNext()) {
			Node child = (Node)var1.next();
			if (child instanceof TextNode) {
				TextNode textNode = (TextNode)child;
				if (!textNode.isBlank()) {
					return true;
				}
			} else if (child instanceof Element) {
				Element el = (Element)child;
				if (el.hasText()) {
					return true;
				}
			}
		}

		return false;
	}

	public String data() {
		StringBuilder sb = new StringBuilder();
		Iterator var2 = this.childNodes.iterator();

		while(var2.hasNext()) {
			Node childNode = (Node)var2.next();
			if (childNode instanceof DataNode) {
				DataNode data = (DataNode)childNode;
				sb.append(data.getWholeData());
			} else if (childNode instanceof Comment) {
				Comment comment = (Comment)childNode;
				sb.append(comment.getData());
			} else if (childNode instanceof Element) {
				Element element = (Element)childNode;
				String elementData = element.data();
				sb.append(elementData);
			} else if (childNode instanceof CDataNode) {
				CDataNode cDataNode = (CDataNode)childNode;
				sb.append(cDataNode.getWholeText());
			}
		}

		return sb.toString();
	}

	public String className() {
		return this.attr("class").trim();
	}

	public Set<String> classNames() {
		String[] names = classSplit.split(this.className());
		Set<String> classNames = new LinkedHashSet(Arrays.asList(names));
		classNames.remove("");
		return classNames;
	}

	public Element classNames(Set<String> classNames) {
		Validate.notNull(classNames);
		if (classNames.isEmpty()) {
			this.attributes().remove("class");
		} else {
			this.attributes().put("class", StringUtil.join(classNames, " "));
		}

		return this;
	}

	public boolean hasClass(String className) {
		String classAttr = this.attributes().getIgnoreCase("class");
		int len = classAttr.length();
		int wantLen = className.length();
		if (len != 0 && len >= wantLen) {
			if (len == wantLen) {
				return className.equalsIgnoreCase(classAttr);
			} else {
				boolean inClass = false;
				int start = 0;

				for(int i = 0; i < len; ++i) {
					if (Character.isWhitespace(classAttr.charAt(i))) {
						if (inClass) {
							if (i - start == wantLen && classAttr.regionMatches(true, start, className, 0, wantLen)) {
								return true;
							}

							inClass = false;
						}
					} else if (!inClass) {
						inClass = true;
						start = i;
					}
				}

				if (inClass && len - start == wantLen) {
					return classAttr.regionMatches(true, start, className, 0, wantLen);
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
	}

	public Element addClass(String className) {
		Validate.notNull(className);
		Set<String> classes = this.classNames();
		classes.add(className);
		this.classNames(classes);
		return this;
	}

	public Element removeClass(String className) {
		Validate.notNull(className);
		Set<String> classes = this.classNames();
		classes.remove(className);
		this.classNames(classes);
		return this;
	}

	public Element toggleClass(String className) {
		Validate.notNull(className);
		Set<String> classes = this.classNames();
		if (classes.contains(className)) {
			classes.remove(className);
		} else {
			classes.add(className);
		}

		this.classNames(classes);
		return this;
	}

	public String val() {
		return this.tagName().equals("textarea") ? this.text() : this.attr("value");
	}

	public Element val(String value) {
		if (this.tagName().equals("textarea")) {
			this.text(value);
		} else {
			this.attr("value", value);
		}

		return this;
	}

	void outerHtmlHead(Appendable accum, int depth, OutputSettings out) throws IOException {
		if (out.prettyPrint() && (this.tag.formatAsBlock() || this.parent() != null && this.parent().tag().formatAsBlock() || out.outline())) {
			if (accum instanceof StringBuilder) {
				if (((StringBuilder)accum).length() > 0) {
					this.indent(accum, depth, out);
				}
			} else {
				this.indent(accum, depth, out);
			}
		}

		accum.append('<').append(this.tagName());
		if (this.attributes != null) {
			this.attributes.html(accum, out);
		}

		if (this.childNodes.isEmpty() && this.tag.isSelfClosing()) {
			if (out.syntax() == Syntax.html && this.tag.isEmpty()) {
				accum.append('>');
			} else {
				accum.append(" />");
			}
		} else {
			accum.append('>');
		}

	}

	void outerHtmlTail(Appendable accum, int depth, OutputSettings out) throws IOException {
		if (!this.childNodes.isEmpty() || !this.tag.isSelfClosing()) {
			if (out.prettyPrint() && !this.childNodes.isEmpty() && (this.tag.formatAsBlock() || out.outline() && (this.childNodes.size() > 1 || this.childNodes.size() == 1 && !(this.childNodes.get(0) instanceof TextNode)))) {
				this.indent(accum, depth, out);
			}

			accum.append("</").append(this.tagName()).append('>');
		}

	}

	public String html() {
		StringBuilder accum = StringUtil.stringBuilder();
		this.html(accum);
		return this.getOutputSettings().prettyPrint() ? accum.toString().trim() : accum.toString();
	}
	public String htmlNoPretty() {
		StringBuilder accum = StringUtil.stringBuilder();
		this.html(accum);
		return accum.toString();
	}

	private void html(StringBuilder accum) {
		Iterator var2 = this.childNodes.iterator();

		while(var2.hasNext()) {
			Node node = (Node)var2.next();
			node.outerHtml(accum);
		}

	}

	public <T extends Appendable> T html(T appendable) {
		Iterator var2 = this.childNodes.iterator();

		while(var2.hasNext()) {
			Node node = (Node)var2.next();
			node.outerHtml(appendable);
		}

		return appendable;
	}

	public Element html(String html) {
		this.empty();
		this.append(html);
		return this;
	}

	public String toString() {
		return this.outerHtml();
	}

	public Element clone() {
		return (Element)super.clone();
	}

	public Element shallowClone() {
		return new Element(this.tag, this.baseUri, this.attributes);
	}

	protected Element doClone(Node parent) {
		Element clone = (Element)super.doClone(parent);
		clone.attributes = this.attributes != null ? this.attributes.clone() : null;
		clone.baseUri = this.baseUri;
		clone.childNodes = new Element.NodeList(clone, this.childNodes.size());
		clone.childNodes.addAll(this.childNodes);
		return clone;
	}

	private static final class NodeList extends ChangeNotifyingArrayList<Node> {
		private final Element owner;

		NodeList(Element owner, int initialCapacity) {
			super(initialCapacity);
			this.owner = owner;
		}

		public void onContentsChanged() {
			this.owner.nodelistChanged();
		}
	}
}
