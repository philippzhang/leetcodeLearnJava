# [1477. Find Two Non-overlapping Sub-arrays Each With Target Sum][enTitle]

**Medium**

Given an array of integers  *arr*  and an integer  *target* .

You have to find **two non-overlapping sub-arrays**  of  *arr*  each with sum equal  *target* . There can be multiple answers so you have to find an answer where the sum of the lengths of the two sub-arrays is **minimum** .

Return  *the minimum sum of the lengths*  of the two required sub-arrays, or return  *-1*  if you cannot find such two sub-arrays.



**Example 1:** 

```
Input: arr = [3,2,2,4,3], target = 3
Output: 2
Explanation: Only two sub-arrays have sum = 3 ([3] and [3]). The sum of their lengths is 2.

```

**Example 2:** 

```
Input: arr = [7,3,4,7], target = 7
Output: 2
Explanation: Although we have three non-overlapping sub-arrays of sum = 7 ([7], [3,4] and [7]), but we will choose the first and third sub-arrays as the sum of their lengths is 2.

```

**Example 3:** 

```
Input: arr = [4,3,2,6,2,3,4], target = 6
Output: -1
Explanation: We have only one sub-array of sum = 6.

```

**Example 4:** 

```
Input: arr = [5,5,4,4,5], target = 3
Output: -1
Explanation: We cannot find a sub-array of sum = 3.

```

**Example 5:** 

```
Input: arr = [3,1,1,1,5,1,2,1], target = 3
Output: 3
Explanation: Note that sub-arrays [1,2] and [2,1] cannot be an answer because they overlap.

```



**Constraints:** 

-  *1 <= arr.length <= 10^5*  
-  *1 <= arr[i] <= 1000*  
-  *1 <= target <= 10^8* 


# [1477. 找两个和为目标值且不重叠的子数组][cnTitle]

**中等**

给你一个整数数组  *arr*  和一个整数值  *target*  。

请你在  *arr*  中找 **两个互不重叠的子数组**  且它们的和都等于  *target*  。可能会有多种方案，请你返回满足要求的两个子数组长度和的 **最小值**  。

请返回满足要求的最小长度和，如果无法找到这样的两个子数组，请返回 **-1**  。



**示例 1：** 

```
输入：arr = [3,2,2,4,3], target = 3
输出：2
解释：只有两个子数组和为 3 （[3] 和 [3]）。它们的长度和为 2 。

```

**示例 2：** 

```
输入：arr = [7,3,4,7], target = 7
输出：2
解释：尽管我们有 3 个互不重叠的子数组和为 7 （[7], [3,4] 和 [7]），但我们会选择第一个和第三个子数组，因为它们的长度和 2 是最小值。

```

**示例 3：** 

```
输入：arr = [4,3,2,6,2,3,4], target = 6
输出：-1
解释：我们只有一个和为 6 的子数组。

```

**示例 4：** 

```
输入：arr = [5,5,4,4,5], target = 3
输出：-1
解释：我们无法找到和为 3 的子数组。

```

**示例 5：** 

```
输入：arr = [3,1,1,1,5,1,2,1], target = 3
输出：3
解释：注意子数组 [1,2] 和 [2,1] 不能成为一个方案因为它们重叠了。

```



**提示：** 

-  *1 <= arr.length <= 10^5*  
-  *1 <= arr[i] <= 1000*  
-  *1 <= target <= 10^8* 




# 算法思路

# 测试用例
```
1477. Find Two Non-overlapping Sub-arrays Each With Target Sum 1477. 找两个和为目标值且不重叠的子数组 Medium
```

[enTitle]: https://leetcode.com/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum/
[cnTitle]: https://leetcode-cn.com/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum/
