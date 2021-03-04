# [1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence][enTitle]

**Easy**

Given a  *sentence*  that consists of some words separated by a **single space** , and a  *searchWord* .

You have to check if  *searchWord*  is a prefix of any word in  *sentence* .

Return  *the index of the word*  in  *sentence*  where  *searchWord*  is a prefix of this word (**1-indexed** ).

If  *searchWord*  is a prefix of more than one word, return the index of the first word **(minimum index)** . If there is no such word return **-1** .

A **prefix**  of a string  *S*  is any leading contiguous substring of  *S* .



**Example 1:** 

```
Input: sentence = "i love eating burger", searchWord = "burg"
Output: 4
Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.

```

**Example 2:** 

```
Input: sentence = "this problem is an easy problem", searchWord = "pro"
Output: 2
Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.

```

**Example 3:** 

```
Input: sentence = "i am tired", searchWord = "you"
Output: -1
Explanation: "you" is not a prefix of any word in the sentence.

```

**Example 4:** 

```
Input: sentence = "i use triple pillow", searchWord = "pill"
Output: 4

```

**Example 5:** 

```
Input: sentence = "hello from the other side", searchWord = "they"
Output: -1

```



**Constraints:** 

-  *1 <= sentence.length <= 100*  
-  *1 <= searchWord.length <= 10*  
-  *sentence*  consists of lowercase English letters and spaces. 
-  *searchWord*  consists of lowercase English letters.


# [1455. 检查单词是否为句中其他单词的前缀][cnTitle]

**简单**

给你一个字符串  *sentence*  作为句子并指定检索词为  *searchWord*  ，其中句子由若干用 **单个空格**  分隔的单词组成。

请你检查检索词  *searchWord*  是否为句子  *sentence*  中任意单词的前缀。

- 如果  *searchWord*  是某一个单词的前缀，则返回句子  *sentence*  中该单词所对应的下标（**下标从 1 开始** ）。 
- 如果  *searchWord*  是多个单词的前缀，则返回匹配的第一个单词的下标（**最小下标** ）。 
- 如果  *searchWord*  不是任何单词的前缀，则返回 **-1** 。

字符串  *S*  的 「前缀」是  *S*  的任何前导连续子字符串。



**示例 1：** 

```
输入：sentence = "i love eating burger", searchWord = "burg"
输出：4
解释："burg" 是 "burger" 的前缀，而 "burger" 是句子中第 4 个单词。
```

**示例 2：** 

```
输入：sentence = "this problem is an easy problem", searchWord = "pro"
输出：2
解释："pro" 是 "problem" 的前缀，而 "problem" 是句子中第 2 个也是第 6 个单词，但是应该返回最小下标 2 。

```

**示例 3：** 

```
输入：sentence = "i am tired", searchWord = "you"
输出：-1
解释："you" 不是句子中任何单词的前缀。

```

**示例 4：** 

```
输入：sentence = "i use triple pillow", searchWord = "pill"
输出：4

```

**示例 5：** 

```
输入：sentence = "hello from the other side", searchWord = "they"
输出：-1

```



**提示：** 

-  *1 <= sentence.length <= 100*  
-  *1 <= searchWord.length <= 10*  
-  *sentence*  由小写英文字母和空格组成。 
-  *searchWord*  由小写英文字母组成。 
- 前缀就是紧密附着于词根的语素，中间不能插入其它成分，并且它的位置是固定的——-位于词根之前。（引用自 前缀_百度百科 ）




# 算法思路

# 测试用例
```
1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence 1455. 检查单词是否为句中其他单词的前缀 Easy
```

[enTitle]: https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
[cnTitle]: https://leetcode-cn.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
