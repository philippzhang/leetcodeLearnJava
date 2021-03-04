# [1536. Minimum Swaps to Arrange a Binary Grid][enTitle]

**Medium**

Given an  *n x n*  binary  *grid* , in one step you can choose two **adjacent rows**  of the grid and swap them.

A grid is said to be **valid**  if all the cells above the main diagonal are **zeros** .

Return  *the minimum number of steps*  needed to make the grid valid, or **-1**  if the grid cannot be valid.

The main diagonal of a grid is the diagonal that starts at cell  *(1, 1)*  and ends at cell  *(n, n)* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/07/28/fw.jpg)

```
Input: grid = [[0,0,1],[1,1,0],[1,0,0]]
Output: 3

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/07/16/e2.jpg)

```
Input: grid = [[0,1,1,0],[0,1,1,0],[0,1,1,0],[0,1,1,0]]
Output: -1
Explanation: All rows are similar, swaps have no effect on the grid.

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/07/16/e3.jpg)

```
Input: grid = [[1,0,0],[1,1,0],[1,1,1]]
Output: 0

```



**Constraints:** 

-  *n == grid.length*  
-  *n == grid[i].length*  
-  *1 <= n <= 200*  
-  *grid[i][j]*  is  *0*  or  *1* 


# [1536. 排布二进制网格的最少交换次数][cnTitle]

**中等**

给你一个  *n x n*  的二进制网格  *grid* ，每一次操作中，你可以选择网格的 **相邻两行**  进行交换。

一个符合要求的网格需要满足主对角线以上的格子全部都是 **0**  。

请你返回使网格满足要求的最少操作次数，如果无法使网格符合要求，请你返回 **-1**  。

主对角线指的是从  *(1, 1)*  到  *(n, n)*  的这些格子。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/02/fw.jpg)

```
输入：grid = [[0,0,1],[1,1,0],[1,0,0]]
输出：3

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/02/e2.jpg)

```
输入：grid = [[0,1,1,0],[0,1,1,0],[0,1,1,0],[0,1,1,0]]
输出：-1
解释：所有行都是一样的，交换相邻行无法使网格符合要求。

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/02/e3.jpg)

```
输入：grid = [[1,0,0],[1,1,0],[1,1,1]]
输出：0

```



**提示：** 

-  *n == grid.length*  
-  *n == grid[i].length*  
-  *1 <= n <= 200*  
-  *grid[i][j]*  要么是  *0*  要么是  *1*  。




# 算法思路

# 测试用例
```
1536. Minimum Swaps to Arrange a Binary Grid 1536. 排布二进制网格的最少交换次数 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-swaps-to-arrange-a-binary-grid/
[cnTitle]: https://leetcode-cn.com/problems/minimum-swaps-to-arrange-a-binary-grid/
