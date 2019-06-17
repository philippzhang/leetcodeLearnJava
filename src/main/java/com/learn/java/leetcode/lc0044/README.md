# [44. Wildcard Matching][enTitle]

**Hard**

Given an input string ( *s* ) and a pattern ( *p* ), implement wildcard pattern matching with support for  *'?'*  and  *'*'* .

```
'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).

```

The matching should cover the **entire**  input string (not partial).

**Note:** 

-  *s*  could be empty and contains only lowercase letters  *a-z* . 
-  *p*  could be empty and contains only lowercase letters  *a-z* , and characters like  *?*  or  *** .

**Example 1:** 

```
Input:
s = "aa"
p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".

```

**Example 2:** 

```
Input:
s = "aa"
p = "*"
Output: true
Explanation: '*' matches any sequence.

```

**Example 3:** 

```
Input:
s = "cb"
p = "?a"
Output: false
Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.

```

**Example 4:** 

```
Input:
s = "adceb"
p = "*a*b"
Output: true
Explanation: The first '*' matches the empty sequence, while the second '*' matches the substring "dce".

```

**Example 5:** 

```
Input:
s = "acdcb"
p = "a*c?b"
Output: false

```
# [44. 通配符匹配][cnTitle]

**困难**

给定一个字符串 ( *s* ) 和一个字符模式 ( *p* ) ，实现一个支持  *'?'*  和  *'*'*  的通配符匹配。

```
'?' 可以匹配任何单个字符。
'*' 可以匹配任意字符串（包括空字符串）。

```

两个字符串**完全匹配** 才算匹配成功。

**说明:** 

-  *s*  可能为空，且只包含从  *a-z*  的小写字母。 
-  *p*  可能为空，且只包含从  *a-z*  的小写字母，以及字符  *?*  和  *** 。

**示例 1:** 

```
输入:
s = "aa"
p = "a"
输出: false
解释: "a" 无法匹配 "aa" 整个字符串。
```

**示例 2:** 

```
输入:
s = "aa"
p = "*"
输出: true
解释: '*' 可以匹配任意字符串。

```

**示例 3:** 

```
输入:
s = "cb"
p = "?a"
输出: false
解释: '?' 可以匹配 'c', 但第二个 'a' 无法匹配 'b'。

```

**示例 4:** 

```
输入:
s = "adceb"
p = "*a*b"
输出: true
解释: 第一个 '*' 可以匹配空字符串, 第二个 '*' 可以匹配字符串 "dce".

```

**示例 5:** 

```
输入:
s = "acdcb"
p = "a*c?b"
输入: false
```


# 算法思路

# 测试用例
```
44. Wildcard Matching 44. 通配符匹配 Hard
Solution.isMatch
---
"aa"
"a"

=false
---
"aa"
"*"

=true
---
"cb"
"?a"

=false
---
"adceb"
"*a*b"

=true
---
"acdcb"
"a*c?b"

=false
```

[enTitle]: https://leetcode.com/problems/wildcard-matching/
[cnTitle]: https://leetcode-cn.com/problems/wildcard-matching/
