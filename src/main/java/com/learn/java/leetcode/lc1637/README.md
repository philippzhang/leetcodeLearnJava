# [1637. Widest Vertical Area Between Two Points Containing No Points][enTitle]

**Medium**

Given  *n*   *points*  on a 2D plane where  *points[i] = [xi, yi]* , Return *the widest vertical area between two points such that no points are inside the area.* 

A **vertical area**  is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). The **widest vertical area**  is the one with the maximum width.

Note that points **on the edge**  of a vertical area **are not**  considered included in the area.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/09/19/points3.png)

```
Input: points = [[8,7],[9,9],[7,4],[9,7]]
Output: 1
Explanation: Both the red and the blue area are optimal.

```

**Example 2:** 

```
Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
Output: 3

```



**Constraints:** 

-  *n == points.length*  
-  *2 <= n <= 105*  
-  *points[i].length == 2*  
-  *0 <= xi, yi <= 109* 


# [1637. 两点之间不包含任何点的最宽垂直面积][cnTitle]

**中等**

给你  *n*  个二维平面上的点  *points*  ，其中  *points[i] = [xi, yi]*  ，请你返回两点之间内部不包含任何点的 **最宽垂直面积**  的宽度。

**垂直面积**  的定义是固定宽度，而 y 轴上无限延伸的一块区域（也就是高度为无穷大）。 **最宽垂直面积**  为宽度最大的一个垂直面积。

请注意，垂直区域 **边上**  的点 **不在**  区域内。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/31/points3.png)

```
输入：points = [[8,7],[9,9],[7,4],[9,7]]
输出：1
解释：红色区域和蓝色区域都是最优区域。

```

**示例 2：** 

```
输入：points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
输出：3

```



**提示：** 

-  *n == points.length*  
-  *2 <= n <= 105*  
-  *points[i].length == 2*  
-  *0 <= xi, yi <= 109* 




# 算法思路

# 测试用例
```
1637. Widest Vertical Area Between Two Points Containing No Points 1637. 两点之间不包含任何点的最宽垂直面积 Medium
```

[enTitle]: https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
[cnTitle]: https://leetcode-cn.com/problems/widest-vertical-area-between-two-points-containing-no-points/
