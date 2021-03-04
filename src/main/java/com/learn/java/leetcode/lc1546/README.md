# [1546. Maximum Number of Non-Overlapping Subarrays With Sum Equals Target][enTitle]

**Medium**

Given an array  *nums*  and an integer  *target* .

Return the maximum number of **non-empty**  **non-overlapping**  subarrays such that the sum of values in each subarray is equal to  *target* .



**Example 1:** 

```
Input: nums = [1,1,1,1,1], target = 2
Output: 2
Explanation:There are 2 non-overlapping subarrays [1,1,1,1,1] with sum equals to target(2).

```

**Example 2:** 

```
Input: nums = [-1,3,5,1,4,2,-9], target = 6
Output: 2
Explanation:There are 3 subarrays with sum equal to 6.
([5,1], [4,2], [3,5,1,4,2,-9]) but only the first 2 are non-overlapping.
```

**Example 3:** 

```
Input: nums = [-2,6,6,3,5,4,1,2,8], target = 10
Output: 3

```

**Example 4:** 

```
Input: nums = [0,0,0], target = 0
Output: 3

```



**Constraints:** 

-  *1 <= nums.length <= 10^5*  
-  *-10^4 <= nums[i] <= 10^4*  
-  *0 <= target <= 10^6* 


# [1546. 和为目标值的最大数目不重叠非空子数组数目][cnTitle]

**中等**

给你一个数组  *nums*  和一个整数  *target*  。

请你返回 **非空不重叠**  子数组的最大数目，且每个子数组中数字和都为  *target*  。



**示例 1：** 

```
输入：nums = [1,1,1,1,1], target = 2
输出：2
解释：总共有 2 个不重叠子数组（加粗数字表示） [1,1,1,1,1] ，它们的和为目标值 2 。

```

**示例 2：** 

```
输入：nums = [-1,3,5,1,4,2,-9], target = 6
输出：2
解释：总共有 3 个子数组和为 6 。
([5,1], [4,2], [3,5,1,4,2,-9]) 但只有前 2 个是不重叠的。
```

**示例 3：** 

```
输入：nums = [-2,6,6,3,5,4,1,2,8], target = 10
输出：3

```

**示例 4：** 

```
输入：nums = [0,0,0], target = 0
输出：3

```



**提示：** 

-  *1 <= nums.length <= 10^5*  
-  *-10^4 <= nums[i] <= 10^4*  
-  *0 <= target <= 10^6* 




# 算法思路

# 测试用例
```
1546. Maximum Number of Non-Overlapping Subarrays With Sum Equals Target 1546. 和为目标值的最大数目不重叠非空子数组数目 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-number-of-non-overlapping-subarrays-with-sum-equals-target/
[cnTitle]: https://leetcode-cn.com/problems/maximum-number-of-non-overlapping-subarrays-with-sum-equals-target/
