# [1551. Minimum Operations to Make Array Equal][enTitle]

**Medium**

You have an array  *arr*  of length  *n*  where  *arr[i] = (2 * i) + 1*  for all valid values of  *i*  (i.e.  *0 <= i < n* ).

In one operation, you can select two indices  *x*  and  *y*  where  *0 <= x, y < n*  and subtract  *1*  from  *arr[x]*  and add  *1*  to  *arr[y]*  (i.e. perform  *arr[x] -=1* and  *arr[y] += 1* ). The goal is to make all the elements of the array **equal** . It is **guaranteed**  that all the elements of the array can be made equal using some operations.

Given an integer  *n* , the length of the array. Return  *the minimum number of operations*  needed to make all the elements of arr equal.



**Example 1:** 

```
Input: n = 3
Output: 2
Explanation: arr = [1, 3, 5]
First operation choose x = 2 and y = 0, this leads arr to be [2, 3, 4]
In the second operation choose x = 2 and y = 0 again, thus arr = [3, 3, 3].

```

**Example 2:** 

```
Input: n = 6
Output: 9

```



**Constraints:** 

-  *1 <= n <= 10^4* 


# [1551. 使数组中所有元素相等的最小操作数][cnTitle]

**中等**

存在一个长度为  *n*  的数组  *arr*  ，其中  *arr[i] = (2 * i) + 1*  （  *0 <= i < n*  ）。

一次操作中，你可以选出两个下标，记作  *x*  和  *y*  （  *0 <= x, y < n*  ）并使  *arr[x]*  减去  *1*  、 *arr[y]*  加上  *1*  （即  *arr[x] -=1* 且  *arr[y] += 1*  ）。最终的目标是使数组中的所有元素都 **相等**  。题目测试用例将会 **保证**  ：在执行若干步操作后，数组中的所有元素最终可以全部相等。

给你一个整数  *n* ，即数组的长度。请你返回使数组  *arr*  中所有元素相等所需的 **最小操作数**  。



**示例 1：** 

```
输入：n = 3
输出：2
解释：arr = [1, 3, 5]
第一次操作选出 x = 2 和 y = 0，使数组变为 [2, 3, 4]
第二次操作继续选出 x = 2 和 y = 0，数组将会变成 [3, 3, 3]

```

**示例 2：** 

```
输入：n = 6
输出：9

```



**提示：** 

-  *1 <= n <= 10^4* 




# 算法思路

# 测试用例
```
1551. Minimum Operations to Make Array Equal 1551. 使数组中所有元素相等的最小操作数 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-operations-to-make-array-equal/
[cnTitle]: https://leetcode-cn.com/problems/minimum-operations-to-make-array-equal/
