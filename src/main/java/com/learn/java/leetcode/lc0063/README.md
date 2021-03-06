# [63. Unique Paths II][enTitle]

**Medium**

A robot is located at the top-left corner of a  *m*  x  *n*  grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

Now consider if some obstacles are added to the grids. How many unique paths would there be?

![img](https://assets.leetcode.com/uploads/2018/10/22/robot_maze.png)

An obstacle and empty space is marked as  *1*  and  *0*  respectively in the grid.

**Note:**   *m*  and  *n*  will be at most 100.

**Example 1:** 

```
Input:[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
Output: 2
Explanation:
There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -> Right -> Down -> Down
2. Down -> Down -> Right -> Right

```
# [63. 不同路径 II][cnTitle]

**中等**

一个机器人位于一个  *m x n* 网格的左上角 （起始点在下图中标记为“Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/22/robot_maze.png)

网格中的障碍物和空位置分别用  *1*  和  *0*  来表示。

**说明：**  *m*  和  *n* 的值均不超过 100。

**示例 1:** 

```
输入:[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
输出: 2
解释:
3x3 网格的正中间有一个障碍物。
从左上角到右下角一共有 2 条不同的路径：
1. 向右 -> 向右 -> 向下 -> 向下
2. 向下 -> 向下 -> 向右 -> 向右

```


# 算法思路

# 测试用例
```
63. Unique Paths II 63. 不同路径 II Medium
Solution.uniquePathsWithObstacles
---
[[0,0,0],[0,1,0],[0,0,0]]

=2
---
[[0,0],[1,1],[0,0]]

=0
```

[enTitle]: https://leetcode.com/problems/unique-paths-ii/
[cnTitle]: https://leetcode-cn.com/problems/unique-paths-ii/
