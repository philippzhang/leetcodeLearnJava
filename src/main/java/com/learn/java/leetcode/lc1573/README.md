# [1573. Number of Ways to Split a String][enTitle]

**Medium**

Given a binary string  *s*  (a string consisting only of '0's and '1's), we can split  *s*  into 3 **non-empty**  strings s1, s2, s3 (s1+ s2+ s3 = s).

Return the number of ways  *s*  can be split such that the number of characters '1' is the same in s1, s2, and s3.

Since the answer may be too large, return it modulo 10^9 + 7.



**Example 1:** 

```
Input: s = "10101"
Output: 4
Explanation: There are four ways to split s in 3 parts where each part contain the same number of letters '1'.
"1|010|1"
"1|01|01"
"10|10|1"
"10|1|01"

```

**Example 2:** 

```
Input: s = "1001"
Output: 0

```

**Example 3:** 

```
Input: s = "0000"
Output: 3
Explanation: There are three ways to split s in 3 parts.
"0|0|00"
"0|00|0"
"00|0|0"

```

**Example 4:** 

```
Input: s = "100100010100110"
Output: 12

```



**Constraints:** 

-  *3 <= s.length <= 10^5*  
-  *s[i]*  is  *'0'*  or  *'1'* .


# [1573. 分割字符串的方案数][cnTitle]

**中等**

给你一个二进制串  *s*  （一个只包含 0 和 1 的字符串），我们可以将  *s*  分割成 3 个 **非空**  字符串 s1, s2, s3 （s1 + s2 + s3 = s）。

请你返回分割  *s*  的方案数，满足 s1，s2 和 s3 中字符 '1' 的数目相同。

由于答案可能很大，请将它对 10^9 + 7 取余后返回。



**示例 1：** 

```
输入：s = "10101"
输出：4
解释：总共有 4 种方法将 s 分割成含有 '1' 数目相同的三个子字符串。
"1|010|1"
"1|01|01"
"10|10|1"
"10|1|01"

```

**示例 2：** 

```
输入：s = "1001"
输出：0

```

**示例 3：** 

```
输入：s = "0000"
输出：3
解释：总共有 3 种分割 s 的方法。
"0|0|00"
"0|00|0"
"00|0|0"

```

**示例 4：** 

```
输入：s = "100100010100110"
输出：12

```



**提示：** 

-  *s[i] == '0'*  或者  *s[i] == '1'*  
-  *3 <= s.length <= 10^5* 




# 算法思路

# 测试用例
```
1573. Number of Ways to Split a String 1573. 分割字符串的方案数 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-ways-to-split-a-string/
[cnTitle]: https://leetcode-cn.com/problems/number-of-ways-to-split-a-string/
