# [1034. Coloring A Border][enTitle]

**Medium**

Given a 2-dimensional  *grid*  of integers, each value in the grid represents the color of the grid square at that location.

Two squares belong to the same  *connected component*  if and only if they have the same color and are next to each other in any of the 4 directions.

The  *border*  of a connected component is all the squares in the connected component that are either 4-directionally adjacent to a square not in the component, or on the boundary of the grid (the first or last row or column).

Given a square at location  *(r0, c0)*  in the grid and a  *color* , color the border of the connected component of that square with the given  *color* , and return the final  *grid* .



**Example 1:** 

```
Input:grid = [[1,1],[1,2]], r0 = 0, c0 = 0, color = 3
Output: [[3, 3], [3, 2]]
```


**Example 2:** 

```
Input:grid = [[1,2,2],[2,3,2]], r0 = 0, c0 = 1, color = 3
Output: [[1, 3, 3], [2, 3, 3]]
```


**Example 3:** 

```
Input:grid = [[1,1,1],[1,1,1],[1,1,1]], r0 = 1, c0 = 1, color = 2
Output: [[2, 2, 2], [2, 1, 2], [2, 2, 2]]
```







**Note:** 

1.  *1 <= grid.length <= 50*  
2.  *1 <= grid[0].length <= 50*  
3.  *1 <= grid[i][j] <= 1000*  
4.  *0 <= r0 < grid.length*  
5.  *0 <= c0 < grid[0].length*  
6.  *1 <= color <= 1000* 


# [1034. 边框着色][cnTitle]

**中等**

给出一个二维整数网格  *grid* ，网格中的每个值表示该位置处的网格块的颜色。

只有当两个网格块的颜色相同，而且在四个方向中任意一个方向上相邻时，它们属于同一**连通分量** 。

连通分量的**边界** 是指连通分量中的所有与不在分量中的正方形相邻（四个方向上）的所有正方形，或者在网格的边界上（第一行/列或最后一行/列）的所有正方形。

给出位于  *(r0, c0)*  的网格块和颜色  *color* ，使用指定颜色  *color*  为所给网格块的连通分量的边界进行着色，并返回最终的网格  *grid*  。



**示例 1：** 

```
输入：grid = [[1,1],[1,2]], r0 = 0, c0 = 0, color = 3
输出：[[3, 3], [3, 2]]

```

**示例 2：** 

```
输入：grid = [[1,2,2],[2,3,2]], r0 = 0, c0 = 1, color = 3
输出：[[1, 3, 3], [2, 3, 3]]

```

**示例 3：** 

```
输入：grid = [[1,1,1],[1,1,1],[1,1,1]], r0 = 1, c0 = 1, color = 2
输出：[[2, 2, 2], [2, 1, 2], [2, 2, 2]]
```



**提示：** 

1.  *1 <= grid.length <= 50*  
2.  *1 <= grid[0].length <= 50*  
3.  *1 <= grid[i][j] <= 1000*  
4.  *0 <= r0 < grid.length*  
5.  *0 <= c0 < grid[0].length*  
6.  *1 <= color <= 1000* 






# 算法思路

# 测试用例
```
1034. Coloring A Border 1034. 边框着色 Medium
```

[enTitle]: https://leetcode.com/problems/coloring-a-border/
[cnTitle]: https://leetcode-cn.com/problems/coloring-a-border/
