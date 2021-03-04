# [1190. Reverse Substrings Between Each Pair of Parentheses][enTitle]

**Medium**

You are given a string  *s*  that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should **not**  contain any brackets.



**Example 1:** 

```
Input: s = "(abcd)"
Output: "dcba"

```

**Example 2:** 

```
Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.

```

**Example 3:** 

```
Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

```

**Example 4:** 

```
Input: s = "a(bcdefghijkl(mno)p)q"
Output: "apmnolkjihgfedcbq"

```



**Constraints:** 

-  *0 <= s.length <= 2000*  
-  *s*  only contains lower case English characters and parentheses. 
- It's guaranteed that all parentheses are balanced.


# [1190. 反转每对括号间的子串][cnTitle]

**中等**

给出一个字符串  *s* （仅含有小写英文字母和括号）。

请你按照从括号内到外的顺序，逐层反转每对匹配括号中的字符串，并返回最终的结果。

注意，您的结果中 **不应**  包含任何括号。



**示例 1：** 

```
输入：s = "(abcd)"
输出："dcba"

```

**示例 2：** 

```
输入：s = "(u(love)i)"
输出："iloveu"

```

**示例 3：** 

```
输入：s = "(ed(et(oc))el)"
输出："leetcode"

```

**示例 4：** 

```
输入：s = "a(bcdefghijkl(mno)p)q"
输出："apmnolkjihgfedcbq"

```



**提示：** 

-  *0 <= s.length <= 2000*  
-  *s*  中只有小写英文字母和括号 
- 我们确保所有括号都是成对出现的




# 算法思路

# 测试用例
```
1190. Reverse Substrings Between Each Pair of Parentheses 1190. 反转每对括号间的子串 Medium
```

[enTitle]: https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
[cnTitle]: https://leetcode-cn.com/problems/reverse-substrings-between-each-pair-of-parentheses/
