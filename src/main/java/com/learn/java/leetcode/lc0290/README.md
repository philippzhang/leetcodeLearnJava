# [290. Word Pattern][enTitle]

**Easy**

Given a  *pattern*  and a string  *str* , find if  *str*  follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in  *pattern*  and a non-empty word in  *str* .

**Example 1:** 

```
Input: pattern = "abba", str = "dog cat cat dog"
Output: true
```

**Example 2:** 

```
Input:pattern = "abba", str = "dog cat cat fish"
Output: false
```

**Example 3:** 

```
Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false
```

**Example 4:** 

```
Input: pattern = "abba", str = "dog dog dog dog"
Output: false
```

Notes: You may assume  *pattern*  contains only lowercase letters, and  *str*  contains lowercase letters that may be separated by a single space.
# [290. 单词规律][cnTitle]

**简单**

给定一种规律  *pattern*  和一个字符串  *str*  ，判断  *str*  是否遵循相同的规律。

这里的 **遵循** 指完全匹配，例如，  *pattern*  里的每个字母和字符串  *str* **** 中的每个非空单词之间存在着双向连接的对应规律。

**示例1:** 

```
输入: pattern = "abba", str = "dog cat cat dog"
输出: true
```

**示例 2:** 

```
输入:pattern = "abba", str = "dog cat cat fish"
输出: false
```

**示例 3:** 

```
输入: pattern = "aaaa", str = "dog cat cat dog"
输出: false
```

**示例 4:** 

```
输入: pattern = "abba", str = "dog dog dog dog"
输出: false
```

**说明:**  你可以假设  *pattern*  只包含小写字母，  *str*  包含了由单个空格分隔的小写字母。


# 算法思路

# 测试用例
```
290. Word Pattern 290. 单词规律 Easy
Solution.wordPattern
---
"abba"
"dog cat cat dog"

=true
---
"abba"
"dog cat cat fish"

=false
---
"aaaa"
"dog cat cat dog"

=false
---
"abba"
"dog dog dog dog"

=false
---
"jquery"
"jquery"

=false
```

[enTitle]: https://leetcode.com/problems/word-pattern/
[cnTitle]: https://leetcode-cn.com/problems/word-pattern/
