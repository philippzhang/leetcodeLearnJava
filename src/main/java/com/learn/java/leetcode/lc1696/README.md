# [1696. Jump Game VI][enTitle]

**Medium**

You are given a **0-indexed**  integer array  *nums*  and an integer  *k* .

You are initially standing at index  *0* . In one move, you can jump at most  *k*  steps forward without going outside the boundaries of the array. That is, you can jump from index  *i*  to any index in the range  *[i + 1, min(n - 1, i + k)]*  **inclusive** .

You want to reach the last index of the array (index  *n - 1* ). Your **score**  is the **sum**  of all  *nums[j]*  for each index  *j*  you visited in the array.

Return  *the maximum score you can get* .



**Example 1:** 

```
Input: nums = [1,-1,-2,4,-7,3], k = 2
Output: 7
Explanation: You can choose your jumps forming the subsequence [1,-1,4,3] (underlined above). The sum is 7.

```

**Example 2:** 

```
Input: nums = [10,-5,-2,4,0,3], k = 3
Output: 17
Explanation: You can choose your jumps forming the subsequence [10,4,3] (underlined above). The sum is 17.

```

**Example 3:** 

```
Input: nums = [1,-5,-20,4,-1,3,-6,-3], k = 2
Output: 0

```



**Constraints:** 

-   *1 <= nums.length, k <= 105*  
-  *-104 <= nums[i] <= 104* 


# [1696. 跳跃游戏 VI][cnTitle]

**中等**

给你一个下标从 **0**  开始的整数数组  *nums*  和一个整数  *k*  。

一开始你在下标  *0*  处。每一步，你最多可以往前跳  *k*  步，但你不能跳出数组的边界。也就是说，你可以从下标  *i*  跳到  *[i + 1， min(n - 1, i + k)]*  **包含**  两个端点的任意位置。

你的目标是到达数组最后一个位置（下标为  *n - 1*  ），你的 **得分**  为经过的所有数字之和。

请你返回你能得到的 **最大得分**  。



**示例 1：** 

```
输入：nums = [1,-1,-2,4,-7,3], k = 2
输出：7
解释：你可以选择子序列 [1,-1,4,3] （上面加粗的数字），和为 7 。

```

**示例 2：** 

```
输入：nums = [10,-5,-2,4,0,3], k = 3
输出：17
解释：你可以选择子序列 [10,4,3] （上面加粗数字），和为 17 。

```

**示例 3：** 

```
输入：nums = [1,-5,-20,4,-1,3,-6,-3], k = 2
输出：0

```



**提示：** 

-   *1 <= nums.length, k <= 105*  
-  *-104 <= nums[i] <= 104* 




# 算法思路

# 测试用例
```
1696. Jump Game VI 1696. 跳跃游戏 VI Medium
```

[enTitle]: https://leetcode.com/problems/jump-game-vi/
[cnTitle]: https://leetcode-cn.com/problems/jump-game-vi/
