# [1368. Minimum Cost to Make at Least One Valid Path in a Grid][enTitle]

**Hard**






- **1**  which means go to the cell to the right. (i.e go from  *grid[i][j]*  to  *grid[i][j + 1]* ) 
- **2**  which means go to the cell to the left. (i.e go from  *grid[i][j]*  to  *grid[i][j - 1]* ) 
- **3**  which means go to the lower cell. (i.e go from  *grid[i][j]*  to  *grid[i + 1][j]* ) 
- **4**  which means go to the upper cell. (i.e go from  *grid[i][j]*  to  *grid[i - 1][j]* )

Notice that there could be some **invalid signs**  on the cells of the  *grid*  which points outside the  *grid* .

You will initially start at the upper left cell  *(0,0)* . A valid path in the grid is a path which starts from the upper left cell  *(0,0)*  and ends at the bottom-right cell  *(m - 1, n - 1)*  following the signs on the grid. The valid path **doesn't have to be the shortest** .

You can modify the sign on a cell with  *cost = 1* . You can modify the sign on a cell **one time only** .

Return  *the minimum cost*  to make the grid have at least one valid path.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/02/13/grid1.png)

```
Input: grid = [[1,1,1,1],[2,2,2,2],[1,1,1,1],[2,2,2,2]]
Output: 3
Explanation: You will start at point (0, 0).
The path to (3, 3) is as follows. (0, 0) --> (0, 1) --> (0, 2) --> (0, 3) change the arrow to down with cost = 1 --> (1, 3) --> (1, 2) --> (1, 1) --> (1, 0) change the arrow to down with cost = 1 --> (2, 0) --> (2, 1) --> (2, 2) --> (2, 3) change the arrow to down with cost = 1 --> (3, 3)
The total cost = 3.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/02/13/grid2.png)

```
Input: grid = [[1,1,3],[3,2,2],[1,1,4]]
Output: 0
Explanation: You can follow the path from (0, 0) to (2, 2).

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/02/13/grid3.png)

```
Input: grid = [[1,2],[4,3]]
Output: 1

```

**Example 4:** 

```
Input: grid = [[2,2,2],[2,2,2]]
Output: 3

```

**Example 5:** 

```
Input: grid = [[4]]
Output: 0

```



**Constraints:** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m, n <= 100* 


# [1368. 使网格图至少有一条有效路径的最小代价][cnTitle]

**困难**

给你一个 m x n 的网格图  *grid*  。  *grid*  中每个格子都有一个数字，对应着从该格子出发下一步走的方向。  *grid[i][j]*  中的数字可能为以下几种情况：

- **1**  ，下一步往右走，也就是你会从  *grid[i][j]*  走到  *grid[i][j + 1]*  
- **2**  ，下一步往左走，也就是你会从  *grid[i][j]*  走到  *grid[i][j - 1]*  
- **3**  ，下一步往下走，也就是你会从  *grid[i][j]*  走到  *grid[i + 1][j]*  
- **4**  ，下一步往上走，也就是你会从  *grid[i][j]*  走到  *grid[i - 1][j]* 

注意网格图中可能会有 **无效数字**  ，因为它们可能指向  *grid*  以外的区域。

一开始，你会从最左上角的格子  *(0,0)*  出发。我们定义一条 **有效路径**  为从格子  *(0,0)*  出发，每一步都顺着数字对应方向走，最终在最右下角的格子  *(m - 1, n - 1)*  结束的路径。有效路径 **不需要是最短路径**  。

你可以花费  *cost = 1*  的代价修改一个格子中的数字，但每个格子中的数字 **只能修改一次**  。

请你返回让网格图至少有一条有效路径的最小代价。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/02/29/grid1.png)

```
输入：grid = [[1,1,1,1],[2,2,2,2],[1,1,1,1],[2,2,2,2]]
输出：3
解释：你将从点 (0, 0) 出发。
到达 (3, 3) 的路径为： (0, 0) --> (0, 1) --> (0, 2) --> (0, 3) 花费代价 cost = 1 使方向向下 --> (1, 3) --> (1, 2) --> (1, 1) --> (1, 0) 花费代价 cost = 1 使方向向下 --> (2, 0) --> (2, 1) --> (2, 2) --> (2, 3) 花费代价 cost = 1 使方向向下 --> (3, 3)
总花费为 cost = 3.

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/02/29/grid2.png)

```
输入：grid = [[1,1,3],[3,2,2],[1,1,4]]
输出：0
解释：不修改任何数字你就可以从 (0, 0) 到达 (2, 2) 。

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/02/29/grid3.png)

```
输入：grid = [[1,2],[4,3]]
输出：1

```

**示例 4：** 

```
输入：grid = [[2,2,2],[2,2,2]]
输出：3

```

**示例 5：** 

```
输入：grid = [[4]]
输出：0

```



**提示：** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m, n <= 100* 




# 算法思路

# 测试用例
```
1368. Minimum Cost to Make at Least One Valid Path in a Grid 1368. 使网格图至少有一条有效路径的最小代价 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/
[cnTitle]: https://leetcode-cn.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/
