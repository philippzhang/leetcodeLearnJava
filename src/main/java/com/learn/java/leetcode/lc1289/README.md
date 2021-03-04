# [1289. Minimum Falling Path Sum II][enTitle]

**Hard**

Given a square grid of integers  *arr* , a  *falling path with non-zero shifts*  is a choice of exactly one element from each row of  *arr* , such that no two elements chosen in adjacent rows are in the same column.

Return the minimum sum of a falling path with non-zero shifts.



**Example 1:** 

```
Input: arr = [[1,2,3],[4,5,6],[7,8,9]]
Output: 13
Explanation:
The possible falling paths are:
[1,5,9], [1,5,7], [1,6,7], [1,6,8],
[2,4,8], [2,4,9], [2,6,7], [2,6,8],
[3,4,8], [3,4,9], [3,5,7], [3,5,9]
The falling path with the smallest sum is [1,5,7], so the answer is 13.

```



**Constraints:** 

-  *1 <= arr.length == arr[i].length <= 200*  
-  *-99 <= arr[i][j] <= 99* 


# [1289. 下降路径最小和 II][cnTitle]

**困难**

给你一个整数方阵  *arr*  ，定义「非零偏移下降路径」为：从  *arr*  数组中的每一行选择一个数字，且按顺序选出来的数字中，相邻数字不在原数组的同一列。

请你返回非零偏移下降路径数字和的最小值。



**示例 1：** 

```
输入：arr = [[1,2,3],[4,5,6],[7,8,9]]
输出：13
解释：
所有非零偏移下降路径包括：
[1,5,9], [1,5,7], [1,6,7], [1,6,8],
[2,4,8], [2,4,9], [2,6,7], [2,6,8],
[3,4,8], [3,4,9], [3,5,7], [3,5,9]
下降路径中数字和最小的是 [1,5,7] ，所以答案是 13 。

```



**提示：** 

-  *1 <= arr.length == arr[i].length <= 200*  
-  *-99 <= arr[i][j] <= 99* 




# 算法思路

# 测试用例
```
1289. Minimum Falling Path Sum II 1289. 下降路径最小和 II Hard
```

[enTitle]: https://leetcode.com/problems/minimum-falling-path-sum-ii/
[cnTitle]: https://leetcode-cn.com/problems/minimum-falling-path-sum-ii/
