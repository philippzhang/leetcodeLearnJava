# [394. Decode String][enTitle]

**Medium**

Given an encoded string, return its decoded string.

The encoding rule is:  *k[encoded_string]* , where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like  *3a*  or  *2[4]* .

Examples:

```
s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".

```




# [394. 字符串解码][cnTitle]

**中等**

给定一个经过编码的字符串，返回它解码后的字符串。

编码规则为:  *k[encoded_string]* ，表示其中方括号内部的  *encoded_string*  正好重复  *k*  次。注意  *k*  保证为正整数。

你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。

此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数  *k*  ，例如不会出现像  *3a*  或  *2[4]*  的输入。

**示例:** 

```
s = "3[a]2[bc]", 返回 "aaabcbc".
s = "3[a2[c]]", 返回 "accaccacc".
s = "2[abc]3[cd]ef", 返回 "abcabccdcdcdef".

```




# 算法思路

# 测试用例
```
394. Decode String 394. 字符串解码 Medium
Solution.decodeString
---
"3[a]2[bc]"

="aaabcbc"
---
"3[a2[c]]"

="accaccacc"
---
"2[abc]3[cd]ef"

="abcabccdcdcdef"
---
"3[a]2[b4[F]c]"

="aaabFFFFcbFFFFc"
```

[enTitle]: https://leetcode.com/problems/decode-string/
[cnTitle]: https://leetcode-cn.com/problems/decode-string/
