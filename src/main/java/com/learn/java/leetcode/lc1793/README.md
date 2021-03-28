# [1793. Maximum Score of a Good Subarray][enTitle]

**Hard**

You are given an array of integers  *nums*  **(0-indexed)**  and an integer  *k* .

The **score**  of a subarray  *(i, j)*  is defined as  *min(nums[i], nums[i+1], ..., nums[j]) * (j - i + 1)* . A **good**  subarray is a subarray where  *i <= k <= j* .

Return  *the maximum possible score of a good subarray.* 



**Example 1:** 

```
Input: nums = [1,4,3,7,4,5], k = 3
Output: 15
Explanation: The optimal subarray is (1, 5) with a score of min(4,3,7,4,5) * (5-1+1) = 3 * 5 = 15. 

```

**Example 2:** 

```
Input: nums = [5,5,4,5,4,1,1,1], k = 0
Output: 20
Explanation: The optimal subarray is (0, 4) with a score of min(5,5,4,5,4) * (4-0+1) = 4 * 5 = 20.

```



**Constraints:** 

-  *1 <= nums.length <= 105*  
-  *1 <= nums[i] <= 2 * 104*  
-  *0 <= k < nums.length* 


# [1793. 好子数组的最大分数][cnTitle]

**困难**

给你一个整数数组  *nums*  **（下标从 0 开始）** 和一个整数  *k*  。

一个子数组  *(i, j)*  的 **分数**  定义为  *min(nums[i], nums[i+1], ..., nums[j]) * (j - i + 1)*  。一个 **好**  子数组的两个端点下标需要满足  *i <= k <= j*  。

请你返回 **好**  子数组的最大可能 **分数**  。



**示例 1：** 

```
输入：nums = [1,4,3,7,4,5], k = 3
输出：15
解释：最优子数组的左右端点下标是 (1, 5) ，分数为 min(4,3,7,4,5) * (5-1+1) = 3 * 5 = 15 。

```

**示例 2：** 

```
输入：nums = [5,5,4,5,4,1,1,1], k = 0
输出：20
解释：最优子数组的左右端点下标是 (0, 4) ，分数为 min(5,5,4,5,4) * (4-0+1) = 4 * 5 = 20 。

```



**提示：** 

-  *1 <= nums.length <= 105*  
-  *1 <= nums[i] <= 2 * 104*  
-  *0 <= k < nums.length* 




# 算法思路

# 测试用例
```
1793. Maximum Score of a Good Subarray 1793. 好子数组的最大分数 Hard
```

[enTitle]: https://leetcode.com/problems/maximum-score-of-a-good-subarray/
[cnTitle]: https://leetcode-cn.com/problems/maximum-score-of-a-good-subarray/
