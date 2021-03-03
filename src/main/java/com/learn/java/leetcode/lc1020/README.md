# [1020. Number of Enclaves][enTitle]

**Medium**

You are given an  *m x n*  binary matrix  *grid* , where  *0*  represents a sea cell and  *1*  represents a land cell.

A **move**  consists of walking from one land cell to another adjacent (**4-directionally** ) land cell or walking off the boundary of the  *grid* .

Return  *the number of land cells in*   *grid*   *for which we cannot walk off the boundary of the grid in any number of moves* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/02/18/enclaves1.jpg)

```
Input: grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
Output: 3
Explanation: There are three 1s that are enclosed by 0s, and one 1 that is not enclosed because its on the boundary.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2021/02/18/enclaves2.jpg)

```
Input: grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
Output: 0
Explanation: All 1s are either on the boundary or can reach the boundary.

```



**Constraints:** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m, n <= 500*  
-  *grid[i][j]*  is either  *0*  or  *1* .


# [1020. 飞地的数量][cnTitle]

**中等**

给出一个二维数组  *A* ，每个单元格为 0（代表海）或 1（代表陆地）。

移动是指在陆地上从一个地方走到另一个地方（朝四个方向之一）或离开网格的边界。

返回网格中**无法** 在任意次数的移动中离开网格边界的陆地单元格的数量。



**示例 1：** 

```
输入：[[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
输出：3
解释：
有三个 1 被 0 包围。一个 1 没有被包围，因为它在边界上。
```

**示例 2：** 

```
输入：[[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
输出：0
解释：
所有 1 都在边界上或可以到达边界。
```



**提示：** 

1.  *1 <= A.length <= 500*  
2.  *1 <= A[i].length <= 500*  
3.  *0 <= A[i][j] <= 1*  
4. 所有行的大小都相同




# 算法思路

# 测试用例
```
1020. Number of Enclaves 1020. 飞地的数量 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-enclaves/
[cnTitle]: https://leetcode-cn.com/problems/number-of-enclaves/
