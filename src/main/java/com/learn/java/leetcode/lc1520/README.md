# [1520. Maximum Number of Non-Overlapping Substrings][enTitle]

**Hard**

Given a string  *s*  of lowercase letters, you need to find the maximum number of **non-empty**  substrings of  *s*  that meet the following conditions:

1. The substrings do not overlap, that is for any two substrings  *s[i..j]*  and  *s[k..l]* , either  *j < k*  or  *i > l*  is true. 
2. A substring that contains a certain character  *c*  must also contain all occurrences of  *c* .

Find  *the maximum number of substrings that meet the above conditions* . If there are multiple solutions with the same number of substrings,  *return the one with minimum total length.* It can be shown that there exists a unique solution of minimum total length.

Notice that you can return the substrings in **any**  order.



**Example 1:** 

```
Input: s = "adefaddaccc"
Output: ["e","f","ccc"]
Explanation: The following are all the possible substrings that meet the conditions:
[
  "adefaddaccc"
  "adefadda",
  "ef",
  "e",
  "f",
  "ccc",
]
If we choose the first string, we cannot choose anything else and we'd get only 1. If we choose "adefadda", we are left with "ccc" which is the only one that doesn't overlap, thus obtaining 2 substrings. Notice also, that it's not optimal to choose "ef" since it can be split into two. Therefore, the optimal way is to choose ["e","f","ccc"] which gives us 3 substrings. No other solution of the same number of substrings exist.

```

**Example 2:** 

```
Input: s = "abbaccd"
Output: ["d","bb","cc"]
Explanation:Notice that while the set of substrings ["d","abba","cc"] also has length 3, it's considered incorrect since it has larger total length.

```



**Constraints:** 

-  *1 <= s.length <= 10^5*  
-  *s*  contains only lowercase English letters.


# [1520. 最多的不重叠子字符串][cnTitle]

**困难**

给你一个只包含小写字母的字符串  *s*  ，你需要找到  *s*  中最多数目的非空子字符串，满足如下条件：

1. 这些字符串之间互不重叠，也就是说对于任意两个子字符串  *s[i..j]*  和  *s[k..l]*  ，要么  *j < k*  要么  *i > l*  。 
2. 如果一个子字符串包含字符  *char*  ，那么  *s*  中所有  *char*  字符都应该在这个子字符串中。

请你找到满足上述条件的最多子字符串数目。如果有多个解法有相同的子字符串数目，请返回这些子字符串总长度最小的一个解。可以证明最小总长度解是唯一的。

请注意，你可以以 **任意**  顺序返回最优解的子字符串。



**示例 1：** 

```
输入：s = "adefaddaccc"
输出：["e","f","ccc"]
解释：下面为所有满足第二个条件的子字符串：
[
  "adefaddaccc"
  "adefadda",
  "ef",
  "e",
  "f",
  "ccc",
]
如果我们选择第一个字符串，那么我们无法再选择其他任何字符串，所以答案为 1 。如果我们选择 "adefadda" ，剩下子字符串中我们只可以选择 "ccc" ，它是唯一不重叠的子字符串，所以答案为 2 。同时我们可以发现，选择 "ef" 不是最优的，因为它可以被拆分成 2 个子字符串。所以最优解是选择 ["e","f","ccc"] ，答案为 3 。不存在别的相同数目子字符串解。

```

**示例 2：** 

```
输入：s = "abbaccd"
输出：["d","bb","cc"]
解释：注意到解 ["d","abba","cc"] 答案也为 3 ，但它不是最优解，因为它的总长度更长。

```



**提示：** 

-  *1 <= s.length <= 10^5*  
-  *s*  只包含小写英文字母。




# 算法思路

# 测试用例
```
1520. Maximum Number of Non-Overlapping Substrings 1520. 最多的不重叠子字符串 Hard
```

[enTitle]: https://leetcode.com/problems/maximum-number-of-non-overlapping-substrings/
[cnTitle]: https://leetcode-cn.com/problems/maximum-number-of-non-overlapping-substrings/
