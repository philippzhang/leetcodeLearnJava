# [1663. Smallest String With A Given Numeric Value][enTitle]

**Medium**

The **numeric value**  of a **lowercase character**  is defined as its position  *(1-indexed)*  in the alphabet, so the numeric value of  *a*  is  *1* , the numeric value of  *b*  is  *2* , the numeric value of  *c*  is  *3* , and so on.

The **numeric value**  of a **string**  consisting of lowercase characters is defined as the sum of its characters' numeric values. For example, the numeric value of the string  *"abe"*  is equal to  *1 + 2 + 5 = 8* .

You are given two integers  *n*  and  *k* . Return <em>the <strong>lexicographically smallest string</strong> with <strong>length</strong> equal to  *n*  and <strong>numeric value</strong> equal to  *k* .</em>

Note that a string  *x*  is lexicographically smaller than string  *y*  if  *x*  comes before  *y*  in dictionary order, that is, either  *x*  is a prefix of  *y* , or if  *i*  is the first position such that  *x[i] != y[i]* , then  *x[i]*  comes before  *y[i]*  in alphabetic order.



**Example 1:** 

```
Input: n = 3, k = 27
Output: "aay"
Explanation: The numeric value of the string is 1 + 1 + 25 = 27, and it is the smallest string with such a value and length equal to 3.

```

**Example 2:** 

```
Input: n = 5, k = 73
Output: "aaszz"

```



**Constraints:** 

-  *1 <= n <= 105*  
-  *n <= k <= 26 * n* 


# [1663. 具有给定数值的最小字符串][cnTitle]

**中等**

**小写字符** 的 **数值**  是它在字母表中的位置（从  *1*  开始），因此  *a*  的数值为  *1*  ， *b*  的数值为  *2*  ， *c*  的数值为  *3*  ，以此类推。

字符串由若干小写字符组成，**字符串的数值**  为各字符的数值之和。例如，字符串  *"abe"*  的数值等于  *1 + 2 + 5 = 8*  。

给你两个整数  *n*  和  *k*  。返回 **长度**  等于  *n*  且 **数值**  等于  *k*  的 **字典序最小**  的字符串。

注意，如果字符串  *x*  在字典排序中位于  *y*  之前，就认为  *x*  字典序比  *y*  小，有以下两种情况：

-  *x*  是  *y*  的一个前缀； 
- 如果  *i*  是  *x[i] != y[i]*  的第一个位置，且  *x[i]*  在字母表中的位置比  *y[i]*  靠前。



**示例 1：** 

```
输入：n = 3, k = 27
输出："aay"
解释：字符串的数值为 1 + 1 + 25 = 27，它是数值满足要求且长度等于 3 字典序最小的字符串。
```

**示例 2：** 

```
输入：n = 5, k = 73
输出："aaszz"

```



**提示：** 

-  *1 <= n <= 105*  
-  *n <= k <= 26 * n* 




# 算法思路

# 测试用例
```
1663. Smallest String With A Given Numeric Value 1663. 具有给定数值的最小字符串 Medium
```

[enTitle]: https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/
[cnTitle]: https://leetcode-cn.com/problems/smallest-string-with-a-given-numeric-value/
