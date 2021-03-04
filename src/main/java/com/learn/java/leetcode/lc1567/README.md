# [1567. Maximum Length of Subarray With Positive Product][enTitle]

**Medium**

Given an array of integers  *nums* , find the maximum length of a subarray where the product of all its elements is positive.

A subarray of an array is a consecutive sequence of zero or more values taken out of that array.

Return  *the maximum length of a subarray with positive product* .



**Example 1:** 

```
Input: nums = [1,-2,-3,4]
Output: 4
Explanation:The array nums already has a positive product of 24.

```

**Example 2:** 

```
Input: nums = [0,1,-2,-3,-4]
Output: 3
Explanation:The longest subarray with positive product is [1,-2,-3] which has a product of 6.
Notice that we cannot include 0 in the subarray since that'll make the product 0 which is not positive.
```

**Example 3:** 

```
Input: nums = [-1,-2,-3,0,1]
Output: 2
Explanation:The longest subarray with positive product is [-1,-2] or [-2,-3].

```

**Example 4:** 

```
Input: nums = [-1,2]
Output: 1

```

**Example 5:** 

```
Input: nums = [1,2,3,5,-6,4,0,10]
Output: 4

```



**Constraints:** 

-  *1 <= nums.length <= 10^5*  
-  *-10^9 <= nums[i] <= 10^9* 


# [1567. 乘积为正数的最长子数组长度][cnTitle]

**中等**

给你一个整数数组  *nums*  ，请你求出乘积为正数的最长子数组的长度。

一个数组的子数组是由原数组中零个或者更多个连续数字组成的数组。

请你返回乘积为正数的最长子数组长度。



**示例 1：** 

```
输入：nums = [1,-2,-3,4]
输出：4
解释：数组本身乘积就是正数，值为 24 。

```

**示例 2：** 

```
输入：nums = [0,1,-2,-3,-4]
输出：3
解释：最长乘积为正数的子数组为 [1,-2,-3] ，乘积为 6 。
注意，我们不能把 0 也包括到子数组中，因为这样乘积为 0 ，不是正数。
```

**示例 3：** 

```
输入：nums = [-1,-2,-3,0,1]
输出：2
解释：乘积为正数的最长子数组是 [-1,-2] 或者 [-2,-3] 。

```

**示例 4：** 

```
输入：nums = [-1,2]
输出：1

```

**示例 5：** 

```
输入：nums = [1,2,3,5,-6,4,0,10]
输出：4

```



**提示：** 

-  *1 <= nums.length <= 10^5*  
-  *-10^9 <= nums[i] <= 10^9* 




# 算法思路

# 测试用例
```
1567. Maximum Length of Subarray With Positive Product 1567. 乘积为正数的最长子数组长度 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/
[cnTitle]: https://leetcode-cn.com/problems/maximum-length-of-subarray-with-positive-product/
