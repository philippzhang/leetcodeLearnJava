# [1703. Minimum Adjacent Swaps for K Consecutive Ones][enTitle]

**Hard**

You are given an integer array,  *nums* , and an integer  *k* .  *nums*  comprises of only  *0* 's and  *1* 's. In one move, you can choose two **adjacent**  indices and swap their values.

Return  *the minimum number of moves required so that*  *nums*  *has*  *k*  *consecutive*  *1*  *'s* .



**Example 1:** 

```
Input: nums = [1,0,0,1,0,1], k = 2
Output: 1
Explanation: In 1 move, nums could be [1,0,0,0,1,1] and have 2 consecutive 1's.

```

**Example 2:** 

```
Input: nums = [1,0,0,0,0,0,1,1], k = 3
Output: 5
Explanation: In 5 moves, the leftmost 1 can be shifted right until nums = [0,0,0,0,0,1,1,1].

```

**Example 3:** 

```
Input: nums = [1,1,0,1], k = 2
Output: 0
Explanation: nums already has 2 consecutive 1's.

```



**Constraints:** 

-  *1 <= nums.length <= 105*  
-  *nums[i]*  is  *0*  or  *1* . 
-  *1 <= k <= sum(nums)* 


# [1703. 得到连续 K 个 1 的最少相邻交换次数][cnTitle]

**困难**

给你一个整数数组  *nums*  和一个整数  *k*  。  *nums*  仅包含  *0*  和  *1*  。每一次移动，你可以选择 **相邻**  两个数字并将它们交换。

请你返回使  *nums*  中包含  *k*  个 **连续**  *1*  的 **最少**  交换次数。



**示例 1：** 

```
输入：nums = [1,0,0,1,0,1], k = 2
输出：1
解释：在第一次操作时，nums 可以变成 [1,0,0,0,1,1] 得到连续两个 1 。

```

**示例 2：** 

```
输入：nums = [1,0,0,0,0,0,1,1], k = 3
输出：5
解释：通过 5 次操作，最左边的 1 可以移到右边直到 nums 变为 [0,0,0,0,0,1,1,1] 。

```

**示例 3：** 

```
输入：nums = [1,1,0,1], k = 2
输出：0
解释：nums 已经有连续 2 个 1 了。

```



**提示：** 

-  *1 <= nums.length <= 105*  
-  *nums[i]*  要么是  *0*  ，要么是  *1*  。 
-  *1 <= k <= sum(nums)* 




# 算法思路

# 测试用例
```
1703. Minimum Adjacent Swaps for K Consecutive Ones 1703. 得到连续 K 个 1 的最少相邻交换次数 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-adjacent-swaps-for-k-consecutive-ones/
[cnTitle]: https://leetcode-cn.com/problems/minimum-adjacent-swaps-for-k-consecutive-ones/
