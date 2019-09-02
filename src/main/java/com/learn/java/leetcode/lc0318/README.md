# [318. Maximum Product of Word Lengths][enTitle]

**Medium**

Given a string array  *words* , find the maximum value of  *length(word[i]) * length(word[j])*  where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.

Example 1:

```
Input: ["abcw","baz","foo","bar","xtfn","abcdef"]
Output:16 
Explanation:The two words can be "abcw", "xtfn".
```

Example 2:

```
Input: ["a","ab","abc","d","cd","bcd","abcd"]
Output:4 
Explanation:The two words can be "ab", "cd".
```

Example 3:

```
Input: ["a","aa","aaa","aaaa"]
Output:0 
Explanation:No such pair of words.

```


# [318. 最大单词长度乘积][cnTitle]

**中等**

给定一个字符串数组  *words* ，找到  *length(word[i]) * length(word[j])*  的最大值，并且这两个单词不含有公共字母。你可以认为每个单词只包含小写字母。如果不存在这样的两个单词，返回 0。

**示例 1:** 

```
输入: ["abcw","baz","foo","bar","xtfn","abcdef"]
输出:16 
解释: 这两个单词为"abcw", "xtfn"。
```

**示例 2:** 

```
输入: ["a","ab","abc","d","cd","bcd","abcd"]
输出:4 
解释:这两个单词为 "ab", "cd"。
```

**示例 3:** 

```
输入: ["a","aa","aaa","aaaa"]
输出:0 
解释: 不存在这样的两个单词。
```




# 算法思路

# 测试用例
```
318. Maximum Product of Word Lengths 318. 最大单词长度乘积 Medium
Solution.maxProduct
---
["abcw","baz","foo","bar","xtfn","abcdef"]

=16
---
["a","ab","abc","d","cd","bcd","abcd"]

=4
---
["a","aa","aaa","aaaa"]

=0
```

[enTitle]: https://leetcode.com/problems/maximum-product-of-word-lengths/
[cnTitle]: https://leetcode-cn.com/problems/maximum-product-of-word-lengths/
