# [1220. Count Vowels Permutation][enTitle]

**Hard**

Given an integer  *n* , your task is to count how many strings of length  *n*  can be formed under the following rules:

- Each character is a lower case vowel ( *'a'* ,  *'e'* ,  *'i'* ,  *'o'* ,  *'u'* ) 
- Each vowel  *'a'*  may only be followed by an  *'e'* . 
- Each vowel  *'e'*  may only be followed by an  *'a'*  or an  *'i'* . 
- Each vowel  *'i'*  **may not**  be followed by another  *'i'* . 
- Each vowel  *'o'*  may only be followed by an  *'i'*  or a  *'u'* . 
- Each vowel  *'u'*  may only be followed by an  *'a'.* 

Since the answer may be too large, return it modulo  *10^9 + 7.* 



**Example 1:** 

```
Input: n = 1
Output: 5
Explanation: All possible strings are: "a", "e", "i" , "o" and "u".

```

**Example 2:** 

```
Input: n = 2
Output: 10
Explanation: All possible strings are: "ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" and "ua".

```

**Example 3:** 

```
Input: n = 5
Output: 68
```



**Constraints:** 

-  *1 <= n <= 2 * 10^4* 


# [1220. 统计元音字母序列的数目][cnTitle]

**困难**

给你一个整数  *n* ，请你帮忙统计一下我们可以按下述规则形成多少个长度为  *n*  的字符串：

- 字符串中的每个字符都应当是小写元音字母（ *'a'* ,  *'e'* ,  *'i'* ,  *'o'* ,  *'u'* ） 
- 每个元音  *'a'*  后面都只能跟着  *'e'*  
- 每个元音  *'e'*  后面只能跟着  *'a'*  或者是  *'i'*  
- 每个元音  *'i'*  后面 **不能**  再跟着另一个  *'i'*  
- 每个元音  *'o'*  后面只能跟着  *'i'*  或者是  *'u'*  
- 每个元音  *'u'*  后面只能跟着  *'a'* 

由于答案可能会很大，所以请你返回 模  *10^9 + 7*  之后的结果。



**示例 1：** 

```
输入：n = 1
输出：5
解释：所有可能的字符串分别是："a", "e", "i" , "o" 和 "u"。

```

**示例 2：** 

```
输入：n = 2
输出：10
解释：所有可能的字符串分别是："ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" 和 "ua"。

```

**示例 3：** 

```
输入：n = 5
输出：68
```



**提示：** 

-  *1 <= n <= 2 * 10^4* 




# 算法思路

# 测试用例
```
1220. Count Vowels Permutation 1220. 统计元音字母序列的数目 Hard
```

[enTitle]: https://leetcode.com/problems/count-vowels-permutation/
[cnTitle]: https://leetcode-cn.com/problems/count-vowels-permutation/
