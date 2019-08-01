# [212. Word Search II][enTitle]

**Hard**

Given a 2D board and a list of words from the dictionary, find all words in the board.

Each word must be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.



**Example:** 

```
Input: 
board= [
  ['o','a','a','n'],
  ['e','t','a','e'],
  ['i','h','k','r'], ['i','f','l','v'] ] words = ["oath","pea","eat","rain"] Output: ["eat","oath"]
```



Note:

1. All inputs are consist of lowercase letters  *a-z* . 
2. The values of  *words*  are distinct.


# [212. 单词搜索 II][cnTitle]

**困难**

给定一个二维网格 **board** 和一个字典中的单词列表 **words** ，找出所有同时在二维网格和字典中出现的单词。

单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母在一个单词中不允许被重复使用。

**示例:** 

```
输入: 
words = ["oath","pea","eat","rain"] and board=
[
  ['o','a','a','n'],
  ['e','t','a','e'],
  ['i','h','k','r'],
  ['i','f','l','v']
]

输出:["eat","oath"]
```

**说明:**  你可以假设所有输入都由小写字母  *a-z*  组成。

**提示:** 

- 你需要优化回溯算法以通过更大数据量的测试。你能否早点停止回溯？ 
- 如果当前单词不存在于所有单词的前缀中，则可以立即停止回溯。什么样的数据结构可以有效地执行这样的操作？散列表是否可行？为什么？ 前缀树如何？如果你想学习如何实现一个基本的前缀树，请先查看这个问题： 实现Trie（前缀树）。




# 算法思路

# 测试用例
```
212. Word Search II 212. 单词搜索 II Hard
Solution.findWords
---
[["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]]
["oath","pea","eat","rain"]

=["eat","oath"]

$disorder
```

[enTitle]: https://leetcode.com/problems/word-search-ii/
[cnTitle]: https://leetcode-cn.com/problems/word-search-ii/
