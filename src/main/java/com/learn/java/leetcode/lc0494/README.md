# [494. Target Sum][enTitle]

**Medium**

You are given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols  *+*  and  *-* . For each integer, you should choose one from  *+*  and  *-*  as its new symbol.

Find out how many ways to assign symbols to make sum of integers equal to target S.

Example 1:

```
Input: nums is [1, 1, 1, 1, 1], S is 3. 
Output: 5
Explanation: 

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

There are 5 ways to assign symbols to make the sum of nums be target 3.

```



Note:

1. The length of the given array is positive and will not exceed 20.  
2. The sum of elements in the given array will not exceed 1000. 
3. Your output answer is guaranteed to be fitted in a 32-bit integer.




# [494. 目标和][cnTitle]

**中等**

给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号  *+*  和  *-* 。对于数组中的任意一个整数，你都可以从  *+*  或  *-* 中选择一个符号添加在前面。

返回可以使最终数组和为目标数 S 的所有添加符号的方法数。

**示例 1:** 

```
输入: nums: [1, 1, 1, 1, 1], S: 3
输出: 5
解释: 

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

一共有5种方法让最终目标和为3。

```

**注意:** 

1. 数组的长度不会超过20，并且数组中的值全为正数。 
2. 初始的数组的和不会超过1000。 
3. 保证返回的最终结果为32位整数。




# 算法思路

# 测试用例
```
494. Target Sum 494. 目标和 Medium
Solution.findTargetSumWays
Solution.findTargetSumWays2
---
[1,1,1,1,1]
3

=5
```

[enTitle]: https://leetcode.com/problems/target-sum/
[cnTitle]: https://leetcode-cn.com/problems/target-sum/
