# [10. Regular Expression Matching][enTitle]

**Hard**

Given an input string ( *s* ) and a pattern ( *p* ), implement regular expression matching with support for  *'.'*  and  *'*'* .

```
'.' Matches any single character.
'*' Matches zero or more of the preceding element.

```

The matching should cover the **entire**  input string (not partial).

**Note:** 

-  *s*  could be empty and contains only lowercase letters  *a-z* . 
-  *p*  could be empty and contains only lowercase letters  *a-z* , and characters like  *.*  or  *** .

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
p = "a*"
Output: true
Explanation: '*' means zero or more of the precedeng element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".

```

**Example 3:** 

```
Input:
s = "ab"
p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".

```

**Example 4:** 

```
Input:
s = "aab"
p = "c*a*b"
Output: true
Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore it matches "aab".

```

**Example 5:** 

```
Input:
s = "mississippi"
p = "mis*is*p*."
Output: false

```
# [10. 正则表达式匹配][cnTitle]

**困难**

给定一个字符串 ( *s* ) 和一个字符模式 ( *p* )。实现支持  *'.'*  和  *'*'*  的正则表达式匹配。

```
'.' 匹配任意单个字符。
'*' 匹配零个或多个前面的元素。

```

匹配应该覆盖**整个** 字符串 ( *s* ) ，而不是部分字符串。

**说明:** 

-  *s*  可能为空，且只包含从  *a-z*  的小写字母。 
-  *p*  可能为空，且只包含从  *a-z*  的小写字母，以及字符  *.*  和  *** 。

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
p = "a*"
输出: true
解释: '*' 代表可匹配零个或多个前面的元素, 即可以匹配 'a' 。因此, 重复 'a' 一次, 字符串可变为 "aa"。

```

**示例 3:** 

```
输入:
s = "ab"
p = ".*"
输出: true
解释: ".*" 表示可匹配零个或多个('*')任意字符('.')。

```

**示例 4:** 

```
输入:
s = "aab"
p = "c*a*b"
输出: true
解释: 'c' 可以不被重复, 'a' 可以被重复一次。因此可以匹配字符串 "aab"。

```

**示例 5:** 

```
输入:
s = "mississippi"
p = "mis*is*p*."
输出: false
```


# 算法思路

# 测试用例
```
10. Regular Expression Matching 10. 正则表达式匹配 Hard
Solution.isMatch
---
"aa"
"a"

=false
---
"aa"
"a*"

=true
---
"ab"
".*"

=true
---
"aab"
"c*a*b"

=true
---
"mississippi"
"mis*is*p*."

=false
```

[enTitle]: https://leetcode.com/problems/regular-expression-matching/
[cnTitle]: https://leetcode-cn.com/problems/regular-expression-matching/
