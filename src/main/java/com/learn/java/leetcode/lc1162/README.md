# [1162. As Far from Land as Possible][enTitle]

**Medium**

Given an  *n x n*   *grid*  containing only values  *0*  and  *1* , where  *0*  represents water and  *1*  represents land, find a water cell such that its distance to the nearest land cell is maximized, and return the distance. If no land or water exists in the grid, return  *-1* .

The distance used in this problem is the Manhattan distance: the distance between two cells  *(x0, y0)*  and  *(x1, y1)*  is  *|x0 - x1| + |y0 - y1|* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/05/03/1336_ex1.JPG)

```
Input: grid = [[1,0,1],[0,0,0],[1,0,1]]
Output: 2
Explanation: The cell (1, 1) is as far as possible from all the land with distance 2.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2019/05/03/1336_ex2.JPG)

```
Input: grid = [[1,0,0],[0,0,0],[0,0,0]]
Output: 4
Explanation: The cell (2, 2) is as far as possible from all the land with distance 4.

```



**Constraints:** 

-  *n == grid.length*  
-  *n == grid[i].length*  
-  *1 <= n <= 100*  
-  *grid[i][j]*  is  *0*  or  *1* 


# [1162. 地图分析][cnTitle]

**中等**

你现在手里有一份大小为 N x N 的 网格  *grid* ，上面的每个 单元格 都用  *0*  和  *1*  标记好了。其中  *0*  代表海洋， *1*  代表陆地，请你找出一个海洋单元格，这个海洋单元格到离它最近的陆地单元格的距离是最大的。

我们这里说的距离是「曼哈顿距离」（ Manhattan Distance）： *(x0, y0)*  和  *(x1, y1)*  这两个单元格之间的距离是  *|x0 - x1| + |y0 - y1|*  。

如果网格上只有陆地或者海洋，请返回  *-1* 。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/08/17/1336_ex1.jpeg)

```
输入：[[1,0,1],[0,0,0],[1,0,1]]
输出：2
解释：
海洋单元格 (1, 1) 和所有陆地单元格之间的距离都达到最大，最大距离为 2。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/08/17/1336_ex2.jpeg)

```
输入：[[1,0,0],[0,0,0],[0,0,0]]
输出：4
解释：
海洋单元格 (2, 2) 和所有陆地单元格之间的距离都达到最大，最大距离为 4。

```



**提示：** 

1.  *1 <= grid.length == grid[0].length <= 100*  
2.  *grid[i][j]*  不是  *0*  就是  *1* 




# 算法思路

# 测试用例
```
1162. As Far from Land as Possible 1162. 地图分析 Medium
```

[enTitle]: https://leetcode.com/problems/as-far-from-land-as-possible/
[cnTitle]: https://leetcode-cn.com/problems/as-far-from-land-as-possible/
