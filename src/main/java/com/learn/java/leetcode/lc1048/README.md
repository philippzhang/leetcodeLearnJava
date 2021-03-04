# [1048. Longest String Chain][enTitle]

**Medium**

Given a list of words, each word consists of English lowercase letters.

Let's say  *word1*  is a predecessor of  *word2*  if and only if we can add exactly one letter anywhere in  *word1*  to make it equal to  *word2* . For example,  *"abc"*  is a predecessor of  *"abac"* .

A  *word chain* is a sequence of words  *[word_1, word_2, ..., word_k]*  with  *k >= 1* , where  *word_1*  is a predecessor of  *word_2* ,  *word_2*  is a predecessor of  *word_3* , and so on.

Return the longest possible length of a word chain with words chosen from the given list of  *words* .



**Example 1:** 

```
Input: words = ["a","b","ba","bca","bda","bdca"]
Output: 4
Explanation: One of the longest word chain is "a","ba","bda","bdca".

```

**Example 2:** 

```
Input: words = ["xbc","pcxbcf","xb","cxbc","pcxbc"]
Output: 5

```



**Constraints:** 

-  *1 <= words.length <= 1000*  
-  *1 <= words[i].length <= 16*  
-  *words[i]*  only consists of English lowercase letters.


# [1048. 最长字符串链][cnTitle]

**中等**

给出一个单词列表，其中每个单词都由小写英文字母组成。

如果我们可以在  *word1*  的任何地方添加一个字母使其变成  *word2* ，那么我们认为  *word1*  是  *word2*  的前身。例如， *"abc"*  是  *"abac"*  的前身。

**词链** 是单词  *[word_1, word_2, ..., word_k]*  组成的序列， *k >= 1* ，其中  *word_1*  是  *word_2*  的前身， *word_2*  是  *word_3*  的前身，依此类推。

从给定单词列表  *words*  中选择单词组成词链，返回词链的最长可能长度。

**示例：** 

```
输入：["a","b","ba","bca","bda","bdca"]
输出：4
解释：最长单词链之一为 "a","ba","bda","bdca"。

```



**提示：** 

1.  *1 <= words.length <= 1000*  
2.  *1 <= words[i].length <= 16*  
3.  *words[i]*  仅由小写英文字母组成。






# 算法思路

# 测试用例
```
1048. Longest String Chain 1048. 最长字符串链 Medium
```

[enTitle]: https://leetcode.com/problems/longest-string-chain/
[cnTitle]: https://leetcode-cn.com/problems/longest-string-chain/
