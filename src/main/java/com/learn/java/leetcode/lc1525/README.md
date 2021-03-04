# [1525. Number of Good Ways to Split a String][enTitle]

**Medium**

You are given a string  *s* , a split is called  *good*  if you can split  *s*  into 2 non-empty strings  *p*  and  *q*  where its concatenation is equal to  *s*  and the number of distinct letters in  *p*  and  *q*  are the same.

Return the number of  *good*  splits you can make in  *s* .



**Example 1:** 

```
Input: s = "aacaba"
Output: 2
Explanation: There are 5 ways to split "aacaba" and 2 of them are good. 
("a", "acaba") Left string and right string contains 1 and 3 different letters respectively.
("aa", "caba") Left string and right string contains 1 and 3 different letters respectively.
("aac", "aba") Left string and right string contains 2 and 2 different letters respectively (good split).
("aaca", "ba") Left string and right string contains 2 and 2 different letters respectively (good split).
("aacab", "a") Left string and right string contains 3 and 1 different letters respectively.

```

**Example 2:** 

```
Input: s = "abcd"
Output: 1
Explanation:Split the string as follows ("ab", "cd").

```

**Example 3:** 

```
Input: s = "aaaaa"
Output: 4
Explanation:All possible splits are good.
```

**Example 4:** 

```
Input: s = "acbadbaada"
Output: 2

```



**Constraints:** 

-  *s*  contains only lowercase English letters. 
-  *1 <= s.length <= 10^5* 


# [1525. 字符串的好分割数目][cnTitle]

**中等**

给你一个字符串  *s*  ，一个分割被称为 「好分割」 当它满足：将  *s*  分割成 2 个字符串  *p*  和  *q*  ，它们连接起来等于  *s*  且  *p*  和  *q*  中不同字符的数目相同。

请你返回  *s*  中好分割的数目。



**示例 1：** 

```
输入：s = "aacaba"
输出：2
解释：总共有 5 种分割字符串 "aacaba" 的方法，其中 2 种是好分割。
("a", "acaba") 左边字符串和右边字符串分别包含 1 个和 3 个不同的字符。
("aa", "caba") 左边字符串和右边字符串分别包含 1 个和 3 个不同的字符。
("aac", "aba") 左边字符串和右边字符串分别包含 2 个和 2 个不同的字符。这是一个好分割。
("aaca", "ba") 左边字符串和右边字符串分别包含 2 个和 2 个不同的字符。这是一个好分割。
("aacab", "a") 左边字符串和右边字符串分别包含 3 个和 1 个不同的字符。

```

**示例 2：** 

```
输入：s = "abcd"
输出：1
解释：好分割为将字符串分割成 ("ab", "cd") 。

```

**示例 3：** 

```
输入：s = "aaaaa"
输出：4
解释：所有分割都是好分割。
```

**示例 4：** 

```
输入：s = "acbadbaada"
输出：2

```



**提示：** 

-  *s*  只包含小写英文字母。 
-  *1 <= s.length <= 10^5* 




# 算法思路

# 测试用例
```
1525. Number of Good Ways to Split a String 1525. 字符串的好分割数目 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-good-ways-to-split-a-string/
[cnTitle]: https://leetcode-cn.com/problems/number-of-good-ways-to-split-a-string/
