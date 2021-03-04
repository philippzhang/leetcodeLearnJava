# [1508. Range Sum of Sorted Subarray Sums][enTitle]

**Medium**

Given the array  *nums*  consisting of  *n*  positive integers. You computed the sum of all non-empty continous subarrays from the array and then sort them in non-decreasing order, creating a new array of  *n * (n + 1) / 2*  numbers.

 *Return the sum of the numbers from index*  *left*  *to index*  *right*  (**indexed from 1** ) *, inclusive, in the new array.* Since the answer can be a huge number return it modulo 10^9 + 7.



**Example 1:** 

```
Input: nums = [1,2,3,4], n = 4, left = 1, right = 5
Output: 13 
Explanation: All subarray sums are 1, 3, 6, 10, 2, 5, 9, 3, 7, 4. After sorting them in non-decreasing order we have the new array [1, 2, 3, 3, 4, 5, 6, 7, 9, 10]. The sum of the numbers from index le = 1 to ri = 5 is 1 + 2 + 3 + 3 + 4 = 13. 

```

**Example 2:** 

```
Input: nums = [1,2,3,4], n = 4, left = 3, right = 4
Output: 6
Explanation: The given array is the same as example 1. We have the new array [1, 2, 3, 3, 4, 5, 6, 7, 9, 10]. The sum of the numbers from index le = 3 to ri = 4 is 3 + 3 = 6.

```

**Example 3:** 

```
Input: nums = [1,2,3,4], n = 4, left = 1, right = 10
Output: 50

```



**Constraints:** 

-  *1 <= nums.length <= 10^3*  
-  *nums.length == n*  
-  *1 <= nums[i] <= 100*  
-  *1 <= left <= right <= n * (n + 1) / 2* 


# [1508. 子数组和排序后的区间和][cnTitle]

**中等**

给你一个数组  *nums*  ，它包含  *n*  个正整数。你需要计算所有非空连续子数组的和，并将它们按升序排序，得到一个新的包含  *n * (n + 1) / 2*  个数字的数组。

请你返回在新数组中下标为 *left*  到  *right*  **（下标从 1 开始）** 的所有数字和（包括左右端点）。由于答案可能很大，请你将它对 10^9 + 7 取模后返回。



**示例 1：** 

```
输入：nums = [1,2,3,4], n = 4, left = 1, right = 5
输出：13 
解释：所有的子数组和为 1, 3, 6, 10, 2, 5, 9, 3, 7, 4 。将它们升序排序后，我们得到新的数组 [1, 2, 3, 3, 4, 5, 6, 7, 9, 10] 。下标从 le = 1 到 ri = 5 的和为 1 + 2 + 3 + 3 + 4 = 13 。

```

**示例 2：** 

```
输入：nums = [1,2,3,4], n = 4, left = 3, right = 4
输出：6
解释：给定数组与示例 1 一样，所以新数组为 [1, 2, 3, 3, 4, 5, 6, 7, 9, 10] 。下标从 le = 3 到 ri = 4 的和为 3 + 3 = 6 。

```

**示例 3：** 

```
输入：nums = [1,2,3,4], n = 4, left = 1, right = 10
输出：50

```



**提示：** 

-  *1 <= nums.length <= 10^3*  
-  *nums.length == n*  
-  *1 <= nums[i] <= 100*  
-  *1 <= left <= right <= n * (n + 1) / 2* 




# 算法思路

# 测试用例
```
1508. Range Sum of Sorted Subarray Sums 1508. 子数组和排序后的区间和 Medium
```

[enTitle]: https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/
[cnTitle]: https://leetcode-cn.com/problems/range-sum-of-sorted-subarray-sums/
