# [1260. Shift 2D Grid][enTitle]

**Easy**

Given a 2D  *grid*  of size  *m x n*  and an integer  *k* . You need to shift the  *grid*   *k*  times.

In one shift operation:

- Element at  *grid[i][j]*  moves to  *grid[i][j + 1]* . 
- Element at  *grid[i][n - 1]*  moves to  *grid[i + 1][0]* . 
- Element at  *grid[m - 1][n - 1]*  moves to  *grid[0][0]* .

Return the  *2D grid*  after applying shift operation  *k*  times.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/11/05/e1.png)

```
Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[9,1,2],[3,4,5],[6,7,8]]

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2019/11/05/e2.png)

```
Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]

```

**Example 3:** 

```
Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
Output: [[1,2,3],[4,5,6],[7,8,9]]

```



**Constraints:** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m <= 50*  
-  *1 <= n <= 50*  
-  *-1000 <= grid[i][j] <= 1000*  
-  *0 <= k <= 100* 


# [1260. 二维网格迁移][cnTitle]

**简单**

给你一个  *m*  行  *n*  列的二维网格  *grid*  和一个整数  *k* 。你需要将  *grid*  迁移  *k*  次。

每次「迁移」操作将会引发下述活动：

- 位于  *grid[i][j]*  的元素将会移动到  *grid[i][j + 1]* 。 
- 位于  *grid[i][n - 1]*  的元素将会移动到  *grid[i + 1][0]* 。 
- 位于  *grid[m - 1][n - 1]*  的元素将会移动到  *grid[0][0]* 。

请你返回  *k*  次迁移操作后最终得到的 **二维网格** 。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/11/16/e1-1.png)

```
输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
输出：[[9,1,2],[3,4,5],[6,7,8]]

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/11/16/e2-1.png)

```
输入：grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
输出：[[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]

```

**示例 3：** 

```
输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
输出：[[1,2,3],[4,5,6],[7,8,9]]

```



**提示：** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m <= 50*  
-  *1 <= n <= 50*  
-  *-1000 <= grid[i][j] <= 1000*  
-  *0 <= k <= 100* 




# 算法思路

# 测试用例
```
1260. Shift 2D Grid 1260. 二维网格迁移 Easy
```

[enTitle]: https://leetcode.com/problems/shift-2d-grid/
[cnTitle]: https://leetcode-cn.com/problems/shift-2d-grid/
