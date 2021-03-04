# [1631. Path With Minimum Effort][enTitle]

**Medium**

You are a hiker preparing for an upcoming hike. You are given  *heights* , a 2D array of size  *rows x columns* , where  *heights[row][col]*  represents the height of cell  *(row, col)* . You are situated in the top-left cell,  *(0, 0)* , and you hope to travel to the bottom-right cell,  *(rows-1, columns-1)*  (i.e., **0-indexed** ). You can move **up** , **down** , **left** , or **right** , and you wish to find a route that requires the minimum **effort** .

A route's **effort**  is the **maximum absolute difference** **** in heights between two consecutive cells of the route.

Return  *the minimum effort required to travel from the top-left cell to the bottom-right cell.* 



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/10/04/ex1.png)

```
Input: heights = [[1,2,2],[3,8,2],[5,3,5]]
Output: 2
Explanation: The route of [1,3,5,3,5] has a maximum absolute difference of 2 in consecutive cells.
This is better than the route of [1,2,2,2,5], where the maximum absolute difference is 3.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/10/04/ex2.png)

```
Input: heights = [[1,2,3],[3,8,4],[5,3,5]]
Output: 1
Explanation: The route of [1,2,3,4,5] has a maximum absolute difference of 1 in consecutive cells, which is better than route [1,3,5,3,5].

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/10/04/ex3.png)

```
Input: heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]
Output: 0
Explanation: This route does not require any effort.

```



**Constraints:** 

-  *rows == heights.length*  
-  *columns == heights[i].length*  
-  *1 <= rows, columns <= 100*  
-  *1 <= heights[i][j] <= 106* 


# [1631. 最小体力消耗路径][cnTitle]

**中等**

你准备参加一场远足活动。给你一个二维  *rows x columns*  的地图  *heights*  ，其中  *heights[row][col]*  表示格子  *(row, col)*  的高度。一开始你在最左上角的格子  *(0, 0)*  ，且你希望去最右下角的格子  *(rows-1, columns-1)*  （注意下标从 **0**  开始编号）。你每次可以往 **上** ，**下** ，**左** ，**右**  四个方向之一移动，你想要找到耗费 **体力**  最小的一条路径。

一条路径耗费的 **体力值**  是路径上相邻格子之间 **高度差绝对值**  的 **最大值**  决定的。

请你返回从左上角走到右下角的最小**体力消耗值**  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/25/ex1.png)

```
输入：heights = [[1,2,2],[3,8,2],[5,3,5]]
输出：2
解释：路径 [1,3,5,3,5] 连续格子的差值绝对值最大为 2 。
这条路径比路径 [1,2,2,2,5] 更优，因为另一条路径差值最大值为 3 。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/25/ex2.png)

```
输入：heights = [[1,2,3],[3,8,4],[5,3,5]]
输出：1
解释：路径 [1,2,3,4,5] 的相邻格子差值绝对值最大为 1 ，比路径 [1,3,5,3,5] 更优。

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/25/ex3.png)

```
输入：heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]
输出：0
解释：上图所示路径不需要消耗任何体力。

```



**提示：** 

-  *rows == heights.length*  
-  *columns == heights[i].length*  
-  *1 <= rows, columns <= 100*  
-  *1 <= heights[i][j] <= 106* 




# 算法思路

# 测试用例
```
1631. Path With Minimum Effort 1631. 最小体力消耗路径 Medium
```

[enTitle]: https://leetcode.com/problems/path-with-minimum-effort/
[cnTitle]: https://leetcode-cn.com/problems/path-with-minimum-effort/
