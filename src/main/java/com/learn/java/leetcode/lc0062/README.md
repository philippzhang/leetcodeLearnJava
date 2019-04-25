# [62. Unique Paths][enTitle]

**Medium**

A robot is located at the top-left corner of a  *m*  x  *n*  grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

![img](https://assets.leetcode.com/uploads/2018/10/22/robot_maze.png) Above is a 7 x 3 grid. How many possible unique paths are there?

**Note:**   *m*  and  *n*  will be at most 100.

**Example 1:** 

```
Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right

```

**Example 2:** 

```
Input: m = 7, n = 3
Output: 28
```
# [62. 不同路径][cnTitle]

**中等**

一个机器人位于一个  *m x n* 网格的左上角 （起始点在下图中标记为“Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

问总共有多少条不同的路径？

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/22/robot_maze.png)

例如，上图是一个7 x 3 的网格。有多少可能的路径？

**说明：**  *m*  和  *n* 的值均不超过 100。

**示例 1:** 

```
输入: m = 3, n = 2
输出: 3
解释:
从左上角开始，总共有 3 条路径可以到达右下角。
1. 向右 -> 向右 -> 向下
2. 向右 -> 向下 -> 向右
3. 向下 -> 向右 -> 向右

```

**示例 2:** 

```
输入: m = 7, n = 3
输出: 28
```


# 算法思路

# 测试用例
```
62. Unique Paths 62. 不同路径 Medium
Solution.uniquePaths
---
3
2

=3
---
7
3

=28
---
23
12

=193536720
```

[enTitle]: https://leetcode.com/problems/unique-paths/
[cnTitle]: https://leetcode-cn.com/problems/unique-paths/
