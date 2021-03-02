# [873. Length of Longest Fibonacci Subsequence][enTitle]

**Medium**

A sequence  *X1, X2, ..., Xn*  is  *Fibonacci-like*  if:

-  *n >= 3*  
-  *Xi + Xi+1 = Xi+2*  for all  *i + 2 <= n* 

Given a strictly increasing array  *arr*  of positive integers forming a sequence, return the **length**  of the longest Fibonacci-like subsequence of  *arr* . If one does not exist, return  *0* .

 *A subsequence is derived from another sequence arr by deleting any number of elements (including none) from arr, without changing the order of the remaining elements. For example, [3, 5, 8] is a subsequence of [3, 4, 5, 6, 7, 8].* 



**Example 1:** 

```
Input: arr = [1,2,3,4,5,6,7,8]
Output: 5
Explanation: The longest subsequence that is fibonacci-like: [1,2,3,5,8].
```

**Example 2:** 

```
Input: arr = [1,3,7,11,12,14,18]
Output: 3
Explanation:The longest subsequence that is fibonacci-like: [1,11,12], [3,11,14] or [7,11,18].
```



**Constraints:** 

-  *3 <= arr.length <= 1000*  
-  *1 <= arr[i] < arr[i + 1] <= 109* 


# [873. 最长的斐波那契子序列的长度][cnTitle]

**中等**

如果序列  *X_1, X_2, ..., X_n*  满足下列条件，就说它是  *斐波那契式* 的：

-  *n >= 3*  
- 对于所有  *i + 2 <= n* ，都有  *X_i + X_{i+1} = X_{i+2}* 

给定一个**严格递增** 的正整数数组形成序列，找到  *A*  中最长的斐波那契式的子序列的长度。如果一个不存在，返回 0 。

 *（回想一下，子序列是从原序列 A 中派生出来的，它从 A 中删掉任意数量的元素（也可以不删），而不改变其余元素的顺序。例如， [3, 5, 8] 是 [3, 4, 5, 6, 7, 8] 的一个子序列）* 





**示例 1：** 

```
输入:[1,2,3,4,5,6,7,8]
输出:5
解释:最长的斐波那契式子序列为：[1,2,3,5,8] 。

```

**示例 2：** 

```
输入:[1,3,7,11,12,14,18]
输出:3
解释:
最长的斐波那契式子序列有：
[1,11,12]，[3,11,14] 以及 [7,11,18] 。

```



**提示：** 

-  *3 <= A.length <= 1000*  
-  *1 <= A[0] < A[1] < ... < A[A.length - 1] <= 10^9*  
-  *（对于以 Java，C，C++，以及 C# 的提交，时间限制被减少了 50%）* 




# 算法思路

# 测试用例
```
873. Length of Longest Fibonacci Subsequence 873. 最长的斐波那契子序列的长度 Medium
```

[enTitle]: https://leetcode.com/problems/length-of-longest-fibonacci-subsequence/
[cnTitle]: https://leetcode-cn.com/problems/length-of-longest-fibonacci-subsequence/
