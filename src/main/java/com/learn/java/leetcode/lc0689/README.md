# [689. Maximum Sum of 3 Non-Overlapping Subarrays][enTitle]

**Hard**

In a given array  *nums*  of positive integers, find three non-overlapping subarrays with maximum sum.

Each subarray will be of size  *k* , and we want to maximize the sum of all  *3*k*  entries.

Return the result as a list of indices representing the starting position of each interval (0-indexed). If there are multiple answers, return the lexicographically smallest one.

Example:

```
Input: [1,2,1,2,6,7,5,1], 2
Output: [0, 3, 5]
Explanation: Subarrays [1, 2], [2, 6], [7, 5] correspond to the starting indices [0, 3, 5].
We could have also taken [2, 1], but an answer of [1, 3, 5] would be lexicographically larger.

```



Note:

-  *nums.length*  will be between 1 and 20000. 
-  *nums[i]*  will be between 1 and 65535. 
-  *k*  will be between 1 and floor(nums.length / 3).




# [689. 三个无重叠子数组的最大和][cnTitle]

**困难**

给定数组  *nums*  由正整数组成，找到三个互不重叠的子数组的最大和。

每个子数组的长度为 *k* ，我们要使这 *3*k* 个项的和最大化。

返回每个区间起始索引的列表（索引从 0 开始）。如果有多个结果，返回字典序最小的一个。

**示例:** 

```
输入: [1,2,1,2,6,7,5,1], 2
输出: [0, 3, 5]
解释: 子数组 [1, 2], [2, 6], [7, 5] 对应的起始索引为 [0, 3, 5]。
我们也可以取 [2, 1], 但是结果 [1, 3, 5] 在字典序上更大。

```

**注意:** 

-  *nums.length* 的范围在 *[1, 20000]* 之间。 
-  *nums[i]* 的范围在 *[1, 65535]* 之间。 
-  *k* 的范围在 *[1, floor(nums.length / 3)]* 之间。




# 算法思路

# 测试用例
```
689. Maximum Sum of 3 Non-Overlapping Subarrays 689. 三个无重叠子数组的最大和 Hard
```

[enTitle]: https://leetcode.com/problems/maximum-sum-of-3-non-overlapping-subarrays/
[cnTitle]: https://leetcode-cn.com/problems/maximum-sum-of-3-non-overlapping-subarrays/
