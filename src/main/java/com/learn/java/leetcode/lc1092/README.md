# [1092. Shortest Common Supersequence][enTitle]

**Hard**

Given two strings  *str1*  and  *str2* , return the shortest string that has both  *str1*  and  *str2*  as subsequences. If multiple answers exist, you may return any of them.

 *(A string S is a subsequence of string T if deleting some number of characters from T (possibly 0, and the characters are chosen anywhere from T) results in the string S.)* 



**Example 1:** 

```
Input:str1 = "abac", str2 = "cab"
Output: "cabac"
Explanation: 
str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
The answer provided is the shortest such string that satisfies these properties.
```



**Note:** 

1.  *1 <= str1.length, str2.length <= 1000*  
2.  *str1*  and  *str2*  consist of lowercase English letters.


# [1092. 最短公共超序列][cnTitle]

**困难**

给出两个字符串  *str1*  和  *str2* ，返回同时以  *str1*  和  *str2*  作为子序列的最短字符串。如果答案不止一个，则可以返回满足条件的任意一个答案。

（如果从字符串 T 中删除一些字符（也可能不删除，并且选出的这些字符可以位于 T 中的 **任意位置** ），可以得到字符串 S，那么 S 就是 T 的子序列）



**示例：** 

```
输入：str1 = "abac", str2 = "cab"
输出："cabac"
解释：
str1 = "abac" 是 "cabac" 的一个子串，因为我们可以删去 "cabac" 的第一个 "c"得到 "abac"。 
str2 = "cab" 是 "cabac" 的一个子串，因为我们可以删去 "cabac" 末尾的 "ac" 得到 "cab"。
最终我们给出的答案是满足上述属性的最短字符串。

```



**提示：** 

1.  *1 <= str1.length, str2.length <= 1000*  
2.  *str1*  和  *str2*  都由小写英文字母组成。




# 算法思路

# 测试用例
```
1092. Shortest Common Supersequence 1092. 最短公共超序列 Hard
```

[enTitle]: https://leetcode.com/problems/shortest-common-supersequence/
[cnTitle]: https://leetcode-cn.com/problems/shortest-common-supersequence/
