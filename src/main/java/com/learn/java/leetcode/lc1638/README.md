# [1638. Count Substrings That Differ by One Character][enTitle]

**Medium**

Given two strings  *s*  and  *t* , find the number of ways you can choose a non-empty substring of  *s*  and replace a **single character**  by a different character such that the resulting substring is a substring of  *t* . In other words, find the number of substrings in  *s*  that differ from some substring in  *t*  by **exactly**  one character.

For example, the underlined substrings in  *"computer"*  and  *"computation"*  only differ by the  *'e'* / *'a'* , so this is a valid way.

Return  *the number of substrings that satisfy the condition above.* 

A **substring**  is a contiguous sequence of characters within a string.



**Example 1:** 

```
Input: s = "aba", t = "baba"
Output: 6
Explanation:The following are the pairs of substrings from s and t that differ by exactly 1 character:
("aba", "baba")
("aba", "baba")
("aba", "baba")
("aba", "baba")
("aba", "baba")
("aba", "baba")
The underlined portions are the substrings that are chosen from s and t.

```


```
Input: s = "ab", t = "bb"
Output: 3
Explanation:The following are the pairs of substrings from s and t that differ by 1 character:
("ab", "bb")
("ab", "bb")
("ab", "bb")
​​​​The underlined portions are the substrings that are chosen from s and t.

```


```
Input: s = "a", t = "a"
Output: 0

```

**Example 4:** 

```
Input: s = "abe", t = "bbc"
Output: 10

```



**Constraints:** 

-  *1 <= s.length, t.length <= 100*  
-  *s*  and  *t*  consist of lowercase English letters only.


# [1638. 统计只差一个字符的子串数目][cnTitle]

**中等**

给你两个字符串  *s*  和  *t*  ，请你找出  *s*  中的非空子串的数目，这些子串满足替换 **一个不同字符**  以后，是  *t*  串的子串。换言之，请你找到  *s*  和  *t*  串中 **恰好**  只有一个字符不同的子字符串对的数目。

比方说，  *"computer"*  和  *"computation"*  加粗部分只有一个字符不同：  *'e'* / *'a'*  ，所以这一对子字符串会给答案加 1 。

请你返回满足上述条件的不同子字符串对数目。

一个 **子字符串**  是一个字符串中连续的字符。



**示例 1：** 

```
输入：s = "aba", t = "baba"
输出：6
解释：以下为只相差 1 个字符的 s 和 t 串的子字符串对：
("aba", "baba")
("aba", "baba")
("aba", "baba")
("aba", "baba")
("aba", "baba")
("aba", "baba")
加粗部分分别表示 s 和 t 串选出来的子字符串。

```


```
输入：s = "ab", t = "bb"
输出：3
解释：以下为只相差 1 个字符的 s 和 t 串的子字符串对：
("ab", "bb")
("ab", "bb")
("ab", "bb")
加粗部分分别表示 s 和 t 串选出来的子字符串。

```


```
输入：s = "a", t = "a"
输出：0

```

**示例 4：** 

```
输入：s = "abe", t = "bbc"
输出：10

```



**提示：** 

-  *1 <= s.length, t.length <= 100*  
-  *s*  和  *t*  都只包含小写英文字母。




# 算法思路

# 测试用例
```
1638. Count Substrings That Differ by One Character 1638. 统计只差一个字符的子串数目 Medium
```

[enTitle]: https://leetcode.com/problems/count-substrings-that-differ-by-one-character/
[cnTitle]: https://leetcode-cn.com/problems/count-substrings-that-differ-by-one-character/
