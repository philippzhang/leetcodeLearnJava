# [1347. Minimum Number of Steps to Make Two Strings Anagram][enTitle]

**Medium**

Given two equal-size strings  *s*  and  *t* . In one step you can choose **any character**  of  *t*  and replace it with **another character** .

Return  *the minimum number of steps*  to make  *t*  an anagram of  *s* .

An **Anagram**  of a string is a string that contains the same characters with a different (or the same) ordering.



**Example 1:** 

```
Input: s = "bab", t = "aba"
Output: 1
Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.

```

**Example 2:** 

```
Input: s = "leetcode", t = "practice"
Output: 5
Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.

```

**Example 3:** 

```
Input: s = "anagram", t = "mangaar"
Output: 0
Explanation: "anagram" and "mangaar" are anagrams. 

```

**Example 4:** 

```
Input: s = "xxyyzz", t = "xxyyzz"
Output: 0

```

**Example 5:** 

```
Input: s = "friend", t = "family"
Output: 4

```



**Constraints:** 

-  *1 <= s.length <= 50000*  
-  *s.length == t.length*  
-  *s*  and  *t*  contain lower-case English letters only.


# [1347. 制造字母异位词的最小步骤数][cnTitle]

**中等**

给你两个长度相等的字符串  *s*  和  *t* 。每一个步骤中，你可以选择将  *t*  中的 **任一字符**  替换为 **另一个字符** 。

返回使  *t*  成为  *s*  的字母异位词的最小步骤数。

**字母异位词**  指字母相同，但排列不同（也可能相同）的字符串。



**示例 1：** 

```
输出：s = "bab", t = "aba"
输出：1
提示：用 'b' 替换 t 中的第一个 'a'，t = "bba" 是 s 的一个字母异位词。

```

**示例 2：** 

```
输出：s = "leetcode", t = "practice"
输出：5
提示：用合适的字符替换 t 中的 'p', 'r', 'a', 'i' 和 'c'，使 t 变成 s 的字母异位词。

```

**示例 3：** 

```
输出：s = "anagram", t = "mangaar"
输出：0
提示："anagram" 和 "mangaar" 本身就是一组字母异位词。 

```

**示例 4：** 

```
输出：s = "xxyyzz", t = "xxyyzz"
输出：0

```

**示例 5：** 

```
输出：s = "friend", t = "family"
输出：4

```



**提示：** 

-  *1 <= s.length <= 50000*  
-  *s.length == t.length*  
-  *s*  和  *t*  只包含小写英文字母




# 算法思路

# 测试用例
```
1347. Minimum Number of Steps to Make Two Strings Anagram 1347. 制造字母异位词的最小步骤数 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
[cnTitle]: https://leetcode-cn.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
