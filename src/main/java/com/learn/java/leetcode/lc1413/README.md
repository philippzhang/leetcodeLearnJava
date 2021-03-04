# [1413. Minimum Value to Get Positive Step by Step Sum][enTitle]

**Easy**

Given an array of integers  *nums* , you start with an initial **positive**  value  *startValue*  *.* 

In each iteration, you calculate the step by step sum of  *startValue*  plus elements in  *nums*  (from left to right).

Return the minimum **positive**  value of  *startValue*  such that the step by step sum is never less than 1.



**Example 1:** 

```
Input: nums = [-3,2,-3,4,2]
Output: 5
Explanation:If you choose startValue = 4, in the third iteration your step by step sum is less than 1.
step by step sum
                startValue = 4 | startValue = 5 | nums                  (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
                  (1 +2 ) = 3  | (2 +2 ) = 4    |   2
                  (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
                  (0 +4 ) = 4  | (1 +4 ) = 5    |   4
                  (4 +2 ) = 6  | (5 +2 ) = 7    |   2

```

**Example 2:** 

```
Input: nums = [1,2]
Output: 1
Explanation: Minimum start value should be positive. 

```

**Example 3:** 

```
Input: nums = [1,-2,-3]
Output: 5

```



**Constraints:** 

-  *1 <= nums.length <= 100*  
-  *-100 <= nums[i] <= 100* 


# [1413. 逐步求和得到正数的最小值][cnTitle]

**简单**

给你一个整数数组  *nums*  。你可以选定任意的 **正数**  startValue 作为初始值。

你需要从左到右遍历  *nums*  数组，并将 startValue 依次累加上  *nums*  数组中的值。

请你在确保累加和始终大于等于 1 的前提下，选出一个最小的 **正数**  作为 startValue 。



**示例 1：** 

```
输入：nums = [-3,2,-3,4,2]
输出：5
解释：如果你选择 startValue = 4，在第三次累加时，和小于 1 。
累加求和
                startValue = 4 | startValue = 5 | nums                  (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
                  (1 +2 ) = 3  | (2 +2 ) = 4    |   2
                  (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
                  (0 +4 ) = 4  | (1 +4 ) = 5    |   4
                  (4 +2 ) = 6  | (5 +2 ) = 7    |   2

```

**示例 2：** 

```
输入：nums = [1,2]
输出：1
解释：最小的 startValue 需要是正数。

```

**示例 3：** 

```
输入：nums = [1,-2,-3]
输出：5

```



**提示：** 

-  *1 <= nums.length <= 100*  
-  *-100 <= nums[i] <= 100* 




# 算法思路

# 测试用例
```
1413. Minimum Value to Get Positive Step by Step Sum 1413. 逐步求和得到正数的最小值 Easy
```

[enTitle]: https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
[cnTitle]: https://leetcode-cn.com/problems/minimum-value-to-get-positive-step-by-step-sum/
