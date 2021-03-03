# [923. 3Sum With Multiplicity][enTitle]

**Medium**

Given an integer array  *arr* , and an integer  *target* , return the number of tuples  *i, j, k*  such that  *i < j < k*  and  *arr[i] + arr[j] + arr[k] == target* .

As the answer can be very large, return it **modulo**   *109 + 7* .



**Example 1:** 

```
Input: arr = [1,1,2,2,3,3,4,4,5,5], target = 8
Output: 20
Explanation:
Enumerating by the values (arr[i], arr[j], arr[k]):
(1, 2, 5) occurs 8 times;
(1, 3, 4) occurs 8 times;
(2, 2, 4) occurs 2 times;
(2, 3, 3) occurs 2 times.

```

**Example 2:** 

```
Input: arr = [1,1,2,2,2,2], target = 5
Output: 12
Explanation:
arr[i] = 1, arr[j] = arr[k] = 2 occurs 12 times:
We choose one 1 from [1,1] in 2 ways,
and two 2s from [2,2,2,2] in 6 ways.

```



**Constraints:** 

-  *3 <= arr.length <= 3000*  
-  *0 <= arr[i] <= 100*  
-  *0 <= target <= 300* 


# [923. 三数之和的多种可能][cnTitle]

**中等**

给定一个整数数组  *A* ，以及一个整数  *target*  作为目标值，返回满足  *i < j < k*  且  *A[i] + A[j] + A[k] == target*  的元组  *i, j, k*  的数量。

由于结果会非常大，请返回  *结果除以 10^9 + 7 的余数* 。



**示例 1：** 

```
输入：A = [1,1,2,2,3,3,4,4,5,5], target = 8
输出：20
解释：
按值枚举（A[i]，A[j]，A[k]）：
(1, 2, 5) 出现 8 次；
(1, 3, 4) 出现 8 次；
(2, 2, 4) 出现 2 次；
(2, 3, 3) 出现 2 次。

```

**示例 2：** 

```
输入：A = [1,1,2,2,2,2], target = 5
输出：12
解释：
A[i] = 1，A[j] = A[k] = 2 出现 12 次：
我们从 [1,1] 中选择一个 1，有 2 种情况，
从 [2,2,2,2] 中选出两个 2，有 6 种情况。

```



**提示：** 

1.  *3 <= A.length <= 3000*  
2.  *0 <= A[i] <= 100*  
3.  *0 <= target <= 300* 




# 算法思路

# 测试用例
```
923. 3Sum With Multiplicity 923. 三数之和的多种可能 Medium
```

[enTitle]: https://leetcode.com/problems/3sum-with-multiplicity/
[cnTitle]: https://leetcode-cn.com/problems/3sum-with-multiplicity/
