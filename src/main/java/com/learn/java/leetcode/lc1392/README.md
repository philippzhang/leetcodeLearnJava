# [1392. Longest Happy Prefix][enTitle]

**Hard**

A string is called a  *happy prefix*  if is a **non-empty**  prefix which is also a suffix (excluding itself).

Given a string  *s* . Return the **longest happy prefix**  of  *s*  .

Return an empty string if no such prefix exists.



**Example 1:** 

```
Input: s = "level"
Output: "l"
Explanation: s contains 4 prefix excluding itself ("l", "le", "lev", "leve"), and suffix ("l", "el", "vel", "evel"). The largest prefix which is also suffix is given by "l".

```

**Example 2:** 

```
Input: s = "ababab"
Output: "abab"
Explanation: "abab" is the largest prefix which is also suffix. They can overlap in the original string.

```

**Example 3:** 

```
Input: s = "leetcodeleet"
Output: "leet"

```

**Example 4:** 

```
Input: s = "a"
Output: ""

```



**Constraints:** 

-  *1 <= s.length <= 10^5*  
-  *s*  contains only lowercase English letters.


# [1392. 最长快乐前缀][cnTitle]

**困难**

「快乐前缀」是在原字符串中既是 **非空**  前缀也是后缀（不包括原字符串自身）的字符串。

给你一个字符串  *s* ，请你返回它的 **最长快乐前缀** 。

如果不存在满足题意的前缀，则返回一个空字符串。



**示例 1：** 

```
输入：s = "level"
输出："l"
解释：不包括 s 自己，一共有 4 个前缀（"l", "le", "lev", "leve"）和 4 个后缀（"l", "el", "vel", "evel"）。最长的既是前缀也是后缀的字符串是 "l" 。

```

**示例 2：** 

```
输入：s = "ababab"
输出："abab"
解释："abab" 是最长的既是前缀也是后缀的字符串。题目允许前后缀在原字符串中重叠。

```

**示例 3：** 

```
输入：s = "leetcodeleet"
输出："leet"

```

**示例 4：** 

```
输入：s = "a"
输出：""

```



**提示：** 

-  *1 <= s.length <= 10^5*  
-  *s*  只含有小写英文字母




# 算法思路

# 测试用例
```
1392. Longest Happy Prefix 1392. 最长快乐前缀 Hard
```

[enTitle]: https://leetcode.com/problems/longest-happy-prefix/
[cnTitle]: https://leetcode-cn.com/problems/longest-happy-prefix/
