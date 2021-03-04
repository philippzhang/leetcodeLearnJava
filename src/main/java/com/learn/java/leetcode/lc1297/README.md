# [1297. Maximum Number of Occurrences of a Substring][enTitle]

**Medium**

Given a string  *s* , return the maximum number of ocurrences of **any**  substring under the following rules:

- The number of unique characters in the substring must be less than or equal to  *maxLetters* . 
- The substring size must be between  *minSize*  and  *maxSize*  inclusive.



**Example 1:** 

```
Input: s = "aababcaab", maxLetters = 2, minSize = 3, maxSize = 4
Output: 2
Explanation: Substring "aab" has 2 ocurrences in the original string.
It satisfies the conditions, 2 unique letters and size 3 (between minSize and maxSize).

```

**Example 2:** 

```
Input: s = "aaaa", maxLetters = 1, minSize = 3, maxSize = 3
Output: 2
Explanation: Substring "aaa" occur 2 times in the string. It can overlap.

```

**Example 3:** 

```
Input: s = "aabcabcab", maxLetters = 2, minSize = 2, maxSize = 3
Output: 3

```

**Example 4:** 

```
Input: s = "abcde", maxLetters = 2, minSize = 3, maxSize = 3
Output: 0

```



**Constraints:** 

-  *1 <= s.length <= 10^5*  
-  *1 <= maxLetters <= 26*  
-  *1 <= minSize <= maxSize <= min(26, s.length)*  
-  *s*  only contains lowercase English letters.


# [1297. 子串的最大出现次数][cnTitle]

**中等**

给你一个字符串  *s*  ，请你返回满足以下条件且出现次数最大的 **任意**  子串的出现次数：

- 子串中不同字母的数目必须小于等于  *maxLetters*  。 
- 子串的长度必须大于等于  *minSize*  且小于等于  *maxSize*  。



**示例 1：** 

```
输入：s = "aababcaab", maxLetters = 2, minSize = 3, maxSize = 4
输出：2
解释：子串 "aab" 在原字符串中出现了 2 次。
它满足所有的要求：2 个不同的字母，长度为 3 （在 minSize 和 maxSize 范围内）。

```

**示例 2：** 

```
输入：s = "aaaa", maxLetters = 1, minSize = 3, maxSize = 3
输出：2
解释：子串 "aaa" 在原字符串中出现了 2 次，且它们有重叠部分。

```

**示例 3：** 

```
输入：s = "aabcabcab", maxLetters = 2, minSize = 2, maxSize = 3
输出：3

```

**示例 4：** 

```
输入：s = "abcde", maxLetters = 2, minSize = 3, maxSize = 3
输出：0

```



**提示：** 

-  *1 <= s.length <= 10^5*  
-  *1 <= maxLetters <= 26*  
-  *1 <= minSize <= maxSize <= min(26, s.length)*  
-  *s*  只包含小写英文字母。




# 算法思路

# 测试用例
```
1297. Maximum Number of Occurrences of a Substring 1297. 子串的最大出现次数 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/
[cnTitle]: https://leetcode-cn.com/problems/maximum-number-of-occurrences-of-a-substring/
