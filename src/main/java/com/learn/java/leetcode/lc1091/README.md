# [1091. Shortest Path in Binary Matrix][enTitle]

**Medium**

Given an  *n x n*  binary matrix  *grid* , return  *the length of the shortest clear path in the matrix* . If there is no clear path, return  *-1* .

A **clear path**  in a binary matrix is a path from the **top-left**  cell (i.e.,  *(0, 0)* ) to the **bottom-right**  cell (i.e.,  *(n - 1, n - 1)* ) such that:

- All the visited cells of the path are  *0* . 
- All the adjacent cells of the path are **8-directionally**  connected (i.e., they are different and they share an edge or a corner).

The **length of a clear path**  is the number of visited cells of this path.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/02/18/example1_1.png)

```
Input: grid = [[0,1],[1,0]]
Output: 2

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2021/02/18/example2_1.png)

```
Input: grid = [[0,0,0],[1,1,0],[1,1,0]]
Output: 4

```

**Example 3:** 

```
Input: grid = [[1,0,0],[1,1,0],[1,1,0]]
Output: -1

```



**Constraints:** 

-  *n == grid.length*  
-  *n == grid[i].length*  
-  *1 <= n <= 100*  
-  *grid[i][j] is 0 or 1* 


# [1091. 二进制矩阵中的最短路径][cnTitle]

**中等**

给你一个  *n x n*  的二进制矩阵  *grid*  中，返回矩阵中最短 **畅通路径**  的长度。如果不存在这样的路径，返回  *-1*  。

二进制矩阵中的 畅通路径 是一条从 **左上角**  单元格（即， *(0, 0)* ）到 右下角 单元格（即， *(n - 1, n - 1)* ）的路径，该路径同时满足下述要求：

- 路径途经的所有单元格都的值都是  *0*  。 
- 路径中所有相邻的单元格应当在 **8 个方向之一**  上连通（即，相邻两单元之间彼此不同且共享一条边或者一个角）。

**畅通路径的长度**  是该路径途经的单元格总数。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2021/02/18/example1_1.png)

```
输入：grid = [[0,1],[1,0]]
输出：2

```

**示例 2：** 

![img](https://assets.leetcode.com/uploads/2021/02/18/example2_1.png)

```
输入：grid = [[0,0,0],[1,1,0],[1,1,0]]
输出：4

```

**示例 3：** 

```
输入：grid = [[1,0,0],[1,1,0],[1,1,0]]
输出：-1

```



**提示：** 

-  *n == grid.length*  
-  *n == grid[i].length*  
-  *1 <= n <= 100*  
-  *grid[i][j]*  为  *0*  或  *1* 




# 算法思路

# 测试用例
```
1091. Shortest Path in Binary Matrix 1091. 二进制矩阵中的最短路径 Medium
```

[enTitle]: https://leetcode.com/problems/shortest-path-in-binary-matrix/
[cnTitle]: https://leetcode-cn.com/problems/shortest-path-in-binary-matrix/
