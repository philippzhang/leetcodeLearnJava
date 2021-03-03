# [903. Valid Permutations for DI Sequence][enTitle]

**Hard**

We are given  *S* , a length  *n*  string of characters from the set  *{'D', 'I'}* . (These letters stand for "decreasing" and "increasing".)

A  *valid permutation*  is a permutation  *P[0], P[1], ..., P[n]*  of integers  *{0, 1, ..., n}* , such that for all  *i* :

- If  *S[i] == 'D'* , then  *P[i] > P[i+1]* , and; 
- If  *S[i] == 'I'* , then  *P[i] < P[i+1]* .

How many valid permutations are there? Since the answer may be large, **return your answer modulo 10^9 + 7** .



**Example 1:** 

```
Input:"DID"
Output: 5
Explanation: 
The 5 valid permutations of (0, 1, 2, 3) are:
(1, 0, 3, 2)
(2, 0, 3, 1)
(2, 1, 3, 0)
(3, 0, 2, 1)
(3, 1, 2, 0)
```



**Note:** 

1.  *1 <= S.length <= 200*  
2.  *S*  consists only of characters from the set  *{'D', 'I'}* .







# [903. DI 序列的有效排列][cnTitle]

**困难**

我们给出  *S* ，一个源于  *{'D', 'I'}*  的长度为  *n*  的字符串 。（这些字母代表 “减少” 和 “增加”。）  *有效排列*  是对整数  *{0, 1, ..., n}*  的一个排列  *P[0], P[1], ..., P[n]* ，使得对所有的  *i* ：

- 如果  *S[i] == 'D'* ，那么  *P[i] > P[i+1]* ，以及； 
- 如果  *S[i] == 'I'* ，那么  *P[i] < P[i+1]* 。

有多少个有效排列？因为答案可能很大，所以请**返回你的答案模** **10^9 + 7** .



**示例：** 

```
输入："DID"
输出：5
解释：
(0, 1, 2, 3) 的五个有效排列是：
(1, 0, 3, 2)
(2, 0, 3, 1)
(2, 1, 3, 0)
(3, 0, 2, 1)
(3, 1, 2, 0)

```



**提示：** 

1.  *1 <= S.length <= 200*  
2.  *S*  仅由集合  *{'D', 'I'}*  中的字符组成。






# 算法思路

# 测试用例
```
903. Valid Permutations for DI Sequence 903. DI 序列的有效排列 Hard
```

[enTitle]: https://leetcode.com/problems/valid-permutations-for-di-sequence/
[cnTitle]: https://leetcode-cn.com/problems/valid-permutations-for-di-sequence/
