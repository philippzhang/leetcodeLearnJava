# [1293. Shortest Path in a Grid with Obstacles Elimination][enTitle]

**Hard**

Given a  *m * n*  grid, where each cell is either  *0*  (empty) or  *1*  (obstacle). In one step, you can move up, down, left or right from and to an empty cell.

Return the minimum number of steps to walk from the upper left corner  *(0, 0)*  to the lower right corner  *(m-1, n-1)*  given that you can eliminate **at most**   *k*  obstacles. If it is not possible to find such walk return -1.



**Example 1:** 

```
Input: 
grid = 
[[0,0,0],
 [1,1,0],
 [0,0,0],
 [0,1,1],
 [0,0,0]], 
k = 1
Output: 6
Explanation:The shortest path without eliminating any obstacle is 10. 
The shortest path with one obstacle elimination at position (3,2) is 6. Such path is (0,0) -> (0,1) -> (0,2) -> (1,2) -> (2,2) -> (3,2) -> (4,2).

```



**Example 2:** 

```
Input: 
grid = 
[[0,1,1],
 [1,1,1],
 [1,0,0]], 
k = 1
Output: -1
Explanation:We need to eliminate at least two obstacles to find such a walk.

```



**Constraints:** 

-  *grid.length == m*  
-  *grid[0].length == n*  
-  *1 <= m, n <= 40*  
-  *1 <= k <= m*n*  
-  *grid[i][j] == 0 or 1*  
-  *grid[0][0] == grid[m-1][n-1] == 0* 


# [1293. 网格中的最短路径][cnTitle]

**困难**

给你一个  *m * n*  的网格，其中每个单元格不是  *0* （空）就是  *1* （障碍物）。每一步，您都可以在空白单元格中上、下、左、右移动。

如果您 **最多**  可以消除  *k*  个障碍物，请找出从左上角  *(0, 0)*  到右下角  *(m-1, n-1)*  的最短路径，并返回通过该路径所需的步数。如果找不到这样的路径，则返回 -1。



**示例 1：** 

```
输入： 
grid = 
[[0,0,0],
 [1,1,0],
 [0,0,0],
 [0,1,1],
 [0,0,0]], 
k = 1
输出：6
解释：不消除任何障碍的最短路径是 10。
消除位置 (3,2) 处的障碍后，最短路径是 6 。该路径是 (0,0) -> (0,1) -> (0,2) -> (1,2) -> (2,2) -> (3,2) -> (4,2).

```



**示例 2：** 

```
输入：
grid = 
[[0,1,1],
 [1,1,1],
 [1,0,0]], 
k = 1
输出：-1
解释：我们至少需要消除两个障碍才能找到这样的路径。

```



**提示：** 

-  *grid.length == m*  
-  *grid[0].length == n*  
-  *1 <= m, n <= 40*  
-  *1 <= k <= m*n*  
-  *grid[i][j] == 0 or 1*  
-  *grid[0][0] == grid[m-1][n-1] == 0* 




# 算法思路

# 测试用例
```
1293. Shortest Path in a Grid with Obstacles Elimination 1293. 网格中的最短路径 Hard
```

[enTitle]: https://leetcode.com/problems/shortest-path-in-a-grid-with-obstacles-elimination/
[cnTitle]: https://leetcode-cn.com/problems/shortest-path-in-a-grid-with-obstacles-elimination/
