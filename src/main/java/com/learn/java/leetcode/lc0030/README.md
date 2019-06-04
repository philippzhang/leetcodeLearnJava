# [30. Substring with Concatenation of All Words][enTitle]

**Hard**

You are given a string, **s** , and a list of words, **words** , that are all of the same length. Find all starting indices of substring(s) in **s**  that is a concatenation of each word in **words**  exactly once and without any intervening characters.

**Example 1:** 

```
Input:
  s = "barfoothefoobarman",
words =["foo","bar"]
Output: [0,9]
Explanation: Substrings starting at index 0 and 9 are "barfoor" and "foobar" respectively.
The output order does not matter, returning [9,0] is fine too.

```

**Example 2:** 

```
Input:
  s = "wordgoodgoodgoodbestword",
words =["word","good","best","word"]
Output: []

```
# [30. 串联所有单词的子串][cnTitle]

**困难**

给定一个字符串 **s** 和一些长度相同的单词 **words。** 找出 **s** 中恰好可以由 **words** 中所有单词串联形成的子串的起始位置。

注意子串要与 **words** 中的单词完全匹配，中间不能有其他字符，但不需要考虑 **words** 中单词串联的顺序。



**示例 1：** 

```
输入：
  s = "barfoothefoobarman",
words =["foo","bar"]
输出：[0,9]
解释：
从索引 0 和 9 开始的子串分别是 "barfoor" 和 "foobar" 。
输出的顺序不重要, [9,0] 也是有效答案。

```

**示例 2：** 

```
输入：
  s = "wordgoodgoodgoodbestword",
words =["word","good","best","word"]
输出：[]

```


# 算法思路

# 测试用例
```
30. Substring with Concatenation of All Words 30. 串联所有单词的子串 Hard
Solution.findSubstring
---
"barfoothefoobarman",
["foo","bar"]

=[0,9]
---
"wordgoodgoodgoodbestword",
["word","good","best","word"]

=[]
```

[enTitle]: https://leetcode.com/problems/substring-with-concatenation-of-all-words/
[cnTitle]: https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words/
