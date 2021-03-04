# [1674. Minimum Moves to Make Array Complementary][enTitle]

**Medium**

You are given an integer array  *nums*  of **even**  length  *n*  and an integer  *limit* . In one move, you can replace any integer from  *nums*  with another integer between  *1*  and  *limit* , inclusive.

The array  *nums*  is **complementary**  if for all indices  *i*  (**0-indexed** ),  *nums[i] + nums[n - 1 - i]*  equals the same number. For example, the array  *[1,2,3,4]*  is complementary because for all indices  *i* ,  *nums[i] + nums[n - 1 - i] = 5* .

Return the  *minimum number of moves required to make*  *nums*  *complementary* .



**Example 1:** 

```
Input: nums = [1,2,4,3], limit = 4
Output: 1
Explanation: In 1 move, you can change nums to [1,2,2,3] (underlined elements are changed).
nums[0] + nums[3] = 1 + 3 = 4.
nums[1] + nums[2] = 2 + 2 = 4.
nums[2] + nums[1] = 2 + 2 = 4.
nums[3] + nums[0] = 3 + 1 = 4.
Therefore, nums[i] + nums[n-1-i] = 4 for every i, so nums is complementary.

```

**Example 2:** 

```
Input: nums = [1,2,2,1], limit = 2
Output: 2
Explanation: In 2 moves, you can change nums to [2,2,2,2]. You cannot change any number to 3 since 3 > limit.

```

**Example 3:** 

```
Input: nums = [1,2,1,2], limit = 2
Output: 0
Explanation: nums is already complementary.

```



**Constraints:** 

-  *n == nums.length*  
-  *2 <= n <= 105*  
-  *1 <= nums[i] <= limit <= 105*  
-  *n*  is even.


# [1674. 使数组互补的最少操作次数][cnTitle]

**中等**

给你一个长度为**偶数**   *n*  的整数数组  *nums*  和一个整数  *limit*  。每一次操作，你可以将  *nums*  中的任何整数替换为  *1*  到  *limit*  之间的另一个整数。

如果对于所有下标  *i* （**下标从**  *0* **开始** ）， *nums[i] + nums[n - 1 - i]*  都等于同一个数，则数组  *nums*  是 **互补的**  。例如，数组  *[1,2,3,4]*  是互补的，因为对于所有下标  *i*  ， *nums[i] + nums[n - 1 - i] = 5*  。

返回使数组 **互补**  的 **最少**  操作次数。



**示例 1：** 

```
输入：nums = [1,2,4,3], limit = 4
输出：1
解释：经过 1 次操作，你可以将数组 nums 变成 [1,2,2,3]（加粗元素是变更的数字）：
nums[0] + nums[3] = 1 + 3 = 4.
nums[1] + nums[2] = 2 + 2 = 4.
nums[2] + nums[1] = 2 + 2 = 4.
nums[3] + nums[0] = 3 + 1 = 4.
对于每个 i ，nums[i] + nums[n-1-i] = 4 ，所以 nums 是互补的。

```

**示例 2：** 

```
输入：nums = [1,2,2,1], limit = 2
输出：2
解释：经过 2 次操作，你可以将数组 nums 变成 [2,2,2,2] 。你不能将任何数字变更为 3 ，因为 3 > limit 。

```

**示例 3：** 

```
输入：nums = [1,2,1,2], limit = 2
输出：0
解释：nums 已经是互补的。

```



**提示：** 

-  *n == nums.length*  
-  *2 <= n <= 105*  
-  *1 <= nums[i] <= limit <= 105*  
-  *n*  是偶数。




# 算法思路

# 测试用例
```
1674. Minimum Moves to Make Array Complementary 1674. 使数组互补的最少操作次数 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-moves-to-make-array-complementary/
[cnTitle]: https://leetcode-cn.com/problems/minimum-moves-to-make-array-complementary/
