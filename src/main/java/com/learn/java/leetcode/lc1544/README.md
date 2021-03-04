# [1544. Make The String Great][enTitle]

**Easy**

Given a string  *s*  of lower and upper case English letters.

A good string is a string which doesn't have **two adjacent characters**   *s[i]*  and  *s[i + 1]*  where:

-  *0 <= i <= s.length - 2*  
-  *s[i]*  is a lower-case letter and  *s[i + 1]*  is the same letter but in upper-case or **vice-versa** .

To make the string good, you can choose **two adjacent**  characters that make the string bad and remove them. You can keep doing this until the string becomes good.

Return  *the string*  after making it good. The answer is guaranteed to be unique under the given constraints.

**Notice**  that an empty string is also good.



**Example 1:** 

```
Input: s = "leEeetcode"
Output: "leetcode"
Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".

```

**Example 2:** 

```
Input: s = "abBAcC"
Output: ""
Explanation: We have many possible scenarios, and all lead to the same answer. For example:
"abBAcC" --> "aAcC" --> "cC" --> ""
"abBAcC" --> "abBA" --> "aA" --> ""

```

**Example 3:** 

```
Input: s = "s"
Output: "s"

```



**Constraints:** 

-  *1 <= s.length <= 100*  
-  *s*  contains only lower and upper case English letters.


# [1544. 整理字符串][cnTitle]

**简单**

给你一个由大小写英文字母组成的字符串  *s*  。

一个整理好的字符串中，两个相邻字符  *s[i]*  和  *s[i+1]* ，其中  *0<= i <= s.length-2*  ，要满足如下条件:

- 若  *s[i]*  是小写字符，则  *s[i+1]*  不可以是相同的大写字符。 
- 若  *s[i]*  是大写字符，则  *s[i+1]*  不可以是相同的小写字符。

请你将字符串整理好，每次你都可以从字符串中选出满足上述条件的 **两个相邻**  字符并删除，直到字符串整理好为止。

请返回整理好的 **字符串**  。题目保证在给出的约束条件下，测试样例对应的答案是唯一的。

**注意：** 空字符串也属于整理好的字符串，尽管其中没有任何字符。



**示例 1：** 

```
输入：s = "leEeetcode"
输出："leetcode"
解释：无论你第一次选的是 i = 1 还是 i = 2，都会使 "leEeetcode" 缩减为 "leetcode" 。

```

**示例 2：** 

```
输入：s = "abBAcC"
输出：""
解释：存在多种不同情况，但所有的情况都会导致相同的结果。例如：
"abBAcC" --> "aAcC" --> "cC" --> ""
"abBAcC" --> "abBA" --> "aA" --> ""

```

**示例 3：** 

```
输入：s = "s"
输出："s"

```



**提示：** 

-  *1 <= s.length <= 100*  
-  *s*  只包含小写和大写英文字母




# 算法思路

# 测试用例
```
1544. Make The String Great 1544. 整理字符串 Easy
```

[enTitle]: https://leetcode.com/problems/make-the-string-great/
[cnTitle]: https://leetcode-cn.com/problems/make-the-string-great/
