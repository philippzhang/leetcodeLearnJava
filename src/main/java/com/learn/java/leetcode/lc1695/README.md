# [1695. Maximum Erasure Value][enTitle]

**Medium**

You are given an array of positive integers  *nums*  and want to erase a subarray containing **unique elements** . The **score**  you get by erasing the subarray is equal to the **sum**  of its elements.

Return  *the maximum score you can get by erasing exactly one subarray.* 

An array  *b*  is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).



**Example 1:** 

```
Input: nums = [4,2,4,5,6]
Output: 17
Explanation: The optimal subarray here is [2,4,5,6].

```

**Example 2:** 

```
Input: nums = [5,2,1,2,5,2,1,2,5]
Output: 8
Explanation: The optimal subarray here is [5,2,1] or [1,2,5].

```



**Constraints:** 

-  *1 <= nums.length <= 105*  
-  *1 <= nums[i] <= 104* 


# [1695. 删除子数组的最大得分][cnTitle]

**中等**

给你一个正整数数组  *nums*  ，请你从中删除一个含有 **若干不同元素**  的子数组**。** 删除子数组的 **得分**  就是子数组各元素之 **和**  。

返回 **只删除一个**  子数组可获得的 **最大得分**  *。* 

如果数组  *b*  是数组  *a*  的一个连续子序列，即如果它等于  *a[l],a[l+1],...,a[r]*  ，那么它就是  *a*  的一个子数组。



**示例 1：** 

```
输入：nums = [4,2,4,5,6]
输出：17
解释：最优子数组是 [2,4,5,6]

```

**示例 2：** 

```
输入：nums = [5,2,1,2,5,2,1,2,5]
输出：8
解释：最优子数组是 [5,2,1] 或 [1,2,5]

```



**提示：** 

-  *1 <= nums.length <= 105*  
-  *1 <= nums[i] <= 104* 




# 算法思路

# 测试用例
```
1695. Maximum Erasure Value 1695. 删除子数组的最大得分 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-erasure-value/
[cnTitle]: https://leetcode-cn.com/problems/maximum-erasure-value/
