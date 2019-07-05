# [591. Tag Validator][enTitle]

**Hard**

Given a string representing a code snippet, you need to implement a tag validator to parse the code and return whether it is valid. A code snippet is valid if all the following rules hold:



1. The code must be wrapped in a valid closed tag. Otherwise, the code is invalid. 
2. A closed tag (not necessarily valid) has exactly the following format :  *<TAG_NAME>TAG_CONTENT</TAG_NAME>* . Among them,  *<TAG_NAME>*  is the start tag, and  *</TAG_NAME>*  is the end tag. The TAG_NAME in start and end tags should be the same. A closed tag is valid if and only if the TAG_NAME and TAG_CONTENT are valid. 
3. A valid  *TAG_NAME*  only contain upper-case letters, and has length in range [1,9]. Otherwise, the  *TAG_NAME*  is invalid. 
4. A valid  *TAG_CONTENT*  may contain other valid closed tags, cdata and any characters (see note1) EXCEPT unmatched  *<* , unmatched start and end tag, and unmatched or closed tags with invalid TAG_NAME. Otherwise, the  *TAG_CONTENT*  is invalid. 
5. A start tag is unmatched if no end tag exists with the same TAG_NAME, and vice versa. However, you also need to consider the issue of unbalanced when tags are nested. 
6. A  *<*  is unmatched if you cannot find a subsequent  *>* . And when you find a  *<*  or  *</* , all the subsequent characters until the next  *>*  should be parsed as TAG_NAME (not necessarily valid). 
7. The cdata has the following format :  *<![CDATA[CDATA_CONTENT]]>* . The range of  *CDATA_CONTENT*  is defined as the characters between  *<![CDATA[*  and the first subsequent  *]]>* .  
8.  *CDATA_CONTENT*  may contain any characters. The function of cdata is to forbid the validator to parse  *CDATA_CONTENT* , so even it has some characters that can be parsed as tag (no matter valid or invalid), you should treat it as regular characters. 

Valid Code Examples:

```
Input: "<DIV>This is the first line <![CDATA[<div>]]></DIV>"
Output: True
Explanation: 
The code is wrapped in a closed tag : <DIV> and </DIV>. 
The TAG_NAME is valid, the TAG_CONTENT consists of some characters and cdata. 
Although CDATA_CONTENT has unmatched start tag with invalid TAG_NAME, it should be considered as plain text, not parsed as tag.
So TAG_CONTENT is valid, and then the code is valid. Thus return true.

Input: "<DIV>>>  ![cdata[]] <![CDATA[<div>]>]]>]]>>]</DIV>"
Output: True
Explanation:
We first separate the code into : start_tag|tag_content|end_tag.
start_tag -> "<DIV>"
end_tag -> "</DIV>"
tag_content could also be separated into : text1|cdata|text2.
text1 -> ">>  ![cdata[]] "
cdata -> "<![CDATA[<div>]>]]>", where the CDATA_CONTENT is "<div>]>"
text2 -> "]]>>]"

The reason why start_tag is NOT "<DIV>>>" is because of the rule 6.
The reason why cdata is NOT "<![CDATA[<div>]>]]>]]>" is because of the rule 7.

```



Invalid Code Examples:

```
Input: "<A>  <B> </A>   </B>"
Output: False
Explanation: Unbalanced. If "<A>" is closed, then "<B>" must be unmatched, and vice versa.

Input: "<DIV>  div tag is not closed  <DIV>"
Output: False

Input: "<DIV>  unmatched <  </DIV>"
Output: False

Input: "<DIV> closed tags with invalid tag name  <b>123</b> </DIV>"
Output: False

Input: "<DIV> unmatched tags with invalid tag name  </1234567890> and <CDATA[[]]>  </DIV>"
Output: False

Input: "<DIV>  unmatched start tag <B>  and unmatched end tag </C>  </DIV>"
Output: False

```



Note:

1. For simplicity, you could assume the input code (including the any characters mentioned above) only contain  *letters* ,  *digits* ,  *'<'* , *'>'* , *'/'* , *'!'* , *'['* , *']'*  and  *' '* .




# [591. 标签验证器][cnTitle]

**困难**

给定一个表示代码片段的字符串，你需要实现一个验证器来解析这段代码，并返回它是否合法。合法的代码片段需要遵守以下的所有规则：

1. 代码必须被**合法的闭合标签** 包围。否则，代码是无效的。 
2. **闭合标签** （不一定合法）要严格符合格式： *<TAG_NAME>TAG_CONTENT</TAG_NAME>* 。其中， *<TAG_NAME>* 是起始标签， *</TAG_NAME>* 是结束标签。起始和结束标签中的 TAG_NAME 应当相同。当且仅当 TAG_NAME 和 TAG_CONTENT 都是合法的，闭合标签才是**合法的** 。 
3. **合法的**   *TAG_NAME*  仅含有**大写字母** ，长度在范围 [1,9] 之间。否则，该  *TAG_NAME*  是**不合法的** 。 
4. **合法的**   *TAG_CONTENT*  可以包含其他**合法的闭合标签** ，**cdata**  （请参考规则7）和任意字符（注意参考规则1）**除了** 不匹配的 *<* 、不匹配的起始和结束标签、不匹配的或带有不合法 TAG_NAME 的闭合标签。否则， *TAG_CONTENT*  是**不合法的** 。 
5. 一个起始标签，如果没有具有相同 TAG_NAME 的结束标签与之匹配，是不合法的。反之亦然。不过，你也需要考虑标签嵌套的问题。 
6. 一个 *<* ，如果你找不到一个后续的 *>* 与之匹配，是不合法的。并且当你找到一个 *<* 或 *</* 时，所有直到下一个 *>* 的前的字符，都应当被解析为 TAG_NAME（不一定合法）。 
7. cdata 有如下格式： *<![CDATA[CDATA_CONTENT]]>* 。 *CDATA_CONTENT*  的范围被定义成  *<![CDATA[*  和**后续的第一个**   *]]>* 之间的字符。 
8.  *CDATA_CONTENT*  可以包含**任意字符** 。cdata 的功能是阻止验证器解析 *CDATA_CONTENT* ，所以即使其中有一些字符可以被解析为标签（无论合法还是不合法），也应该将它们视为**常规字符** 。

**合法代码的例子:** 

```
输入: "<DIV>This is the first line <![CDATA[<div>]]></DIV>"

输出: True

解释: 

代码被包含在了闭合的标签内： <DIV> 和 </DIV> 。

TAG_NAME 是合法的，TAG_CONTENT 包含了一些字符和 cdata 。 

即使 CDATA_CONTENT 含有不匹配的起始标签和不合法的 TAG_NAME，它应该被视为普通的文本，而不是标签。

所以 TAG_CONTENT 是合法的，因此代码是合法的。最终返回True。


输入: "<DIV>>>  ![cdata[]] <![CDATA[<div>]>]]>]]>>]</DIV>"

输出: True

解释:

我们首先将代码分割为： start_tag|tag_content|end_tag 。

start_tag -> "<DIV>"

end_tag -> "</DIV>"

tag_content 也可被分割为： text1|cdata|text2 。

text1 -> ">>  ![cdata[]] "

cdata -> "<![CDATA[<div>]>]]>" ，其中 CDATA_CONTENT 为 "<div>]>"

text2 -> "]]>>]"


start_tag 不是 "<DIV>>>" 的原因参照规则 6 。
cdata 不是 "<![CDATA[<div>]>]]>]]>" 的原因参照规则 7 。

```

**不合法代码的例子:** 

```
输入: "<A>  <B> </A>   </B>"
输出: False
解释: 不合法。如果 "<A>" 是闭合的，那么 "<B>" 一定是不匹配的，反之亦然。

输入: "<DIV>  div tag is not closed  <DIV>"
输出: False

输入: "<DIV>  unmatched <  </DIV>"
输出: False

输入: "<DIV> closed tags with invalid tag name  <b>123</b> </DIV>"
输出: False

输入: "<DIV> unmatched tags with invalid tag name  </1234567890> and <CDATA[[]]>  </DIV>"
输出: False

输入: "<DIV>  unmatched start tag <B>  and unmatched end tag </C>  </DIV>"
输出: False

```

**注意:** 

1. 为简明起见，你可以假设输入的代码（包括提到的**任意字符** ）只包含 *数字* , 字母,  *'<'* , *'>'* , *'/'* , *'!'* , *'['* , *']'* 和 *' '* 。




# 算法思路

# 测试用例
```
591. Tag Validator 591. 标签验证器 Hard
Solution.isValid
---
"<DIV>This is the first line <![CDATA[<div>]]></DIV>"

=true
---
"<DIV>>>  ![cdata[]] <![CDATA[<div>]>]]>]]>>]</DIV>"

=true
---
"<A>  <B> </A>   </B>"

=false
---
"<DIV>  div tag is not closed  <DIV>"

=false
---
"<DIV>  unmatched <  </DIV>"

=false
---
"<DIV> closed tags with invalid tag name  <b>123</b> </DIV>"

=false
---
<DIV> unmatched tags with invalid tag name  </1234567890> 

=false
---
"<DIV>  unmatched start tag <B>  and unmatched end tag </C>  </DIV>"

=false
---
"<A><![CDATA[</A>]]123></A>"

=false
---
"<A><!A></A>"

=false
---
"<![CDATA[wahaha]]]><![CDATA[]> wahaha]]>"

=false
---
"<DIV> closed tags with invalid</div>"

=false
```

[enTitle]: https://leetcode.com/problems/tag-validator/
[cnTitle]: https://leetcode-cn.com/problems/tag-validator/
