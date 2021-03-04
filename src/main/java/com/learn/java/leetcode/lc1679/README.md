# [1679. Max Number of K-Sum Pairs][enTitle]

**Medium**

You are given an integer array  *nums*  and an integer  *k* .

In one operation, you can pick two numbers from the array whose sum equals  *k*  and remove them from the array.

Return  *the maximum number of operations you can perform on the array* .



**Example 1:** 

```
Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
```

**Example 2:** 

```
Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.
```



**Constraints:** 

-  *1 <= nums.length <= 105*  
-  *1 <= nums[i] <= 109*  
-  *1 <= k <= 109* 


# [1679. K 和数对的最大数目][cnTitle]

**中等**

给你一个整数数组  *nums*  和一个整数  *k*  。

每一步操作中，你需要从数组中选出和为  *k*  的两个整数，并将它们移出数组。

返回你可以对数组执行的最大操作数。



**示例 1：** 

```
输入：nums = [1,2,3,4], k = 5
输出：2
解释：开始时 nums = [1,2,3,4]：
- 移出 1 和 4 ，之后 nums = [2,3]
- 移出 2 和 3 ，之后 nums = []
不再有和为 5 的数对，因此最多执行 2 次操作。
```

**示例 2：** 

```
输入：nums = [3,1,3,4,3], k = 6
输出：1
解释：开始时 nums = [3,1,3,4,3]：
- 移出前两个 3 ，之后nums = [1,4,3]
不再有和为 6 的数对，因此最多执行 1 次操作。
```



**提示：** 

-  *1 <= nums.length <= 105*  
-  *1 <= nums[i] <= 109*  
-  *1 <= k <= 109* 




# 算法思路

# 测试用例
```
1679. Max Number of K-Sum Pairs 1679. K 和数对的最大数目 Medium
```

[enTitle]: https://leetcode.com/problems/max-number-of-k-sum-pairs/
[cnTitle]: https://leetcode-cn.com/problems/max-number-of-k-sum-pairs/
