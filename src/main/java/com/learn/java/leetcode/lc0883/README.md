# [883. Projection Area of 3D Shapes][enTitle]

**Easy**

You are given an  *n x n*   *grid*  where we place some  *1 x 1 x 1*  cubes that are axis-aligned with the  *x* ,  *y* , and  *z*  axes.

Each value  *v = grid[i][j]*  represents a tower of  *v*  cubes placed on top of the cell  *(i, j)* .

We view the projection of these cubes onto the  *xy* ,  *yz* , and  *zx*  planes.

A **projection**  is like a shadow, that maps our **3-dimensional**  figure to a **2-dimensional**  plane. We are viewing the "shadow" when looking at the cubes from the top, the front, and the side.

Return  *the total area of all three projections* .



**Example 1:** 

![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/08/02/shadow.png)

```
Input: grid = [[1,2],[3,4]]
Output: 17
Explanation: Here are the three projections ("shadows") of the shape made with each axis-aligned plane.

```

**Example 2:** 

```
Input: grid = [[2]]
Output: 5

```

**Example 3:** 

```
Input: grid = [[1,0],[0,2]]
Output: 8

```

**Example 4:** 

```
Input: grid = [[1,1,1],[1,0,1],[1,1,1]]
Output: 14

```

**Example 5:** 

```
Input: grid = [[2,2,2],[2,1,2],[2,2,2]]
Output: 21

```



**Constraints:** 

-  *n == grid.length*  
-  *n == grid[i].length*  
-  *1 <= n <= 50*  
-  *0 <= grid[i][j] <= 50* 


# [883. 三维形体投影面积][cnTitle]

**简单**

在  *N * N*  的网格中，我们放置了一些与 x，y，z 三轴对齐的  *1 * 1 * 1*  立方体。

每个值  *v = grid[i][j]*  表示  *v*  个正方体叠放在单元格  *(i, j)*  上。

现在，我们查看这些立方体在 xy、yz 和 zx 平面上的 *投影* 。

投影就像影子，将三维形体映射到一个二维平面上。

在这里，从顶部、前面和侧面看立方体时，我们会看到“影子”。

返回所有三个投影的总面积。











**示例 1：** 

```
输入：[[2]]
输出：5

```

**示例 2：** 


<pre><strong>输入：</strong>[[1,2],[3,4]]
<strong>输出：</strong>17
<strong>解释：</strong>
这里有该形体在三个轴对齐平面上的三个投影(“阴影部分”)。
<img style="height: 200px; width: 749px;" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/08/02/shadow.png" alt="">
</pre>

**示例 3：** 

```
输入：[[1,0],[0,2]]
输出：8

```

**示例 4：** 

```
输入：[[1,1,1],[1,0,1],[1,1,1]]
输出：14

```

**示例 5：** 

```
输入：[[2,2,2],[2,1,2],[2,2,2]]
输出：21

```



**提示：** 

-  *1 <= grid.length = grid[0].length <= 50*  
-  *0 <= grid[i][j] <= 50* 




# 算法思路

# 测试用例
```
883. Projection Area of 3D Shapes 883. 三维形体投影面积 Easy
```

[enTitle]: https://leetcode.com/problems/projection-area-of-3d-shapes/
[cnTitle]: https://leetcode-cn.com/problems/projection-area-of-3d-shapes/
