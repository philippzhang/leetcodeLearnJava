# [1328. Break a Palindrome][enTitle]

**Medium**

Given a palindromic string of lowercase English letters  *palindrome* , replace **exactly one**  character with any lowercase English letter so that the resulting string is **not**  a palindrome and that it is the **lexicographically smallest**  one possible.

Return  *the resulting string. If there is no way to replace a character to make it not a palindrome, return an empty string.* 

A string  *a*  is lexicographically smaller than a string  *b*  (of the same length) if in the first position where  *a*  and  *b*  differ,  *a*  has a character strictly smaller than the corresponding character in  *b* . For example,  *"abcc"*  is lexicographically smaller than  *"abcd"*  because the first position they differ is at the fourth character, and  *'c'*  is smaller than  *'d'* .



**Example 1:** 

```
Input: palindrome = "abccba"
Output: "aaccba"
Explanation: There are many ways to make "abccba" not a palindrome, such as "zbccba", "aaccba", and "abacba".
Of all the ways, "aaccba" is the lexicographically smallest.

```

**Example 2:** 

```
Input: palindrome = "a"
Output: ""
Explanation: There is no way to replace a single character to make "a" not a palindrome, so return an empty string.

```

**Example 3:** 

```
Input: palindrome = "aa"
Output: "ab"
```

**Example 4:** 

```
Input: palindrome = "aba"
Output: "abb"

```



**Constraints:** 

-  *1 <= palindrome.length <= 1000*  
-  *palindrome*  consists of only lowercase English letters.


# [1328. 破坏回文串][cnTitle]

**中等**

给你一个回文字符串  *palindrome*  ，请你将其中 **一个**  字符用任意小写英文字母替换，使得结果字符串的字典序最小，且 **不是**  回文串。

请你返回结果字符串。如果无法做到，则返回一个空串。



**示例 1：** 

```
输入：palindrome = "abccba"
输出："aaccba"

```

**示例 2：** 

```
输入：palindrome = "a"
输出：""

```



**提示：** 

-  *1 <= palindrome.length <= 1000*  
-  *palindrome*  只包含小写英文字母。




# 算法思路

# 测试用例
```
1328. Break a Palindrome 1328. 破坏回文串 Medium
```

[enTitle]: https://leetcode.com/problems/break-a-palindrome/
[cnTitle]: https://leetcode-cn.com/problems/break-a-palindrome/
