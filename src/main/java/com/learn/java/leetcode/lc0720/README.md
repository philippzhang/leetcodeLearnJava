# [720. Longest Word in Dictionary][enTitle]

**Easy**

Given a list of strings  *words*  representing an English Dictionary, find the longest word in  *words*  that can be built one character at a time by other words in  *words* . If there is more than one possible answer, return the longest word with the smallest lexicographical order.

Example 1:

```
Input: 
words = ["w","wo","wor","worl", "world"]
Output: "world"
Explanation: 
The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".

```



Example 2:

```
Input: 
words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
Output: "apple"
Explanation: 
Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply".

```



Note:







# [720. 词典中最长的单词][cnTitle]

**简单**

给出一个字符串数组 *words* 组成的一本英语词典。从中找出最长的一个单词，该单词是由 *words* 词典中其他单词逐步添加一个字母组成。若其中有多个可行的答案，则返回答案中字典序最小的单词。

若无答案，则返回空字符串。



**示例 1：** 

```
输入：
words = ["w","wo","wor","worl", "world"]
输出："world"
解释： 
单词"world"可由"w", "wo", "wor", 和 "worl"添加一个字母组成。

```

**示例 2：** 

```
输入：
words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
输出："apple"
解释：
"apply"和"apple"都能由词典中的单词组成。但是"apple"的字典序小于"apply"。

```



**提示：** 

- 所有输入的字符串都只包含小写字母。 
-  *words* 数组长度范围为 *[1,1000]* 。 
-  *words[i]* 的长度范围为 *[1,30]* 。




# 算法思路

# 测试用例
```
720. Longest Word in Dictionary 720. 词典中最长的单词 Easy
```

[enTitle]: https://leetcode.com/problems/longest-word-in-dictionary/
[cnTitle]: https://leetcode-cn.com/problems/longest-word-in-dictionary/
