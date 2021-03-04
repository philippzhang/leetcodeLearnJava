# [1498. Number of Subsequences That Satisfy the Given Sum Condition][enTitle]

**Medium**

Given an array of integers  *nums*  and an integer  *target* .

Return the number of **non-empty**  subsequences of  *nums*  such that the sum of the minimum and maximum element on it is less or equal to  *target* . Since the answer may be too large, return it modulo  *109 + 7* .



**Example 1:** 

```
Input: nums = [3,5,6,7], target = 9
Output: 4
Explanation:There are 4 subsequences that satisfy the condition.
[3] -> Min value + max value <= target (3 + 3 <= 9)
[3,5] -> (3 + 5 <= 9)
[3,5,6] -> (3 + 6 <= 9)
[3,6] -> (3 + 6 <= 9)

```

**Example 2:** 

```
Input: nums = [3,3,6,8], target = 10
Output: 6
Explanation:There are 6 subsequences that satisfy the condition. (nums can have repeated numbers).
[3] , [3] , [3,3], [3,6] , [3,6] , [3,3,6]
```

**Example 3:** 

```
Input: nums = [2,3,3,4,6,7], target = 12
Output: 61
Explanation:There are 63 non-empty subsequences, two of them don't satisfy the condition ([6,7], [7]).
Number of valid subsequences (63 - 2 = 61).

```

**Example 4:** 

```
Input: nums = [5,2,4,1,7,6,8], target = 16
Output: 127
Explanation:All non-empty subset satisfy the condition (2^7 - 1) = 127
```



**Constraints:** 

-  *1 <= nums.length <= 105*  
-  *1 <= nums[i] <= 106*  
-  *1 <= target <= 106* 


# [1498. 满足条件的子序列数目][cnTitle]

**中等**

给你一个整数数组  *nums*  和一个整数  *target*  。

请你统计并返回  *nums*  中能满足其最小元素与最大元素的 **和**  小于或等于  *target*  的 **非空**  子序列的数目。

由于答案可能很大，请将结果对 10^9 + 7 取余后返回。



**示例 1：** 

```
输入：nums = [3,5,6,7], target = 9
输出：4
解释：有 4 个子序列满足该条件。
[3] -> 最小元素 + 最大元素 <= target (3 + 3 <= 9)
[3,5] -> (3 + 5 <= 9)
[3,5,6] -> (3 + 6 <= 9)
[3,6] -> (3 + 6 <= 9)

```

**示例 2：** 

```
输入：nums = [3,3,6,8], target = 10
输出：6
解释：有 6 个子序列满足该条件。（nums 中可以有重复数字）
[3] , [3] , [3,3], [3,6] , [3,6] , [3,3,6]
```

**示例 3：** 

```
输入：nums = [2,3,3,4,6,7], target = 12
输出：61
解释：共有 63 个非空子序列，其中 2 个不满足条件（[6,7], [7]）
有效序列总数为（63 - 2 = 61）

```

**示例 4：** 

```
输入：nums = [5,2,4,1,7,6,8], target = 16
输出：127
解释：所有非空子序列都满足条件 (2^7 - 1) = 127
```



**提示：** 

-  *1 <= nums.length <= 10^5*  
-  *1 <= nums[i] <= 10^6*  
-  *1 <= target <= 10^6* 




# 算法思路

# 测试用例
```
1498. Number of Subsequences That Satisfy the Given Sum Condition 1498. 满足条件的子序列数目 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/
[cnTitle]: https://leetcode-cn.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/
