# [1191. K-Concatenation Maximum Sum][enTitle]

**Medium**

Given an integer array  *arr*  and an integer  *k* , modify the array by repeating it  *k*  times.

For example, if  *arr = [1, 2]*  and  *k = 3* then the modified array will be  *[1, 2, 1, 2, 1, 2]* .

Return the maximum sub-array sum in the modified array. Note that the length of the sub-array can be  *0*  and its sum in that case is  *0* .

As the answer can be very large, return the answer **modulo**   *109 + 7* .



**Example 1:** 

```
Input: arr = [1,2], k = 3
Output: 9

```

**Example 2:** 

```
Input: arr = [1,-2,1], k = 5
Output: 2

```

**Example 3:** 

```
Input: arr = [-1,-2], k = 7
Output: 0

```



**Constraints:** 

-  *1 <= arr.length <= 105*  
-  *1 <= k <= 105*  
-  *-104 <= arr[i] <= 104* 


# [1191. K 次串联后最大子数组之和][cnTitle]

**中等**

给你一个整数数组  *arr*  和一个整数  *k* 。

首先，我们要对该数组进行修改，即把原数组  *arr*  重复  *k*  次。


然后，请你返回修改后的数组中的最大的子数组之和。

注意，子数组长度可以是  *0* ，在这种情况下它的总和也是  *0* 。

由于 **结果可能会很大** ，所以需要 **模（mod）**   *10^9 + 7*  后再返回。



**示例 1：** 

```
输入：arr = [1,2], k = 3
输出：9

```

**示例 2：** 

```
输入：arr = [1,-2,1], k = 5
输出：2

```

**示例 3：** 

```
输入：arr = [-1,-2], k = 7
输出：0

```



**提示：** 

-  *1 <= arr.length <= 10^5*  
-  *1 <= k <= 10^5*  
-  *-10^4 <= arr[i] <= 10^4* 




# 算法思路

# 测试用例
```
1191. K-Concatenation Maximum Sum 1191. K 次串联后最大子数组之和 Medium
```

[enTitle]: https://leetcode.com/problems/k-concatenation-maximum-sum/
[cnTitle]: https://leetcode-cn.com/problems/k-concatenation-maximum-sum/
