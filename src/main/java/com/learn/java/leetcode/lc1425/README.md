# [1425. Constrained Subsequence Sum][enTitle]

**Hard**

Given an integer array  *nums*  and an integer  *k* , return the maximum sum of a **non-empty**  subsequence of that array such that for every two **consecutive**  integers in the subsequence,  *nums[i]*  and  *nums[j]* , where  *i < j* , the condition  *j - i <= k*  is satisfied.

A  *subsequence*  of an array is obtained by deleting some number of elements (can be zero) from the array, leaving the remaining elements in their original order.



**Example 1:** 

```
Input: nums = [10,2,-10,5,20], k = 2
Output: 37
Explanation: The subsequence is [10, 2, 5, 20].

```

**Example 2:** 

```
Input: nums = [-1,-2,-3], k = 1
Output: -1
Explanation: The subsequence must be non-empty, so we choose the largest number.

```

**Example 3:** 

```
Input: nums = [10,-2,-10,-5,20], k = 2
Output: 23
Explanation: The subsequence is [10, -2, -5, 20].

```



**Constraints:** 

-  *1 <= k <= nums.length <= 105*  
-  *-104 <= nums[i] <= 104* 


# [1425. 带限制的子序列和][cnTitle]

**困难**

给你一个整数数组  *nums*  和一个整数  *k*  ，请你返回 **非空**  子序列元素和的最大值，子序列需要满足：子序列中每两个 **相邻**  的整数  *nums[i]*  和  *nums[j]*  ，它们在原数组中的下标  *i*  和  *j*  满足  *i < j*  且  *j - i <= k*  。

数组的子序列定义为：将数组中的若干个数字删除（可以删除 0 个数字），剩下的数字按照原本的顺序排布。



**示例 1：** 

```
输入：nums = [10,2,-10,5,20], k = 2
输出：37
解释：子序列为 [10, 2, 5, 20] 。

```

**示例 2：** 

```
输入：nums = [-1,-2,-3], k = 1
输出：-1
解释：子序列必须是非空的，所以我们选择最大的数字。

```

**示例 3：** 

```
输入：nums = [10,-2,-10,-5,20], k = 2
输出：23
解释：子序列为 [10, -2, -5, 20] 。

```



**提示：** 

-  *1 <= k <= nums.length <= 10^5*  
-  *-10^4 <= nums[i] <= 10^4* 




# 算法思路

# 测试用例
```
1425. Constrained Subsequence Sum 1425. 带限制的子序列和 Hard
```

[enTitle]: https://leetcode.com/problems/constrained-subsequence-sum/
[cnTitle]: https://leetcode-cn.com/problems/constrained-subsequence-sum/
