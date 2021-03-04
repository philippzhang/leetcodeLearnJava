# [1765. Map of Highest Peak][enTitle]

**Medium**

You are given an integer matrix  *isWater*  of size  *m x n*  that represents a map of **land**  and **water**  cells.

- If  *isWater[i][j] == 0* , cell  *(i, j)*  is a **land**  cell. 
- If  *isWater[i][j] == 1* , cell  *(i, j)*  is a **water**  cell.

You must assign each cell a height in a way that follows these rules:

- The height of each cell must be non-negative. 
- If the cell is a **water**  cell, its height must be  *0* . 
- Any two adjacent cells must have an absolute height difference of **at most**   *1* . A cell is adjacent to another cell if the former is directly north, east, south, or west of the latter (i.e., their sides are touching).

Find an assignment of heights such that the maximum height in the matrix is **maximized** .

Return  *an integer matrix*  *height*  *of size*  *m x n*  *where*  *height[i][j]*  *is cell*  *(i, j)*  *'s height. If there are multiple solutions, return any of them* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/01/10/screenshot-2021-01-11-at-82045-am.png)

```
Input: isWater = [[0,1],[0,0]]
Output: [[1,0],[2,1]]
Explanation: The image shows the assigned heights of each cell.
The blue cell is the water cell, and the green cells are the land cells.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2021/01/10/screenshot-2021-01-11-at-82050-am.png)

```
Input: isWater = [[0,0,1],[1,0,0],[0,0,0]]
Output: [[1,1,0],[0,1,1],[1,2,2]]
Explanation: A height of 2 is the maximum possible height of any assignment.
Any height assignment that has a maximum height of 2 while still meeting the rules will also be accepted.

```



**Constraints:** 

-  *m == isWater.length*  
-  *n == isWater[i].length*  
-  *1 <= m, n <= 1000*  
-  *isWater[i][j]*  is  *0*  or  *1* . 
- There is at least **one**  water cell.


# [1765. 地图中的最高点][cnTitle]

**中等**

给你一个大小为  *m x n*  的整数矩阵  *isWater*  ，它代表了一个由 **陆地**  和 **水域**  单元格组成的地图。

- 如果  *isWater[i][j] == 0*  ，格子  *(i, j)*  是一个 **陆地**  格子。 
- 如果  *isWater[i][j] == 1*  ，格子  *(i, j)*  是一个 **水域**  格子。

你需要按照如下规则给每个单元格安排高度：

- 每个格子的高度都必须是非负的。 
- 如果一个格子是是 **水域**  ，那么它的高度必须为  *0*  。 
- 任意相邻的格子高度差 **至多**  为  *1*  。当两个格子在正东、南、西、北方向上相互紧挨着，就称它们为相邻的格子。（也就是说它们有一条公共边）

找到一种安排高度的方案，使得矩阵中的最高高度值 **最大**  。

请你返回一个大小为  *m x n*  的整数矩阵  *height*  ，其中  *height[i][j]*  是格子  *(i, j)*  的高度。如果有多种解法，请返回 **任意一个**  。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2021/01/10/screenshot-2021-01-11-at-82045-am.png)

```
输入：isWater = [[0,1],[0,0]]
输出：[[1,0],[2,1]]
解释：上图展示了给各个格子安排的高度。
蓝色格子是水域格，绿色格子是陆地格。

```

**示例 2：** 

![img](https://assets.leetcode.com/uploads/2021/01/10/screenshot-2021-01-11-at-82050-am.png)

```
输入：isWater = [[0,0,1],[1,0,0],[0,0,0]]
输出：[[1,1,0],[0,1,1],[1,2,2]]
解释：所有安排方案中，最高可行高度为 2 。
任意安排方案中，只要最高高度为 2 且符合上述规则的，都为可行方案。

```



**提示：** 

-  *m == isWater.length*  
-  *n == isWater[i].length*  
-  *1 <= m, n <= 1000*  
-  *isWater[i][j]*  要么是  *0*  ，要么是  *1*  。 
- 至少有 **1**  个水域格子。




# 算法思路

# 测试用例
```
1765. Map of Highest Peak 1765. 地图中的最高点 Medium
```

[enTitle]: https://leetcode.com/problems/map-of-highest-peak/
[cnTitle]: https://leetcode-cn.com/problems/map-of-highest-peak/
