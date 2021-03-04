# [1391. Check if There is a Valid Path in a Grid][enTitle]

**Medium**






- **1**  which means a street connecting the left cell and the right cell. 
- **2**  which means a street connecting the upper cell and the lower cell. 
- 3 which means a street connecting the left cell and the lower cell. 
- 4 which means a street connecting the right cell and the lower cell. 
- 5 which means a street connecting the left cell and the upper cell. 
- 6 which means a street connecting the right cell and the upper cell.

![img](https://assets.leetcode.com/uploads/2020/03/05/main.png)

You will initially start at the street of the upper-left cell  *(0,0)* . A valid path in the grid is a path which starts from the upper left cell  *(0,0)*  and ends at the bottom-right cell  *(m - 1, n - 1)* . **The path should only follow the streets** .

**Notice**  that you are **not allowed**  to change any street.

Return true if there is a valid path in the grid or  *false*  otherwise.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/03/05/e1.png)

```
Input: grid = [[2,4,3],[6,5,2]]
Output: true
Explanation: As shown you can start at cell (0, 0) and visit all the cells of the grid to reach (m - 1, n - 1).

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/03/05/e2.png)

```
Input: grid = [[1,2,1],[1,2,1]]
Output: false
Explanation: As shown you the street at cell (0, 0) is not connected with any street of any other cell and you will get stuck at cell (0, 0)

```

**Example 3:** 

```
Input: grid = [[1,1,2]]
Output: false
Explanation: You will get stuck at cell (0, 1) and you cannot reach cell (0, 2).

```

**Example 4:** 

```
Input: grid = [[1,1,1,1,1,1,3]]
Output: true

```

**Example 5:** 

```
Input: grid = [[2],[2],[2],[2],[2],[2],[6]]
Output: true

```



**Constraints:** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m, n <= 300*  
-  *1 <= grid[i][j] <= 6* 


# [1391. 检查网格中是否存在有效路径][cnTitle]

**中等**

给你一个  *m*  x  *n*  的网格  *grid* 。网格里的每个单元都代表一条街道。 *grid[i][j]*  的街道可以是：

- **1**  表示连接左单元格和右单元格的街道。 
- **2**  表示连接上单元格和下单元格的街道。 
- **3**  表示连接左单元格和下单元格的街道。 
- **4**  表示连接右单元格和下单元格的街道。 
- **5**  表示连接左单元格和上单元格的街道。 
- **6**  表示连接右单元格和上单元格的街道。

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/03/21/main.png)

你最开始从左上角的单元格  *(0,0)*  开始出发，网格中的「有效路径」是指从左上方的单元格  *(0,0)*  开始、一直到右下方的  *(m-1,n-1)*  结束的路径。**该路径必须只沿着街道走** 。

**注意：** 你 **不能**  变更街道。

如果网格中存在有效的路径，则返回  *true* ，否则返回  *false*  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/03/21/e1.png)

```
输入：grid = [[2,4,3],[6,5,2]]
输出：true
解释：如图所示，你可以从 (0, 0) 开始，访问网格中的所有单元格并到达 (m - 1, n - 1) 。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/03/21/e2.png)

```
输入：grid = [[1,2,1],[1,2,1]]
输出：false
解释：如图所示，单元格 (0, 0) 上的街道没有与任何其他单元格上的街道相连，你只会停在 (0, 0) 处。

```

**示例 3：** 

```
输入：grid = [[1,1,2]]
输出：false
解释：你会停在 (0, 1)，而且无法到达 (0, 2) 。

```

**示例 4：** 

```
输入：grid = [[1,1,1,1,1,1,3]]
输出：true

```

**示例 5：** 

```
输入：grid = [[2],[2],[2],[2],[2],[2],[6]]
输出：true

```



**提示：** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m, n <= 300*  
-  *1 <= grid[i][j] <= 6* 




# 算法思路

# 测试用例
```
1391. Check if There is a Valid Path in a Grid 1391. 检查网格中是否存在有效路径 Medium
```

[enTitle]: https://leetcode.com/problems/check-if-there-is-a-valid-path-in-a-grid/
[cnTitle]: https://leetcode-cn.com/problems/check-if-there-is-a-valid-path-in-a-grid/
