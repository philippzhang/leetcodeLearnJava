# [127. Word Ladder][enTitle]

**Medium**

Given two words ( *beginWord*  and  *endWord* ), and a dictionary's word list, find the length of shortest transformation sequence from  *beginWord*  to  *endWord* , such that:

1. Only one letter can be changed at a time. 
2. Each transformed word must exist in the word list. Note that  *beginWord*  is  *not*  a transformed word.

**Note:** 

- Return 0 if there is no such transformation sequence. 
- All words have the same length. 
- All words contain only lowercase alphabetic characters. 
- You may assume no duplicates in the word list. 
- You may assume  *beginWord*  and  *endWord*  are non-empty and are not the same.

**Example 1:** 

```
Input:
beginWord = "hit",
endWord = "cog",
wordList = ["hot","dot","dog","lot","log","cog"]

Output:5

Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
return its length 5.

```

**Example 2:** 

```
Input:
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log"]

Output: 0

Explanation: The endWord "cog" is not in wordList, therefore no possibletransformation.

```


# [127. 单词接龙][cnTitle]

**中等**

给定两个单词（ *beginWord* 和  *endWord* ）和一个字典，找到从  *beginWord*  到  *endWord*  的最短转换序列的长度。转换需遵循如下规则：

1. 每次转换只能改变一个字母。 
2. 转换过程中的中间单词必须是字典中的单词。

**说明:** 

- 如果不存在这样的转换序列，返回 0。 
- 所有单词具有相同的长度。 
- 所有单词只由小写字母组成。 
- 字典中不存在重复的单词。 
- 你可以假设  *beginWord*  和  *endWord* 是非空的，且二者不相同。

**示例 1:** 

```
输入:
beginWord = "hit",
endWord = "cog",
wordList = ["hot","dot","dog","lot","log","cog"]

输出:5

解释:一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog",
     返回它的长度 5。

```

**示例 2:** 

```
输入:
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log"]

输出: 0

解释: endWord "cog" 不在字典中，所以无法进行转换。
```


# 算法思路

# 测试用例
```
127. Word Ladder 127. 单词接龙 Medium
Solution.ladderLength
---
"hit"
"cog"
["hot","dot","dog","lot","log","cog"]

=5
---
"hit"
"cog"
["hot","dot","dog","lot","log"]

=0
```

[enTitle]: https://leetcode.com/problems/word-ladder/
[cnTitle]: https://leetcode-cn.com/problems/word-ladder/
