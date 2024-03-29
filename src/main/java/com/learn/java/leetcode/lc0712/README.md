# [712. Minimum ASCII Delete Sum for Two Strings][enTitle]

**Medium**

Given two strings  *s1, s2* , find the lowest ASCII sum of deleted characters to make two strings equal.

Example 1:

```
Input: s1 = "sea", s2 = "eat"
Output: 231
Explanation: Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.
Deleting "t" from "eat" adds 116 to the sum.
At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.

```



Example 2:

```
Input: s1 = "delete", s2 = "leet"
Output: 403
Explanation: Deleting "dee" from "delete" to turn the string into "let",
adds 100[d]+101[e]+101[e] to the sum.  Deleting "e" from "leet" adds 101[e] to the sum.
At the end, both strings are equal to "let", and the answer is 100+101+101+101 = 403.
If instead we turned both strings into "lee" or "eet", we would get answers of 433 or 417, which are higher.

```



Note:






# [712. 两个字符串的最小ASCII删除和][cnTitle]

**中等**

给定两个字符串 *s1, s2* ，找到使两个字符串相等所需删除字符的ASCII值的最小和。

**示例 1:** 

```
输入: s1 = "sea", s2 = "eat"
输出: 231
解释: 在 "sea" 中删除 "s" 并将 "s" 的值(115)加入总和。
在 "eat" 中删除 "t" 并将 116 加入总和。
结束时，两个字符串相等，115 + 116 = 231 就是符合条件的最小和。

```

**示例 2:** 

```
输入: s1 = "delete", s2 = "leet"
输出: 403
解释: 在 "delete" 中删除 "dee" 字符串变成 "let"，
将 100[d]+101[e]+101[e] 加入总和。在 "leet" 中删除 "e" 将 101[e] 加入总和。
结束时，两个字符串都等于 "let"，结果即为 100+101+101+101 = 403 。
如果改为将两个字符串转换为 "lee" 或 "eet"，我们会得到 433 或 417 的结果，比答案更大。

```

**注意:** 

-  *0 < s1.length, s2.length <= 1000* 。 
- 所有字符串中的字符ASCII值在 *[97, 122]* 之间。




# 算法思路

# 测试用例
```
712. Minimum ASCII Delete Sum for Two Strings 712. 两个字符串的最小ASCII删除和 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/
[cnTitle]: https://leetcode-cn.com/problems/minimum-ascii-delete-sum-for-two-strings/
