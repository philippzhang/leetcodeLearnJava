# [466. Count The Repetitions][enTitle]

**Hard**

Define  *S = [s,n]*  as the string S which consists of n connected strings s. For example,  *["abc", 3]*  ="abcabcabc".

On the other hand, we define that string s1 can be obtained from string s2 if we can remove some characters from s2 such that it becomes s1. For example, “abc” can be obtained from “abdbec” based on our definition, but it can not be obtained from “acbbe”.

You are given two non-empty strings s1 and s2 (each at most 100 characters long) and two integers 0 ≤ n1 ≤ 10<sup>6</sup> and 1 ≤ n2 ≤ 10<sup>6</sup>. Now consider the strings S1 and S2, where  *S1=[s1,n1]*  and  *S2=[s2,n2]* . Find the maximum integer M such that  *[S2,M]*  can be obtained from  *S1* .

Example:

```
Input:
s1="acb", n1=4
s2="ab", n2=2

Return:
2

```




# [466. 统计重复个数][cnTitle]

**困难**

由 n 个连接的字符串 s 组成字符串 S，记作  *S = [s,n]* 。例如， *["abc",3]* =“abcabcabc”。

如果我们可以从 s2<sub> </sub>中删除某些字符使其变为 s1，则称字符串 s1<sub> </sub>可以从字符串 s2 获得。例如，根据定义，"abc" 可以从 “abdbec” 获得，但不能从 “acbbe” 获得。

现在给你两个非空字符串 s1 和 s2（每个最多 100 个字符长）和两个整数 0 ≤ n1 ≤ 10<sup>6 </sup>和 1 ≤ n2 ≤ 10<sup>6</sup>。现在考虑字符串 S1 和 S2，其中  *S1=[s1,n1]*  、 *S2=[s2,n2]*  。

请你找出一个可以满足使 *[S2,M]*  从  *S1*  获得的最大整数 M 。



**示例：** 

```
输入：
s1 ="acb",n1 = 4
s2 ="ab",n2 = 2

返回：
2

```




# 算法思路

# 测试用例
```
466. Count The Repetitions 466. 统计重复个数 Hard
```

[enTitle]: https://leetcode.com/problems/count-the-repetitions/
[cnTitle]: https://leetcode-cn.com/problems/count-the-repetitions/
