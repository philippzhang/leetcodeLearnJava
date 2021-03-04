# [1568. Minimum Number of Days to Disconnect Island][enTitle]

**Hard**

Given a 2D  *grid*  consisting of  *1* s (land) and  *0* s (water). An  *island*  is a maximal 4-directionally (horizontal or vertical) connected group of  *1* s.

The grid is said to be **connected**  if we have **exactly one island** , otherwise is said **disconnected** .

In one day, we are allowed to change **any** single land cell  *(1)*  into a water cell  *(0)* .

Return  *the minimum number of days*  to disconnect the grid.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/08/13/1926_island.png)

```
Input: grid = [[0,1,1,0],[0,1,1,0],[0,0,0,0]]
Output: 2
Explanation: We need at least 2 days to get a disconnected grid.
Change land grid[1][1] and grid[0][2] to water and get 2 disconnected island.

```

**Example 2:** 

```
Input: grid = [[1,1]]
Output: 2
Explanation:Grid of full water is also disconnected ([[1,1]] -> [[0,0]]), 0 islands.

```

**Example 3:** 

```
Input: grid = [[1,0,1,0]]
Output: 0

```

**Example 4:** 

```
Input: grid = [[1,1,0,1,1],
               [1,1,1,1,1],
               [1,1,0,1,1],
               [1,1,0,1,1]]
Output: 1

```

**Example 5:** 

```
Input: grid = [[1,1,0,1,1],
               [1,1,1,1,1],
               [1,1,0,1,1],
               [1,1,1,1,1]]
Output: 2

```



**Constraints:** 

-  *1 <= grid.length, grid[i].length <= 30*  
-  *grid[i][j]*  is  *0*  or  *1* .


# [1568. 使陆地分离的最少天数][cnTitle]

**困难**

给你一个由若干  *0*  和  *1*  组成的二维网格  *grid*  ，其中  *0*  表示水，而  *1*  表示陆地。岛屿由水平方向或竖直方向上相邻的  *1*  （陆地）连接形成。

如果 **恰好只有一座岛屿** ，则认为陆地是 **连通的**  ；否则，陆地就是 **分离的**  。

一天内，可以将任何单个陆地单元（ *1* ）更改为水单元（ *0* ）。

返回使陆地分离的最少天数。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/30/1926_island.png)

```
输入：grid = [[0,1,1,0],[0,1,1,0],[0,0,0,0]]
输出：2
解释：至少需要 2 天才能得到分离的陆地。
将陆地 grid[1][1] 和 grid[0][2] 更改为水，得到两个分离的岛屿。

```

**示例 2：** 

```
输入：grid = [[1,1]]
输出：2
解释：如果网格中都是水，也认为是分离的 ([[1,1]] -> [[0,0]])，0 岛屿。

```

**示例 3：** 

```
输入：grid = [[1,0,1,0]]
输出：0

```

**示例 4：** 

```
输入：grid = [[1,1,0,1,1],
             [1,1,1,1,1],
             [1,1,0,1,1],
             [1,1,0,1,1]]
输出：1

```

**示例 5：** 

```
输入：grid = [[1,1,0,1,1],
             [1,1,1,1,1],
             [1,1,0,1,1],
             [1,1,1,1,1]]
输出：2

```



**提示：** 

-  *1 <= grid.length, grid[i].length <= 30*  
-  *grid[i][j]*  为  *0*  或  *1* 




# 算法思路

# 测试用例
```
1568. Minimum Number of Days to Disconnect Island 1568. 使陆地分离的最少天数 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-number-of-days-to-disconnect-island/
[cnTitle]: https://leetcode-cn.com/problems/minimum-number-of-days-to-disconnect-island/
