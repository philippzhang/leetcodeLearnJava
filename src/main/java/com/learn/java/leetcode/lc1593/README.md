# [1593. Split a String Into the Max Number of Unique Substrings][enTitle]

**Medium**

Given a string  *s* , return  *the maximum number of unique substrings that the given string can be split into* .

You can split string  *s*  into any list of **non-empty substrings** , where the concatenation of the substrings forms the original string. However, you must split the substrings such that all of them are **unique** .

A **substring**  is a contiguous sequence of characters within a string.



**Example 1:** 

```
Input: s = "ababccc"
Output: 5
Explanation: One way to split maximally is ['a', 'b', 'ab', 'c', 'cc']. Splitting like ['a', 'b', 'a', 'b', 'c', 'cc'] is not valid as you have 'a' and 'b' multiple times.

```

**Example 2:** 

```
Input: s = "aba"
Output: 2
Explanation: One way to split maximally is ['a', 'ba'].

```

**Example 3:** 

```
Input: s = "aa"
Output: 1
Explanation: It is impossible to split the string any further.

```



**Constraints:** 

-  1 <= s.length <= 16  
-  s contains only lower case English letters. 


# [1593. 拆分字符串使唯一子字符串的数目最大][cnTitle]

**中等**

给你一个字符串  *s*  ，请你拆分该字符串，并返回拆分后唯一子字符串的最大数目。

字符串  *s*  拆分后可以得到若干 **非空子字符串**  ，这些子字符串连接后应当能够还原为原字符串。但是拆分出来的每个子字符串都必须是 **唯一的**  。

注意：**子字符串**  是字符串中的一个连续字符序列。



**示例 1：** 

```
输入：s = "ababccc"
输出：5
解释：一种最大拆分方法为 ['a', 'b', 'ab', 'c', 'cc'] 。像 ['a', 'b', 'a', 'b', 'c', 'cc'] 这样拆分不满足题目要求，因为其中的 'a' 和 'b' 都出现了不止一次。

```

**示例 2：** 

```
输入：s = "aba"
输出：2
解释：一种最大拆分方法为 ['a', 'ba'] 。

```

**示例 3：** 

```
输入：s = "aa"
输出：1
解释：无法进一步拆分字符串。

```



**提示：** 

-  1 <= s.length <= 16  
-  s 仅包含小写英文字母 




# 算法思路

# 测试用例
```
1593. Split a String Into the Max Number of Unique Substrings 1593. 拆分字符串使唯一子字符串的数目最大 Medium
```

[enTitle]: https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings/
[cnTitle]: https://leetcode-cn.com/problems/split-a-string-into-the-max-number-of-unique-substrings/
