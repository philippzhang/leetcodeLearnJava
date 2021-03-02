# [695. Max Area of Island][enTitle]

**Medium**

Given a non-empty 2D array  *grid*  of 0's and 1's, an island is a group of  *1* 's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

Example 1:

```
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]

```


Example 2:

```
[[0,0,0,0,0,0,0,0]]
```


Note: The length of each dimension in the given  *grid*  does not exceed 50.


# [695. 岛屿的最大面积][cnTitle]

**中等**

给定一个包含了一些  *0*  和  *1*  的非空二维数组  *grid*  。

一个 **岛屿**  是由一些相邻的  *1*  (代表土地) 构成的组合，这里的「相邻」要求两个  *1*  必须在水平或者竖直方向上相邻。你可以假设  *grid*  的四个边缘都被  *0* （代表水）包围着。

找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为  *0*  。)



**示例 1:** 

```
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]

```

对于上面这个给定矩阵应返回  *6* 。注意答案不应该是  *11*  ，因为岛屿只能包含水平或垂直的四个方向的  *1*  。

**示例 2:** 

```
[[0,0,0,0,0,0,0,0]]
```

对于上面这个给定的矩阵, 返回  *0* 。



**注意:** 给定的矩阵 *grid*  的长度和宽度都不超过 50。




# 算法思路

# 测试用例
```
695. Max Area of Island 695. 岛屿的最大面积 Medium
```

[enTitle]: https://leetcode.com/problems/max-area-of-island/
[cnTitle]: https://leetcode-cn.com/problems/max-area-of-island/
