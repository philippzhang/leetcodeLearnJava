# [1400. Construct K Palindrome Strings][enTitle]

**Medium**

Given a string  *s*  and an integer  *k* . You should construct  *k*  non-empty **palindrome**  strings using **all the characters**  in  *s* .

Return  *True*  if you can use all the characters in  *s*  to construct  *k*  palindrome strings or  *False*  otherwise.



**Example 1:** 

```
Input: s = "annabelle", k = 2
Output: true
Explanation: You can construct two palindromes using all characters in s.
Some possible constructions "anna" + "elble", "anbna" + "elle", "anellena" + "b"

```

**Example 2:** 

```
Input: s = "leetcode", k = 3
Output: false
Explanation: It is impossible to construct 3 palindromes using all the characters of s.

```

**Example 3:** 

```
Input: s = "true", k = 4
Output: true
Explanation: The only possible solution is to put each character in a separate string.

```

**Example 4:** 

```
Input: s = "yzyzyzyzyzyzyzy", k = 2
Output: true
Explanation: Simply you can put all z's in one string and all y's in the other string. Both strings will be palindrome.

```

**Example 5:** 

```
Input: s = "cr", k = 7
Output: false
Explanation: We don't have enough characters in s to construct 7 palindromes.

```



**Constraints:** 

-  *1 <= s.length <= 10^5*  
- All characters in  *s*  are lower-case English letters. 
-  *1 <= k <= 10^5* 


# [1400. 构造 K 个回文字符串][cnTitle]

**中等**

给你一个字符串  *s*  和一个整数  *k*  。请你用  *s*  字符串中 **所有字符**  构造  *k*  个非空 **回文串**  。

如果你可以用  *s*  中所有字符构造  *k*  个回文字符串，那么请你返回 **True**  ，否则返回 **False**  。



**示例 1：** 

```
输入：s = "annabelle", k = 2
输出：true
解释：可以用 s 中所有字符构造 2 个回文字符串。
一些可行的构造方案包括："anna" + "elble"，"anbna" + "elle"，"anellena" + "b"

```

**示例 2：** 

```
输入：s = "leetcode", k = 3
输出：false
解释：无法用 s 中所有字符构造 3 个回文串。

```

**示例 3：** 

```
输入：s = "true", k = 4
输出：true
解释：唯一可行的方案是让 s 中每个字符单独构成一个字符串。

```

**示例 4：** 

```
输入：s = "yzyzyzyzyzyzyzy", k = 2
输出：true
解释：你只需要将所有的 z 放在一个字符串中，所有的 y 放在另一个字符串中。那么两个字符串都是回文串。

```

**示例 5：** 

```
输入：s = "cr", k = 7
输出：false
解释：我们没有足够的字符去构造 7 个回文串。

```



**提示：** 

-  *1 <= s.length <= 10^5*  
-  *s*  中所有字符都是小写英文字母。 
-  *1 <= k <= 10^5* 




# 算法思路

# 测试用例
```
1400. Construct K Palindrome Strings 1400. 构造 K 个回文字符串 Medium
```

[enTitle]: https://leetcode.com/problems/construct-k-palindrome-strings/
[cnTitle]: https://leetcode-cn.com/problems/construct-k-palindrome-strings/
