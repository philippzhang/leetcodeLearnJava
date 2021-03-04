# [1717. Maximum Score From Removing Substrings][enTitle]

**Medium**

You are given a string  *s*  and two integers  *x*  and  *y* . You can perform two types of operations any number of times.

- Remove substring  *"ab"*  and gain  *x*  points. 
 <ul> 
  - For example, when removing  *"ab"*  from  *"cabxbae"*  it becomes  *"cxbae"* . 
 </ul>  
- Remove substring  *"ba"*  and gain  *y*  points. 
 <ul> 
  - For example, when removing  *"ba"*  from  *"cabxbae"*  it becomes  *"cabxe"* . 
 </ul> 

Return  *the maximum points you can gain after applying the above operations on*   *s* .



**Example 1:** 

```
Input: s = "cdbcbbaaabab", x = 4, y = 5
Output: 19
Explanation:
- Remove the "ba" underlined in "cdbcbbaaabab". Now, s = "cdbcbbaaab" and 5 points are added to the score.
- Remove the "ab" underlined in "cdbcbbaaab". Now, s = "cdbcbbaa" and 4 points are added to the score.
- Remove the "ba" underlined in "cdbcbbaa". Now, s = "cdbcba" and 5 points are added to the score.
- Remove the "ba" underlined in "cdbcba". Now, s = "cdbc" and 5 points are added to the score.
Total score = 5 + 4 + 5 + 5 = 19.
```

**Example 2:** 

```
Input: s = "aabbaaxybbaabb", x = 5, y = 4
Output: 20

```



**Constraints:** 

-  *1 <= s.length <= 105*  
-  *1 <= x, y <= 104*  
-  *s*  consists of lowercase English letters.


# [1717. 删除子字符串的最大得分][cnTitle]

**中等**

给你一个字符串  *s*  和两个整数  *x*  和  *y*  。你可以执行下面两种操作任意次。

- 删除子字符串  *"ab"*  并得到  *x*  分。 
 <ul> 
  - 比方说，从  *"cabxbae"*  删除  *ab*  ，得到  *"cxbae"*  。 
 </ul>  
- 删除子字符串 *"ba"*  并得到  *y*  分。 
 <ul> 
  - 比方说，从  *"cabxbae"*  删除  *ba*  ，得到  *"cabxe"*  。 
 </ul> 

请返回对  *s*  字符串执行上面操作若干次能得到的最大得分。



**示例 1：** 

```
输入：s = "cdbcbbaaabab", x = 4, y = 5
输出：19
解释：
- 删除 "cdbcbbaaabab" 中加粗的 "ba" ，得到 s = "cdbcbbaaab" ，加 5 分。
- 删除 "cdbcbbaaab" 中加粗的 "ab" ，得到 s = "cdbcbbaa" ，加 4 分。
- 删除 "cdbcbbaa" 中加粗的 "ba" ，得到 s = "cdbcba" ，加 5 分。
- 删除 "cdbcba" 中加粗的 "ba" ，得到 s = "cdbc" ，加 5 分。
总得分为 5 + 4 + 5 + 5 = 19 。
```

**示例 2：** 

```
输入：s = "aabbaaxybbaabb", x = 5, y = 4
输出：20

```



**提示：** 

-  *1 <= s.length <= 105*  
-  *1 <= x, y <= 104*  
-  *s*  只包含小写英文字母。




# 算法思路

# 测试用例
```
1717. Maximum Score From Removing Substrings 1717. 删除子字符串的最大得分 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-score-from-removing-substrings/
[cnTitle]: https://leetcode-cn.com/problems/maximum-score-from-removing-substrings/
