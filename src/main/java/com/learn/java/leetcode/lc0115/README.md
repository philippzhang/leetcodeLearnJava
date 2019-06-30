# [115. Distinct Subsequences][enTitle]

**Hard**

Given a string **S**  and a string **T** , count the number of distinct subsequences of **S**  which equals **T** .

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie,  *"ACE"*  is a subsequence of  *"ABCDE"*  while  *"AEC"*  is not).

**Example 1:** 

```
Input:S = "rabbbit", T = "rabbit"
Output: 3Explanation:
As shown below, there are 3 ways you can generate "rabbit" from S.
(The caret symbol ^ means the chosen letters)

rabbbit
^^^^ ^^
rabbbit
^^ ^^^^
rabbbit
^^^ ^^^

```

**Example 2:** 

```
Input:S = "babgbag", T = "bag"
Output: 5Explanation:
As shown below, there are 5 ways you can generate "bag" from S.
(The caret symbol ^ means the chosen letters)

babgbag
^^ ^
babgbag
^^    ^
babgbag
^    ^^
babgbag
  ^  ^^
babgbag
    ^^^

```


# [115. 不同的子序列][cnTitle]

**困难**

给定一个字符串 **S** 和一个字符串 **T** ，计算在 **S**  的子序列中 **T**  出现的个数。

一个字符串的一个子序列是指，通过删除一些（也可以不删除）字符且不干扰剩余字符相对位置所组成的新字符串。（例如， *"ACE"*  是  *"ABCDE"*  的一个子序列，而  *"AEC"*  不是）

**示例 1:** 

```
输入:S = "rabbbit", T = "rabbit"
输出: 3解释:
如下图所示, 有 3 种可以从 S 中得到 "rabbit" 的方案。
(上箭头符号 ^ 表示选取的字母)

rabbbit
^^^^ ^^
rabbbit
^^ ^^^^
rabbbit
^^^ ^^^

```

**示例 2:** 

```
输入:S = "babgbag", T = "bag"
输出: 5解释:
如下图所示, 有 5 种可以从 S 中得到 "bag" 的方案。 
(上箭头符号 ^ 表示选取的字母)

babgbag
^^ ^
babgbag
^^    ^
babgbag
^    ^^
babgbag
  ^  ^^
babgbag
    ^^^
```




# 算法思路

# 测试用例
```
115. Distinct Subsequences 115. 不同的子序列 Hard
```

[enTitle]: https://leetcode.com/problems/distinct-subsequences/
[cnTitle]: https://leetcode-cn.com/problems/distinct-subsequences/
