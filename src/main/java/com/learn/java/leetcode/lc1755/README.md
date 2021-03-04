# [1755. Closest Subsequence Sum][enTitle]

**Hard**

You are given an integer array  *nums*  and an integer  *goal* .

You want to choose a subsequence of  *nums*  such that the sum of its elements is the closest possible to  *goal* . That is, if the sum of the subsequence's elements is  *sum* , then you want to **minimize the absolute difference**   *abs(sum - goal)* .

Return  *the minimum possible value of*   *abs(sum - goal)* .

Note that a subsequence of an array is an array formed by removing some elements **(possibly all or none)**  of the original array.



**Example 1:** 

```
Input: nums = [5,-7,3,5], goal = 6
Output: 0
Explanation: Choose the whole array as a subsequence, with a sum of 6.
This is equal to the goal, so the absolute difference is 0.

```

**Example 2:** 

```
Input: nums = [7,-9,15,-2], goal = -5
Output: 1
Explanation: Choose the subsequence [7,-9,-2], with a sum of -4.
The absolute difference is abs(-4 - (-5)) = abs(1) = 1, which is the minimum.

```

**Example 3:** 

```
Input: nums = [1,2,3], goal = -7
Output: 7

```



**Constraints:** 

-  *1 <= nums.length <= 40*  
-  *-107 <= nums[i] <= 107*  
-  *-109 <= goal <= 109* 


# [1755. 最接近目标值的子序列和][cnTitle]

**困难**

给你一个整数数组  *nums*  和一个目标值  *goal*  。

你需要从  *nums*  中选出一个子序列，使子序列元素总和最接近  *goal*  。也就是说，如果子序列元素和为  *sum*  ，你需要 **最小化绝对差**   *abs(sum - goal)*  。

返回  *abs(sum - goal)*  可能的 **最小值**  。

注意，数组的子序列是通过移除原始数组中的某些元素（可能全部或无）而形成的数组。



**示例 1：** 

```
输入：nums = [5,-7,3,5], goal = 6
输出：0
解释：选择整个数组作为选出的子序列，元素和为 6 。
子序列和与目标值相等，所以绝对差为 0 。

```

**示例 2：** 

```
输入：nums = [7,-9,15,-2], goal = -5
输出：1
解释：选出子序列 [7,-9,-2] ，元素和为 -4 。
绝对差为 abs(-4 - (-5)) = abs(1) = 1 ，是可能的最小值。

```

**示例 3：** 

```
输入：nums = [1,2,3], goal = -7
输出：7

```



**提示：** 

-  *1 <= nums.length <= 40*  
-  *-107 <= nums[i] <= 107*  
-  *-109 <= goal <= 109* 




# 算法思路

# 测试用例
```
1755. Closest Subsequence Sum 1755. 最接近目标值的子序列和 Hard
```

[enTitle]: https://leetcode.com/problems/closest-subsequence-sum/
[cnTitle]: https://leetcode-cn.com/problems/closest-subsequence-sum/
