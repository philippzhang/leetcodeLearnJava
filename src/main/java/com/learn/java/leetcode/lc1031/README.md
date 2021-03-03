# [1031. Maximum Sum of Two Non-Overlapping Subarrays][enTitle]

**Medium**

Given an array  *A*  of non-negative integers, return the maximum sum of elements in two non-overlapping (contiguous) subarrays, which have lengths  *L*  and  *M* . (For clarification, the  *L* -length subarray could occur before or after the  *M* -length subarray.)

Formally, return the largest  *V*  for which  *V = (A[i] + A[i+1] + ... + A[i+L-1]) + (A[j] + A[j+1] + ... + A[j+M-1])*  and either:

-  *0 <= i < i + L - 1 < j < j + M - 1 < A.length* , **or**  
-  *0 <= j < j + M - 1 < i < i + L - 1 < A.length* .






**Example 1:** 

```
Input:A = [0,6,5,2,2,5,1,9,4], L = 1, M = 2
Output: 20
Explanation: One choice of subarrays is [9] with length 1, and [6,5] with length 2.
```


**Example 2:** 

```
Input:A = [3,8,1,3,2,1,8,9,0], L = 3, M = 2
Output: 29
Explanation: One choice of subarrays is [3,8,1] with length 3, and [8,9] with length 2.
```


**Example 3:** 

```
Input:A = [2,1,5,6,0,9,5,0,3,8], L = 4, M = 3
Output: 31
Explanation: One choice of subarrays is [5,6,0,9] with length 4, and [3,8] with length 3.
```



**Note:** 

1.  *L >= 1*  
2.  *M >= 1*  
3.  *L + M <= A.length <= 1000*  
4.  *0 <= A[i] <= 1000* 








# [1031. 两个非重叠子数组的最大和][cnTitle]

**中等**

给出非负整数数组  *A*  ，返回两个非重叠（连续）子数组中元素的最大和，子数组的长度分别为  *L*  和  *M* 。（这里需要澄清的是，长为 L 的子数组可以出现在长为 M 的子数组之前或之后。）

从形式上看，返回最大的  *V* ，而  *V = (A[i] + A[i+1] + ... + A[i+L-1]) + (A[j] + A[j+1] + ... + A[j+M-1])*  并满足下列条件之一：



-  *0 <= i < i + L - 1 < j < j + M - 1 < A.length* , **或**  
-  *0 <= j < j + M - 1 < i < i + L - 1 < A.length* .



**示例 1：** 

```
输入：A = [0,6,5,2,2,5,1,9,4], L = 1, M = 2
输出：20
解释：子数组的一种选择中，[9] 长度为 1，[6,5] 长度为 2。

```

**示例 2：** 

```
输入：A = [3,8,1,3,2,1,8,9,0], L = 3, M = 2
输出：29
解释：子数组的一种选择中，[3,8,1] 长度为 3，[8,9] 长度为 2。

```

**示例 3：** 

```
输入：A = [2,1,5,6,0,9,5,0,3,8], L = 4, M = 3
输出：31
解释：子数组的一种选择中，[5,6,0,9] 长度为 4，[0,3,8] 长度为 3。
```



**提示：** 

1.  *L >= 1*  
2.  *M >= 1*  
3.  *L + M <= A.length <= 1000*  
4.  *0 <= A[i] <= 1000* 




# 算法思路

# 测试用例
```
1031. Maximum Sum of Two Non-Overlapping Subarrays 1031. 两个非重叠子数组的最大和 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-sum-of-two-non-overlapping-subarrays/
[cnTitle]: https://leetcode-cn.com/problems/maximum-sum-of-two-non-overlapping-subarrays/
