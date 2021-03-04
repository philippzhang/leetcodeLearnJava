# [1524. Number of Sub-arrays With Odd Sum][enTitle]

**Medium**

Given an array of integers  *arr* . Return  *the number of sub-arrays*  with **odd**  sum.

As the answer may grow large, the answer **must be**  computed modulo  *10^9 + 7* .



**Example 1:** 

```
Input: arr = [1,3,5]
Output: 4
Explanation: All sub-arrays are [[1],[1,3],[1,3,5],[3],[3,5],[5]]
All sub-arrays sum are [1,4,9,3,8,5].
Odd sums are [1,9,3,5] so the answer is 4.

```

**Example 2:** 

```
Input: arr = [2,4,6]
Output: 0
Explanation: All sub-arrays are [[2],[2,4],[2,4,6],[4],[4,6],[6]]
All sub-arrays sum are [2,6,12,4,10,6].
All sub-arrays have even sum and the answer is 0.

```

**Example 3:** 

```
Input: arr = [1,2,3,4,5,6,7]
Output: 16

```

**Example 4:** 

```
Input: arr = [100,100,99,99]
Output: 4

```

**Example 5:** 

```
Input: arr = [7]
Output: 1

```



**Constraints:** 

-  *1 <= arr.length <= 10^5*  
-  *1 <= arr[i] <= 100* 


# [1524. 和为奇数的子数组数目][cnTitle]

**中等**

给你一个整数数组  *arr*  。请你返回和为 **奇数**  的子数组数目。

由于答案可能会很大，请你将结果对  *10^9 + 7*  取余后返回。



**示例 1：** 

```
输入：arr = [1,3,5]
输出：4
解释：所有的子数组为 [[1],[1,3],[1,3,5],[3],[3,5],[5]] 。
所有子数组的和为 [1,4,9,3,8,5].
奇数和包括 [1,9,3,5] ，所以答案为 4 。

```

**示例 2 ：** 

```
输入：arr = [2,4,6]
输出：0
解释：所有子数组为 [[2],[2,4],[2,4,6],[4],[4,6],[6]] 。
所有子数组和为 [2,6,12,4,10,6] 。
所有子数组和都是偶数，所以答案为 0 。

```

**示例 3：** 

```
输入：arr = [1,2,3,4,5,6,7]
输出：16

```

**示例 4：** 

```
输入：arr = [100,100,99,99]
输出：4

```

**示例 5：** 

```
输入：arr = [7]
输出：1

```



**提示：** 

-  *1 <= arr.length <= 10^5*  
-  *1 <= arr[i] <= 100* 




# 算法思路

# 测试用例
```
1524. Number of Sub-arrays With Odd Sum 1524. 和为奇数的子数组数目 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/
[cnTitle]: https://leetcode-cn.com/problems/number-of-sub-arrays-with-odd-sum/
