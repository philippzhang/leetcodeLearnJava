# [892. Surface Area of 3D Shapes][enTitle]

**Easy**

You are given an  *n x n*   *grid*  where you have placed some  *1 x 1 x 1*  cubes. Each value  *v = grid[i][j]*  represents a tower of  *v*  cubes placed on top of cell  *(i, j)* .

After placing these cubes, you have decided to glue any directly adjacent cubes to each other, forming several irregular 3D shapes.

Return  *the total surface area of the resulting shapes* .

**Note:**  The bottom face of each shape counts toward its surface area.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2021/01/08/tmp-grid1.jpg)

```
Input: grid = [[2]]
Output: 10

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2021/01/08/tmp-grid2.jpg)

```
Input: grid = [[1,2],[3,4]]
Output: 34

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2021/01/08/tmp-grid3.jpg)

```
Input: grid = [[1,0],[0,2]]
Output: 16

```

**Example 4:** 

![img](https://assets.leetcode.com/uploads/2021/01/08/tmp-grid4.jpg)

```
Input: grid = [[1,1,1],[1,0,1],[1,1,1]]
Output: 32

```

**Example 5:** 

![img](https://assets.leetcode.com/uploads/2021/01/08/tmp-grid5.jpg)

```
Input: grid = [[2,2,2],[2,1,2],[2,2,2]]
Output: 46

```



**Constraints:** 

-  *n == grid.length*  
-  *n == grid[i].length*  
-  *1 <= n <= 50*  
-  *0 <= grid[i][j] <= 50* 


# [892. 三维形体的表面积][cnTitle]

**简单**

给你一个  *n * n*  的网格  *grid*  ，上面放置着一些  *1 x 1 x 1*  的正方体。

每个值  *v = grid[i][j]*  表示  *v*  个正方体叠放在对应单元格  *(i, j)*  上。

放置好正方体后，任何直接相邻的正方体都会互相粘在一起，形成一些不规则的三维形体。

请你返回最终这些形体的总表面积。

**注意：** 每个形体的底面也需要计入表面积中。





**示例 1：** 

![img](https://assets.leetcode.com/uploads/2021/01/08/tmp-grid1.jpg)

```
输入：grid = [[2]]
输出：10

```

**示例 2：** 

![img](https://assets.leetcode.com/uploads/2021/01/08/tmp-grid2.jpg)

```
输入：grid = [[1,2],[3,4]]
输出：34

```

**示例 3：** 

![img](https://assets.leetcode.com/uploads/2021/01/08/tmp-grid3.jpg)

```
输入：grid = [[1,0],[0,2]]
输出：16

```

**示例 4：** 

![img](https://assets.leetcode.com/uploads/2021/01/08/tmp-grid4.jpg)

```
输入：grid = [[1,1,1],[1,0,1],[1,1,1]]
输出：32

```

**示例 5：** 

![img](https://assets.leetcode.com/uploads/2021/01/08/tmp-grid5.jpg)

```
输入：grid = [[2,2,2],[2,1,2],[2,2,2]]
输出：46

```



**提示：** 

-  *n == grid.length*  
-  *n == grid[i].length*  
-  *1 <= n <= 50*  
-  *0 <= grid[i][j] <= 50* 




# 算法思路

# 测试用例
```
892. Surface Area of 3D Shapes 892. 三维形体的表面积 Easy
```

[enTitle]: https://leetcode.com/problems/surface-area-of-3d-shapes/
[cnTitle]: https://leetcode-cn.com/problems/surface-area-of-3d-shapes/
