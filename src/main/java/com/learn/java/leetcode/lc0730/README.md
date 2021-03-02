# [730. Count Different Palindromic Subsequences][enTitle]

**Hard**

Given a string S, find the number of different non-empty palindromic subsequences in S, and return that number modulo 10^9 + 7.

A subsequence of a string S is obtained by deleting 0 or more characters from S.

A sequence is palindromic if it is equal to the sequence reversed.

Two sequences  *A_1, A_2, ...*  and  *B_1, B_2, ...*  are different if there is some  *i*  for which  *A_i != B_i* .

Example 1:

```
Input: 
S = 'bccb'
Output: 6
Explanation: 
The 6 different non-empty palindromic subsequences are 'b', 'c', 'bb', 'cc', 'bcb', 'bccb'.
Note that 'bcb' is counted only once, even though it occurs twice.

```



Example 2:

```
Input: 
S = 'abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba'
Output: 104860361
Explanation: 
There are 3104860382 different non-empty palindromic subsequences, which is 104860361 modulo 10^9 + 7.

```



Note:






# [730. 统计不同回文子序列][cnTitle]

**困难**

给定一个字符串 S，找出 S 中不同的非空回文子序列个数，并**返回该数字与 10^9 + 7 的模。** 

通过从 S 中删除 0 个或多个字符来获得子序列。

如果一个字符序列与它反转后的字符序列一致，那么它是回文字符序列。

如果对于某个  *i* ， *A_i != B_i* ，那么  *A_1, A_2, ...*  和  *B_1, B_2, ...*  这两个字符序列是不同的。



**示例 1：** 

```
输入：
S = 'bccb'
输出：6
解释：
6 个不同的非空回文子字符序列分别为：'b', 'c', 'bb', 'cc', 'bcb', 'bccb'。
注意：'bcb' 虽然出现两次但仅计数一次。

```

**示例 2：** 

```
输入：
S = 'abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba'
输出：104860361
解释：
共有 3104860382 个不同的非空回文子序列，对 10^9 + 7 取模为 104860361。

```



**提示：** 

- 字符串  *S*  的长度将在 *[1, 1000]* 范围内。 
- 每个字符  *S[i]*  将会是集合  *{'a', 'b', 'c', 'd'}*  中的某一个。






# 算法思路

# 测试用例
```
730. Count Different Palindromic Subsequences 730. 统计不同回文子序列 Hard
```

[enTitle]: https://leetcode.com/problems/count-different-palindromic-subsequences/
[cnTitle]: https://leetcode-cn.com/problems/count-different-palindromic-subsequences/
