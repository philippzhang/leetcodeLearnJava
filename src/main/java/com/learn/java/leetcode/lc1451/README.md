# [1451. Rearrange Words in a Sentence][enTitle]

**Medium**

Given a sentence  *text*  (A  *sentence*  is a string of space-separated words) in the following format:

- First letter is in upper case. 
- Each word in  *text*  are separated by a single space.

Your task is to rearrange the words in text such that all words are rearranged in an increasing order of their lengths. If two words have the same length, arrange them in their original order.

Return the new text following the format shown above.



**Example 1:** 

```
Input: text = "Leetcode is cool"
Output: "Is cool leetcode"
Explanation:There are 3 words, "Leetcode" of length 8, "is" of length 2 and "cool" of length 4.
Output is ordered by length and the new first word starts with capital letter.

```

**Example 2:** 

```
Input: text = "Keep calm and code on"
Output: "On and keep calm code"
Explanation:Output is ordered as follows:
"On" 2 letters.
"and" 3 letters.
"keep" 4 letters in case of tie order by position in original text.
"calm" 4 letters.
"code" 4 letters.

```

**Example 3:** 

```
Input: text = "To be or not to be"
Output: "To be or to be not"

```



**Constraints:** 

-  *text*  begins with a capital letter and then contains lowercase letters and single space between words. 
-  *1 <= text.length <= 10^5* 


# [1451. 重新排列句子中的单词][cnTitle]

**中等**

「句子」是一个用空格分隔单词的字符串。给你一个满足下述格式的句子  *text*  :

- 句子的首字母大写 
-  *text*  中的每个单词都用单个空格分隔。

请你重新排列  *text*  中的单词，使所有单词按其长度的升序排列。如果两个单词的长度相同，则保留其在原句子中的相对顺序。

请同样按上述格式返回新的句子。



**示例 1：** 

```
输入：text = "Leetcode is cool"
输出："Is cool leetcode"
解释：句子中共有 3 个单词，长度为 8 的 "Leetcode" ，长度为 2 的 "is" 以及长度为 4 的 "cool" 。
输出需要按单词的长度升序排列，新句子中的第一个单词首字母需要大写。

```

**示例 2：** 

```
输入：text = "Keep calm and code on"
输出："On and keep calm code"
解释：输出的排序情况如下：
"On" 2 个字母。
"and" 3 个字母。
"keep" 4 个字母，因为存在长度相同的其他单词，所以它们之间需要保留在原句子中的相对顺序。
"calm" 4 个字母。
"code" 4 个字母。

```

**示例 3：** 

```
输入：text = "To be or not to be"
输出："To be or to be not"

```



**提示：** 

-  *text*  以大写字母开头，然后包含若干小写字母以及单词间的单个空格。 
-  *1 <= text.length <= 10^5* 




# 算法思路

# 测试用例
```
1451. Rearrange Words in a Sentence 1451. 重新排列句子中的单词 Medium
```

[enTitle]: https://leetcode.com/problems/rearrange-words-in-a-sentence/
[cnTitle]: https://leetcode-cn.com/problems/rearrange-words-in-a-sentence/
