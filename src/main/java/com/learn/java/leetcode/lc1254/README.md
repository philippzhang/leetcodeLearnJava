# [1254. Number of Closed Islands][enTitle]

**Medium**

Given a 2D  *grid*  consists of  *0s*  (land) and  *1s*  (water). An  *island*  is a maximal 4-directionally connected group of  *0s*  and a  *closed island*  is an island **totally**  (all left, top, right, bottom) surrounded by  *1s.* 

Return the number of  *closed islands* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/10/31/sample_3_1610.png)

```
Input: grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0],[1,0,1,0,1,1,1,0],[1,0,0,0,0,1,0,1],[1,1,1,1,1,1,1,0]]
Output: 2
Explanation: 
Islands in gray are closed because they are completely surrounded by water (group of 1s).
```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2019/10/31/sample_4_1610.png)

```
Input: grid = [[0,0,1,0,0],[0,1,0,1,0],[0,1,1,1,0]]
Output: 1

```

**Example 3:** 

```
Input: grid = [[1,1,1,1,1,1,1],
               [1,0,0,0,0,0,1],
               [1,0,1,1,1,0,1],
               [1,0,1,0,1,0,1],
               [1,0,1,1,1,0,1],
               [1,0,0,0,0,0,1],
               [1,1,1,1,1,1,1]]
Output: 2

```



**Constraints:** 

-  *1 <= grid.length, grid[0].length <= 100*  
-  *0 <= grid[i][j] <=1* 


# [1254. 统计封闭岛屿的数目][cnTitle]

**中等**

有一个二维矩阵  *grid*  ，每个位置要么是陆地（记号为  *0*  ）要么是水域（记号为  *1*  ）。

我们从一块陆地出发，每次可以往上下左右 4 个方向相邻区域走，能走到的所有陆地区域，我们将其称为一座「**岛屿** 」。

如果一座岛屿 **完全**  由水域包围，即陆地边缘上下左右所有相邻区域都是水域，那么我们将其称为 「**封闭岛屿** 」。

请返回封闭岛屿的数目。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/11/07/sample_3_1610.png)

```
输入：grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0],[1,0,1,0,1,1,1,0],[1,0,0,0,0,1,0,1],[1,1,1,1,1,1,1,0]]
输出：2
解释：
灰色区域的岛屿是封闭岛屿，因为这座岛屿完全被水域包围（即被 1 区域包围）。
```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/11/07/sample_4_1610.png)

```
输入：grid = [[0,0,1,0,0],[0,1,0,1,0],[0,1,1,1,0]]
输出：1

```

**示例 3：** 

```
输入：grid = [[1,1,1,1,1,1,1],
             [1,0,0,0,0,0,1],
             [1,0,1,1,1,0,1],
             [1,0,1,0,1,0,1],
             [1,0,1,1,1,0,1],
             [1,0,0,0,0,0,1],
             [1,1,1,1,1,1,1]]
输出：2

```



**提示：** 

-  *1 <= grid.length, grid[0].length <= 100*  
-  *0 <= grid[i][j] <=1* 




# 算法思路

# 测试用例
```
1254. Number of Closed Islands 1254. 统计封闭岛屿的数目 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-closed-islands/
[cnTitle]: https://leetcode-cn.com/problems/number-of-closed-islands/
