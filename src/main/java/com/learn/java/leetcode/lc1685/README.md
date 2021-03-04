# [1685. Sum of Absolute Differences in a Sorted Array][enTitle]

**Medium**

You are given an integer array  *nums*  sorted in **non-decreasing**  order.

Build and return  *an integer array*  *result*  *with the same length as*  *nums*  *such that*  *result[i]*  *is equal to the summation of absolute differences between*  *nums[i]*  *and all the other elements in the array.* 

In other words,  *result[i]*  is equal to  *sum(|nums[i]-nums[j]|)*  where  *0 <= j < nums.length*  and  *j != i*  (**0-indexed** ).



**Example 1:** 

```
Input: nums = [2,3,5]
Output: [4,3,5]
Explanation: Assuming the arrays are 0-indexed, then
result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4,
result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3,
result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5.

```

**Example 2:** 

```
Input: nums = [1,4,6,8,10]
Output: [24,15,13,15,21]

```



**Constraints:** 

-  *2 <= nums.length <= 105*  
-  *1 <= nums[i] <= nums[i + 1] <= 104* 


# [1685. 有序数组中差绝对值之和][cnTitle]

**中等**

给你一个 **非递减** 有序整数数组  *nums*  。

请你建立并返回一个整数数组 *result* ，它跟 *nums*  长度相同，且 *result[i]*  等于 *nums[i]*  与数组中所有其他元素差的绝对值之和。

换句话说，  *result[i]*  等于  *sum(|nums[i]-nums[j]|)*  ，其中  *0 <= j < nums.length*  且  *j != i*  （下标从 0 开始）。



**示例 1：** 

```
输入：nums = [2,3,5]
输出：[4,3,5]
解释：假设数组下标从 0 开始，那么
result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4，
result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3，
result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5。

```

**示例 2：** 

```
输入：nums = [1,4,6,8,10]
输出：[24,15,13,15,21]

```



**提示：** 

-  *2 <= nums.length <= 105*  
-  *1 <= nums[i] <= nums[i + 1] <= 104* 




# 算法思路

# 测试用例
```
1685. Sum of Absolute Differences in a Sorted Array 1685. 有序数组中差绝对值之和 Medium
```

[enTitle]: https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
[cnTitle]: https://leetcode-cn.com/problems/sum-of-absolute-differences-in-a-sorted-array/
