# [1422. Maximum Score After Splitting a String][enTitle]

**Easy**

Given a string  *s*  of zeros and ones,  *return the maximum score after splitting the string into two non-empty substrings*  (i.e. **left**  substring and **right**  substring).

The score after splitting a string is the number of **zeros**  in the **left**  substring plus the number of **ones**  in the **right**  substring.



**Example 1:** 

```
Input: s = "011101"
Output: 5 
Explanation: 
All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5 
left = "01" and right = "1101", score = 1 + 3 = 4 
left = "011" and right = "101", score = 1 + 2 = 3 
left = "0111" and right = "01", score = 1 + 1 = 2 
left = "01110" and right = "1", score = 2 + 1 = 3

```

**Example 2:** 

```
Input: s = "00111"
Output: 5
Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5

```

**Example 3:** 

```
Input: s = "1111"
Output: 3

```



**Constraints:** 

-  *2 <= s.length <= 500*  
- The string  *s*  consists of characters '0' and '1' only.


# [1422. 分割字符串的最大得分][cnTitle]

**简单**

给你一个由若干 0 和 1 组成的字符串  *s*  ，请你计算并返回将该字符串分割成两个 **非空**  子字符串（即 **左**  子字符串和 **右**  子字符串）所能获得的最大得分。

「分割字符串的得分」为 **左**  子字符串中 **0**  的数量加上 **右**  子字符串中 **1**  的数量。



**示例 1：** 

```
输入：s = "011101"
输出：5 
解释：
将字符串 s 划分为两个非空子字符串的可行方案有：
左子字符串 = "0" 且 右子字符串 = "11101"，得分 = 1 + 4 = 5 
左子字符串 = "01" 且 右子字符串 = "1101"，得分 = 1 + 3 = 4 
左子字符串 = "011" 且 右子字符串 = "101"，得分 = 1 + 2 = 3 
左子字符串 = "0111" 且 右子字符串 = "01"，得分 = 1 + 1 = 2 
左子字符串 = "01110" 且 右子字符串 = "1"，得分 = 2 + 1 = 3

```

**示例 2：** 

```
输入：s = "00111"
输出：5
解释：当 左子字符串 = "00" 且 右子字符串 = "111" 时，我们得到最大得分 = 2 + 3 = 5

```

**示例 3：** 

```
输入：s = "1111"
输出：3

```



**提示：** 

-  *2 <= s.length <= 500*  
- 字符串  *s*  仅由字符  *'0'*  和  *'1'*  组成。




# 算法思路

# 测试用例
```
1422. Maximum Score After Splitting a String 1422. 分割字符串的最大得分 Easy
```

[enTitle]: https://leetcode.com/problems/maximum-score-after-splitting-a-string/
[cnTitle]: https://leetcode-cn.com/problems/maximum-score-after-splitting-a-string/
